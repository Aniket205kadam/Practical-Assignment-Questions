class Demo {
    public int addition(int num1, int num2) {
        return num1 + num2;
    }
}
public class Ouestion2 {
    public static void main(String []args) {
        int num1 = 5, num2 = 6;
        Demo obj = new Demo();
        int result = obj.addition(num1, num2);
        System.out.println(num1 + " + " + num2 + " = " + result);
    }
}
