package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class FEE {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		student s1 = new student(8,"krishna");
		student s2 = new student(89,"amit");
		File file = new File("/Users/Anil.kumar/Desktop/FEE.json");
		//FileInputStream fin = new FileInputStream(file);
		FileOutputStream fout = new FileOutputStream(file);
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(s1);
		//out.writeObject(s2);
		
		FileInputStream fin = new FileInputStream(file);
		ObjectInputStream oin = new ObjectInputStream(fin);
		student ss = (student)oin.readObject();
		System.out.println(ss.id);
		out.close();
		fout.close();

	}

}
class student implements Serializable{
	int id;
	String name;
	student(int id,String name){
		this.id = id;
		this.name = name;
	}
}