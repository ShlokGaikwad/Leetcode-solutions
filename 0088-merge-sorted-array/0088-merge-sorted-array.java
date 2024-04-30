class Solution {
    public void merge(int[] arr1, int m, int[] arr2, int n) {
       List<Integer> list=new ArrayList<>();
        int i=0,j=0;
        while(i<m && j<n){
            if(arr1[i]<=arr2[j]){
                list.add(arr1[i]);
                i++;
            }else {
                list.add(arr2[j]);
                j++;
            }
        }
        while(i<m){
            list.add(arr1[i]);
            i++;
        }
        while(j<n){
            list.add(arr2[j]);
            j++;
        }
        for(int k=0;k<m+n;k++){
            arr1[k]=list.get(k);
        }
    }
}