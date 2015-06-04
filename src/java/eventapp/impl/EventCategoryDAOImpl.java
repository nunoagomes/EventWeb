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

public class EventCategoryDAOImpl implements eventapp.dao.EventCategoryDAO {
	public EventCategory loadEventCategoryByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = eventapp.ArchitecturePersistentManager.instance().getSession();
			return loadEventCategoryByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public EventCategory getEventCategoryByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = eventapp.ArchitecturePersistentManager.instance().getSession();
			return getEventCategoryByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public EventCategory loadEventCategoryByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = eventapp.ArchitecturePersistentManager.instance().getSession();
			return loadEventCategoryByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public EventCategory getEventCategoryByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = eventapp.ArchitecturePersistentManager.instance().getSession();
			return getEventCategoryByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public EventCategory loadEventCategoryByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (EventCategory) session.load(eventapp.EventCategory.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public EventCategory getEventCategoryByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (EventCategory) session.get(eventapp.EventCategory.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public EventCategory loadEventCategoryByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (EventCategory) session.load(eventapp.EventCategory.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public EventCategory getEventCategoryByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (EventCategory) session.get(eventapp.EventCategory.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryEventCategory(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = eventapp.ArchitecturePersistentManager.instance().getSession();
			return queryEventCategory(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryEventCategory(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = eventapp.ArchitecturePersistentManager.instance().getSession();
			return queryEventCategory(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public EventCategory[] listEventCategoryByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = eventapp.ArchitecturePersistentManager.instance().getSession();
			return listEventCategoryByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public EventCategory[] listEventCategoryByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = eventapp.ArchitecturePersistentManager.instance().getSession();
			return listEventCategoryByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryEventCategory(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From eventapp.EventCategory as EventCategory");
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
	
	public List queryEventCategory(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From eventapp.EventCategory as EventCategory");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("EventCategory", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public EventCategory[] listEventCategoryByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryEventCategory(session, condition, orderBy);
			return (EventCategory[]) list.toArray(new EventCategory[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public EventCategory[] listEventCategoryByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryEventCategory(session, condition, orderBy, lockMode);
			return (EventCategory[]) list.toArray(new EventCategory[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public EventCategory loadEventCategoryByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = eventapp.ArchitecturePersistentManager.instance().getSession();
			return loadEventCategoryByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public EventCategory loadEventCategoryByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = eventapp.ArchitecturePersistentManager.instance().getSession();
			return loadEventCategoryByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public EventCategory loadEventCategoryByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		EventCategory[] eventCategorys = listEventCategoryByQuery(session, condition, orderBy);
		if (eventCategorys != null && eventCategorys.length > 0)
			return eventCategorys[0];
		else
			return null;
	}
	
	public EventCategory loadEventCategoryByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		EventCategory[] eventCategorys = listEventCategoryByQuery(session, condition, orderBy, lockMode);
		if (eventCategorys != null && eventCategorys.length > 0)
			return eventCategorys[0];
		else
			return null;
	}
	
	public java.util.Iterator iterateEventCategoryByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = eventapp.ArchitecturePersistentManager.instance().getSession();
			return iterateEventCategoryByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateEventCategoryByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = eventapp.ArchitecturePersistentManager.instance().getSession();
			return iterateEventCategoryByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateEventCategoryByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From eventapp.EventCategory as EventCategory");
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
	
	public java.util.Iterator iterateEventCategoryByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From eventapp.EventCategory as EventCategory");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("EventCategory", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public EventCategory createEventCategory() {
		return new eventapp.EventCategory();
	}
	
	public boolean save(eventapp.EventCategory eventCategory) throws PersistentException {
		try {
			eventapp.ArchitecturePersistentManager.instance().saveObject(eventCategory);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(eventapp.EventCategory eventCategory) throws PersistentException {
		try {
			eventapp.ArchitecturePersistentManager.instance().deleteObject(eventCategory);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(eventapp.EventCategory eventCategory)throws PersistentException {
		try {
			eventapp.Event[] lEventss = eventCategory.events.toArray();
			for(int i = 0; i < lEventss.length; i++) {
				lEventss[i].setEventCategory(null);
			}
			return delete(eventCategory);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(eventapp.EventCategory eventCategory, org.orm.PersistentSession session)throws PersistentException {
		try {
			eventapp.Event[] lEventss = eventCategory.events.toArray();
			for(int i = 0; i < lEventss.length; i++) {
				lEventss[i].setEventCategory(null);
			}
			try {
				session.delete(eventCategory);
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
	
	public boolean refresh(eventapp.EventCategory eventCategory) throws PersistentException {
		try {
			eventapp.ArchitecturePersistentManager.instance().getSession().refresh(eventCategory);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(eventapp.EventCategory eventCategory) throws PersistentException {
		try {
			eventapp.ArchitecturePersistentManager.instance().getSession().evict(eventCategory);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
