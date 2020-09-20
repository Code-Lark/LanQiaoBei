package �㷨ѵ��;

import java.util.Scanner;

public class ���ѡ�� {
	public int[][] dp = new int[100002][2];
    public int[][] tree = new int[100002][502];
	
    public void creatTree(int point1, int point2) {
        int i = 0;
        //����point1���ڵ�Ϊ��ĸ�ڵ�ʱ
        while(tree[point1][i] != 0) i++;  //�����point1���ڵ��Ѿ��к����ˣ�������һ������
        tree[point1][i] = point2;
        int j = 0;
        //����point2���ڵ�Ϊ��ĸ�ڵ�ʱ
        while(tree[point2][j] != 0) j++;
        tree[point2][j] = point1;
    }
	
    public void dfs(int start, int root) {
        int child = tree[start][0];  //��start���ڵ�ĵ�1�����ӽڵ�
        for(int i = 0;child != 0;i++) {
            child = tree[start][i];
            if(child != root) {  //��ֹ����start�ĺ��ӳ�Ϊstart�ĸ������
                dfs(child, start);
                dp[start][1] += dp[child][0];  //����child���ڵ�û�к��ӽڵ�ʱ����ʼ����
                dp[start][0] += (dp[child][1] > dp[child][0] ? dp[child][1] : dp[child][0]);
            }
        }
    }

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		���ѡ�� test =new ���ѡ��();
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        for(int i = 0;i < n;i++)
            test.dp[i + 1][1] = in.nextInt();
        for(int i = 0;i < n - 1;i++) {
            int point1 = in.nextInt();
            int point2 = in.nextInt();
            test.creatTree(point1, point2);
        }
        test.dfs(1, 0);   //�Ӵ��������ĸ��ڵ㣨����1�����㣬0��ʾ���ڵ�ĸ�ĸ�ڵ㣩��ʼ����DFS����
        int max = (test.dp[1][1] > test.dp[1][0] ? test.dp[1][1] : test.dp[1][0]);
        System.out.println(max);

	}
	
}
