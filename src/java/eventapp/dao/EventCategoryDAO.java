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
package eventapp.dao;

import org.orm.*;
import org.hibernate.LockMode;
import eventapp.*;

public interface EventCategoryDAO {
	public EventCategory loadEventCategoryByORMID(int ID) throws PersistentException;
	public EventCategory getEventCategoryByORMID(int ID) throws PersistentException;
	public EventCategory loadEventCategoryByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public EventCategory getEventCategoryByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public EventCategory loadEventCategoryByORMID(PersistentSession session, int ID) throws PersistentException;
	public EventCategory getEventCategoryByORMID(PersistentSession session, int ID) throws PersistentException;
	public EventCategory loadEventCategoryByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public EventCategory getEventCategoryByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public EventCategory[] listEventCategoryByQuery(String condition, String orderBy) throws PersistentException;
	public EventCategory[] listEventCategoryByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryEventCategory(String condition, String orderBy) throws PersistentException;
	public java.util.List queryEventCategory(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateEventCategoryByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateEventCategoryByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public EventCategory[] listEventCategoryByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public EventCategory[] listEventCategoryByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryEventCategory(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryEventCategory(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateEventCategoryByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateEventCategoryByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public EventCategory loadEventCategoryByQuery(String condition, String orderBy) throws PersistentException;
	public EventCategory loadEventCategoryByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public EventCategory loadEventCategoryByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public EventCategory loadEventCategoryByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public EventCategory createEventCategory();
	public boolean save(eventapp.EventCategory eventCategory) throws PersistentException;
	public boolean delete(eventapp.EventCategory eventCategory) throws PersistentException;
	public boolean deleteAndDissociate(eventapp.EventCategory eventCategory) throws PersistentException;
	public boolean deleteAndDissociate(eventapp.EventCategory eventCategory, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(eventapp.EventCategory eventCategory) throws PersistentException;
	public boolean evict(eventapp.EventCategory eventCategory) throws PersistentException;
}
