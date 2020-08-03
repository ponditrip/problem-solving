class Solution {
    public int numTrees(int n) {
        int[] memo = new int[n+1];
        
        //Number of binary trees for 0 and 1 nodes is 1
        memo[0]=1;
        memo[1]=1;
        
        for(int totalNodes=2; totalNodes<=n; totalNodes++)
            for(int root=1; root<=totalNodes; root++){
                memo[totalNodes] += memo[root-1] * memo[totalNodes-root];
            }
        
        return memo[n];
    }
}
