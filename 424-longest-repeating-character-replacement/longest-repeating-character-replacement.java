class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();
        int left = 0, right = 0;

        int maxLen = 0, mostFreq = 0;

        while (right < s.length()) {
            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);
            mostFreq = Math.max(mostFreq, map.get(arr[right]));

            int replaced = (right - left + 1) - mostFreq;
            if (replaced > k) {
                map.put(arr[left], map.get(arr[left]) - 1);
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }
        return maxLen;
    }
}