package mypack;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class test {
	
	public static void main(String[] args){
		
		//Employee e1 = new Employee(1, "hello");
		//Employee e2 = new Employee(2, "jhj");
		
		//	Employee e3 = new Employee("Anil");
		
		SessionFactory sf =  new AnnotationConfiguration().configure().buildSessionFactory();
		Session myses = sf.openSession();
		
		Transaction tr = myses.beginTransaction();
		
		//myses.beginTransaction();
		
		//For select
		Employee eget = (Employee)myses.get(Employee.class, 2);
		
		//Update
		
		//eget.setName("Krish");
		//myses.update(eget);
		//myses.delete(eget);
		//String hql = "insert into hibernateTest.Emp3 (id, empName, empId) values (1,'as', '2')";
		//Query q1 = myses.createQuery(hql);
		//int result = q1.executeUpdate();

		Query q = myses.createQuery("From Employee where id=:e");
		q.setInteger("e", 1);
		
		List<Employee> list = q.list();
		
		for(Employee e : list){
			
			System.out.println(e.getName());
		}
		
		//myses.save(e1);
		//myses.save(e3);
		myses.getTransaction().commit();
		
	}

}
