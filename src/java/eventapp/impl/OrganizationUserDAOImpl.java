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
package eventapp.impl;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;
import eventapp.*;

public class OrganizationUserDAOImpl implements eventapp.dao.OrganizationUserDAO {
	public OrganizationUser loadOrganizationUserByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = eventapp.ArchitecturePersistentManager.instance().getSession();
			return loadOrganizationUserByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public OrganizationUser getOrganizationUserByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = eventapp.ArchitecturePersistentManager.instance().getSession();
			return getOrganizationUserByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public OrganizationUser loadOrganizationUserByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = eventapp.ArchitecturePersistentManager.instance().getSession();
			return loadOrganizationUserByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public OrganizationUser getOrganizationUserByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = eventapp.ArchitecturePersistentManager.instance().getSession();
			return getOrganizationUserByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public OrganizationUser loadOrganizationUserByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (OrganizationUser) session.load(eventapp.OrganizationUser.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public OrganizationUser getOrganizationUserByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (OrganizationUser) session.get(eventapp.OrganizationUser.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public OrganizationUser loadOrganizationUserByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (OrganizationUser) session.load(eventapp.OrganizationUser.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public OrganizationUser getOrganizationUserByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (OrganizationUser) session.get(eventapp.OrganizationUser.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryOrganizationUser(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = eventapp.ArchitecturePersistentManager.instance().getSession();
			return queryOrganizationUser(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryOrganizationUser(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = eventapp.ArchitecturePersistentManager.instance().getSession();
			return queryOrganizationUser(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public OrganizationUser[] listOrganizationUserByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = eventapp.ArchitecturePersistentManager.instance().getSession();
			return listOrganizationUserByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public OrganizationUser[] listOrganizationUserByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = eventapp.ArchitecturePersistentManager.instance().getSession();
			return listOrganizationUserByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryOrganizationUser(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From eventapp.OrganizationUser as OrganizationUser");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryOrganizationUser(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From eventapp.OrganizationUser as OrganizationUser");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("OrganizationUser", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public OrganizationUser[] listOrganizationUserByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryOrganizationUser(session, condition, orderBy);
			return (OrganizationUser[]) list.toArray(new OrganizationUser[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public OrganizationUser[] listOrganizationUserByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryOrganizationUser(session, condition, orderBy, lockMode);
			return (OrganizationUser[]) list.toArray(new OrganizationUser[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public OrganizationUser loadOrganizationUserByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = eventapp.ArchitecturePersistentManager.instance().getSession();
			return loadOrganizationUserByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public OrganizationUser loadOrganizationUserByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = eventapp.ArchitecturePersistentManager.instance().getSession();
			return loadOrganizationUserByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public OrganizationUser loadOrganizationUserByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		OrganizationUser[] organizationUsers = listOrganizationUserByQuery(session, condition, orderBy);
		if (organizationUsers != null && organizationUsers.length > 0)
			return organizationUsers[0];
		else
			return null;
	}
	
	public OrganizationUser loadOrganizationUserByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		OrganizationUser[] organizationUsers = listOrganizationUserByQuery(session, condition, orderBy, lockMode);
		if (organizationUsers != null && organizationUsers.length > 0)
			return organizationUsers[0];
		else
			return null;
	}
	
	public java.util.Iterator iterateOrganizationUserByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = eventapp.ArchitecturePersistentManager.instance().getSession();
			return iterateOrganizationUserByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateOrganizationUserByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = eventapp.ArchitecturePersistentManager.instance().getSession();
			return iterateOrganizationUserByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateOrganizationUserByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From eventapp.OrganizationUser as OrganizationUser");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateOrganizationUserByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From eventapp.OrganizationUser as OrganizationUser");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("OrganizationUser", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public OrganizationUser createOrganizationUser() {
		return new eventapp.OrganizationUser();
	}
	
	public boolean save(eventapp.OrganizationUser organizationUser) throws PersistentException {
		try {
			eventapp.ArchitecturePersistentManager.instance().saveObject(organizationUser);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(eventapp.OrganizationUser organizationUser) throws PersistentException {
		try {
			eventapp.ArchitecturePersistentManager.instance().deleteObject(organizationUser);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(eventapp.OrganizationUser organizationUser)throws PersistentException {
		try {
			eventapp.Event[] lEventss = organizationUser.events.toArray();
			for(int i = 0; i < lEventss.length; i++) {
				lEventss[i].setOrganizationUser(null);
			}
			return delete(organizationUser);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(eventapp.OrganizationUser organizationUser, org.orm.PersistentSession session)throws PersistentException {
		try {
			eventapp.Event[] lEventss = organizationUser.events.toArray();
			for(int i = 0; i < lEventss.length; i++) {
				lEventss[i].setOrganizationUser(null);
			}
			try {
				session.delete(organizationUser);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean refresh(eventapp.OrganizationUser organizationUser) throws PersistentException {
		try {
			eventapp.ArchitecturePersistentManager.instance().getSession().refresh(organizationUser);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(eventapp.OrganizationUser organizationUser) throws PersistentException {
		try {
			eventapp.ArchitecturePersistentManager.instance().getSession().evict(organizationUser);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
