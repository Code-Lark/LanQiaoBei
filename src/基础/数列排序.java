package ����;

import java.util.ArrayList;
import java.util.Scanner;

public class �������� {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		//��������
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
