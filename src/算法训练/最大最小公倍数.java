package �㷨ѵ��;

import java.util.Scanner;

public class �����С������ {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner sc =new Scanner(System.in);
		long n=sc.nextLong();
		
		if(n%2==0) {
			if(n%3==0) {
				System.out.println((n-1)*(n-2)*(n-3));
			}else {
				System.out.println(n*(n-1)*(n-3));
			}
		}else {
			System.out.println(n*(n-1)*(n-2));
		}
	}

}
