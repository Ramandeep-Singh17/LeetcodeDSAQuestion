class Triplet implements Comparable<Triplet> {
        int dist;
        int x;
        int y;
        Triplet(int dist, int x, int y){
         this.dist = dist;
            this.x = x;
            this.y = y;
        }
        public int compareTo(Triplet t){
            return this.dist-t.dist;// jo naam diye hi use minus kardo;
        }
    }
class Solution {
    public int[][] kClosest(int[][] points, int k) {
   PriorityQueue<Triplet> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int[] arr : points){
            int x = arr[0];
            int y = arr[1];
            int dist= x*x+y*y;// distance nikale  sqrt me hota hai but aise nikal liye phir bhi 
            // kaam karega. beacuse no hi dena hai and jo no min hoga usi ka sqrt min hoga
            pq.add(new Triplet(dist,x,y));
            if(pq.size()>k) pq.remove();
        }
        int[][] ans= new int[k][2];
        for(int i =0;i<k;i++){
            Triplet top= pq.remove();
            ans[i][0]= top.x;
            ans[i][1]= top.y;
        }
        return ans;
    }
}