import java.util.*;
class GuessTheNumber
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.println("\t\t\t\t***Guess The Number***");
		System.out.println("\t\t\t\t-------------------------------");
		
		char choice; 
		
		do{
			 int sys_Number = (int)(Math.random() * 100) + 1;
		     int user_Number = -1;  
			 
			 System.out.println("System has generated a number between 1 and 100");
             System.out.println("Try to guess it");
			 
			  while (user_Number != sys_Number)
				  {
                System.out.print("Enter your guess: ");
                user_Number = sc.nextInt();

                if (user_Number < sys_Number) 
					{
                    System.out.println("Low");
                } 
				else if (user_Number > sys_Number)
					{
                    System.out.println("High");
                }
				else
					{
                    System.out.println("Congrats! You got the number: " + sys_Number);
                }
				  }//while close
		
		System.out.print("Do you want to play again? (Y/N): ");
        choice = sc.next().charAt(0);

		}//do close
		 while (choice == 'Y' || choice == 'y');

        System.out.println("Thanks for playing");
	}//main close
}//class close