package javaday8;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Mapping {
    public static void main(String args[])
    {
        Map<String, Integer> phoneBook = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while(!exit){
            System.out.println("1.Add Contact");
            System.out.println("2.Find Contact");
            System.out.println("Display all contacts");
            System.out.println("4. Exit");
            System.out.println("Enter your choice");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 1:
                System.out.println("Enter Name: ");
                String name = scanner.nextLine();
                System.out.println("Enter phone Number:");
                int phoneNumber;
                try{
                    phoneNumber = scanner.nextInt();

                }catch(InputMismatchException e){
                    System.out.println("Invalid phone number:");
                    scanner.nextLine();
                    break;
                }
                
                scanner.nextLine();
                phoneBook.put(name, phoneNumber);
                System.out.println("contact added succesfully:)");
                break;
                case 2:
                System.out.println("Enter name of the person:");
                String searchName = scanner.nextLine();
                if(phoneBook.containsKey(searchName))
                {
                    System.out.println("phone number:" + searchName+":"+ phoneBook.get(searchName));
                }
                else{
                    System.out.println("contact not found");
                }
                break;
                case 3:
                System.out.println("All Contacts:");
                phoneBook.forEach((contactName , contactNumber) -> System.out.println(contactName +":" + contactNumber));
                break;
                case 4:
                exit =true;
                System.out.println("Exiting program...");
                break;
                default:
                System.out.println("Ivalid choice, please enter again");
            }
        }
        scanner.close();
        
    }
    
}
