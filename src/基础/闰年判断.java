package 基础;

import java.util.Scanner;

public class 闰年判断 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc =new Scanner(System.in);
		int y=sc.nextInt();
		
		if(y%400==0||(y%4==0&&y%100!=0))
			System.out.println("yes");
		else {
			System.out.println("no");
		}
	}

}
