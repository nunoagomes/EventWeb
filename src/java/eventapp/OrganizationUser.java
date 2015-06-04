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
@Table(name="OrganizationUser")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("OrganizationUser")
@PrimaryKeyJoinColumn(name="UserID", referencedColumnName="ID")
public class OrganizationUser extends eventapp.User implements Serializable {
	public OrganizationUser() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == eventapp.ORMConstants.KEY_ORGANIZATIONUSER_EVENTS) {
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
	
	private String occupation;
	
	private long phoneNumber;
	
	private String organizationName;
	
	private String organizationNIF;
	
	private java.util.Set ORM_events = new java.util.HashSet();
	
	public void setOccupation(String value) {
		this.occupation = value;
	}
	
	@Column(name="Occupation", nullable=false, length=100)	
	public String getOccupation() {
		return occupation;
	}
	
	public void setPhoneNumber(long value) {
		this.phoneNumber = value;
	}
	
	@Column(name="PhoneNumber", nullable=true, length=12)	
	public long getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setOrganizationName(String value) {
		this.organizationName = value;
	}
	
	@Column(name="OrganizationName", nullable=false, length=100)	
	public String getOrganizationName() {
		return organizationName;
	}
	
	public void setOrganizationNIF(String value) {
		this.organizationNIF = value;
	}
	
	@Column(name="OrganizationNIF", nullable=false, unique=true, length=12)	
	public String getOrganizationNIF() {
		return organizationNIF;
	}
	
	private void setORM_Events(java.util.Set value) {
		this.ORM_events = value;
	}
	
	@OneToMany(mappedBy="ORM_OrganizationUser", targetEntity=eventapp.Event.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set getORM_Events() {
		return ORM_events;
	}
	
	@Transient	
	public final eventapp.EventSetCollection events = new eventapp.EventSetCollection(this, _ormAdapter, eventapp.ORMConstants.KEY_ORGANIZATIONUSER_EVENTS, eventapp.ORMConstants.KEY_EVENT_ORGANIZATIONUSER, eventapp.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
