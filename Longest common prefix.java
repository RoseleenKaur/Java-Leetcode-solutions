class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)
            return "";
        else if(strs.length==1)
        {
            return strs[0];
        }
        String comms=null;
        String sprev, snext;
        sprev=strs[0];
        for(int i=0; i<strs.length-1;i++)
        {
            int next=i+1;
            snext=strs[next];
             comms=commonsubstring(sprev,snext);  
            if (comms.equals(""))
            {
                return comms;
            }
            sprev=comms;
        }
        return comms;
    }
    public String commonsubstring(String str1, String str2)
    {
        String smin,smax;
        if(str1.length()>str2.length())
        {
            smax=str1;
            smin=str2;
        }
        else
        {
            smin=str1;
            smax=str2;
        }
        int i=smin.length();
        while(i!=0)
        {
            if(smin.substring(0,i).equals(smax.substring(0,i)))
                return smin.substring(0,i);
            i--;
        }
        return "";
    }
}
