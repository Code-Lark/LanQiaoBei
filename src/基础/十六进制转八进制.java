package ����;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class ʮ������ת�˽��� {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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
	 * @param str ��ת������
	 * @param x  ��ת�������Ľ���
	 * @param y  ת������Ľ���
	 * @return
	 */
	public static String Transform(String str,int x,int y) {
		return new BigInteger(str, x).toString(y);
	}
}
