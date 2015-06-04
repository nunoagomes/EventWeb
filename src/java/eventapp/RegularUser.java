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
@Table(name="RegularUser")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("RegularUser")
@PrimaryKeyJoinColumn(name="UserID", referencedColumnName="ID")
public class RegularUser extends eventapp.User implements Serializable {
	public RegularUser() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == eventapp.ORMConstants.KEY_REGULARUSER_EVENTS) {
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
	
	private String firstName;
	
	private String lastName;
	
	private java.util.Set ORM_events = new java.util.HashSet();
	
	public void setFirstName(String value) {
		this.firstName = value;
	}
	
	@Column(name="FirstName", nullable=false, length=100)	
	public String getFirstName() {
		return firstName;
	}
	
	public void setLastName(String value) {
		this.lastName = value;
	}
	
	@Column(name="LastName", nullable=false, length=100)	
	public String getLastName() {
		return lastName;
	}
	
	private void setORM_Events(java.util.Set value) {
		this.ORM_events = value;
	}
	
	@ManyToMany(targetEntity=eventapp.Event.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set getORM_Events() {
		return ORM_events;
	}
	
	@Transient	
	public final eventapp.EventSetCollection events = new eventapp.EventSetCollection(this, _ormAdapter, eventapp.ORMConstants.KEY_REGULARUSER_EVENTS, eventapp.ORMConstants.KEY_EVENT_REGULARUSERS, eventapp.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
