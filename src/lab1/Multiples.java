package lab1;

public class Multiples {
    public static void main(String[] args) {
        int count1 = multiples(1000, 3, 5);
        System.out.println(count1);

        int count2 = multiples();
        System.out.println(count2);
    }

    public static int multiples(int n, int a, int b) {
        int i = 1;
        int counter = 0;
        while (i < n) {
            if (i%a==0 || i%b==0) {
                counter++;
            } i++;
        }
        return counter;
    }

    public static int multiples() {
        return multiples(1000, 3, 5);
    }
}
