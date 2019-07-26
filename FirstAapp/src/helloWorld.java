import java.util.*;
import java.io.*;

class helloWorld{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        
        int k=1;
        while(in.hasNext()==true){
        	
        	System.out.println("k. "+in.nextLine());
        }
        
        if(t>=0 && t<=500){
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            if((a>=0 && a<=50) && (b>=0 && b<=50) && (n>=1 && n<=15)){
                int s = 0;
              
               
                for (int j=0; j<n; j++){
                	
                	Double p = Math.pow(2,j)*b;
                	if(j==0)
                    s = a+p.intValue();
                	else
                		s+=p.intValue();
                   

                    System.out.print(s+" ");

                }
            }
        }
    }
        in.close();
    }
}

