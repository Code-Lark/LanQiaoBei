package 基础;

import java.util.Scanner;

public class 十进制转十六进制 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		String str=Integer.toHexString(a);
        System.out.println(str.toUpperCase());
	}
}
