package codingAssignments;

import java.lang.reflect.Array;

public class assignmentWeek4 {

	public static void main(String[] args) {
		//1. 
		// Step 1: Create the array ages
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};

        // Step 1a: Subtract the first element from the last element
        int result1a = ages[ages.length - 1] - ages[0];
        System.out.println("Step 1a result: " + result1a);

        // Step 1b: Create a new array ages2 with 9 elements
        int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 15};

        // Step 1b.ii: Subtract the first element from the last element in ages2
        int result1b = ages2[ages2.length - 1] - ages2[0];
        System.out.println("Step 1b result: " + result1b);

        // Step 1b.iii: Demonstrate dynamic indexing (works for arrays of different lengths)
        // This is already demonstrated above by using array.length dynamically.

        // Step 1c: Calculate the average age using a loop
        int sumOfAges = 0;
        for (int age : ages) {
            sumOfAges += age;
        }
        double averageAge = (double) sumOfAges / ages.length;
        System.out.println("Step 1c: Average age: " + averageAge);
        
        //2. 
        //Create an array of String called names that contains the following values: 
        //“Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

       // a. Use a loop to iterate through the array and calculate the average number of 
        //letters per name. Print the result to the console.
        int charSum = 0;//the total number of all char added is assumed 0.
        for (int i = 0; i < names.length; i++) {//for loop loops the length of the array  
        charSum += names[i].length();//and adds the number of characters in each string contained in each index.
        }
        //once charSum has been updated and the for loop is closed, 
        //charSum is divided by the length of the array.
        int average = charSum/names.length;
        
        System.out.println("The average number of letters per name is: " + average);
        
       // b. Use a loop to iterate through the array again and concatenate all the names together, 
       // separated by spaces, and print the result to the console.
        StringBuilder allNames = new StringBuilder();//declared new variable of type StringBuilder
        for (int i = 0; i < names.length; i++) {//for loop begins
        	//this will put all names one after the other, 
        	//as one String, separated by spaces
        	allNames.append(names[i] + " "); 
        }
        System.out.println(allNames);
        
        //3. 
        //How do you access the last element of any array?
        //Array.length - 1;//
        System.out.println("The answer to question 3 is Array[array.length-1]");

//4. How do you access the first element of any array?
        System.out.println("The answer to question 3 is Array[0]");

//5. 
    //Create a new array of int called nameLengths.
        int[] nameLengths = new int [names.length];
   //Write a loop to iterate over the previously created names array 
        for (int i = 0; i < names.length; i++) {
        //and add the length of each name to the nameLengths array.
        nameLengths[i]	= names[i].length(); 
        } 	
//6. 
   //Write a loop to iterate over the nameLengths array and calculate the sum of 
        //all the elements in the array. Print the result to the console.
        int sum = 0;//declare a variable equally 0 of type int 
        for(int nameLegth: nameLengths) {// enhanced for  loop begins
        	sum = sum + nameLegth;//
        }
        System.out.println(sum);

//7. 
   //Write a method that takes a String, word, and an int, n, as arguments and returns the word 
    //concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method 
        //to return “HelloHelloHello”).
        System.out.println("Step 7 method answer: " + repeatWord("Howdy", 3));

//8. 
        //Write a method that takes two Strings, firstName and lastName, 
        //and returns a full name (the full name should be the first and the last name as a 
        //String separated by a space).
        System.out.println("#8 methods aswer: The author of the book Brown Spots on the Wall is: " + printFullName("Who-flung", "Pooh"));

//9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
        int[] exampleArray = {20, 30, 50};
        System.out.println("# 9 method: Is sum greater than 100? " + isSumGreaterThan100(exampleArray));
//10. Write a method that takes an array of double and returns the average of all the elements in the array.
        double[] anotherArray={36, 24, 35, 32, 18, 31};
        System.out.println(" # 10 answer: The average of all elelments in the array is: " + calculateAverage(anotherArray));
//11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
        double[] array1 = {16.94, 13.8, 21.5};
        double[] array2 = {32.04, 25.10, 35.40};
        
        System.out.println("Is the average of the first array greater? " + isFirstAverageGreater(array1, array2));
//12. 
        //Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
        boolean isHotOutside = false;//i set isHotOutside to false - afterall, it is December!
        double moneyInPocket = 0.75;//i set moneyInPocket to 0.75 because I am broke right now.

        System.out.println("Will buy drink? " + willBuyDrink(isHotOutside, moneyInPocket));
//13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
        int num1 = 28;
        System.out.println("The aswers for the method isPrinme: ");
        System.out.println(num1 + " is prime? " + isPrime(num1));

        int num2 = 63;
        System.out.println(num2 + " is prime? " + isPrime(num2));

        int num3 = 2;
        System.out.println(num3 + " is prime? " + isPrime(num3));


	}//end of main method//
	
	//7. 
	   //Write a method that takes a String, word, and an int, n, as arguments and returns the word 
	    //concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method 
	        //to return “HelloHelloHello”).
	public static String repeatWord(String userWord, int numTimes) {
		String yadaYada = "";	    
		for(int i = 0; i < numTimes; i++){
		    yadaYada += userWord;
		}
		return yadaYada;
	}
	        

	//8. Write a method that takes two Strings, firstName and lastName, and returns a full name 
	//(the full name should be the first and the last name as a String separated by a space).
	public static String printFullName(String firstName, String lastName) {
    	
    	String fullName = (firstName + " " + lastName);
    	return fullName;
    }

	//9.
	
	// Write a method that takes an array of int and returns true if the sum of all the ints 
	//in the array is greater than 100.
	public static boolean isSumGreaterThan100(int[] numbers) {
		int sum = 0;
		 for (int num : numbers) {//enhanced for loop is used to loop through the array
			 sum += num;
		 }//end of for loop
	        return sum > 100;
	        
	}//end of method 9.
        

	//10.
	// Write a method that takes an array of double and returns the average of all the 
	//elements in the array.
	public static double calculateAverage(double[] numbers) {
		double sum = 0;
        for (double num : numbers) {//enhanced for loop is used to loop through the array
        	sum += num;
        }//end of for loop
          return sum/numbers.length;  
	}

	//11.
	// Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
	 public static boolean isFirstAverageGreater(double[] array1, double[] array2) {
		 double average1 = calculateAverage(array1);
	        double average2 = calculateAverage(array2);

	        return average1 > average2;
	 }//end of isfirstAverageGreater
	 public static double calculateAverage1(double[] numbers) {
		 double sum = 0;
	        for (double num : numbers) {
	        	sum += num;
	        }
	        return sum / numbers.length;   
	        
	 }//end of calculate average 1 method
	//12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	 public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		 return isHotOutside && moneyInPocket > 10.50;
	 }//end of willBuyDrink Method
	//13.
	 //Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
	 public static boolean isPrime(int number) {
	        if (number <= 1) {
	            return false; // Numbers less than or equal to 1 are not prime.
	        }
	        for (int i = 2; i <= Math.sqrt(number); i++) {
	            if (number % i == 0) {
	                return false; // Found a divisor, so the number is not prime.
	            }
	        }
	        return true; // No divisors found, so the number is prime.
	    }
	
	 

}//end of class(do not go out of the class)//
