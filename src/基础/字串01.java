package ����;

public class �ִ�01 {

	public static void main(String[] args) {
		String str="";
		// TODO �Զ����ɵķ������
		for(int i=0;i<32;i++) {
			str=Integer.toBinaryString(i);
			while(str.length()<5) {
				str=0+str;
			}
			System.out.println(str);
		}
	}

}
