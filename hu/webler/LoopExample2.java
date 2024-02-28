package hu.webler;

public class LoopExample2 {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        System.out.println("-------------");

        for (int i = 0; i < 5; i += 2) { // i + 2 nem működik mert incrementáló opretátor, nem pedig értékadó
            System.out.println(i);
        }

        System.out.println("------------");

        for (int i = 0; i < 5; i++) {
            System.out.println(i++);
        }
        System.out.println("------------");

        for (int i = 0; i < 5; i++) {
            System.out.println(++i);
        }
        System.out.println("------------");

        int[] numbers = {10, 20, 30, 40};
        for (int i = 1; i < numbers.length; i++) {
            System.out.println(i); // ezzel elem indexét ratjuk ki! (hányadik index maga az i)
        }
        System.out.println("------------");

        for (int i = 1; i < numbers.length; i++) {
            System.out.println(numbers[i]); // ezzel a tömb értékét kérjük ki (adott indexen álló elem értékét)
        }
        System.out.println("------------");
        /*
        for (int i= 0; i <= numbers.length; i++){
            System.out.println(numbers[i]); // ha Exaption nincs kezelve, akkor nem fut tovább a program
            */
        for (int i = 0; i <= numbers.length - 1; i++) {  // numbers.length = 4 !!!
            System.out.println(numbers[i]);
        }
        System.out.println("-------------");
        for (int i = 1; i <= numbers.length - 2; i++) {
            System.out.println(numbers[i]);
        }

        int[] nums = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        // jelenleg az igény, hogy az ötödik elemtől rassuk ki!
        for (int i = 4; i < nums.length; i++) { // ez alapban int i= 0; de ha van igény rá csak akkor módostsuk!!
            System.out.println("Index: " + i + " helyen álló elem értéke:" + nums[i]);
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println("----------");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    }
