import java.util.Scanner;
public class WhilePractice{
	public static void main(String[] args){
		//100以内的偶数和相加
		/*int i = 1;
		int count = 0;
		while(i<=100){
			if(i%2 == 0){
			count = count + i;	
			}
			
			i ++;
		}
		System.out.println("100以内偶数的和值为"+count);*/
		
		//购物清单实现(自己的思路和方式)
		
		/*System.out.println("****************************");
		System.out.println("请选择购买的商品编号：");
		System.out.println("1.T恤"+"2.网球鞋"+"3.网球拍");
		System.out.println("****************************");
		
		String str = "y";
		Scanner sc = new Scanner(System.in);
		double sum = 0.0;
		while(str.equals("y")){
			
			double count = 0.0;
			double price = 0.0;
			System.out.println("请输入商品编号");
			int num = sc.nextInt();
			System.out.println("请输入购买商品的数量");
			int qty = sc.nextInt();
			if(num==1){
				System.out.println("T恤￥245.0 数量"+qty+"合计￥"+245.0*qty);
				price = 245.0;count = price*qty;
			}else if(num==2){
				System.out.println("网球鞋￥570.0 数量"+qty+"合计￥"+570*qty);
				price = 570.0;count = price*qty;
			}else{
				System.out.println("网球拍￥320.0 数量"+qty+"合计￥"+320*qty);
				price = 320.0;count = price*qty;
			}
			//这行写的是不太好的
			sum = sum + count;
			System.out.println(sum);
			System.out.println("是否继续(y/n)");
			str = sc.next();
			System.out.println(str);
			
		}
		double discount = 0.0;
		discount = 0.8*sum;
		System.out.println("应付金额="+discount);
		
		System.out.println("实付金额为");
		double pay = sc.nextDouble();
		System.out.println("实付金额="+pay);

		if(pay<discount){
			System.out.println("您输入的金额小于应付金额，请重新输入：");
		}else{
			System.out.println("找零"+(pay-discount));
		}*/
		
		
		//借鉴了别人的好方法写的购物结算（switch在等值里确实比较好用）
		/*Scanner sc = new Scanner(System.in);
		System.out.println("**************************");
		System.out.println("请选择购买的商品编号：");
		System.out.println("1.T恤"+"2.网球鞋"+"3.网球拍");
		System.out.println("**************************");
		
		
		String goon = "y";
		double sum = 0.0;
		
		while(goon.equals("y")){
			
			double price = 0.0;
			double count = 0.0;
			String name;
			
			System.out.println("请输入商品编号");
			int num = sc.nextInt();
			System.out.println("请输入购买商品的数量");
			int qty = sc.nextInt();
			
			switch(num){
				case 1:
				price = 245.0;
				name = "1.T恤";
				count =  price * qty;
				System.out.println("您选择的产品是"+name+",数量是"+qty+",合计价格是"+count);
				break;
				
				case 2:
				price = 570.0;
				name = "2.网球鞋";
				count =  price * qty;
				System.out.println("您选择的产品是"+name+",数量是"+qty+",合计价格是"+count);
				break;
				
				case 3:
				price = 320.0;
				name = "3.网球拍";
				count =  price * qty;
				System.out.println("您选择的产品是"+name+",数量是"+qty+",合计价格是"+count);
				break;
			}
			
			sum = count + sum;
			System.out.println("是否继续:y/n");
			goon = sc.next();
			
			System.out.println("是否这个会执行完？");
		}
		
		System.out.println("商品价格总计"+sum);
		double discount = sum * 0.8;
		System.out.println("商品应付"+discount);
		System.out.println("商品实付");
		double pay = sc.nextDouble();
		
		
		if(pay<discount){
			System.out.println("钱给少了，加钱");
		}else{
			System.out.println("找钱"+(pay-discount));
		}*/
		
		
		
		//计算顾客年龄比例(自己写的相对有点复杂，不过可以实现修改的需求，还不错)
		
		/*int agedown = 0;
		int ageup = 0;
		double agesum = 0.0;
		double downrate = 0.0;
		double uprate = 0.0;
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<11;i++){
			System.out.println("请输入第"+i+"位顾客的年龄");
			int age = sc.nextInt();
			if(age<=30){
				System.out.println("年龄小于30岁");
				agedown = agedown+1; 
				System.out.println(agedown);
			}else{
				System.out.println("年龄大于30岁");
				ageup = ageup+1;
				System.out.println(ageup);
			}
		}	
		agesum = agedown+ageup;
		downrate = agedown/agesum;
		uprate = ageup/agesum;
		System.out.println("30岁以下的比例是："+downrate*100+"%");
		System.out.println("30岁以上的比例是："+uprate*100+"%");*/
		
		
		//用while和for循环分别计算100以内奇数和偶数的和，并输出。
		//先用while循环
		
		/*int i=1;
		int count = 0;
		while(i<=100){
			if(i%2==0){
			count = count + i;}
			i++;
		}
		System.out.println("100以内的所有偶数相加为"+count);
		*/
		
		//100以内奇数相加的和
		/*int i=1;
		int count = 0;
		while(i<=100){
			if(i%2==1){
				count=count+i;
			}
			i++;
		}
		System.out.println("100以内的所有奇数相加为"+count);*/
		

		//用for循环实现 先实现偶数和
		
		/*int count = 0;
		for(int i=1;i<=100;i++){
			if(i%2==0){
				count = count + i;
			}
		}
		System.out.println("100以内的所有偶数相加为"+count);*/
		
		//再用for实现奇数和
		
		/*int count = 0;
		for(int i=1;i<=100;i++){
			if(i%2==1){
				count = count + i;
			}
		}
		System.out.println("100以内的所有奇数相加为"+count);*/
		
		
		//用while和for循环输出1-1000之间能被5整除的数，且每行输出3个。
		//先用while循环试试
		int i = 1;
		int count = 0;
		while(i<1000){
			if(i%5==0){
				System.out.println(i);
				count++;
				if(count>=3){
				System.out.println(\t);
			}
			
			}
			
			i++;
		}		
		
		
	}
}