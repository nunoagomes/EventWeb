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
@Table(name="Attachment")
public class Attachment implements Serializable {
	public Attachment() {
	}
	
	private int ID;
	
	private String filename;
	
	private String createTimestamp;
	
	private String updateTimestamp;
	
	public void setID(int value) {
		this.ID = value;
	}
	
	@Column(name="ID", nullable=false, length=11)	
	@Id	
	@GeneratedValue(generator="EVENTAPP_ATTACHMENT_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="EVENTAPP_ATTACHMENT_ID_GENERATOR", strategy="native")	
	public int getID() {
		return ID;
	}
	
	@Transient	
	public int getORMID() {
		return getID();
	}
	
	public void setFilename(String value) {
		this.filename = value;
	}
	
	@Column(name="Filename", nullable=false, length=255)	
	public String getFilename() {
		return filename;
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
