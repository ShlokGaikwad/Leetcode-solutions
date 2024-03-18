class Solution {
public int minOperations(int[] nums, int k) {

    PriorityQueue<Long>pq = new PriorityQueue<>();
    
    for(int c : nums){
        pq.add((long)c);
    }
    
    long count = 0;        
    while(pq.size()>=2){
       

       if(pq.peek()>=k){
     return (int)count;
       }
      
    long temp = pq.poll()* 2 + pq.poll();
    pq.add(temp);
    count++;
    }
    
  
   return (int)count;
}

}