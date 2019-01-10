package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

import com.google.gson.Gson;

public class FA {

	public static void main(String[] args) throws IOException {
		//File file = new File("/Users/Anil.kumar/Desktop");
		File fl = new File("/Users/Anil.kumar/Desktop/t.txt");
		
		/*if(fl.isFile()==true){
				
			System.out.println("this is a file");
		}
		else
			System.out.println("this is not a file");*/
		StringBuilder sb = new StringBuilder();
		if(fl.exists()==true){
		int a;	
			//System.out.println("file exists");
			FileInputStream fin = new FileInputStream(fl);
			FileOutputStream fout = new FileOutputStream("/Users/Anil.kumar/Desktop/new2.txt");
			//a=fin.read();
			//System.out.println(fin.read());
			while((a=fin.read())!=-1){
				fout.write(a);
				sb.append((char)a);
			}
			//System.out.println(sb);
			String ss= sb.toString();
			Gson gs = new Gson();
			//System.out.println(ss);
			Map<Object, Object> mp = gs.fromJson(ss, Map.class);
			//Map<Object, Object> mp = gs.fromJson(ss, Map.class);
			System.out.println(mp.get("sourcingDetails"));
			fin.close();
			fout.close();
		}
		else
		{	
			System.out.println("file doesn't exists");
		}
		
		 
		/*System.out.println(file.getName());
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		
		System.out.println(file.length());
		
		String fileList[] = file.list();
		
		for(String fs : fileList){
			File f  = new File(file+"/"+fs);
			if(f.isDirectory()){
				System.out.println(fs+" is folder");
			}else{
				System.out.println(fs+ " is file");
			}
		}*/

	}
}
