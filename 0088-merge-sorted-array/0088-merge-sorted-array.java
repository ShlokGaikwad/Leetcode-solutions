class Solution {
    public void merge(int[] arr1, int m, int[] arr2, int n) {
        ArrayList<Integer> res=new ArrayList<>();
        int i=0,j=0;
        while(i<m&& j<n){
            if(arr1[i]<arr2[j]){
                res.add(arr1[i]);
                i++;
            }else{
                res.add(arr2[j]);
                j++;
            }
        }
        while(i<m){
            res.add(arr1[i]);
            i++;
        }
        while(j<n){
            res.add(arr2[j]);
            j++;
        }
        
        for(int k=0;k<m+n;k++){
            arr1[k]=res.get(k);
        }
    }
}