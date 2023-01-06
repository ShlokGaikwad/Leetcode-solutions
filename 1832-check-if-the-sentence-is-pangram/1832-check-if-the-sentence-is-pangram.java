class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean all=true;
        for (char ch='a';ch<='z';ch++){
            if(!sentence.contains(String.valueOf(ch))){
                all=false;
                break;
            }
        }
        if(all){
            return true;
        }
        return false;
    }
}