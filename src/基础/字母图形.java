package ����;

import java.util.Scanner;

public class ��ĸͼ�� {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//����
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
