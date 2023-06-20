public class Question5 {
    public static void main(String []args) {
        //jagged Array
        int nums[][] = {
                {1, 2, 3, 4},
                {5, 6},
                {7, 8, 9, 10}
        };
        //print the array
        //row of the array
        for (int n[] : nums) {
            //column of the array
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
