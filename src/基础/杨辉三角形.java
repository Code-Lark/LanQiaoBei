package ����;

import java.util.Scanner;

public class ��������� {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		
		int a[][]=new int [n][n+2];
		a[0][1]=1;
		System.out.println(a[0][1]);
		for(int i=1;i<n;i++) {
			for(int j=1;j<=i+1;j++) {
				a[i][j]=a[i-1][j-1]+a[i-1][j];
				if(j==i+1)
					System.out.print(a[i][j]);
				else
					System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
