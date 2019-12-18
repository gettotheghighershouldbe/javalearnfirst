import java.util.Scanner;


public class BreakPractice{
	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("请输入学生姓名");
	String name = sc.next();
	
	//先用while循环
	int i = 1;
	int count = 0;
	while(i<=6){
		System.out.println("请输入第"+i+"门课的成绩");
		int score = sc.nextInt();
		if(score>0){
			System.out.println(score);
		}else{
			System.out.println("抱歉，分数录入错误，请重新进行录入");
			break;
		}
		count = score + count;
		i = i + 1;
		System.out.println("张浩的平均分是："+count/(i-1));
	} 

	}
}