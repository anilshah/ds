package hibernateEx;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class employeetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory ses = cfg.buildSessionFactory();
		
		Session dbSession = ses.openSession();**/
		
		Session dbSession = new AnnotationConfiguration().configure().buildSessionFactory().openSession();
		
		Transaction t1 = dbSession.beginTransaction();
		
		Employee e1 = new Employee();
		//e1.setId(2);
		e1.setName("Anil");
		e1.setAddress("bdjha");
		dbSession.persist(e1);
		
		t1.commit();
		dbSession.close();
		
		System.out.println("saved");
		

	}

}
