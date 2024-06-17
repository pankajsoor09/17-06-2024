//write a java program to calculate a simple interest for a given amount
public class task2 {//class started here
	//Java program execution starts from manin()method
	public static void main(String[] args) {
		// main()method starts from here
       /*S.I. = (P*R*T)/100
        *where P = Principal( initially borrowed amount)
        *R = Rate of Interest in % per annum,T = Time
        *for example take principal = 10000 Rate =5% Time = 2 years  */
		
		int P = 10000;  // Initially borrowed amount
		
		int R = 5;     // Rate of Intrest in %
		
		int T = 2;    // Time for which monney was borrowed
		
		int SimpleInterest = (P*R*T)/100; // formula for calculating simple interest
		
				System.out.println(SimpleInterest);// prints the simple interest
				
	}//main() method ends here

} // class ends here
