public class IfDemo{
	public static void main(String[] args){
	
	//单分支结构
	//int i = (int)(6*Math.random())+10;	
	//System.out.println(i);
	
	/*double i = 6*Math.random();
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
	
	System.out.println("今天总共得了"+count+"分");*/
	
	
	//双分支结构
	/*double r = 4*Math.random();
	double area = Math.PI*Math.pow(r,2);
	double circle = 2*Math.PI*r;
	
	System.out.println("半径为"+r);
	System.out.println("面积为"+area);
	System.out.println("周长为"+circle);
	
	
	if(area>=circle){
		System.out.println("面积大于等于周长");
	}
	else{
		System.out.println("面积小于周长");
	}*/
	
	
	//多分支结构
	int age =(int)(100*Math.random());
	System.out.println("年龄是"+age+",属于");
	if(age<15){
		System.out.println("儿童，喜欢玩");
	}else if(age<25){
		System.out.println("青年，喜欢学习");
	}else if(age<45){
		System.out.println("中年，努力工作");
	}else if(age<65){
		System.out.println("中老年，要补钙");
	}else if(age<85){
		System.out.println("老年，多运动");
	}else{
		System.out.println("老寿星，古来稀");
	}
	
	}
	
	}

