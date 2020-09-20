package 入门;

import java.util.Scanner;

public class 圆的面积 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		double r=sc.nextInt();
		double area=Math.PI*r*r;
		System.out.printf("%.7f",area);
	}

}
