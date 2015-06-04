/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventapp.beans;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import eventapp.DAOFactory;
import eventapp.Event;
import eventapp.pojos.GeoCoder;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.ejb.Stateless;
import org.orm.PersistentException;

/**
 *
 * @author nunoandrebarbosagomes
 */
@Stateless
public class EventManagement implements EventManagementLocal {

    @Override
    public GeoCoder geoCoding(String address) throws Exception {
        Gson gson = new Gson();
        GeoCoder location = null;

        URL url = new URL("https://maps.googleapis.com/maps/api/geocode/json?address=1600+Amphitheatre+Parkway,+Mountain+View,+CA&key=AIzaSyDQm3SmzFttml3FCJAsO6nQ7os_q8bdUhA");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setDoOutput(true);
        connection.setDoInput(true);
        connection.setRequestProperty("Acceptd", "application/json");
        connection.setRequestMethod("GET");
        String requestParams = "";

        try (OutputStream os = connection.getOutputStream();
                BufferedWriter _writer = new BufferedWriter(new OutputStreamWriter(os, "UTF-8"));) {
            _writer.write(requestParams);
            _writer.flush();
        }
        try (InputStream in = connection.getInputStream();
                JsonReader reader = new JsonReader(new InputStreamReader(in, "UTF-8"));) {
            JsonElement jelement = new JsonParser().parse(reader);
            //json.results[0].geometry.location
            JsonObject jobject = jelement.getAsJsonArray().get(0).getAsJsonObject().getAsJsonObject("geometry").getAsJsonObject("location");
            location = gson.fromJson((JsonElement) jobject, GeoCoder.class);
        }
        return location;
    }

    @Override
    public Event insertEvent(long organizationUserID, long eventCategoryID,
            String title, String date, String description,
            String additionalInformation, String country, String city,
            String zip, String address, String addressOptional, double price)
            throws Exception {

        Event event = DAOFactory.getDAOFactory().getEventDAO().createEvent();
        copyToEvent(event, organizationUserID, eventCategoryID, title, date,
                description, additionalInformation, country, city, zip, address,
                addressOptional, price);
        
        if (eventapp.DAOFactory.getDAOFactory().getEventDAO().save(event)) {
            return event;
        } else {
            return null;
        } //To change body of generated methods, choose Tools | Templates.
    }

    private void copyToEvent(eventapp.Event _event,
            long organizationUserID, long eventCategoryID, String title,
            String date, String description, String additionalInformation,
            String country, String city, String zip, String address,
            String addressOptional, double price) {

        _event.setTitle(date);
        _event.setDate(date);
        _event.setDescription(description);
        _event.setAdditionalInformation(additionalInformation);
        _event.setCountry(country);
        _event.setCity(city);
        _event.setZip(zip);
        _event.setAddress(address);
        _event.setAddressOptional(addressOptional);
        _event.setPrice(price);

        try {
            eventapp.EventCategory _eventCategory = eventapp.DAOFactory.getDAOFactory().getEventCategoryDAO().loadEventCategoryByORMID((int) eventCategoryID);
            _event.setEventCategory(_eventCategory);
        } catch (PersistentException e) {
        }

        try {
            eventapp.OrganizationUser _organizationUser = eventapp.DAOFactory.getDAOFactory().getOrganizationUserDAO().loadOrganizationUserByORMID((int) organizationUserID);
            _event.setOrganizationUser(_organizationUser);
        } catch (PersistentException e) {
        }
    }
}
