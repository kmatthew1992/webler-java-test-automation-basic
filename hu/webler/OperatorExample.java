package hu.webler;

public class OperatorExample {

    public static void main(String[] args) {

        int x = 5;
        int y = 10;
        int z = 15;

        // logikai OR operator (||)
        boolean resultLogicalOr = (x < y) || (y < z); // true vagy true -> igaz
        System.out.println("logikal or result: " + resultLogicalOr);

        boolean res = false || true; // vagy esetén (||) ha az egyik igaz az eredméyn igaz
        System.out.println(res);

        // logikai AND operato (&&) - logikai ÉS művelet

        boolean resultLogicalAnd = (x < y) && (y < z);
        System.out.println("Logical and result: " + resultLogicalAnd);
        System.out.println(true && false);
        System.out.println(false && false);

        // tagadás példa, jele: !
        boolean negateAnd = (x & y) != 0;
        System.out.println("Negated XAND result: " + negateAnd);

        boolean nonNegated = (x & y) == 0;
        System.out.println("Non negated: " + nonNegated);

        boolean otherNegated = (x != y);
        System.out.println("Other negated: " + otherNegated);

    }
}
