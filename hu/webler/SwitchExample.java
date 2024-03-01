package hu.webler;

public class SwitchExample {
    public static void main(String[] args) {

        int dayOfWeek = 3;
        String dayName = "";

        switch(dayOfWeek){
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            default:
                dayName = "Unknown";
                break;
        }
        System.out.println("Today is " + dayName);

        String input = "Hello";
        String output = "";

        switch (input) {
            case "hello":
                output = "hello";
                break;
            case "Hello":
                output = "Hello Hello";
                break;
            default:
                output = "Not Hello";
                break;
        }
        System.out.println(output);
    }
}
