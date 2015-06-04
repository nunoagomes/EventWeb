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

public interface OrganizationUserDAO {
	public OrganizationUser loadOrganizationUserByORMID(int ID) throws PersistentException;
	public OrganizationUser getOrganizationUserByORMID(int ID) throws PersistentException;
	public OrganizationUser loadOrganizationUserByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public OrganizationUser getOrganizationUserByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public OrganizationUser loadOrganizationUserByORMID(PersistentSession session, int ID) throws PersistentException;
	public OrganizationUser getOrganizationUserByORMID(PersistentSession session, int ID) throws PersistentException;
	public OrganizationUser loadOrganizationUserByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public OrganizationUser getOrganizationUserByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public OrganizationUser[] listOrganizationUserByQuery(String condition, String orderBy) throws PersistentException;
	public OrganizationUser[] listOrganizationUserByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryOrganizationUser(String condition, String orderBy) throws PersistentException;
	public java.util.List queryOrganizationUser(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateOrganizationUserByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateOrganizationUserByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public OrganizationUser[] listOrganizationUserByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public OrganizationUser[] listOrganizationUserByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryOrganizationUser(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryOrganizationUser(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateOrganizationUserByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateOrganizationUserByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public OrganizationUser loadOrganizationUserByQuery(String condition, String orderBy) throws PersistentException;
	public OrganizationUser loadOrganizationUserByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public OrganizationUser loadOrganizationUserByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public OrganizationUser loadOrganizationUserByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public OrganizationUser createOrganizationUser();
	public boolean save(eventapp.OrganizationUser organizationUser) throws PersistentException;
	public boolean delete(eventapp.OrganizationUser organizationUser) throws PersistentException;
	public boolean deleteAndDissociate(eventapp.OrganizationUser organizationUser) throws PersistentException;
	public boolean deleteAndDissociate(eventapp.OrganizationUser organizationUser, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(eventapp.OrganizationUser organizationUser) throws PersistentException;
	public boolean evict(eventapp.OrganizationUser organizationUser) throws PersistentException;
}
