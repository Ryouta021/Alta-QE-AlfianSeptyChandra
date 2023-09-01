public class problem7 {
    public static float calculateMean(float[] array) {
        float total = 0;

        for (int i = 0; i < array.length; i++) {
            total =total + array[i];
        }

        return total / array.length;
    }

    public static void main(String[] args) {
        float[] numbers = { 1, 2, 3, 4 };

        float mean = calculateMean(numbers);
//
//        System.out.print("Array: [");
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i]);
//            if (i < numbers.length - 1) {
//                System.out.print(", ");
//            }
//        }
//        System.out.println("]");
        System.out.println("Mean: " + mean);
    }
}
