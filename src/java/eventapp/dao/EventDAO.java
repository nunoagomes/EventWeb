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

public interface EventDAO {
	public Event loadEventByORMID(int ID) throws PersistentException;
	public Event getEventByORMID(int ID) throws PersistentException;
	public Event loadEventByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Event getEventByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Event loadEventByORMID(PersistentSession session, int ID) throws PersistentException;
	public Event getEventByORMID(PersistentSession session, int ID) throws PersistentException;
	public Event loadEventByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Event getEventByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Event[] listEventByQuery(String condition, String orderBy) throws PersistentException;
	public Event[] listEventByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryEvent(String condition, String orderBy) throws PersistentException;
	public java.util.List queryEvent(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateEventByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateEventByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Event[] listEventByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Event[] listEventByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryEvent(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryEvent(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateEventByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateEventByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Event loadEventByQuery(String condition, String orderBy) throws PersistentException;
	public Event loadEventByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Event loadEventByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Event loadEventByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Event createEvent();
	public boolean save(eventapp.Event event) throws PersistentException;
	public boolean delete(eventapp.Event event) throws PersistentException;
	public boolean deleteAndDissociate(eventapp.Event event) throws PersistentException;
	public boolean deleteAndDissociate(eventapp.Event event, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(eventapp.Event event) throws PersistentException;
	public boolean evict(eventapp.Event event) throws PersistentException;
}
