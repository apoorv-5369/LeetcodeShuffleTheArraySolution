class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i=0,j=n;
        boolean flag=true;
        int res[]=new int[nums.length];
        int ind=0;
        while(i < n && j < nums.length ){
            if(flag)res[ind++]=nums[i++];
            else res[ind++]=nums[j++];
            flag=!flag;
        }
        if(flag){
            while(i < n)res[ind++]=nums[i++];    
        }else{
            while(j < nums.length)res[ind++]=nums[j++];
        }
        return res;
    }
}
