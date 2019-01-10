package filehandling;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

import com.google.gson.Gson;

public class FBB {

	public static void main(String[] args) throws IOException {
		File file = new File("/Users/Anil.kumar/Desktop/APS-252051.json");
		FileInputStream fin = new FileInputStream(file);
		BufferedInputStream bin = new BufferedInputStream(fin);
		//FileOutputStream fout = new FileOutputStream("/Users/Anil.kumar/Desktop/t.txt");
		//BufferedOutputStream bout = new BufferedOutputStream(fout);
		//InputStreamReader in = new InputStreamReader(fin);
		StringBuilder sb = new StringBuilder();
		int a;
		while((a=bin.read())!=-1){
			sb.append((char)a);
			//bout.write(a);
			//System.out.print((char)a);'
		}
		String ss= sb.toString();
		Gson gs = new Gson();
		System.out.println(sb);
		Map<Object, Object> mp = gs.fromJson(ss, Map.class);
		//Map<Object, Object> mp = gs.fromJson(ss, Map.class);
		System.out.println(mp.get("tempApplId"));
		fin.close();
		//fout.close();
	}

}
