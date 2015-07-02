/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventapp.beans;

import eventapp.Attachment;
import eventapp.Event;
import eventapp.pojos.GeoCoder;
import java.util.ArrayList;

/**
 *
 * @author nunoandrebarbosagomes
 */
public interface EventManagementLocal {
    
    public GeoCoder geoCoding(String address) throws Exception;

    public Event saveEvent(long organizationUserID, long eventCategoryID,
            String title, String date, String description, 
            String additionalInformation, String country, String city, 
            String zip, String address, String addressOptional, double price, 
            ArrayList<String> imagesPath) throws Exception;
    
    public Event getEvent(long eventID) throws Exception;
    
    public boolean deleteEvent(long eventID) throws Exception;
    
    public Attachment insertAttachment(String fileName) throws Exception;
    
}
