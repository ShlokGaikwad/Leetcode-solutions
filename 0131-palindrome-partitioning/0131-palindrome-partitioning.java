class Solution {
    public List<List<String>> partition(String s) {
        //create a list which will return 
        List<List<String>> list=new ArrayList<>();
        //create a path which will have the palindrom string in it
        List<String> path=new ArrayList<>();
        // create a function which will recursivley add the string
        
        fun(0,s,list,path);
        return list;
    }
    static void fun(int idx,String s,List<List<String>> list,List<String> path){
        if(idx==s.length()){
            list.add(new ArrayList<>(path));
            return;
        }
        
        for(int i=idx;i<s.length();i++){
            if(isPalindrom(idx,i,s)){
                path.add(s.substring(idx,i+1));
                fun(i+1,s,list,path);
                path.remove(path.size()-1);
            }
        }
    }
    static boolean isPalindrom(int s,int e,String str){
        while(s<=e){
            if(str.charAt(s++)!=str.charAt(e--)) return false;
        }
        return true;
    }
}