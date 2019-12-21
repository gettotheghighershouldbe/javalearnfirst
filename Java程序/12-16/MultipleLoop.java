import java.util.Scanner;

public class MultipleLoop{
	public static void main(String[] args){
	
	//多重循环
	//打印矩形（4*5）；
	
	
	/*for(int i = 1;i<=4;i++){
		
		for(int j =1;j<=5;j++){
		
		System.out.print("*");
		}
		
		System.out.println();
		
	}*/
	
	
	//打印平行四边形(参照别人才写出来的，逻辑能力不够强)
	
	/*for(int i = 1;i<=5;i++){
		
		
		for(int k = 1;k<=i;k++){
			System.out.print(" ");
		}
		
		for(int j = 1;j<=5;j++){
			System.out.print("*");
		}
		
		System.out.println();
	}
	*/
	
	//打印等腰三角形
	/*for(int i = 0;i<4;i++){
	
		for(int k = 0;k <= i;k++){
			System.out.print(" ");
		}
		
		for(int j =1;j<=7-2*i;j++){
			System.out.print("*");
		}
		
		System.out.println();
	}*/
	
	
	//打印棱形(现在还没写出来，慢慢学)
	
	
	
	//多重循环中使用continue 3个班级各4名学员参赛，计算每个班级参赛学员平均分，统计成绩大于85分学员数
	
	
	Scanner sc = new Scanner(System.in);
	int count = 0;
	int sum = 0;
	for(int i =1;i<=3;i++){
		
		for(int k = 1;k<=4;k++){
			
			System.out.println("请输入第"+i+"班的第"+k+"个学生的分数");
		    int j = sc.nextInt();
			
			if(j>85){
			System.out.println("这个学生分数大于85分");
			count = count +1; 
		}else{continue;}
			sum = sum +j;
		}
	
		System.out.println("第"+i+"班的学生平均成绩为"+sum/4);	
	
		
	}
		System.out.println("高于85分的人数为"+count);
	

		
		
	
		
	}
}