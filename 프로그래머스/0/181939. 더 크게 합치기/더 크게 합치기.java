class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String aAddB = String.valueOf(a) + String.valueOf(b);
        String bAddA = String.valueOf(b) + String.valueOf(a);
        
        int num1 = Integer.parseInt(aAddB);
        int num2 = Integer.parseInt(bAddA);
        
        if (num1 > num2) {
            answer = num1;
        }
        else {
            answer = num2;
        }
        
        return answer;
    }
}