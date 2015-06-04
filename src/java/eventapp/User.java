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
@Table(name="`User`")
@Inheritance(strategy=InheritanceType.JOINED)
public class User implements Serializable {
	public User() {
	}

	private int ID;
	
	private String email;
	
	private String password;
	
	private String createTimestamp;
	
	private String updateTimestamp;
	
	public void setID(int value) {
		this.ID = value;
	}
	
	@Column(name="ID", nullable=false, length=11)	
	@Id	
	@GeneratedValue(generator="EVENTAPP_USER_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="EVENTAPP_USER_ID_GENERATOR", strategy="native")	
	public int getID() {
		return ID;
	}
	
	@Transient	
	public int getORMID() {
		return getID();
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	@Column(name="Email", nullable=false, unique=true, length=100)	
	public String getEmail() {
		return email;
	}
	
	public void setPassword(String value) {
                this.password = value;
	}
	
	@Column(name="Password", nullable=false, length=100)	
	public String getPassword() {
		return password;
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
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
