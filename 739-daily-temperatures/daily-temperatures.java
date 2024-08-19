class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int[temperatures.length];
        Stack<Integer> s1 = new Stack<>();
        for(int i = 0;i<temperatures.length;i++){
            while(!s1.isEmpty() && temperatures[s1.peek()]<temperatures[i]){
                int index = s1.pop();
                answer[index] = i-index;
            }
            s1.push(i);
        }

        
        return answer;
    }
}