package pack;
//Single Inheritance
public class inheritanceEx {

	public static void main(String[] args) {
		
		kiddy2 k = new kiddy2();
		System.out.println(k.str+"=="+k.x+"=="+k.str2);
	}
}

class myParent{
	int a=10;
	char x='b'; 
}

//Single Inheritance
class kiddy extends myParent{
	int b=3;
	String str = "hello"; 
}

class kiddy2 extends kiddy{
	int str2=6;
}
//Note: Multiple inheritance is not supported in Java because we can face ambuguity. Use interfaces instead.

//Interfaces
interface Test3{
	int t =1;
}

interface Test4{
	int t4 = 6;
}

class kiddy3 implements Test4, Test3{
	int str2=6;
}
