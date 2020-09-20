package 入门;

import java.util.Scanner;

public class Fibonacci数列 {
	
	public static int fibo(int n) {
		int f1=1,f2=1,temp=0;
		for(int i=3;i<=n;i++) {
			temp=f2;
			f2=(f1+f2)%10007;
			f1=temp;
		}
		return f2;
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(fibo(n));
	}
}
