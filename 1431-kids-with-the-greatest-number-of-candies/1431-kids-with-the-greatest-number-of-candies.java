class Solution {
    public List<Boolean> kidsWithCandies(int[] arr, int k) {
        int max=Integer.MIN_VALUE,n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        
        List<Boolean> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]+k>=max){
                list.add(true);
            }else{
                list.add(false);
            }
        }
        return list;
    }
}