package hu.webler;

public class MethodSignature {

    public static void main(String[] args) {

        // Tesztelés: egy példatömb létrehozása
        int[] numbers = {1, 2, 3, 4, 5};
        int[] nums = {-10, 100, 1000};

        int sumResult = sumElements(numbers);
        int multiplicationRes = multiplyElements(numbers);

        // Az eredmény kiírása
        System.out.println("Az elemek összege: " + sumResult);
        System.out.println("Az elemek szorzata: " + multiplicationRes);

        int result = sumElements(nums);
        int res = multiplyElements(nums);
        System.out.println(result);
        System.out.println(res);

    }

    /**
     *  Metódus amely összeadja a bemeneti tömb elemeit.
     *
     * @param arr a bemeneti tömb, amelynek elemeit össze akarjuk adni
     * @return az összeg, amelyet az elemekből kaptunk
     */

    public static int sumElements(int[] arr) {
        // Szignitúra:
        // - Visszatérési típus: int ( az összeg)
        // - Metódusnév: sumElements
        // - Paraméter: int[] arr (egész számok tömbje)

        // Paraméter:
        // - int[] arr: az input, egy egész számok tömbje

        // Body (metódusmag):
        // - Itt történik az össeadás logikája
        // - Kezdetben az összeg 0
        int sum = 0;

        // Ciklus:
        // - Egy for ciklus segtségével iterálunk végig a bemeneti tömb elemein
        // - A tömb hosszúsága ( arr.length) hetározza meg az iterációk számát
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    public static int multiplyElements(int[] arr) {
        int res = 1;
        for (int num : arr) {
            res *= num;
        }
        return res;
    }
}
