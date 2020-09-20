package 算法训练;

import java.util.ArrayList;
import java.util.Scanner;

public class 区间k大数查询 {
	public static void fun(ArrayList arr,int l,int r,int k) {
//		System.out.println(l);
//		System.out.println(r);
//		System.out.println(k);	
		ArrayList<Integer> tmp=new ArrayList<Integer>(arr.subList(l-1, r));
		tmp.sort(null);
		System.out.println(tmp.get(tmp.size()-k));
	}
	
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<n;i++) {
			list.add(sc.nextInt());
		}
		int m=sc.nextInt();
//		int l=0;
//		int r=0;
//		int k=0;
		for(int i=0;i<m;i++) {
//			l=sc.nextInt();
//			r=sc.nextInt();
//			k=sc.nextInt();
//			fun(list, l, r, k);
			fun(list,sc.nextInt(),sc.nextInt(),sc.nextInt());
		}

	}

}
