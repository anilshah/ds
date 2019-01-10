package mypack;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class myTest {

	Session dbSession;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
		Session myses = sf.openSession();
		
		myTest mt = new myTest();
		mt.dbSession = myses;
		
		//mt.insert();
		//mt.update();
		//mt.delete();
		//mt.select();
		
		/*
		myses.beginTransaction();
		
		Employee e2 = new Employee("Anil2");
		myses.save(e2);
		
		Employee eget1 = (Employee) myses.get(Employee.class, 2);
		eget1.setName("new");
		myses.update(eget1);*/
		
		/*Query q1 = myses.createQuery("From Employee where empId=2");
		
		List <Employee> empList = q1.list();
		
		for(Employee e: empList){
			System.out.println("empid="+e.getId());
			
		}*/
		/*myses.getTransaction().commit();
		myses.close();*/

	}
	
	public void update(){
	
		Session myses = this.dbSession;
		myses.beginTransaction();
		Employee e1 = (Employee) myses.get(Employee.class, 1);
		e1.setName("Amit");
		myses.update(e1);
		
		myses.getTransaction().commit();
		myses.close();
	}
	
	public void select()
	{
		Session myses = this.dbSession;
		
		myses.beginTransaction();
		
		Query q = myses.createQuery("From Employee where empId=1");
		
			List<Employee> empList = q.list();
			if(!empList.isEmpty()){
			
			for(Employee e : empList){
				
				System.out.println("empName=="+e.getName());
			}
		}
		else
		{
			System.out.println("No records");
		}
	}
	
	public void insert(){
		
		Session myses = this.dbSession;
		myses.beginTransaction();
		
		Employee e1 = new Employee("Amit2");
		myses.save(e1);
		myses.getTransaction().commit();
		myses.close();
	}
	
	public void delete(){
		
		Session myses = this.dbSession;
		myses.beginTransaction();
		
		Employee e1 = (Employee)myses.get(Employee.class,1);
		myses.delete(e1);
		myses.getTransaction().commit();
		myses.close();
		
	}

}
