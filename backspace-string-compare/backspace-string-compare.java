class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == '#') {
                if (sb1.length() > 0) {
                    sb1.deleteCharAt(sb1.length() - 1);
                }
            } else {
                sb1.append(c);
            }
        }

        for (char c : t.toCharArray()) {
            if (c == '#') {
                if (sb2.length() > 0) {
                    sb2.deleteCharAt(sb2.length() - 1);
                }
            } else {
                sb2.append(c);
            }
        }

        return sb1.toString().equals(sb2.toString());
    }
}
