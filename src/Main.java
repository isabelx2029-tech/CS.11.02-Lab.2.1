/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Isabel
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {
        int sum = add(5,7);
        System.out.println(sum);

        int secondSum = add(5, 7, 6, 6);
        System.out.println(secondSum);

        String morningGreetingSentence = morningGreeting("Toby Fox");
        System.out.println(morningGreetingSentence);

        String afternoonGreetingSentence = afternoonGreeting("Mac Miller");
        System.out.println(afternoonGreetingSentence);

        String tripledSentence = triple("oohbaby");
        System.out.println(tripledSentence);

        double halvedResult = half(19);
        System.out.println(halvedResult);

        int roundedPositive = roundPositiveValueToNearestInteger(8.49);
        System.out.println(roundedPositive);

        int roundedNegative = roundNegativeValueToNearestInteger(-8.49);
        System.out.println(roundedNegative);
    }

    // 1. add
    public static int add(int a, int b){
        return (a + b);
    }
    
    // 2. add
    public static int add(int a, int b, int c, int d){
        int firstPair = add(a, b);
        int secondPair = add(c, d);
        return add(firstPair, secondPair);
    }

    // 3. morningGreeting
    public static String morningGreeting(String name){
        return ("早上好, " + name + "!");
    }

    // 4. afternoonGreeting
    public static String afternoonGreeting(String name2){
        return ("下午好, " + name2 + "!");
    }

    // 5. triple
    public static String triple(String tripledWord){
        return (tripledWord + tripledWord + tripledWord);
    }

    // 6. half
    public static double half(int halvedNumber){
        return (halvedNumber / 2.0);
    }

    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double roundedNumber){
        return (int) (roundedNumber + 0.5);
    }

    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double roundedNumber2){
        return (int) (roundedNumber2 - 0.5);
    }

}
