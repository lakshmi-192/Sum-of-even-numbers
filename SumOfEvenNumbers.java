public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int i = 2;
        int sum = 0;
        while (i <= 100) {
            sum += i;
            i += 2;
        }
        System.out.println("Sum of even numbers between 1 and 100 : " + sum);
    }
}
