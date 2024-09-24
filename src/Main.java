public class Main
{
    public static void main(String[] args)
    {
        int intOperandA = 5;
        int intOperandB = 13;
        int intSum;
        int intProduct;
        int intDifference;
        int intQuotient;
        int intModulo;

        intSum = intOperandA + intOperandB;
        System.out.println("The sum using ints of " + intOperandA + " and " + intOperandB + " is " + intSum);

        double doubleOperandA = 3.50;
        double doubleOperandB = 4.75;
        double doubleSum;
        double doubleProduct;
        double doubleDifference;
        double doubleQuotient;

        doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("The sum using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);

        double myLunchCost = 12.50;
        int numberOfKids = 2;
        boolean isRaining = false;
        double gasPrice = 3.89;
        int favoriteNumber = 7;
        double shoeSize = 10.5;
        int birthMonth = 4;
        String fullName = "Alyk Lippincott";

        System.out.println("The cost of my lunch is: " + myLunchCost);
    }
}