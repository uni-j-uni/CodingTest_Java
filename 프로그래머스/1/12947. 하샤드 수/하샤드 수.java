class Solution {
    public boolean solution(int x) {
        int sum = 0, num = x;
        
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return x % sum == 0;
    }
}