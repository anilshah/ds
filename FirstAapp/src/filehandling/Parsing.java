package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Parsing {
	
	public static void main(String[] args){
		
		
		BufferedReader br = null;
		
		try{
			br = new BufferedReader(new FileReader("/Users/Anil.kumar/Documents/anilapptech/FirstAapp/src/filehandling/log.txt"));
			
			String line;
			ArrayList<logData> ipArr = new ArrayList<>();
			while((line=br.readLine()) !=null){
				
				String spiltStringArr[] = line.split("- -");
				logData l = new logData();
				l.setDate(spiltStringArr[0]);
				
				ipArr.add(l);
				System.out.println(line);
				//ipArr.add(spiltStringArr[0]);
				
			}
			
			
			
		}
		catch(IOException e){
			
			e.printStackTrace();
			
		}
		finally{
			try{
				System.out.println("closing file");
			br.close();
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}
		
		File[] dr = new File("/Users/Anil.kumar/Documents/anilapptech").listFiles();
		visitDirectory(dr);
		
		
	}
	
	
	static void visitDirectory(File[] dirs){
		
		for(File dir:dirs){
		if(dir.isDirectory()){
			
			System.out.println("dir=="+dir.getName());
			String child[] = dir.list();
				
				visitDirectory(dir.listFiles());
			
		}
		else
		{
			System.out.println("file name=="+dir.getName());
			
			BufferedReader br1 = null;
			try{
				br1 = new BufferedReader(new FileReader(dir.getName()));
				
			}
			catch(IOException e)
			{
				e.printStackTrace();
				
			}finally{
				
				try{
					br1.close();
					
				}
				catch(IOException e)
				{
					e.printStackTrace();
				}
			}
			
		}
		}
		
	}

}
