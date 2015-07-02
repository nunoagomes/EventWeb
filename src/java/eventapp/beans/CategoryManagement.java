/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventapp.beans;

import eventapp.EventCategory;
import javax.ejb.Stateless;

/**
 *
 * @author nunoandrebarbosagomes
 */
@Stateless
public class CategoryManagement implements CategoryManagementLocal {

    @Override
    public EventCategory[] listCategories() throws Exception {
        return eventapp.DAOFactory.getDAOFactory().getEventCategoryDAO().
                listEventCategoryByQuery(null, null);
    }
}
