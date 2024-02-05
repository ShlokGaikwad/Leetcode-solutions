class Solution {
    public int romanToInt(String s) {
        int result = 0;
        int previous_value = getValue(s.charAt(0));
        
        for(int i=1;i<s.length();i++){
            int current_value = getValue(s.charAt(i));
            if(previous_value < current_value){
                result-=previous_value;
            }
            else{
                result+=previous_value;
            }
            previous_value=current_value;
        }
        result+=previous_value;
        return result;
    }
    private int getValue(char c){
            switch(c){
                case 'I' : return 1;
                case 'V' : return 5;
                case 'X' : return 10;
                case 'L' : return 50;
                case 'C' : return 100;
                case 'D' : return 500;
                case 'M' : return 1000;
                default : return 0;
            }
        }
}