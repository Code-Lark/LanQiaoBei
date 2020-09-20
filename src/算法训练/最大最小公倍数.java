package 算法训练;

import java.util.Scanner;

public class 最大最小公倍数 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc =new Scanner(System.in);
		long n=sc.nextLong();
		
		if(n%2==0) {
			if(n%3==0) {
				System.out.println((n-1)*(n-2)*(n-3));
			}else {
				System.out.println(n*(n-1)*(n-3));
			}
		}else {
			System.out.println(n*(n-1)*(n-2));
		}
	}

}
