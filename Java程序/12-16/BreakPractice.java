import java.util.Scanner;


public class BreakPractice{
	public static void main(String[] args){
	
	/*Scanner sc = new Scanner(System.in);
	System.out.println("请输入学生姓名");
	String name = sc.next();*/
	
	//先用while循环
	/*int i = 1;
	int sum = 0;
	int score;
	while(i<=6){
		System.out.println("请输入第"+i+"门课的成绩");
		score = sc.nextInt();
		if(score>0){
			System.out.println(score);
		}else{
			System.out.println("抱歉，分数录入错误，请重新进行录入");
			break;
		}
		sum = score + sum;
		i = i + 1;
		System.out.println("张浩的平均分是："+sum/(i-1));
	} 
	*/
	
	//然后用for循环
	/*int sum = 0;
	int score;
	for(int i = 1;i<=6;i++){
		System.out.println("请输入第"+i+"门课的成绩");
		score = sc.nextInt();
		if(score<0){
			break;
		}
		sum = sum + score;
		System.out.println("目前的总分为"+sum);
		
	}
	System.out.println("抱歉，分数录入错误，请重新进行录入");
	*/
	
	
	//1~10之间的整数相加，得到累加值大于20的当前数；
	
	/*int sum = 0;
	for(int i = 1;i<=10;i++){
		sum = sum + i;
		if(sum>20){
		System.out.println("当前的数为"+i);
			break;
		}
	}*/

	
	

	}
}