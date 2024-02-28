package hu.webler;

public class PrimitiveVariableExample {

    public static void main(String[] args){

        // byte: -128 és 127 között. az alapértelmezett értéke 0
        byte num1 = 0;

        //short: -32768 és 32767 között, alaéprtelmezett ésrék: 0
        short num2 = 0;

        //int: - 2^31 éa (2^31)-1 között, alapértéke: 0
        int num3 = 0;

        // long: -2^63 és (2^63)-1 között, alapértéke: 0
        long num4 = 0L;

        //float: kb. 1.4E-45 és kb 3.4E+38 között, alapértéke: 0.0
        float num5 = 0.0f;

        // double: kb 4.9E-324 és kb 1.8E+308 között, alapértéke: 0.0
        double num6 = 0.0;

        // char: Unicode karakterek, alapértelmezett érték: '\u0000'
        char letter1 = '\u0000';
        char letter2 = 'b';

        // boolean: true vagy false, alapértelmezett éstékr: false
        boolean isValid = false;

        // változók kiírása új sorba
        System.out.println("byteVariable: " + num1);
        System.out.println("shortVariable: " + num2);
        System.out.println("intVariable: " + num3);
        System.out.println("longVariable: " + num4);
        System.out.println("floatVariable: " + num5);
        System.out.println("soubleVariable: " + num6);
        System.out.println("charVariable: " + letter1);
        System.out.println("char2: " + letter2);
        System.out.println("booleanVariable: " + isValid);

        System.out.println("-------------");

        // a \t egy escape karakter
        System.out.println("byteVariable: \t" + num1); // tabulátor használata
        System.out.println("-------------");
        System.out.println("byteVariable: \n" + num1); // új sor hazsnálata

        //formázás
        int number = 10;
        int anotherNumber = 100;
        double value = 3.14159;
        System.out.printf("A szám: %d, az érték: %.2f \n" , number, value);
        System.out.printf("A szám: %d x 10 az érték: %d \n", number, anotherNumber);
    }
}
