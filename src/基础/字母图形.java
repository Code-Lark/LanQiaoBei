package 基础;

import java.util.Scanner;

public class 字母图形 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//输入
		Scanner sc =new Scanner(System.in);
		Integer n=sc.nextInt();
		Integer m=sc.nextInt();
			
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print((char)('A'+Math.abs(j-i)));
			}
			System.out.println();
		}		
	}
}
