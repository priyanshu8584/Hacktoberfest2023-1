class Solution {
    public int search(int[] nums, int target) {
        int l=0;
        int u=nums.length-1;
        int mid=0;
        while(l<=u)
        {
            mid=(l+u)/2;
            if(target<nums[mid])
            {
               u=mid-1;
            }
            else if(target>nums[mid])
            {
               l=mid+1;
            }
            else 
            return mid;
        }
        return -1;
    }
}
