public class ArrayFunctions {

    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static double average(int[] array) {
        int sum = sum(array);
        return sum / array.length;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };

        System.out.println("The sum of the array is: " + sum(array));
        System.out.println("The average of the array is: " + average(array));
        System.out.println("The maximum value of the array is: " + max(array));
        System.out.println("The minimum value of the array is: " + min(array));
    }
}

// Result:
// The sum of the array is: 15
// The average of the array is: 3.0
// The maximum value of the array is: 5
// The minimum value of the array is: 1
