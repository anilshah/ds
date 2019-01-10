package hibernateEx;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Columns;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenericGenerator;

@Entity

@Table(name="emp1001")
public class Employee {

	@Id
	@GenericGenerator(name="empGen", strategy="increment")
	@GeneratedValue(generator="empGen")
	@Column(name="id")
	private int id;
	
	@Column
	private String name, address;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
