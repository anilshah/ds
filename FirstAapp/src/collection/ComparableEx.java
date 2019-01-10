package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ComparableEx {

	public static void main(String[] args) {
		/*student s1 = new student("amit",3);
		student s2 = new student("kishna",6);
		student s3 = new student("bimal",2);
		ArrayList<student> ar = new ArrayList<>();
		ar.add(s1);
		ar.add(s2);
		ar.add(s3);
		Collections.sort(ar);
		//Iterator<student> itr = ar.iterator();
		for(student ss : ar){
				System.out.println(ss.name+":"+ss.rno);
		}
		
		System.out.println(ar);*/
		
		Employee e1 = new Employee(1,"xy");
		Employee e2 = new Employee(9, "ab");
		Employee e3 = new Employee(2, "h");
		
		ArrayList<Employee> ar = new ArrayList<>();
		ar.add(e1);
		ar.add(e2);
		ar.add(e3);
		Collections.sort(ar,new SortempById());
	}

}
class student implements Comparable<student>{
	int rno;
	String name;
	
	student(String name,int rno){
		this.name = name;
		this.rno = rno;
	}

	@Override
	public int compareTo(student o) {
		/*if(rno>o.rno){
			return 1;
		}else if(rno<o.rno){
			return -1;
		}else{
			return 0;
		}*/
		return name.compareTo(o.name);
	}
}

class Employee {

	int id;
	String name;
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
	
	Employee(int id ,String name){
		this.id = id;
		this.name= name;
	}
}

class SortEmpByName implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		
		return e1.name.compareTo(e2.name);
		
	}
	
	
}

class SortempById implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1 = (Employee)o1;
		Employee e2 = (Employee)o2;
		if(e1.id>e2.id){
			return 1;
		}else if(e1.id<e2.id){
			return -1;
		}else{
			return 0;
		}
		
	}
	
}