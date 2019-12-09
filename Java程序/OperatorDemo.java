public class OperatorDemo{
	public static void main(String[] args){
		int a = 1;
		int b = 2;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);	
		System.out.println(a++);
		System.out.println(++a);
		
		System.out.println(a--);
		System.out.println(--a);
		System.out.println(b);
		System.out.println(++b+b++);
		System.out.println(b);
		//扩展值运算符
		int c =1;
		//两写法意义一样，表示加2的操作
		c = c + 2;
		c += 2;
		
		byte d =10;
		//d = d + 1;
		d += 1;
		
		//关系运算符:返回的值是布尔类型，也就是说只有true和false两种情况
		System.out.println(1>2);
		System.out.println(1>2);	
		System.out.println(1>=2);
		System.out.println(1<=2);
		System.out.println(1==2);
		System.out.println(1!=2);
		
		a = 3;
		b = 2;
		System.out.println(a+=b);
		System.out.println(a);
		System.out.println(a-=b);
		a=3;
		b=2;
		System.out.println(a);
		System.out.println(b);
		//System.out.println(a+=a);
		//System.out.println(b+=b);
		
		System.out.println(a = a + a);
		System.out.println(b = b + b);
		System.out.println(a =  a + 1);
		//System.out.println(a + 1 = a);
		
		System.out.println(3>5 && 3<4);
		System.out.println(3>5 || 3<4);
		System.out.println(!(3>4));
		System.out.println(!false);
		
		//位运算符：只能操作数值，操作的时候会转成二进制进行运算
		System.out.println(4 & 5);
		System.out.println(4 | 5);
		System.out.println(4 ^ 5);
		System.out.println(~4);
		
		System.out.println(2<<3);
		System.out.println(16>>2);
		
		System.out.println(3>2?3:2);
		
		int x =10;
		System.out.println(x<100 && x>0);
		
	}
}