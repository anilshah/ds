package linkedin;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileParsing {
	
	public static void main(String[] args) {
	
		
		File[] f = new File("abc.txt").listFiles();
		TraverseDir(f);
	}

	void loadFile(){
		
		BufferedReader br = null;
		
		try{
		br = new BufferedReader(new FileReader("abc.txt"));
		
		String line;
		while((line=br.readLine())!=null){
			
			String ar[] = line.split("--");
		}
		
		}
		catch(IOException e){
			
			e.printStackTrace();
		}
	}
	
	static void TraverseDir(File[] f){
		
		for(File f1: f){
			
			if(f1.isDirectory()){
				System.out.println("dir name is:"+f1.getName());
				
				TraverseDir(f1.listFiles());
				
			}
			else{
				
				System.out.println("file is=="+f1.getName());
			}
		}
	}
}
