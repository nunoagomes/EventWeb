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

public class AttachmentDAOImpl implements eventapp.dao.AttachmentDAO {
	public Attachment loadAttachmentByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = eventapp.ArchitecturePersistentManager.instance().getSession();
			return loadAttachmentByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Attachment getAttachmentByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = eventapp.ArchitecturePersistentManager.instance().getSession();
			return getAttachmentByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Attachment loadAttachmentByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = eventapp.ArchitecturePersistentManager.instance().getSession();
			return loadAttachmentByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Attachment getAttachmentByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = eventapp.ArchitecturePersistentManager.instance().getSession();
			return getAttachmentByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Attachment loadAttachmentByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Attachment) session.load(eventapp.Attachment.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Attachment getAttachmentByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Attachment) session.get(eventapp.Attachment.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Attachment loadAttachmentByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Attachment) session.load(eventapp.Attachment.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Attachment getAttachmentByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Attachment) session.get(eventapp.Attachment.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryAttachment(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = eventapp.ArchitecturePersistentManager.instance().getSession();
			return queryAttachment(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryAttachment(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = eventapp.ArchitecturePersistentManager.instance().getSession();
			return queryAttachment(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Attachment[] listAttachmentByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = eventapp.ArchitecturePersistentManager.instance().getSession();
			return listAttachmentByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Attachment[] listAttachmentByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = eventapp.ArchitecturePersistentManager.instance().getSession();
			return listAttachmentByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryAttachment(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From eventapp.Attachment as Attachment");
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
	
	public List queryAttachment(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From eventapp.Attachment as Attachment");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Attachment", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Attachment[] listAttachmentByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryAttachment(session, condition, orderBy);
			return (Attachment[]) list.toArray(new Attachment[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Attachment[] listAttachmentByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryAttachment(session, condition, orderBy, lockMode);
			return (Attachment[]) list.toArray(new Attachment[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Attachment loadAttachmentByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = eventapp.ArchitecturePersistentManager.instance().getSession();
			return loadAttachmentByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Attachment loadAttachmentByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = eventapp.ArchitecturePersistentManager.instance().getSession();
			return loadAttachmentByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Attachment loadAttachmentByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Attachment[] attachments = listAttachmentByQuery(session, condition, orderBy);
		if (attachments != null && attachments.length > 0)
			return attachments[0];
		else
			return null;
	}
	
	public Attachment loadAttachmentByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Attachment[] attachments = listAttachmentByQuery(session, condition, orderBy, lockMode);
		if (attachments != null && attachments.length > 0)
			return attachments[0];
		else
			return null;
	}
	
	public java.util.Iterator iterateAttachmentByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = eventapp.ArchitecturePersistentManager.instance().getSession();
			return iterateAttachmentByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateAttachmentByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = eventapp.ArchitecturePersistentManager.instance().getSession();
			return iterateAttachmentByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateAttachmentByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From eventapp.Attachment as Attachment");
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
	
	public java.util.Iterator iterateAttachmentByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From eventapp.Attachment as Attachment");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Attachment", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Attachment createAttachment() {
		return new eventapp.Attachment();
	}
	
	public boolean save(eventapp.Attachment attachment) throws PersistentException {
		try {
			eventapp.ArchitecturePersistentManager.instance().saveObject(attachment);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(eventapp.Attachment attachment) throws PersistentException {
		try {
			eventapp.ArchitecturePersistentManager.instance().deleteObject(attachment);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean refresh(eventapp.Attachment attachment) throws PersistentException {
		try {
			eventapp.ArchitecturePersistentManager.instance().getSession().refresh(attachment);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(eventapp.Attachment attachment) throws PersistentException {
		try {
			eventapp.ArchitecturePersistentManager.instance().getSession().evict(attachment);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
