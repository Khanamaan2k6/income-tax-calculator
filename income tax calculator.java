import java.util.*;
public class incomtaxcalculator {
    public static void main(String args[]){
        // Welcome message for the user
        System.out.println("INCOME TAX CALCULATOR \n PLEASE ENTER YOU INCOME");

        Scanner scn = new Scanner(System.in);  // Scanner object created to take input from user
        int income = scn.nextInt(); // Taking income input from the user

        // Case 1: No tax for income <= 3,00,000
        if(income<=300000){
            System.out.print("you have 0% percent tax on your income : " + income);
        }
        // Case 2: 5% tax for income between 3,00,001 and 6,00,000
        else if(income>=300000 && income<=600000){
            int af1 = (int) (income * 0.05f);
            System.out.println(" your actual income : " + income);
            System.out.println(" your tax amount on your income 5% : " + af1);
            System.out.println(" after tax amount : " + (income-af1));
        }
        // Case 3: 10% tax for income between 6,00,001 and 9,00,000
            else if (income>=600000 && income<=900000){
                int af2 = (int) (income * 0.10);
                System.out.println(" your actual income : " + income);
                System.out.println(" your tax amount on your income 10% : " + af2);
                System.out.println(" after tax amount : " + (income-af2));
        }
        // Case 4: 15% tax for income between 9,00,001 and 12,00,000
                else if (income>=900000 && income<=1200000){
                    int af3 = (int) (income * 0.15);
                    System.out.println(" your actual income : " + income);
                    System.out.println(" your tax amount on your income 15% : " + af3);
                    System.out.println(" after tax amount : " + (income-af3));
        }
         // Case 5: 20% tax for income between 12,00,001 and 15,00,000
                    else if (income>=1200000 && income<=1500000){
                        int af4 = (int) (income * 0.20);
                        System.out.println(" your actual income 20% : " + income);
                        System.out.println(" your tax amount on your income : " + af4);
                        System.out.println(" after tax amount : " + (income-af4));
        }
         // Case 6: 30% tax for income above 15,00,000
                        else if (income>=1500000){
                            int af5 = (int) (income * 0.30);
                            System.out.println(" your actual income 30% : " + income);
                            System.out.println(" your tax amount on your income : " + af5);
                            System.out.println(" after tax amount : " + (income-af5));
            }
         }
    
    }
