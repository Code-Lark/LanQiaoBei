package ����;

public class ������ {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		for(Integer i=10;i<100;i++) {
			String str=Integer.toString(i);
			StringBuilder sb=new StringBuilder(str);
			System.out.println(i+sb.reverse().toString());
		}
	}
}
