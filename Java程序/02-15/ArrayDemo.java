/*
数组表示存储相同数据类型数据的有序集合
	特点：
		1、数组中存放的数据必须是同一个数据类型，可以死基本数据类型，也可以是引用数据类型
		2、数组在定义的时候必须要给定大小，且大小不可改变。
		3、可以通过下标值来获取数据，下标从0开始。
		4、插入数组中的数据是有序集合，此时有序并不是指代大小排序，而是指插入的顺序。

	使用：
		1、声明数组
		2、创建空间
		3、赋值
		4、数组操作	

*/

public class ArrayDemo{
	public static void main(String[] args) {
		//声明数组
		int[] array;
		//创建内存空间	
		array = new int[5];
		//数组赋值
		array[0] = 0; 
		array[1] = 1;
		array[2] = 2;
		array[3] = 3;
		array[4] = 4;
		// array[5] = 5;
		//数组操作
		System.out.println(array[2]);

		//数组在几种创建方式
		//1、声明并申请空间 
		int[] arr = new int[4];
		//2、声明数组并赋值
		int[] arr2 = new int[]{1,2,3};
		System.out.println(arr2[2]);
		//3、直接初始化操作
		int[] arr3 = {1,2,3,4,5};

		System.out.println(arr.length);



		/*int[]score = new int[]{60,70,90,100,120};
		double avg;
		int sum = 0;
		for(int i = 0;i < score.length;i++){
			sum = sum + score[i];
		}
		avg = sum/score.length;
		System.out.println("平均分是"+avg);


		int[] scores = new int[5];
		int sum = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("请输入5位学员的成绩：");
		for(int i = o;i<scores.length;i++){
			scores[i]
		}*/
	}

 

}
