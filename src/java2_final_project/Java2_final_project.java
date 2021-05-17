/* Saudi Airline Reservation System is a booking system
that support the customers to let them :
1.book/buy a ticket
2.Cancel a ticket
3.Check the ticket 
4.shows the table of the ticket reservation 
5- a customer helping system inside this system 
and lastly, it lets the user to exit the system */
package java2_final_project;

import java.util.*;
import java.math.*;

/**
 * This an interface for Flight
 */
interface Interface_Flight {

    /* we implemented the interface in class flight,
    these methods need to be overriden because they're abstract methods */
    public void setName(String name);

    public String getName();

    public void setID(String ID);

    public String getID();

}

public class Java2_final_project {

    //the main method, here we invoke everything
    public static void main(String[] args) {
        //Used to get User's input
        Scanner scan = new Scanner(System.in);

        //create delete object 
        delete passenger1 = new delete();

        //create table object 
        flighttable table = new flighttable();

        //create helper object 
        Help helper = new Help();

        //initializing the variable i to use it in the do while loop
        int i = 0;
        do {
            /* The System that enable user to book/cancel/check/show table */
            System.out.print("/----------------------------------------------------------------------\\ \n");
            System.out.print("|\t\tWelcome to Saudi Airline Reservation System            |\n");
            System.out.print("|----------------------------------------------------------------------|\n");
            System.out.println("|   1- Buy/Book a ticket                                               |");

            System.out.println("|   2- Cancel ticket                                                   |");

            System.out.println("|   3- Check ticket                                                    |");

            System.out.println("|   4- Table of the tickets reservation                                |");
            
            System.out.println("|   5- Exit                                                            |");

            System.out.println("|   6- The User help system                                            |");
            System.out.println("\\----------------------------------------------------------------------/");

            System.out.println();
            System.out.println("--> Please enter you choice (1-6):");

            //declaring user's input to the variable UserChoice with type int 
            int UserChoice = scan.nextInt();
            //check if the user input is 1/2/3/4 switch depending on the user's choice
            if (UserChoice == 1 || UserChoice == 2 || UserChoice == 3 || UserChoice == 4 || UserChoice == 6) {
                switch (UserChoice) {

                    /* this is the case were the user will book a ticket*/
                    case 1: {

                        System.out.print("Enter your name: ");
                        //declaring user's input to the variable name with type string
                        String name = scan.next();
                        System.out.println("");

                        // setting the user's input which will be his/her full name
                        passenger1.setName(name);
                        //inisializing the varaible IDloop to let the loop continue excuting 
                        int IDloop = 0;
                        do {
                            System.out.print("Enter your ID number: ");

                            //enable the user to enter his/her ID number
                            String ID = scan.next();

                            /*check if the user input is only digit, 
                            otherwise the program will tell the user to try again*/
                            if (ID.matches("[0-9]+")) {
                                // setting the user's input which will be his/her ID number
                                passenger1.setID(ID);
                                System.out.println("Your ID is Correct ");

                                //summing the variable IDloop with 1, to exit the loop
                                IDloop++;
                            } else {

                                System.out.println(" Wrong Answer. Please enter a digit number ");
                            }

                            /*the do while loop will continue looping
                            if and only if the varaible IDloop is 0 */
                        } while (IDloop == 0);

                        //inisializing the varaible DepartFromLoop to let the loop continue excuting 
                        int DepartFromLoop = 0;
                        do {

                            System.out.print("Enter departfrom: ");

                            //enable the user to enter his/her the city that they'll depart from 
                            String departfrom = scan.next();

                            /*check if the user input is only letters, 
                            otherwise the program will tell the user to try again*/
                            if (departfrom.matches("[a-zA-Z]+")) {

                                // setting the user's input which will be his/her city that they'll depart from
                                passenger1.setDepartfrom(departfrom);

                                //summing the variable DepartFromLoop with 1, to exit the loop
                                DepartFromLoop++;
                            } else {
                                System.out.println("Wrong Answer. Please enter a letters ");
                            }
                            /*the do while loop will continue looping
                            if and only if the varaible DepartFromLoop is 0 */
                        } while (DepartFromLoop == 0);

                        //inisializing the varaible DepartToLoop to let the loop continue excuting 
                        int DepartToLoop = 0;
                        do {
                            System.out.print("Enter departto: ");

                            //enable the user to enter his/her the city that they'll depart to 
                            String departto = scan.next();

                            /*check if the user input is only letters, 
                            otherwise the program will tell the user to try again*/
                            if (departto.matches("[a-zA-Z]+")) {

                                // setting the user's input which will be his/her city that they'll depart to
                                passenger1.setDepartto(departto);

                                //summing the variable DepartToLoop with 1, to exit the loop
                                DepartToLoop++;
                            } else {
                                System.out.println("Wrong Answer. Please enter a letters ");

                            }
                            /*the do while loop will continue looping
                            if and only if the varaible DepartToLoop is 0 */
                        } while (DepartToLoop == 0);

                        //flightsection method is invoked 
                        passenger1.flightsection();

                        //print method is invoked
                        passenger1.print();
                        System.out.println("Choose your flight according to the Boarding Number: ");

                        //enable the user to enter his/her the boarding number
                        int boardingnum = scan.nextInt();

                        //printing the user's information 
                        System.out.println("You booked from " + passenger1.departfrom + " to " + passenger1.departto
                                + " ticket number is " + passenger1.boarding(boardingnum));
                        System.out.println("---------------------------------------------------------------------------");//

                        //break is used to exit the switch statment 
                        break;

                    }//end of case 1

                    case 2: {
                        //inisializing the varaible k to let the loop continue looping 
                        int k = 0;
                        do {
                            System.out.println("If you want to cancel your boarding");
                            System.out.println("Enter your ticket number:  ");

                            //enable the user to enter the ticket number
                            int deletboarding = scan.nextInt();

                            //the ticket number which will be randomly selected, will be minus 15800 which will be the boarding number
                            deletboarding -= 15800;

                            //cancele method is invoked 
                            passenger1.cancele(deletboarding);

                            /* check if the user did not enter the ticket number, if the user 
                            entered the ticket number the compiler will enter the if statment */
                            if (deletboarding == 1000 || deletboarding == 1001 || deletboarding == 1002 || deletboarding == 1003
                                    || deletboarding == 1004 || deletboarding == 1005 || deletboarding == 1006 || deletboarding == 1007
                                    || deletboarding == 1008 || deletboarding == 1009 || deletboarding == 1010 || deletboarding == 1011
                                    || deletboarding == 1012 || deletboarding == 1013 || deletboarding == 1014 || deletboarding == 1015
                                    || deletboarding == 1016 || deletboarding == 1017 || deletboarding == 1018 || deletboarding == 1019
                                    || deletboarding == 1020 || deletboarding == 1021 || deletboarding == 1021 || deletboarding == 10122
                                    || deletboarding == 1023) {
                                System.out.println("Your boarding is canceld");

                                //summing the variable k to let the loop exit
                                k++;
                            } else {
                                System.out.println("No ticket with this number, please enter the correct number");
                            }

                            /*the do while loop will continue looping
                            if and only if the varaible k is 0 */
                        } while (k == 0);
                        break;
                    }//end of case 2

                    //if the user entered 3, the compiler will enter this case and show the user rservation
                    case 3: {

                        //inisializing the varaible j to let the loop continue looping 
                        int j = 1;
                        do {

                            System.out.print("Enter your ticket number: ");

                            int ticketnum = scan.nextInt();
                            ticketnum -= 15800;

                            // check if the ticket is canceled which will be null
                            if (passenger1.boardingdate == null) {
                                System.out.println("You have canceled your ticket");
                                j++;
                            } else if (ticketnum == 1000 || ticketnum == 1001 || ticketnum == 1002 || ticketnum == 1003 || ticketnum == 1004 || ticketnum == 1005 || ticketnum == 1006
                                    || ticketnum == 1007 || ticketnum == 1008 || ticketnum == 1009 || ticketnum == 1010 || ticketnum == 1011 || ticketnum == 1012 || ticketnum == 1013
                                    || ticketnum == 1014 || ticketnum == 1015 || ticketnum == 1016 || ticketnum == 1017 || ticketnum == 1018 || ticketnum == 1019 || ticketnum == 1020
                                    || ticketnum == 1021 || ticketnum == 1022 || ticketnum == 1023) {
                                //printing the user's information 
                                System.out.println("Passenger name is " + passenger1.name + ", your ID is " + passenger1.ID + ", departfrom "
                                        + passenger1.departfrom + " to " + passenger1.departto + ", boarding due to " + passenger1.boardingdate);
                                j++;
                            }
                                else {
                                  System.out.println("No ticket with this number.\n please try again ");

                                }
                            
                            /*the do while loop will continue looping
                            if and only if the varaible j is 1 */
                        } while (j == 1);

                        break;
                    }//end of case 3

                    //if the user entered 4, it will show her/him the ticket reservation table 
                    case 4: {
                        System.out.println("--------------------------------------------");
                        System.out.println("-| The Table of the Ticket Reservation is |-");
                        System.out.println("--------------------------------------------");
                        table.print();
                        break;

                    }//end of case 4

                    //if the user enterd 6, he/she will be in this case. that means the user need the system to help her/him
                    case 6: {
                        //inisializing the varaible d to let the loop continue looping 
                        int d = 0;
                        do {
                            System.out.println("-------------------------------------------------------------------------");
                            System.out.println("\t\t\tThis is your helping System\n Please enter the problem that you're facing from scale(1-5): ");
                            System.out.println("-------------------------------------------------------------------------");
                            System.out.println("\t\t\t(1) How to buy/book a Ticket\n\t\t\t(2) How to cancel a ticket"
                                    + "\n\t\t\t(3) how to check your ticket \n\t\t\t(4) how to see the ticket reservation table\n\t\t\t(5) how to exit the system ");
                            System.out.println("-------------------------------------------------------------------------");
                            System.out.println("--->Please enter your problem here(1-5):");
                            System.out.print("---> ");

                            //enable the user to enter from scale 1 to 5 
                            int UserInput = scan.nextInt();

                            //UserHelper method invoked
                            helper.UserHelper(UserInput);
                            System.out.println("-------------------------------------------------------------------------");
                            System.out.println("Do you have any other problems? answer with (yes/no): ");
                            System.out.println("-------------------------------------------------------------------------");
                            System.out.print("---> ");

                            //enable the user to enter yes if there is another problem and no to exiting the system
                            String UserInput1 = scan.next();
                            //if the user want to continue and she/he had a problem the they need to write yes. of not, they need to write no
                            if (UserInput1.equalsIgnoreCase("yes")) {
                                d = 0;
                            } else {
                                d++;
                            }
                            /*the do while loop will continue looping
                            if and only if the varaible d is 0 */
                        } while (d == 0);
                        break;
                    }//end of case 6 

                }//end of switch

                //if the user want to continue he/she need to write yes. of not, he need to write no
                System.out.println("Do you want to continue? answer with (yes/no): ");
                String YesNoLoop = scan.next();

                //inisializing the varaible w to let the loop continue looping 
                int w = 0;

                /*the do while loop will continue looping
                            if and only if the varaible w is 0 */
                while (w == 0) {

                    //cjeck if the user want to continue the ticket reservation system or not
                    if (YesNoLoop.equalsIgnoreCase("yes")) {

                        i = 0;
                        w++;

                    } else if (YesNoLoop.equalsIgnoreCase("No")) {
                        i = 1;
                        w++;

                    } else {
                        System.out.println("Wrong selection, Please try again! ");

                        YesNoLoop = scan.next();
                    }

                }//end of while loop

                // check if the user entered 5 
            } else if (UserChoice == 5) {
                System.out.println("Thanks for using this System");
                i++;
                // if the user did not enter 5 
            } else {
                System.out.println("Wrong answer! Please enter your choice from scale (1-5)\n try again please");

            }
            /*the do while loop will continue looping
             if and only if the varaible i is 0 */
        } while (i == 0);

    }//end of main method
}//end of public class

/* class flight, that implements the methods of the Interface_Flight interface */
class Flight implements Interface_Flight {

    //declaration of Flight's attributes 
    protected String name;
    protected String ID;

    //Flight no-arg Constructor 
    public Flight() {
        this(null, "0");
    }

    // Flight parameterized Constructor
    public Flight(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String getID() {
        return ID;
    }

}//end of flight class
/* create buyticket subclass from its superclass flight  */
class buyticket extends Flight {

    //buyticket decleration of attributes 
    protected String departfrom;
    protected String departto;

    //buyticket no-arg Constructor 
    public buyticket() {
        //superclass no-arg constroctor is rewritten here
        super();
        departfrom = null;
        departto = null;
    }

    // buyticket parameterized Constructor
    public buyticket(String departfrom, String departto, String day) {
        this.departfrom = departfrom;
        this.departto = departto;
    }

    // decleration of accessor method for depart from 
    public String getDepartfrom() {
        return departfrom;
    }

    // decleration of mutator method for depart from 
    public void setDepartfrom(String departfrom) {
        this.departfrom = departfrom;
    }

    // decleration of accessor method for depart to 
    public String getDepartto() {
        return departto;
    }
    // decleration of mutator method for depart to 

    public void setDepartto(String departto) {
        this.departto = departto;
    }
}//end of buyticket subclass
/* create flightsection subclass from its superclass buyticket  */
class flightsection extends buyticket {

    //flight section attributes 
    protected String section;

    /* this method is used for flight section reservation */
    public void flightsection() {
        Scanner scan = new Scanner(System.in);
        //decleration of varaible numclass
        int numclass;

        do {
            System.out.println("If you want the Economy class press (1) ");
            System.out.println("If you want the Business class press (2) ");
            numclass = scan.nextInt();

            switch (numclass) {
                //check if the user entered 1 then economy class 
                case 1:
                    section = "Your seat is Economy class";
                    break;
                //check if the user entered 1 then buisness class 
                case 2:
                    section = "Your seat is Business class";
                    break;
                // if the user did not enter 1 or 2 
                default:
                    System.out.println("wrong selection, please try again ");
            }
            /*the do while loop will continue looping
             if and only if the varaible numclass is not equal to 0 and 1*/
        } while (numclass != 1 && numclass != 2);

    }//end of flightsection method 
}//end of flightsection subclass

/* create flighttable subclass from its superclass flightsection  */
class flighttable extends flightsection {

    //Flight table Attributes 
    //array list to add the day and the time and the boarding number
    protected ArrayList<String> boarding = new ArrayList<String>();
    protected String boardingdate;

    /* this method is used to Show the Ticket reservation table */
    public void print() {

        System.out.println("Day\t\t Time\t\tBoarding No");
        System.out.println("--------------------------------------------");
        boarding.add(0, "SUNDAY\t         1:00\t\t 1000");
        boarding.add(1, "MONDAY\t         2:00\t\t 1001");
        boarding.add(2, "TUSDAY\t         3:00\t\t 1002");
        boarding.add(3, "WEDNSDAY         4:00\t\t 1003");
        boarding.add(4, "THURSDAY         5:00\t\t 1004");
        boarding.add(5, "FRIDAY\t         6:00\t\t 1005");
        boarding.add(6, "SATERDAY         7:00\t\t 1006");
        boarding.add(7, "SUNDAY\t         8:00\t\t 1007");
        boarding.add(8, "MONDAY\t         9:00\t\t 1008");
        boarding.add(9, "TUSDAY \t        10:00\t\t 1009");
        boarding.add(10, "WEDNSDAY        11:00\t\t 1010");
        boarding.add(11, "THURSDAY        12:00\t\t 1011");
        boarding.add(12, "FRIDAY\t        13:00\t\t 1012");
        boarding.add(13, "SATERDAY        14:00\t\t 1013");
        boarding.add(14, "SUNDAY \t        15:00\t\t 1014");
        boarding.add(15, "MONDAY\t        16:00\t\t 1015");
        boarding.add(16, "TUSDAY\t        17:00\t\t 1016");
        boarding.add(17, "WEDNSDAY        18:00\t\t 1017");
        boarding.add(18, "THURSDAY        19:00\t\t 1018");
        boarding.add(19, "FRIDAY \t        20:00\t\t 1019");
        boarding.add(20, "SATERDAY        21:00\t\t 1020");
        boarding.add(21, "SUNDAY\t        22:00\t\t 1021");
        boarding.add(22, "MONDAY \t        23:00\t\t 1022");
        boarding.add(23, "TUSDAY\t        24:00\t\t 1023");
        // begining of for each loop for boarding array list
        for (String x : boarding) {
            System.out.println(x);
        }//end of for each 
    }//end of print method 

    /* this method is used to Book a Ticket */
    public int boarding(int g) {

        switch (g) {
            case 1000:
                boarding.set(0, "boarding is booked");
                boardingdate = "SUNDAY at 1:00";
                break;
            case 1001:
                boarding.set(1, "boarding is booked");
                boardingdate = "MONDAY at 2:00";
                break;
            case 1002:
                boarding.set(2, "boarding is booked");
                boardingdate = "TUSDAY at 3:00";
                break;
            case 1003:
                boarding.set(3, "boarding is booked");
                boardingdate = "WEDNSDAY at 4:00";
                break;
            case 1004:
                boarding.set(4, "boarding is booked");
                boardingdate = "THURSDAY at 5:00";
                break;
            case 1005:
                boarding.set(5, "boarding is booked");
                boardingdate = "FRIDAY at 6:00";
                break;
            case 1006:
                boarding.set(6, "boarding is booked");
                boardingdate = "SATERDAY at 7:00";
                break;
            case 1007:
                boarding.set(7, "boarding is booked");
                boardingdate = "SUNDAY at 8:00";
                break;
            case 1008:
                boarding.set(8, "boarding is booked");
                boardingdate = "MONDAY at 9:00";
                break;
            case 1009:
                boarding.set(9, "boarding is booked");
                boardingdate = "SUNDAY at 10:00";
                break;
            case 1010:
                boarding.set(10, "boarding is booked");
                boardingdate = "SUNDAY at 11:00";
                break;
            case 1011:
                boarding.set(11, "boarding is booked");
                boardingdate = "SUNDAY at 12:00";
                break;
            case 1012:
                boarding.set(12, "boarding is booked");
                boardingdate = "SUNDAY at 13:00";
                break;
            case 1013:
                boarding.set(13, "boarding is booked");
                boardingdate = "SUNDAY at 14:00";
                break;
            case 1014:
                boarding.set(14, "boarding is booked");
                boardingdate = "SUNDAY at 15:00";
                break;
            case 1015:
                boarding.set(15, "boarding is booked");
                boardingdate = "SUNDAY at 16:00";
                break;
            case 1016:
                boarding.set(16, "boarding is booked");
                boardingdate = "SUNDAY at 17:00";
                break;
            case 1017:
                boarding.set(17, "boarding is booked");
                boardingdate = "SUNDAY at 18:00";
                break;
            case 1018:
                boarding.set(18, "boarding is booked");
                boardingdate = "SUNDAY at 19:00";
                break;
            case 1019:
                boarding.set(19, "boarding is booked");
                boardingdate = "SUNDAY at 20:00";
                break;
            case 1020:
                boarding.set(20, "boarding is booked");
                boardingdate = "SUNDAY at 21:00";
                break;
            case 1021:
                boarding.set(21, "boarding is booked");
                boardingdate = "SUNDAY at 22:00";
                break;
            case 1022:
                boarding.set(22, "boarding is booked");
                boardingdate = "SUNDAY at 23:00";
                break;
            case 1023:
                boarding.set(23, "boarding is booked");
                boardingdate = "SUNDAY at 24-:00";
                break;
            default:
                System.out.println("wrong selection, please try again ");
        }
        return g + 15800;
    }

}//end of class flighttable
/* create delete subclass from its superclass flighttable  */
class delete extends flighttable {

    /* this method is used to Cancel Ticket */
    public void cancele(int s) {

        switch (s) {
            case 1000:
                boarding.set(0, "Ticket has been reserved at SUNDAY, bording at 1:00. boarding number 1000");
                boardingdate = null;
                break;
            case 1001:
                boarding.set(1, "Ticket has been reserved at MONDAY, bording at 2:00. boarding number 1001");
                boardingdate = null;
                break;
            case 1002:
                boarding.set(2, "Ticket has been reserved at TUSDAY, bording at 3:00. boarding number 1002");
                boardingdate = null;
                break;
            case 1003:
                boarding.set(3, "Ticket has been reserved at WEDNSDAY, bording at 4:00. boarding number 1003");
                boardingdate = null;
                break;
            case 1004:
                boarding.set(4, "Ticket has been reserved at THURSDAY, bording at 5:00. boarding number 1004");
                boardingdate = null;
                break;
            case 1005:
                boarding.set(5, "Ticket has been reserved at FRIDAY, bording at 6:00. boarding number 1005");
                boardingdate = null;
                break;
            case 1006:
                boarding.set(6, "Ticket has been reserved at SATERDAY, bording at 7:00. boarding number 1006");
                boardingdate = null;
                break;
            case 1007:
                boarding.set(7, "Ticket has been reserved at SUNDAY, bording at 8:00. boarding number 1007");
                boardingdate = null;
                break;
            case 1008:
                boarding.set(8, "Ticket has been reserved at MONDAY, boarding at 9:00. boarding number 1008");
                boardingdate = null;
                break;
            case 1009:
                boarding.set(9, "Ticket has been reserved at TUSDAY, boarding at 10:00. boarding number 1009");
                boardingdate = null;
                break;
            case 1010:
                boarding.set(10, "Ticket has been reserved at WEDNSDAY, boarding at 11:00. boarding number 1010");
                boardingdate = null;
                break;
            case 1011:
                boarding.set(11, "Ticket has been reserved at THURSDAY, boarding at 12:00. boarding number 1011");
                boardingdate = null;
                break;
            case 1012:
                boarding.set(12, "Ticket has been reserved at FRIDAY, boarding at 13:00. boarding number 1012");
                boardingdate = null;
                break;
            case 1013:
                boarding.set(13, "Ticket has been reserved at SATERDAY, boarding at 14:00. boarding number 1013");
                boardingdate = null;
                break;
            case 1014:
                boarding.set(14, "Ticket has been reserved at SUNDAY, boarding at 15:00.  boarding number 1014");
                boardingdate = null;
                break;
            case 1015:
                boarding.set(15, "Ticket has been reserved at MONDAY, boarding at 16:00. boarding number 1015");
                boardingdate = null;
                break;
            case 1016:
                boarding.set(16, "Ticket has been reserved at TUSDAY, boarding at 17:00. boarding number 1016");
                boardingdate = null;
                break;
            case 1017:
                boarding.set(17, "Ticket has been reserved at WEDNSDAY, boarding at 18:00. boarding number 1017");
                boardingdate = null;
                break;
            case 1018:
                boarding.set(18, "Ticket has been reserved at THURSDAY, boarding at 19:00. boarding number 1018");
                boardingdate = null;
                break;
            case 1019:
                boarding.set(19, "Ticket has been reserved at FRIDAY, boarding at 20:00. boarding number 1019");
                boardingdate = null;
                break;
            case 1020:
                boarding.set(20, "Ticket has been reserved at SATERDAY, boarding at 21:00. boarding number 1020");
                boardingdate = null;
                break;
            case 1021:
                boarding.set(21, "Ticket has been reserved at SUNDAY, bording at 22:00. boarding number 1021");
                boardingdate = null;
                break;
            case 1022:
                boarding.set(22, "Ticket has been reserved at MONDAY, bording at 23:00. boarding number 1022");
                boardingdate = null;
                break;
            case 1023:
                boarding.set(23, "Ticket has been reserved at TUSDAY, bording at 24:00. boarding number 1023");
                boardingdate = null;
                break;

        }//end of switch 
    }//end of cancele method

}//end of the subclass delete

//creation of class help which only includes the UserHelper method 
class Help {

    /* this method will help the user with any problem that he/she is facing */
    public void UserHelper(int s) {

        System.out.println("The System will tell you to enter a number from scale (1-6)\n");
        switch (s) {

            case 1: {
                System.out.println("How to buy a ticket?\nFirst: if you want to buy/book a ticket you need to enter number 1 without any additions to it"
                        + "\nSecond: When you enter number 1, the System will ask you to enter the following"
                        + "\n1.Your Full name\n2.Your ID number\n3.the city that you'll depart from\n4.the city you'll depart to\nMoreover, The System will show you the table of the ticket reservation."
                        + "\nThe system will ask you to choice the day and the time of the flight according to the boarding number,\nthis means that you will answer by the boarding number that on the table ");
                break;
            }//end of case 1
            case 2: {
                System.out.println("How to cancel your ticket?\nTo cancel your ticket"
                        + "\nyou need to enter you ticket number that is conected to your"
                        + " boarding number when you reserved your ticket");
                break;

            }//end of case 2 
            case 3: {
                System.out.println("How to check your ticket?\nTo check your ticket, "
                        + "\nyou need to enter you ticket number that is conected to "
                        + "your boarding number when you reserved your ticket");
                break;
            }//end of case 3
            case 4: {
                System.out.println("How to see the ticket reservation table?\n"
                        + "to see the ticket reservation table, you need enter number"
                        + " 4 without any additions");
                break;
            }//end of case 4 
            case 5: {
                System.out.println("How to exit the System?\n"
                        + "To exit the system you need to enter number 5 without any additions");
                break;
            }//end of case 5 

        } //end of switch 

    }// end of UserHelper method

}//end of class help




