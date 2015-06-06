/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventapp.beans;

import eventapp.EventCategory;

/**
 *
 * @author nunoandrebarbosagomes
 */
public interface CategoryManagementLocal {
    
    public EventCategory[] listCategories() throws Exception;
    
}
