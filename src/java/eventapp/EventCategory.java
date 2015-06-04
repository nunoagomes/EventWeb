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
@Table(name="EventCategory")
public class EventCategory implements Serializable {
	public EventCategory() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == eventapp.ORMConstants.KEY_EVENTCATEGORY_EVENTS) {
			return ORM_events;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int ID;
	
	private String categoryName;
	
	private String createTimestamp;
	
	private String updateTimestamp;
	
	private java.util.Set ORM_events = new java.util.HashSet();
	
	public void setID(int value) {
		this.ID = value;
	}
	
	@Column(name="ID", nullable=false, length=11)	
	@Id	
	@GeneratedValue(generator="EVENTAPP_EVENTCATEGORY_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="EVENTAPP_EVENTCATEGORY_ID_GENERATOR", strategy="native")	
	public int getID() {
		return ID;
	}
	
	@Transient	
	public int getORMID() {
		return getID();
	}
	
	public void setCategoryName(String value) {
		this.categoryName = value;
	}
	
	@Column(name="CategoryName", nullable=false, unique=true, length=100)	
	public String getCategoryName() {
		return categoryName;
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
	
	private void setORM_Events(java.util.Set value) {
		this.ORM_events = value;
	}
	
	@OneToMany(mappedBy="ORM_EventCategory", targetEntity=eventapp.Event.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set getORM_Events() {
		return ORM_events;
	}
	
	@Transient	
	public final eventapp.EventSetCollection events = new eventapp.EventSetCollection(this, _ormAdapter, eventapp.ORMConstants.KEY_EVENTCATEGORY_EVENTS, eventapp.ORMConstants.KEY_EVENT_EVENTCATEGORY, eventapp.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
