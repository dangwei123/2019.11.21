给定长度为 n 的整数数组 nums，其中 n > 1，返回输出数组 output ，其中 output[i] 等于 
nums 中除 nums[i] 之外其余各元素的乘积。

示例:

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/product-of-array-except-self
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res=new int[nums.length];
        int n=1;
        for(int i=0;i<res.length;i++){
            res[i]=n;
            n*=nums[i];
        }
        n=1;
        for(int i=res.length-1;i>=0;i--){
            res[i]*=n;
            n*=nums[i];
        }
        return res;
    }
}

给定一个元素都是正整数的数组A ，正整数 L 以及 R (L <= R)。

求连续、非空且其中最大元素满足大于等于L 小于等于R的子数组个数。
class Solution {
    public int numSubarrayBoundedMax(int[] A, int L, int R) {
        int num1=0;
        int num2=0;
        int j=0;
        for(int i=0;i<A.length;i++){
            if(A[i]<=R){
                num1+=(i-j+1);
            }else{
                j=i+1;
            }
        }
        j=0;
        for(int i=0;i<A.length;i++){
            if(A[i]<L){
                num2+=(i-j+1);
            }else{
                j=i+1;
            }
        }
        return num1-num2;
    }
}


假设按照升序排序的数组在预先未知的某个点上进行了旋转。

( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。

请找出其中最小的元素。

注意数组中可能存在重复的元素。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array-ii
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
class Solution {
    public int findMin(int[] nums) {
        int l=0;
        int r=nums.length-1;
        while(l<r){
            int mid=(l+r)>>>1;
            if(nums[mid]==nums[r]){
                r--;
            }else if(nums[mid]>nums[r]){
                l=mid+1;
            }else{
                r=mid;
            }
        }
        return nums[l];
    }
}

