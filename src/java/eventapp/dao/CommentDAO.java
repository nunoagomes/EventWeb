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

public interface CommentDAO {
	public Comment loadCommentByORMID(int ID) throws PersistentException;
	public Comment getCommentByORMID(int ID) throws PersistentException;
	public Comment loadCommentByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Comment getCommentByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Comment loadCommentByORMID(PersistentSession session, int ID) throws PersistentException;
	public Comment getCommentByORMID(PersistentSession session, int ID) throws PersistentException;
	public Comment loadCommentByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Comment getCommentByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Comment[] listCommentByQuery(String condition, String orderBy) throws PersistentException;
	public Comment[] listCommentByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryComment(String condition, String orderBy) throws PersistentException;
	public java.util.List queryComment(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateCommentByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateCommentByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Comment[] listCommentByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Comment[] listCommentByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryComment(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryComment(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateCommentByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateCommentByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Comment loadCommentByQuery(String condition, String orderBy) throws PersistentException;
	public Comment loadCommentByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Comment loadCommentByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Comment loadCommentByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Comment createComment();
	public boolean save(eventapp.Comment comment) throws PersistentException;
	public boolean delete(eventapp.Comment comment) throws PersistentException;
	public boolean refresh(eventapp.Comment comment) throws PersistentException;
	public boolean evict(eventapp.Comment comment) throws PersistentException;
}
