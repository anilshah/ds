package pack;
import java.util.*;
public class WhileEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0; 
		int i=0; 
		while(i<4){
			int x = sc.nextInt();
			if(x<0){
				continue;
			}
			sum+=x;
			
			i++;
		}
		System.out.println(sum);

	}

}
