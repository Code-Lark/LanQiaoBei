package 算法训练;

import java.math.BigInteger;
import java.util.Scanner;

public class K好数 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int l=sc.nextInt();
		
		long arr[][]=new long[l][k];
		
		//第一行
		for(int i=1;i<k;i++) {
			arr[0][i]=1;
		}
		
		for(int i=1;i<l;i++) {
			for(int j=0;j<k;j++) {
				for(int a=0;a<k;a++) {
					if((j!=a+1)&&(j!=a-1)) {
						arr[i][j]=(arr[i][j]+arr[i-1][a])%1000000007;
					}
				}
			}
		}
		
		BigInteger bigInteger=new BigInteger("0");
		for(int i=0;i<k;i++) {
			bigInteger=bigInteger.add(new BigInteger(arr[l-1][i]+""));
		}
		
		System.out.println(bigInteger.mod(new BigInteger("1000000007")));
		
		
		sc.close();
		
	}

}
