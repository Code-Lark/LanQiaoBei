package 基础;

public class 回文数 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		for(Integer i=10;i<100;i++) {
			String str=Integer.toString(i);
			StringBuilder sb=new StringBuilder(str);
			System.out.println(i+sb.reverse().toString());
		}
	}
}
