class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character>set=new HashSet<>();
        int maxLength=0;
        int j=0;
        for(int i=0;i<s.length();i++){
           
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                maxLength=Math.max(maxLength,i-j+1);
                
            }else{
                while(s.charAt(j)!=s.charAt(i)){
                    set.remove(s.charAt(j));
                    j++;
                }
                set.remove(s.charAt(j));j++;
                set.add(s.charAt(i));
            }
            
        }
        return maxLength;
    }
}