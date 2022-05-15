public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome!");
        boolean responseAreEqualThreeDecimalPlaces = areEqualThreeDecimalPlaces(3.145,3.1455);
        if(responseAreEqualThreeDecimalPlaces){
            // if true.
            System.out.println("Numbers are equal up to three decimal places.");
        }else{
            // if false.
            System.out.println("Numbers not equal up to three decimal places.");
        }
    }
    public static boolean areEqualThreeDecimalPlaces(double first, double second){
        int num1 = (int) first * 1000; // casting
        int num2 = (int) second * 1000; // casting
        // check whether two number are equal or not.
        if(num1 == num2){
            // if equals, it returns true.
            return true;
        }
        // if not equal, it returns false.
        return false;
    }
}