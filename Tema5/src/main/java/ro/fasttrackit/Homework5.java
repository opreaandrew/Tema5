package ro.fasttrackit;

import java.util.ArrayList;
import java.util.Random;

public class Homework5 {
    public static void main(String[] args) {
        int[] zeArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Exercise 1: ");
        System.out.println(sum(zeArray));

        System.out.println("\nExercise 2: ");
        System.out.println(oddElements(zeArray));

        System.out.println("\nExercise 3: ");
        System.out.println(greater(zeArray, 5));

        System.out.println("\nExercise 4: ");
        donations(10000);

        System.out.println("\nExercise 5: ");
        cappedDonations(10000, 5);

        System.out.println("\nExercise 6: ");
        String zePhrase = "Little Boy Blue, please cover your nose." +
                "You sneezed on Miss Muffet and ruined her clothes." +
                "You sprayed Mother Hubbard, and now she is sick." +
                "You put out the fire on Jack’s candlestick.\n" +

                "Your sneeze is the reason why Humpty fell down." +
                "You drenched Yankee Doodle when he came to town." +
                "The blind mice are angry! The sheep are upset!." +
                "From now on, use a tissue so no one gets wet!.";
        phrasePrinter(zePhrase);
    }


    // Exercise 1
    public static int sum(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        return sum;
    }

    // Exercise 2
    public static int oddElements(int[] array) {
        int odd = 0;
        for (int number : array) {
            if (number % 2 != 0) {
                odd++;
            }
        }
        return odd;
    }

    // Exercise 3
    public static ArrayList<Integer> greater(int[] array, int minimum) {
        ArrayList<Integer> greaterNumbers = new ArrayList<>();
        for (int number : array) {
            if (number > minimum) {
                greaterNumbers.add(number);
            }
        }
        return greaterNumbers;
    }

    // Exercise 4
    public static void donations(int target) {
        int sum = 0;
        Random moneyzz = new Random();
        while (sum <= target) {
            sum += moneyzz.nextInt();
        }
        System.out.println("Thank you for refuelling one African Migrant Vessel. " +
                "\nWe shall inform the overlords of your contribution.");
    }

    // Exercise 5
    public static void cappedDonations(int target, int donationsLimit) {
        int sum = 0;
        int counter = 0;
        Random moneyzz = new Random();
        while (sum <= target) {
            if (counter <= donationsLimit) {
                sum += moneyzz.nextInt();
                counter++;
            } else {
                break;
            }
        }
        System.out.println("Thank you for your generous donation.");
    }

    // Exercise 6
    public static void phrasePrinter(String phrase) {
        String[] pieces = phrase.split("\\.");
        for (String words : pieces) {
            System.out.println(words);
        }
    }
}