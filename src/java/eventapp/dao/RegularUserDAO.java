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

public interface RegularUserDAO {
	public RegularUser loadRegularUserByORMID(int ID) throws PersistentException;
	public RegularUser getRegularUserByORMID(int ID) throws PersistentException;
	public RegularUser loadRegularUserByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public RegularUser getRegularUserByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public RegularUser loadRegularUserByORMID(PersistentSession session, int ID) throws PersistentException;
	public RegularUser getRegularUserByORMID(PersistentSession session, int ID) throws PersistentException;
	public RegularUser loadRegularUserByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public RegularUser getRegularUserByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public RegularUser[] listRegularUserByQuery(String condition, String orderBy) throws PersistentException;
	public RegularUser[] listRegularUserByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryRegularUser(String condition, String orderBy) throws PersistentException;
	public java.util.List queryRegularUser(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateRegularUserByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateRegularUserByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public RegularUser[] listRegularUserByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public RegularUser[] listRegularUserByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryRegularUser(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryRegularUser(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateRegularUserByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateRegularUserByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public RegularUser loadRegularUserByQuery(String condition, String orderBy) throws PersistentException;
	public RegularUser loadRegularUserByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public RegularUser loadRegularUserByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public RegularUser loadRegularUserByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public RegularUser createRegularUser();
	public boolean save(eventapp.RegularUser regularUser) throws PersistentException;
	public boolean delete(eventapp.RegularUser regularUser) throws PersistentException;
	public boolean deleteAndDissociate(eventapp.RegularUser regularUser) throws PersistentException;
	public boolean deleteAndDissociate(eventapp.RegularUser regularUser, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(eventapp.RegularUser regularUser) throws PersistentException;
	public boolean evict(eventapp.RegularUser regularUser) throws PersistentException;
}
