public class array_concat {
    public static void main(String[] args) {
        int nums[] = {1,2,1};
        int ans[] = new int[nums.length * 2];
        System.out.println(ans.length);
        System.out.println(nums.length);
        for(int i = 0; i < ans.length ; i++){
            if(i <= nums.length - 1){
                ans[i] = nums[i];
            }
            else{
                ans[i] = nums[i - nums.length];
            }
        }
        for(int i : ans){
            System.out.print(" "+i);
        }
    }
}
