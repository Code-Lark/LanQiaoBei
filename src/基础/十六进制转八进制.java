package 基础;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class 十六进制转八进制 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<String> list=new ArrayList<String>();
		for(int i=0;i<n;i++) {
			list.add(sc.next());
		}
		for(String tmp:list) {
			System.out.println(Transform(tmp, 16, 8));
		}
	}
		
	/**
	 * @param str 待转换的数
	 * @param x  待转换的数的进制
	 * @param y  转换结果的进制
	 * @return
	 */
	public static String Transform(String str,int x,int y) {
		return new BigInteger(str, x).toString(y);
	}
}
