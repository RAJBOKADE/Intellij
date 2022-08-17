import java.util.*;

public class CreditCard {

    public static void main(String args[]) {
        String CType(String number) {
            if (number.startsWith("4"))
                return "Visa";
            else if (number.startsWith("5"))
                return "MasterCard";
            else if (number.startsWith("6"))
                return "Discover";
            else if (number.startsWith("37"))
                return "American Express";
            else
                return "Unknown type";
        };
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a credit card number: ");
        long number = input.nextLong();

        long total = sumOfEvenPlaces(number) + (sumOfOddPlaces(number)*2);

        if (isValid(total)) {
            System.out.println("The "+CType+" card number is valid");
        } else {
            System.out.println("The "+CType+" card number is invalid.");
        }
    }