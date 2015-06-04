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

public interface UserDAO {
	public User loadUserByORMID(int ID) throws PersistentException;
	public User getUserByORMID(int ID) throws PersistentException;
	public User loadUserByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public User getUserByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public User loadUserByORMID(PersistentSession session, int ID) throws PersistentException;
	public User getUserByORMID(PersistentSession session, int ID) throws PersistentException;
	public User loadUserByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public User getUserByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public User[] listUserByQuery(String condition, String orderBy) throws PersistentException;
	public User[] listUserByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryUser(String condition, String orderBy) throws PersistentException;
	public java.util.List queryUser(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateUserByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateUserByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public User[] listUserByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public User[] listUserByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryUser(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryUser(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateUserByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateUserByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public User loadUserByQuery(String condition, String orderBy) throws PersistentException;
	public User loadUserByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public User loadUserByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public User loadUserByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public User createUser();
	public boolean save(eventapp.User user) throws PersistentException;
	public boolean delete(eventapp.User user) throws PersistentException;
	public boolean refresh(eventapp.User user) throws PersistentException;
	public boolean evict(eventapp.User user) throws PersistentException;
}
