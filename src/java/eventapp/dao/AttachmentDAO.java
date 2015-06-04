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

public interface AttachmentDAO {
	public Attachment loadAttachmentByORMID(int ID) throws PersistentException;
	public Attachment getAttachmentByORMID(int ID) throws PersistentException;
	public Attachment loadAttachmentByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Attachment getAttachmentByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Attachment loadAttachmentByORMID(PersistentSession session, int ID) throws PersistentException;
	public Attachment getAttachmentByORMID(PersistentSession session, int ID) throws PersistentException;
	public Attachment loadAttachmentByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Attachment getAttachmentByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Attachment[] listAttachmentByQuery(String condition, String orderBy) throws PersistentException;
	public Attachment[] listAttachmentByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryAttachment(String condition, String orderBy) throws PersistentException;
	public java.util.List queryAttachment(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateAttachmentByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateAttachmentByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Attachment[] listAttachmentByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Attachment[] listAttachmentByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryAttachment(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryAttachment(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateAttachmentByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateAttachmentByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Attachment loadAttachmentByQuery(String condition, String orderBy) throws PersistentException;
	public Attachment loadAttachmentByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Attachment loadAttachmentByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Attachment loadAttachmentByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Attachment createAttachment();
	public boolean save(eventapp.Attachment attachment) throws PersistentException;
	public boolean delete(eventapp.Attachment attachment) throws PersistentException;
	public boolean refresh(eventapp.Attachment attachment) throws PersistentException;
	public boolean evict(eventapp.Attachment attachment) throws PersistentException;
}
