class Solution {
    public String solution(String s) {
        if (s.length() % 2 == 0) return s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
        else return String.valueOf(s.charAt(s.length() / 2));
    }
}