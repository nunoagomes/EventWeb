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
import eventapp.impl.*;

public class DAOFactoryImpl extends DAOFactory {
	private UserDAO _userDAO = new UserDAOImpl();
	public UserDAO getUserDAO() {
		return _userDAO;
	}
	
	private RegularUserDAO _regularUserDAO = new RegularUserDAOImpl();
	public RegularUserDAO getRegularUserDAO() {
		return _regularUserDAO;
	}
	
	private OrganizationUserDAO _organizationUserDAO = new OrganizationUserDAOImpl();
	public OrganizationUserDAO getOrganizationUserDAO() {
		return _organizationUserDAO;
	}
	
	private EventDAO _eventDAO = new EventDAOImpl();
	public EventDAO getEventDAO() {
		return _eventDAO;
	}
	
	private AttachmentDAO _attachmentDAO = new AttachmentDAOImpl();
	public AttachmentDAO getAttachmentDAO() {
		return _attachmentDAO;
	}
	
	private EventCategoryDAO _eventCategoryDAO = new EventCategoryDAOImpl();
	public EventCategoryDAO getEventCategoryDAO() {
		return _eventCategoryDAO;
	}
	
	private CommentDAO _commentDAO = new CommentDAOImpl();
	public CommentDAO getCommentDAO() {
		return _commentDAO;
	}
	
}

