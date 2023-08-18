import java.util.Scanner;

class Solution {
    public static int divisorSubstrings(int num, int k) {
        String number = String.valueOf(num);
        int count = 0;
        for (int i = 0; i <= number.length() - k; i++) {
            String substring = number.substring(i, i + k);
            int subNum = Integer.parseInt(substring);
            if (subNum != 0 && num % subNum == 0) {
                count++;
            }
        }
        return count;
    }
}
