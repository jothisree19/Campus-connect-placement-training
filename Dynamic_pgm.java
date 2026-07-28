class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        
)
        int[][] dp = new int[m + 1][n + 1];
        
        // Step 2: Fill the table from bottom-up
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                
                // Step 3: Check if the current characters match
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    // Match found: add 1 to the best answer of the remaining substrings
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {

                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        
        return dp[m][n];
    }
}