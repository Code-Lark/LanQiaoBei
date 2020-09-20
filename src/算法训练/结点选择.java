package 算法训练;

import java.util.Scanner;

public class 结点选择 {
	public int[][] dp = new int[100002][2];
    public int[][] tree = new int[100002][502];
	
    public void creatTree(int point1, int point2) {
        int i = 0;
        //当第point1个节点为父母节点时
        while(tree[point1][i] != 0) i++;  //如果第point1个节点已经有孩子了，再增加一个孩子
        tree[point1][i] = point2;
        int j = 0;
        //当第point2个节点为父母节点时
        while(tree[point2][j] != 0) j++;
        tree[point2][j] = point1;
    }
	
    public void dfs(int start, int root) {
        int child = tree[start][0];  //第start个节点的第1个孩子节点
        for(int i = 0;child != 0;i++) {
            child = tree[start][i];
            if(child != root) {  //防止出现start的孩子成为start的父亲情况
                dfs(child, start);
                dp[start][1] += dp[child][0];  //当第child个节点没有孩子节点时，开始回溯
                dp[start][0] += (dp[child][1] > dp[child][0] ? dp[child][1] : dp[child][0]);
            }
        }
    }

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		结点选择 test =new 结点选择();
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        for(int i = 0;i < n;i++)
            test.dp[i + 1][1] = in.nextInt();
        for(int i = 0;i < n - 1;i++) {
            int point1 = in.nextInt();
            int point2 = in.nextInt();
            test.creatTree(point1, point2);
        }
        test.dfs(1, 0);   //从创建的数的根节点（即第1个顶点，0表示根节点的父母节点）开始进行DFS遍历
        int max = (test.dp[1][1] > test.dp[1][0] ? test.dp[1][1] : test.dp[1][0]);
        System.out.println(max);

	}
	
}
