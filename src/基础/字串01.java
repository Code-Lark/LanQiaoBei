package 基础;

public class 字串01 {

	public static void main(String[] args) {
		String str="";
		// TODO 自动生成的方法存根
		for(int i=0;i<32;i++) {
			str=Integer.toBinaryString(i);
			while(str.length()<5) {
				str=0+str;
			}
			System.out.println(str);
		}
	}

}
