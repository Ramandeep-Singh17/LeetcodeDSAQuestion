class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
        
        double[][] tower = new double[101][101];   
        
        tower[0][0] = poured;
        
        for (int i = 0; i <= query_row; i++) {
            for (int j = 0; j <= i; j++) {
                
                if (tower[i][j] > 1.0) {
                    double extra = tower[i][j] - 1.0;
                    tower[i][j] = 1.0;
                    
                    tower[i + 1][j] += extra / 2.0;
                    tower[i + 1][j + 1] += extra / 2.0;
                }
            }
        }
        
        return Math.min(1.0, tower[query_row][query_glass]);
    }
}
