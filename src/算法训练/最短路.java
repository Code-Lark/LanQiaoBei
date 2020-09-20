package 算法训练;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * 问题描述
 * 给定一个n个顶点，m条边的有向图（其中某些边权可能为负，但保证没有负环）。
 * 请你计算从1号点到其他点的最短路（顶点从1到n编号）。
 * 
 *  输入格式
 *  第一行两个整数n, m。
 * 接下来的m行，每行有三个整数u, v, l，表示u到v有一条长度为l的边。
 * @author Lark
 *
 */
public class 最短路 {
	

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		LinkedList[] arrays=new LinkedList[n];
		
		int u;
		int v;
		int l;
		
		for(int i=0;i<m;i++) {
			arrays[i]=new LinkedList();
			arrays[1].
		}

	}

}
