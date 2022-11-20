import java.util.Scanner;

class testMain{
  
   public static void main(String[] args) {
   
      int quarters;   
      int dimes;      
      int nickels;    
      int pennies;    
      
      Scanner sc = new Scanner( System.in );
      
      double dollars; 
      
      
      
      System.out.println("Enter the number of quarters(int): ");
      quarters = sc.nextInt();
      
      
      System.out.println("Enter the number of dimes(int): ");
      dimes = sc.nextInt();
      
      
      System.out.println("Enter the number of nickels(int): ");
      nickels = sc.nextInt();
      
      System.out.println("Enter the number of pennies(int): ");
      pennies = sc.nextInt();

      
      // calculate dollars
      
      dollars = (0.25 * quarters) + (0.10 * dimes) 
                          + (0.05 * nickels) + (0.01 * pennies); 
      
      
      System.out.println("\nTotal Dollars : "+dollars);
      
   }  
 
} 