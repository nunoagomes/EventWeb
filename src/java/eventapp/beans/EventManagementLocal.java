/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventapp.beans;

import eventapp.Event;
import eventapp.pojos.GeoCoder;

/**
 *
 * @author nunoandrebarbosagomes
 */
public interface EventManagementLocal {
    
    public GeoCoder geoCoding(String address) throws Exception;

    public Event insertEvent(long organizationUserID, long eventCategoryID,
            String title, String date, String description, 
            String additionalInformation, String country, String city, 
            String zip, String address, String addressOptional, double price)
            throws Exception;
    
}
