package ����;

import java.util.Scanner;

public class �������� {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int t=0;
		int max=0;
		int min=0;
		int sum=0;
		t=sc.nextInt();
		max=t;
		min=t;
		sum+=t;
		
		for(int i=0;i<n-1;i++) {
			t=sc.nextInt();
			if(t>max)
				max=t;
			if(t<min)
				min=t;
			sum+=t;
		}
		System.out.println(max);
		System.out.println(min);
		System.out.println(sum);
	}
}
