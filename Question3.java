public class Question3 {
    public static void main(String []args) {
        int nums[] = {1, 2, 3, 4, 5};
        Arrays1 obj = new Arrays1();
        int result = obj.sumOfArray(nums);
        System.out.println("The sum of the array is: " + result);
    }
}

class Arrays1 {
    public int sumOfArray(int nums[]) {
        int ans = 0;
        for (int a : nums) {
            ans += a;
        }
        return ans;
    }
}
