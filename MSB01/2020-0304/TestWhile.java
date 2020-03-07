// 用while和do-while循环完成 0-9 和 1-10 的输出；

public class TestWhile {
	public static void main (String[] args){
		int i = 0;
		while (i < 10){
			i++;
			System.out.println(i);
			// i++;
		}



		i = 0;
		do{
			i++;
			System.out.println(i);
			// i++;
		}while(i < 10);
	}
}