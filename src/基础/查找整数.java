package ����;

import java.util.Scanner;

public class �������� {
	
	public static int search(int arr[],int a) {
		for(int i=1;i<=arr.length;i++) {
			if(a==arr[i-1]) {
				return i;
			}	
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//����
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
