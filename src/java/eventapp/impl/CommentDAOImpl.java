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

public class CommentDAOImpl implements eventapp.dao.CommentDAO {
	public Comment loadCommentByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = eventapp.ArchitecturePersistentManager.instance().getSession();
			return loadCommentByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Comment getCommentByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = eventapp.ArchitecturePersistentManager.instance().getSession();
			return getCommentByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Comment loadCommentByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = eventapp.ArchitecturePersistentManager.instance().getSession();
			return loadCommentByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Comment getCommentByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = eventapp.ArchitecturePersistentManager.instance().getSession();
			return getCommentByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Comment loadCommentByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Comment) session.load(eventapp.Comment.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Comment getCommentByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Comment) session.get(eventapp.Comment.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Comment loadCommentByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Comment) session.load(eventapp.Comment.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Comment getCommentByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Comment) session.get(eventapp.Comment.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryComment(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = eventapp.ArchitecturePersistentManager.instance().getSession();
			return queryComment(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryComment(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = eventapp.ArchitecturePersistentManager.instance().getSession();
			return queryComment(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Comment[] listCommentByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = eventapp.ArchitecturePersistentManager.instance().getSession();
			return listCommentByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Comment[] listCommentByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = eventapp.ArchitecturePersistentManager.instance().getSession();
			return listCommentByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryComment(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From eventapp.Comment as Comment");
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
	
	public List queryComment(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From eventapp.Comment as Comment");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Comment", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Comment[] listCommentByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryComment(session, condition, orderBy);
			return (Comment[]) list.toArray(new Comment[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Comment[] listCommentByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryComment(session, condition, orderBy, lockMode);
			return (Comment[]) list.toArray(new Comment[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Comment loadCommentByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = eventapp.ArchitecturePersistentManager.instance().getSession();
			return loadCommentByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Comment loadCommentByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = eventapp.ArchitecturePersistentManager.instance().getSession();
			return loadCommentByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Comment loadCommentByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Comment[] comments = listCommentByQuery(session, condition, orderBy);
		if (comments != null && comments.length > 0)
			return comments[0];
		else
			return null;
	}
	
	public Comment loadCommentByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Comment[] comments = listCommentByQuery(session, condition, orderBy, lockMode);
		if (comments != null && comments.length > 0)
			return comments[0];
		else
			return null;
	}
	
	public java.util.Iterator iterateCommentByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = eventapp.ArchitecturePersistentManager.instance().getSession();
			return iterateCommentByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateCommentByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = eventapp.ArchitecturePersistentManager.instance().getSession();
			return iterateCommentByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateCommentByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From eventapp.Comment as Comment");
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
	
	public java.util.Iterator iterateCommentByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From eventapp.Comment as Comment");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Comment", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Comment createComment() {
		return new eventapp.Comment();
	}
	
	public boolean save(eventapp.Comment comment) throws PersistentException {
		try {
			eventapp.ArchitecturePersistentManager.instance().saveObject(comment);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(eventapp.Comment comment) throws PersistentException {
		try {
			eventapp.ArchitecturePersistentManager.instance().deleteObject(comment);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean refresh(eventapp.Comment comment) throws PersistentException {
		try {
			eventapp.ArchitecturePersistentManager.instance().getSession().refresh(comment);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(eventapp.Comment comment) throws PersistentException {
		try {
			eventapp.ArchitecturePersistentManager.instance().getSession().evict(comment);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
