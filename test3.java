import java.util.ArrayList;

public class test3 {
    public static void main(String[] args) {
        //TODO research what the keywork new is.

//            Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
//Programmatically subtract the value of the first element in the array from the value in the last element of the array
//(i.e. do not use ages[7] in your code). Print the result to the console.
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
        System.out.println("1a. Last element subtracts first element: " + (ages[ages.length - 1] - ages[0]));
//            1a answer above ^^^^


//Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
        int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 100};
        System.out.println("1b. Last element with new age subtracts first element: " + (ages2[ages2.length - 1] - ages2[0]));

//        1b. answer above ^^^^

//Use a loop to iterate through the array and calculate the average age. Print the result to the console.

        double agesAverage = 0;
        for (int sum : ages2) {
            agesAverage = (agesAverage += sum);
        }
        System.out.println("1c. " + agesAverage / (ages2.length));

//        1c. answer above ^^^^^

//      Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
//      Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the
//      console.
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
        double total = 0;
        for (String name : names) {
            total = total + name.length();
        }
        System.out.println("2a. " + total / names.length);

//      2a. answer above^^^^

        String allNamesTogether = "";
        for (String name : names) {
            allNamesTogether = allNamesTogether + name + " ";
        }
        System.out.println("2b. " + allNamesTogether);
//      2b. answer above but i don't remember how we did it. this one doesn't work and I don't know why

        System.out.println("3. " + names[names.length - 1]);
        System.out.println("4. " + names[0]);
//        3 and 4 answers above^^^^ these work hence I added Dave and Cheenue to the names to check


//     5. Create a new array of int called nameLengths.
//        Write a loop to iterate over the previously created names array and add the length of each name to the
//        nameLengths array.
        ArrayList<Integer> nameLengths = new ArrayList<>();
        for (String name : names) {
            nameLengths.add(name.length());
        }
        System.out.println("5. " + nameLengths);
//        5. answer above^^^ I don't know how I did this yesterday lol
//        names is a string and can't be converted to an int
//        I need to turn the names into integers but how?


//6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array.
//              Print the result to the console.
        int sumTotal = 0;
        for (int number : nameLengths) {
            sumTotal = sumTotal + number;
        }
        System.out.println("6. " + sumTotal);

//7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated
//          to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return
//          “HelloHelloHello”).
        String results = method7("Cheenue", 5);
        System.out.println("7. " + results);

//8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the
//          first and the last name as a String separated by a space).
        String results8 = method8("Cheenue", "Thao");
        System.out.println("8. " + results8);
//9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.

        ArrayList<Integer> listOfNumbersUnder100 = new ArrayList<>();
        listOfNumbersUnder100.add(20);
        listOfNumbersUnder100.add(30);

        boolean results9 = method9(listOfNumbersUnder100);
        if (!results9) {
            System.out.println("9. Total is less than 100");
        } else {
            System.out.println("9. Total is greater than 100");
        }

//10. Write a method that takes an array of double and returns the average of all the elements in the array.

        ArrayList<Double> doubleArrayList = new ArrayList<>();
        doubleArrayList.add(15.25);
        doubleArrayList.add(45.75);
        doubleArrayList.add(32.50);

        Double task10Results = method10(doubleArrayList);
        System.out.println("10. Average of double list: " + task10Results);

//11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is
//          greater than the average of the elements in the second array.

        ArrayList<Double> method11Double1 = new ArrayList<>();
        method11Double1.add(50.50);
        method11Double1.add(23.75);

        ArrayList<Double> method11Double2 = new ArrayList<>();
        method11Double2.add(75.50);
        method11Double2.add(15.75);

        boolean task11results = method11(method11Double1, method11Double2);
        System.out.println("11. Is the average of the array1 greater than array2?: " + task11results);

//12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if
//          it is hot outside and if moneyInPocket is greater than 10.50.
        boolean isItHot = true;
        double money = 175.25;
        boolean task12Results = willBuyDrink(isItHot, money);
        System.out.println("12. " + task12Results);

//13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
        int value = 150;
        double myWeight = method13(value);
        System.out.println("13. " + (myWeight));

    }


    //    Task 8 Method
    public static String method7(String word, int n) {
        String repeatedString = "";
        for (int i = 0; i < n; i++) {
            repeatedString = repeatedString + word;
        }
        return repeatedString;
    }

    public static String method8(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    //    Task 9 Method
    public static boolean method9(ArrayList<Integer> listOfNumbers) {
        int total = 0;
        for (int number : listOfNumbers) {
            total = total + number;
        }
        if (total > 100) {
            return true;
        } else {
            return false;
        }
    }

    //Task 10 Method
    public static double method10(ArrayList<Double> method10Numbers) {
        double total10 = 0.0;
        for (double numbers : method10Numbers) {
            total10 = total10 + numbers;
        }
        double average = total10 / method10Numbers.size();
        return average;
    }

    //Task 11 Method
    public static boolean method11(ArrayList<Double> listOfDouble1, ArrayList<Double> listOfDouble2) {
        double total11a = 0.0;
        for (double num : listOfDouble1) {
            total11a = total11a + num;
        }
        double average1 = total11a / listOfDouble1.size();

        double total11b = 0.0;
        for (double num : listOfDouble2) {
            total11a = total11b + num;
        }
        double average2 = total11b / listOfDouble2.size();

        return average1 > average2;

    }

    //12. Task 12 Method
    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        if (isHotOutside && (moneyInPocket > 10.50)) {
            return true;
        }
        return false;
    }


    //13. Task 13 Method
    public static double method13(int weightInLbs){
        double weightInKg = weightInLbs * 0.453592;
        return weightInKg;
    }
}
