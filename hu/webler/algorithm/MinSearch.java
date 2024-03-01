package hu.webler.algorithm;

public class MinSearch {

    public static void main(String[] args) {

        int[] numbers = {3, 4, 1, 9, 4, 2, 8};

        int min = findMin(numbers);
        System.out.println(min);
    }

    public static int findMin(int[] numbers) {
        if(numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("The array is either null or empty.");
        }

        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }
}
