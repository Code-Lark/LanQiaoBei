package 基础;

import java.util.Scanner;

public class 查找整数 {
	
	public static int search(int arr[],int a) {
		for(int i=1;i<=arr.length;i++) {
			if(a==arr[i-1]) {
				return i;
			}	
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//输入
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int a=sc.nextInt();
		
		System.out.println(search(arr, a));
	}

}
