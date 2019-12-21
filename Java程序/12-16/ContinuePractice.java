import java.util.Scanner;
//continue只能用在循环里，跳过循环体中剩余的语句而执行下一次循环，通常于条件语句一起使用，加速循环
public class ContinuePractice{
	public static void main(String[] args){
		
		//循环录入java课的学生成绩，统计分数大于等于80分的学生比例
		
		Scanner sc = new Scanner(System.in);
		System.out.println("班级总人数为：");
		int j = sc.nextInt();
		int count = 0;
		int score;
		for(int i = 1;i<=j;i++){
		
			System.out.println("请输入第"+i+"位学生的成绩:");
			score = sc.nextInt();
			if(score<80){
				continue;
			}
			count = count + 1;
		}
			System.out.println("80分以上的学生人数是"+count);
			double rate = (double)count/j*100;
			System.out.println("80分以上的学生所占的比例是"+rate+"%");
		
	}
}