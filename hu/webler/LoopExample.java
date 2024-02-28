package hu.webler;

public class LoopExample {

    // elöl tesztelős ciklus: for, while
    // hátul tesztelős ciklus: do while

    public static void main(String[] args) {

        // for loop
        //Az i változó inicializálása 0-ra, majd minden iterációban egyel növeljük
        //A ciklus addig fut, míg az 1 kisebb mint 5
        for (int i = 0; i < 5; i++) {
            System.out.println("For loop: " + i);
        }

        // While loop
        // A ciklus addig fut, amg a feltétel igaz
        // először ellenőrizzük a feltételt, majdhajtjuk végre a cikluscsomagot

        int i = 0;
        while (i < 5) {
            System.out.println("While loop: " + i);
            i++; // Ne felejtsük el növelni a ciklusváltozót, hogy elkerüljük a végtelen ciklust!
        }

        // do- while loop
        // A ciklus egy blokkot hajt végre, majd ellenőrzi a feltételt
        // Ez azt jelenti, hogy a blokk legalább egyszer lefut, még akkor is, ha a feltétel hamis az elején

        int j = 0;
        do {
            System.out.println("Do-While loop: " + j);
            j++; // követjük a ciklusváltozót a végtelen ciklus elkerülése érdekében
        } while (j < 5);

        // Enhanced for loop
        // Ez a loop speciális típusú loop, ami egy iterálható objektum elemein iterál
        // pl. tömb vagy kollekció
        // A ciklusmagban az aktuális elemet egy változóval kezeljük
        // Ebben az esetben nem érkesel, hogy hányadik indexen áll, engem az érték érdekel!
        int[] numbers = {10, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.println("Enhanced for loop: " + num);
        }

    }
}
