package lab1;


public class Multiples {
    public static void main(String[] args) {
        int n = 1000;
        int a = 3;
        int b = 5;
        System.out.println(multiples(n, a, b));

    }

    static int multiples(int n, int a, int b) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            boolean divisibleBya = i % a == 0;
            boolean divisibleByb = i % b == 0;

            if (divisibleBya || divisibleByb){
                count++;
            }
        }
        return count;
    }
}