class Solution {
    public String defangIPaddr(String address) {
        StringBuilder b=new StringBuilder();
        for(int i=0;i<address.length();i++){
            if(address.charAt(i)=='.'){
                b.append("[.]");
            }else{
                b.append(address.charAt(i));
            }
        }
        return b.toString();
    }
}