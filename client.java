package api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 

public class client {

	static int display() throws IOException {

        System.out.println("\t\t Client Database ");

        System.out.println("\t\t ~~~~~~~~~~~~~~~~~ ");

        System.out.println("\t\t 1. Insert. ");

        System.out.println("\t\t 2. Display. ");

        System.out.println("\t\t 3. Exit. ");

        System.out.print("\t Choose an option [1,2,3] : ");

        int ch = Integer.parseInt(getInput());

        return ch;

        }        //       end of display

	private static String getInput() {
		// TODO Auto-generated method stub
		 
		   String str;

	          try {

	                   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	                   str = br.readLine();

	              }catch(Exception e) {

	                   return null;}

	                   return str;

	 

	          }        //       end of getInput
		
		
	  public static void main(String args[]) throws IOException {

          database db = new database();

       

          while(true) {

          int ch = display();

          switch(ch) {

                   case 1:

                             System.out.print("\n Enter client Id : ");

                             String id = getInput();

                             System.out.print(" client first Name : ");

                             String firstname = getInput();

                             System.out.print(" client last name : ");

                             String lastname = getInput();

                             System.out.print("  email : ");

                             String email = getInput();

                            
                             db.inserts(id, firstname, lastname, email);

                             break;

 

                   case 2:

                             db.display();

                             break;

 

                   case 3:

                             db.close();

                             System.exit(0);

                   }        //       end of switch

          }        //       end of while

 

          }
	
	}
	

