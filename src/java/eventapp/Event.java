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
@Table(name="Event")
public class Event implements Serializable {
	public Event() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == eventapp.ORMConstants.KEY_EVENT_REGULARUSERS) {
			return ORM_regularUsers;
		}
		else if (key == eventapp.ORMConstants.KEY_EVENT_PHOTOS) {
			return ORM_photos;
		}
		else if (key == eventapp.ORMConstants.KEY_EVENT_COMMENTS) {
			return ORM_comments;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == eventapp.ORMConstants.KEY_EVENT_EVENTCATEGORY) {
			this.eventCategory = (eventapp.EventCategory) owner;
		}
		
		else if (key == eventapp.ORMConstants.KEY_EVENT_ORGANIZATIONUSER) {
			this.organizationUser = (eventapp.OrganizationUser) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private eventapp.OrganizationUser organizationUser;
	
	private eventapp.EventCategory eventCategory;
	
	private String title;
	
	private String date;
	
	private String description;
	
	private String additionalInformation;
	
	private String country;
	
	private String city;
	
	private String zip;
	
	private String address;
	
	private String addressOptional;
	
	private double price;
	
	private double latitude;
	
	private double longitude;
	
	private String createTimestamp;
	
	private String updateTimestamp;
	
	private java.util.Set ORM_regularUsers = new java.util.HashSet();
	
	private java.util.Set ORM_photos = new java.util.HashSet();
	
	private java.util.Set ORM_comments = new java.util.HashSet();
	
	public void setID(int value) {
		this.ID = value;
	}
	
	@Column(name="ID", nullable=false, length=11)	
	@Id	
	@GeneratedValue(generator="EVENTAPP_EVENT_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="EVENTAPP_EVENT_ID_GENERATOR", strategy="native")	
	public int getID() {
		return ID;
	}
	
	@Transient	
	public int getORMID() {
		return getID();
	}
	
	public void setTitle(String value) {
		this.title = value;
	}
	
	@Column(name="Title", nullable=false, length=200)	
	public String getTitle() {
		return title;
	}
	
	public void setDate(String value) {
		this.date = value;
	}
	
	@Column(name="`Date`", nullable=false)	
	public String getDate() {
		return date;
	}
	
	public void setDescription(String value) {
		this.description = value;
	}
	
	@Column(name="Description", nullable=true, length=3000)	
	public String getDescription() {
		return description;
	}
	
	public void setAdditionalInformation(String value) {
		this.additionalInformation = value;
	}
	
	@Column(name="AdditionalInformation", nullable=true, length=3000)	
	public String getAdditionalInformation() {
		return additionalInformation;
	}
	
	public void setCity(String value) {
		this.city = value;
	}
	
	@Column(name="City", nullable=false, length=100)	
	public String getCity() {
		return city;
	}
	
	public void setCountry(String value) {
		this.country = value;
	}
	
	@Column(name="Country", nullable=false, length=100)	
	public String getCountry() {
		return country;
	}
	
	public void setZip(String value) {
		this.zip = value;
	}
	
	@Column(name="Zip", nullable=false, length=12)	
	public String getZip() {
		return zip;
	}
	
	public void setAddress(String value) {
		this.address = value;
	}
	
	@Column(name="Address", nullable=false, length=255)	
	public String getAddress() {
		return address;
	}
	
	public void setAddressOptional(String value) {
		this.addressOptional = value;
	}
	
	@Column(name="AddressOptional", nullable=true, length=255)	
	public String getAddressOptional() {
		return addressOptional;
	}
	
	public void setPrice(double value) {
		this.price = value;
	}
	
	@Column(name="Price", nullable=false)	
	public double getPrice() {
		return price;
	}
	
	public void setLatitude(double value) {
		this.latitude = value;
	}
	
	@Column(name="Latitude", nullable=false)	
	public double getLatitude() {
		return latitude;
	}
	
	public void setLongitude(double value) {
		this.longitude = value;
	}
	
	@Column(name="Longitude", nullable=false)	
	public double getLongitude() {
		return longitude;
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
	
	public void setEventCategory(eventapp.EventCategory value) {
		if (eventCategory != null) {
			eventCategory.events.remove(this);
		}
		if (value != null) {
			value.events.add(this);
		}
	}
	
	@Transient	
	public eventapp.EventCategory getEventCategory() {
		return eventCategory;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_EventCategory(eventapp.EventCategory value) {
		this.eventCategory = value;
	}
	
	@ManyToOne(targetEntity=eventapp.EventCategory.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="EventCategoryID", referencedColumnName="ID", nullable=false) })	
	private eventapp.EventCategory getORM_EventCategory() {
		return eventCategory;
	}
	
	public void setOrganizationUser(eventapp.OrganizationUser value) {
		if (organizationUser != null) {
			organizationUser.events.remove(this);
		}
		if (value != null) {
			value.events.add(this);
		}
	}
	
	@Transient	
	public eventapp.OrganizationUser getOrganizationUser() {
		return organizationUser;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_OrganizationUser(eventapp.OrganizationUser value) {
		this.organizationUser = value;
	}
	
	@ManyToOne(targetEntity=eventapp.OrganizationUser.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="OrganizationUserUserID", referencedColumnName="UserID", nullable=false) })	
	private eventapp.OrganizationUser getORM_OrganizationUser() {
		return organizationUser;
	}
	
	private void setORM_RegularUsers(java.util.Set value) {
		this.ORM_regularUsers = value;
	}
	
	@ManyToMany(targetEntity=eventapp.RegularUser.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="RegularUser_Event", joinColumns={ @JoinColumn(name="EventID") }, inverseJoinColumns={ @JoinColumn(name="RegularUserUserID") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set getORM_RegularUsers() {
		return ORM_regularUsers;
	}
	
	@Transient	
	public final eventapp.RegularUserSetCollection regularUsers = new eventapp.RegularUserSetCollection(this, _ormAdapter, eventapp.ORMConstants.KEY_EVENT_REGULARUSERS, eventapp.ORMConstants.KEY_REGULARUSER_EVENTS, eventapp.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Photos(java.util.Set value) {
		this.ORM_photos = value;
	}
	
	@OneToMany(orphanRemoval=true, targetEntity=eventapp.Attachment.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.ALL})	
	@JoinColumns({ @JoinColumn(name="EventID", nullable=false) })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set getORM_Photos() {
		return ORM_photos;
	}
	
	@Transient	
	public final eventapp.AttachmentSetCollection photos = new eventapp.AttachmentSetCollection(this, _ormAdapter, eventapp.ORMConstants.KEY_EVENT_PHOTOS, eventapp.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Comments(java.util.Set value) {
		this.ORM_comments = value;
	}
	
	@OneToMany(orphanRemoval=true, targetEntity=eventapp.Comment.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.ALL})	
	@JoinColumns({ @JoinColumn(name="EventID", nullable=false) })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set getORM_Comments() {
		return ORM_comments;
	}
	
	@Transient	
	public final eventapp.CommentSetCollection comments = new eventapp.CommentSetCollection(this, _ormAdapter, eventapp.ORMConstants.KEY_EVENT_COMMENTS, eventapp.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
