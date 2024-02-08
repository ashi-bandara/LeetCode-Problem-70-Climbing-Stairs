class Solution {
    public int climbStairs(int n) {
        switch(n){
            case 0: {
                return 0;
            }
            case 1:{
                return 1;
            }
            case 2:{
                return 2;
            }
            default:{
                int[] array = new int[n+1];
                array[0] = 0;
                array[1] = 1;
                array[2] = 2;

                for (int i = 3; i <= n ; i++) {
                    array[i] = array[i-1] + array[i-2];
                }
                return array[n];
            }
        }
    }
}