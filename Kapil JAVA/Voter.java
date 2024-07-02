import java.util.*;

class Voter {
	public static void main(String[] args) {

		int Age = 18;
		String Nationality = "Indian"; 

		Scanner Age = new Age(System.in);
		System.out.println("Please Enter your age:- ");

		Scanner Name = new Name (System.in);
		System.out.println("Please Enter your Name:- ");

		 Scanner Nationality = new Nationality(System.in);
		System.out.println("Please Enter your Nationality:- "); 

		if( Age >= 18 && Nationality == "Indian") {
				System.out.println("Thany-You, You are eligible for a voterID");
			}

		}
}