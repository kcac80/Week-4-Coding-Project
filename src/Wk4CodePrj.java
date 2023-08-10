public class Wk4CodePrj {

	public static void main (String [] args) {
	
	//Code Problem 1
		int [] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		int result = ages[ages.length -1] - ages [0];
		System.out.println(result);
		
		int [] newAges = {53, 19, 3, 4, 22, 18, 38, 90, 150};
		int newResult = newAges[newAges.length -1] - newAges[0];
		
		int sum = 0;
		for (int i = 0; i <newAges.length; i++) {
				sum += newAges [i];;
		}
		double averageAge = (double) sum / newAges.length;
		
		System.out.println("Average Age: " + averageAge); 
		
		
	
	//Code Problem 2
		String [] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		int totalLetters = 0;{
		for (String name : names) {
			totalLetters += name.length();
		}
		double averageLetters = (double) totalLetters / names.length;
		System.out.println("Average number of letters: "+ averageLetters);
		
		StringBuilder concatenatedNames = new StringBuilder();
		for (String name1 : names) {
			concatenatedNames.append(name1).append((" "));
			
			if(concatenatedNames.length() > 0) {
				concatenatedNames.deleteCharAt(concatenatedNames.length() -1);
			System.out.println(concatenatedNames.toString());
			}
	
		}
		}
	
		//Code Problem 3
		//Answer: int lastPartOfAnArray = array[array.length - 1];
		//Code Problem 4
		//Answer: int firstPartOfAnArray = array[0];
	
	/*	//Code Problem 5 and 6
		int [] nameLengths = new int [names1.length];
		for (int i = 0; i < names1.length; i++) {
			nameLengths[i] = names1[i].length();
		}
		system.out.println("Names length: [ ");
		for (int i = 0; i < nameLengths.length; i++) {
			System.out.println(nameLengths.length - 1); {
				System.out.print(",");
			}
			system.out.println("]");
	*/		
		//Code Problem 7
		String tripleHello = multiplyString("Hello", 3);
		System.out.println(tripleHello);
		
		//Code Problem 8
		String firstName = "Sam";
		String lastName = "Smith";
		System.out.println(fullName (firstName, lastName));
		
		//Code Problem 9
		int [] theArray = {23, 45, 78, 65, 1};
		boolean result1 = greaterThan100(theArray);
		System.out.println("Greater than 100?" + result1);
		
		//Code Problem 10
		double[] theArray1 = {11,12,34,72,12};
		double average = calculateAverage(theArray1);
		System.out.println("Array average: " + average); 
		
		//Code Problem 11
		double [] array1 = {33, 87, 107, 4};
		double [] array2 = {34, 12, 11, 45};
		boolean greaterAverage = compare(array1, array2);
		System.out.println(greaterAverage);
		
		//Code Problem 12
		boolean isHotOutside = true;
		double moneyInPocket = 19.23;
		
		boolean willBuy = willBuyDrink(isHotOutside, moneyInPocket);
		System.out.println("Will you buy it?" + willBuy);
		
		//Code Problem 13
		int [] myArray = {2, 45, 12, 13, 4};
		boolean result11 = isSumLessThan75(myArray);
		System.out.println("Is the sum less than 75? " + result11);
	}
	
		//Method Code Problem 7
		public static String multiplyString (String str, int num) {
		String result = "";
		for (int i = 0; i < num; i++) {
			result += str;
		}
			return result;
		}
		//Method Code Problem 8
		public static String fullName (String first, String last) {
			return (first + " " + last);
		
		}
		//Method Code Problem 9
		public static boolean greaterThan100(int[] arr) {
			int sum = 0;
			for (int num : arr) {
				sum+= num;
			}
			return sum > 100;
		}
		//Method Code Problem 10 
		public static double calculateAverage(double[] arr) {
			if (arr == null || arr.length == 0) {
			return 0.0;
		
			}
			double sum = 0.0;
			for (double num : arr) {
				sum += num;
			return sum / arr.length;
			}
			return sum;
			}
		//Method Code Problem 11
		public static boolean compare(double[] arr1, double[] array2) {
			double average1 = calculateAverage(arr1);
			double average2 = calculateAverage (array2);
			
		return average1 > average2;
		}
		private static double calculateAverage1(double[] arr) {
			if (arr == null || arr.length == 0) {
				return 0.0;
			}
			double sum = 0.0;
			for (double num : arr) {
				sum += num;
			}
			return sum / arr.length;
					}
		//Method Code 12
		public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
			return isHotOutside && moneyInPocket > 10.50; 
		}
		public static boolean isSumLessThan75(int [] arr) {
			int sum = 0;
				for (int num : arr) {
					sum += num;
				}
			return sum <75;
				}
		}


		




		
	
