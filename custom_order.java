// Code for Beginning Java's Cake & Cupcake Shop Tutorial

import java.util.Scanner;  // Needed for the Scanner class to read input

public class custom_order {

    // STEP 1 PRINTING HELLO WORLD TO CONSOLE
    public static void main(String[] args) {
        
      //System.out.println("Hello World!"); // print Hello World to console
        
    // TEST CODE
    
    // STEP 2 CREATE A SCANNER OBEJCT, DECLARE VARAIBLES, & PRINT STATEMENTS
	  
    Scanner keyboard = new Scanner (System.in); 

    String firstName;
    String itemOrder;
    String frostingType;
    String fillingType;
    String toppings;
    String input;

    double cost = 15.00;
    final double TAX_RATE = .08;
    double tax;

	 
    // Introduce shop and prompt user to input first name

    System.out.println("Welcome to Java's cake & cupcake shop");
    System.out.println("We make custom cakes with our secret batter");
      

	  
	  
    // TEST CODE
    
    // STEP 3 INPUT YOUR NAME AND PREPARE TO VIEW MENU

    System.out.println("What is your first name? ");
    firstName = keyboard.nextLine();

    System.out.print(firstName + ", please see our MENU below: ");
    System.out.print("\n"); //skips a line
   
	  
      
    // TEST CODE     
    
    // STEP 4 DISPLAY MENU

    System.out.println("_______________________________________________");
    System.out.println("      MENU          Qty         Base Cost      ");
    System.out.println("_______________________________________________");
    System.out.println("      CAKE           1             $15         ");
    System.out.println("    SET of Cupcakes  6             $15         ");
    System.out.println("Frostings (vanilla, chocolate, strawberry, coco)");
    System.out.println("Fillings (mocha, mint, lemon, caramel, vanilla)");
    System.out.println("Toppings (sprinkles, cinnamon, cocoa, nuts)");
    System.out.println("_______________________________________________");
	

    // TEST CODE     
    
    // STEP 5 PROMPT USER TO ORDER
    System.out.println(" Do you want a CAKE or CUPCAKES");
    itemOrder = keyboard.nextLine();

  
	  
	  
	  
      
    // TEST CODE
      
    // STEP 6 PROMPT USER TO CHOOSE FROSTING

    System.out.println("What type of frosting do you want?");
    System.out.println("Vanilla or chocolate");
    frostingType = keyboard.nextLine();

   
	 
	 
	 
      
    //TEST CODE
      
    // STEP 7 PROMPT USER TO CHOOSE FILLING

    System.out.println("What type of filling do you want?");
    System.out.println("Mint or lemon?");
    fillingType = keyboard.nextLine();


	  
	  
      
    // TEST CODE
      
    // STEP 8 PROMPT USER TO CHOOSE TOPPINGS
    System.out.println("What type of topping do you want?");
    System.out.println("Sprinkles or nuts?");
    toppings = keyboard.nextLine();


	
      
      
    // TEST CODE
      
    // STEP 9 DISPLAY ORDER CONFIRMATION
    System.out.println();
    System.out.println(firstName + " , your order is as follows: ");
    System.out.println("_________________________________________");
    System.out.println("Item Ordered: " + itemOrder);
    System.out.println("Frosting: " + frostingType);
    System.out.println("Filling: " + fillingType);
    System.out.println("Toppings: " + toppings);
    System.out.println("_________________________________________");


      
	  
	  
	  
    
    // TEST CODE
      
    // STEP 10 DISPLAY COST AND SALES TAX

    System.out.printf("The cost of your order is: $%.2f\n", cost);
    tax = cost * TAX_RATE;
    System.out.printf("The tax rate is: $%.2f\n", tax);
    System.out.printf("The total bill is: $%.2f\n", (tax + cost));

  
    }   
}