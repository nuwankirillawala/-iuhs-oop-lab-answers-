public class Square {

    public static int square(int number) {
        return number * number;
    }

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += square(i);
        }
        System.out.println(sum);
    }
}

// Result:
// 385