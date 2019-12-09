public class IfDemo{
	public static void main(String[] args){
	//int i = (int)(6*Math.random())+10;	
	//System.out.println(i);
	
	double i = 6*Math.random();
	//System.out.println(i);
	double j = 6*Math.random();
	double k = 6*Math.random();
	
	int count = (int)(i+j+k);
	//System.out.println(count);
	
	if(count>15){
		System.out.println("今天手气还可以");
	}
	if(count>=10 && count<=15){
	System.out.println("今天手气一般般");
	}
	if(count<10){
		System.out.println("今天手气有点差");
	}
	
	System.out.println("今天总共得了"+count+"分");
	}
	
	}

