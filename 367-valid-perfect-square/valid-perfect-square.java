class Solution {
    public boolean isPerfectSquare(int num) {
        long si =2;
        long ei =num; 
        if(num == 1){
            return true;
        }
        while(si<ei){
            long mid = si +(ei-si)/2;
            if((mid*mid) == num){
                return true;
            }
            else if((mid*mid) >num){
                ei = mid;
            }else{
                si = mid +1;
            }
        
        }
        return false;
    }
}