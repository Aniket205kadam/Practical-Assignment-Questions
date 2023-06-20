class Cals {
    public int add(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }
    public int add(int num1, int num2, int num3) {
        int result = num1 + num2 + num3;
        return result;
    }
    public float add(float num1, float num2) {
        float result = num1 + num2;
        return result;
    }
}
public class Question1 {
    public static void main(String []args) {
       Cals obj = new Cals();
       float result = obj.add(2.3f, 5.6f);
       System.out.println("Answer is: " + result);
    }
}
