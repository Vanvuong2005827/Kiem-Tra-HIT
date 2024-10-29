package core;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] dp = new long[n + 1];
        long[] A = new long[n + 1];
        dp[0] = 0;
        for (int i = 1; i <= n; ++i) {
            A[i] = sc.nextLong();
        }

        for(int i = 1; i <=n; ++i) {
            dp[i] += dp[i - 1] + A[i];
        }

        int q = sc.nextInt();
        for(int i = 1 ; i <= q; ++i){
            int l = sc.nextInt();
            int r = sc.nextInt();
            System.out.println(dp[r] - dp[l-1]);
        }
    }
}
