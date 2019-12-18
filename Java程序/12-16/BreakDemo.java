//break:跳出整个循环。在循环中通常与条件语句一起使用。

import java.util.Scanner;


public class BreakDemo{
	public static void main(String[] args){
		/*int total = 0;
		System.out.println("Begin");
		while(true){
			
			int i = (int)(Math.random()*100);
			System.out.println(i);
			if(i == 88)break;
			total++;
		}
		System.out.println("Game over,used"+total+"times");
		*/
		
		
	Scanner sc = new Scanner(System.in);
	System.out.println("请问今天是星期几？");
	int i = sc.nextInt();
	switch(i){
		case 1:
		System.out.println("星期一");
		break;
		case 2:
		System.out.println("星期二");
		break;
		case 3:
		System.out.println("星期三");
		break;
	}
		
		
		
	}
}

