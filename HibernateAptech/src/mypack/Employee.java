package mypack;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Pure old Java Object
//Bean Class->All variables are private, Setter and getter, There should be 
@Entity
@Table(name="Emp3")
public class Employee {

	@Id
	//@Column(name="empId")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="empName")
	private String name;
	
	public Employee() {
	
	}
	
	public Employee(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	
	public Employee(String name) {
		
		this.name = name;
	}
	
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
	
	
}
