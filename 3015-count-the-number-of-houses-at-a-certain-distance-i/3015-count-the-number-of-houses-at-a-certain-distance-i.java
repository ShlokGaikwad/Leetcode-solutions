import java.lang.Math;

class Solution {
    public int[] countOfPairs(int n, int x, int y) {
        int[] answer = new int[n];
        int distance = n-1; //actual distance, for n things max is n-1
        int k = distance - 1; //not necessary, but separate array indexer for sanity
        while(distance > 0){
            answer[k] = (n-distance)*2;
            distance--;
            k--;
        }
        //guarantee that x is lower, again for sanity
        if(x > y){
            int tmp = x; 
            x = y;
            y = tmp;
        }
        int skip = y - x;
        if(skip < 2){
            return answer; 
            //nothing is changed if the street doesn't skip anything
        }
        //check all pairs of houses to see if they're closer now
        for(int i = 1; i < n; i++){
            for(int j = i+1; j <= n; j++){
                int old_distance = j - i;
                int new_distance = Math.abs(x - i) + Math.abs(y - j) + 1;
                //like an airplane, the shortest path may be behind you
                if(new_distance < old_distance){
                    answer[old_distance-1] -= 2;
                    answer[new_distance-1] += 2;
                }
            }
        }
        return answer;
    }
}