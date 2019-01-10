package filehandling;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FDD {

	public static void main(String[] args) throws IOException {
		int a=23;
		float f = 5.6f;
		String name="krishna";
		
		File file = new File("/Users/Anil.kumar/Desktop/fbb.txt");
		FileOutputStream fout = new FileOutputStream(file);
		DataOutputStream dout = new DataOutputStream(fout);
		
		dout.writeInt(a);
		dout.writeFloat(f);
		dout.writeUTF(name);
		
		dout.close();
		
		FileInputStream fin = new FileInputStream(file);
		DataInputStream din = new DataInputStream(fin);
		
		System.out.println(din.readInt());
		System.out.println(din.readFloat());

	}

}
