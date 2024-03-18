class Solution {
    public int maxPalindromesAfterOperations(String[] words) {
        int []freq= new int[27];
        int []len=new int[words.length];
        int res=0;
    
    for(int i=0;i<words.length;i++)
    {
        len[i]=words[i].length();
        for(char c:words[i].toCharArray())
        {
            freq[c-'a']++;
        }
    }
    Arrays.sort(len);
    int even=0;//even pairs
    int odd=0;// odd single character
    for(int i=0;i<freq.length;i++)
    {
        even+=freq[i]/2;
        if(freq[i]%2!=0)
        {
            odd++;
        }
    }
    for(int i=0;i<len.length;i++)
    {
        int req_even=len[i]/2;//required even pairs
        int req_odd=len[i]%2;

        if(req_even>even)
        break;
        even-=req_even;//subtration even pairs

        if(req_odd>odd)
        {
            even--;//breaking even pair
            odd=+2;//increase in 2 single character
        }
        odd-=req_odd;
        res++;
    }
       
        return res;
    }
}