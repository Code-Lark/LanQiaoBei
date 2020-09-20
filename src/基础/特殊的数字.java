package 基础;

public class 特殊的数字 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int a=0;
		int b=0;
		int c=0;
		for(int i=125;i<1000;i++) {
			a=i/100;
			b=i/10%10;
			c=i%10;
			if(i==a*a*a+b*b*b+c*c*c) {
				System.out.println(i);
			}
		}
	}
}
