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
package eventapp;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Comment")
public class Comment implements Serializable {
	public Comment() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == eventapp.ORMConstants.KEY_COMMENT_USER) {
			this.user = (eventapp.User) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private eventapp.User user;
	
	private String text;
	
	private String createTimestamp;
	
	private String updateTimestamp;
	
	public void setID(int value) {
		this.ID = value;
	}
	
	@Column(name="ID", nullable=false, length=11)	
	@Id	
	@GeneratedValue(generator="EVENTAPP_COMMENT_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="EVENTAPP_COMMENT_ID_GENERATOR", strategy="native")	
	public int getID() {
		return ID;
	}
	
	@Transient	
	public int getORMID() {
		return getID();
	}
	
	public void setText(String value) {
		this.text = value;
	}
	
	@Column(name="Text", nullable=false, length=255)	
	public String getText() {
		return text;
	}
	
	public void setCreateTimestamp(String value) {
		this.createTimestamp = value;
	}
	
	@Column(name="CreateTimestamp", nullable=true)	
	public String getCreateTimestamp() {
		return createTimestamp;
	}
	
	public void setUpdateTimestamp(String value) {
		this.updateTimestamp = value;
	}
	
	@Column(name="UpdateTimestamp", nullable=true)	
	public String getUpdateTimestamp() {
		return updateTimestamp;
	}
	
	public void setUser(eventapp.User value) {
		this.user = value;
	}
	
	@ManyToOne(targetEntity=eventapp.User.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="UserID", referencedColumnName="ID", nullable=false) })	
	public eventapp.User getUser() {
		return user;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
