/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Universidade do Minho
 * License Type: Academic
 */
package eventapp;

import eventapp.dao.*;

public abstract class DAOFactory {
	private static DAOFactory _factory = new DAOFactoryImpl();
	
	public static DAOFactory getDAOFactory() {
		return _factory;
	}
	
	public abstract UserDAO getUserDAO();
	public abstract RegularUserDAO getRegularUserDAO();
	public abstract OrganizationUserDAO getOrganizationUserDAO();
	public abstract EventDAO getEventDAO();
	public abstract AttachmentDAO getAttachmentDAO();
	public abstract EventCategoryDAO getEventCategoryDAO();
	public abstract CommentDAO getCommentDAO();
}

