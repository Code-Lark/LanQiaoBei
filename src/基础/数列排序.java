package 基础;

import java.util.ArrayList;
import java.util.Scanner;

public class 数列排序 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		//输入数组
		ArrayList list=new ArrayList();
		for(int i=0;i<n;i++) {
			list.add(sc.nextInt());
		}
		
		list.sort(null);
		int i;
		for(i=0;i<list.size()-1;i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.print(list.get(i));
	}
}
