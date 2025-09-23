class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        int left=0,right=n-1;
        for(int i=n-1;i>=0;i--){
            int leftsquare=nums[left]*nums[left];
            int rightsquare=nums[right]*nums[right];
            if(leftsquare>rightsquare){
                arr[i]=leftsquare;
                left++;
            }
            else{
                arr[i]=rightsquare;
                right--;
            }
        }
        return arr;
    }
}
