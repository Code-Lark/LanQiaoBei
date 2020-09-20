package 基础;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class 特殊回文数 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;
		int b=0;
		int c=0;
		int sum=0;
		ArrayList<String> five=new ArrayList<String>();
		ArrayList<String> six=new ArrayList<String>();
		
		for(int i=100;i<1000;i++) {
			a=i/100;
			b=i/10%10;
			c=i%10;
			sum=a+b+c+b+a;
			if(sum==n)
				five.add(""+i+b+a);
			if((sum+c)==n)
				six.add(""+i+c+b+a);
		}
		for(String tmp:five) {
			System.out.println(tmp);
		}
		for(String tmp:six) {
			System.out.println(tmp);
		}
	}
}
