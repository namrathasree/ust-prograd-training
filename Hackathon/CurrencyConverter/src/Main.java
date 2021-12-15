import sun.rmi.runtime.Log;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {
    public static void main(String[] args) throws IOException {
        CurrencyConvereter currencyConvereter=new CurrencyConvereter();
        Scanner sc=new Scanner(System.in);
        Logger logger = Logger.getLogger("MyLog");
        FileHandler fh;
        fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);
        logger.info("Program Started...");
        while(true){
            System.out.println("\n\n1.INR To USD");
            System.out.println("2.USD To INR");
            System.out.println("3.INR To AUD");
            System.out.println("4.AUD To INR");
            System.out.println("5.INR To CAD");
            System.out.println("6.CAD To INR");
            System.out.println(("7.Exit"));

            System.out.println("Enter your choice:");
            int choice=sc.nextInt();
            sc.nextLine();
            if(choice==1){
                logger.info("User selected INR to USD ");
                System.out.println("Enter Amount in INR");
                double amountInRupees=sc.nextDouble();
                logger.info("User entered amount  " +amountInRupees );
                if (amountInRupees <= 0)
                {
                    throw new IllegalArgumentException("Amount cannot be negative or zero");
                }
                else
                    System.out.printf("Amount in Dollars   %.2f" ,currencyConvereter.rupeesToDollar(amountInRupees));

            }
            else if(choice==2){
                logger.info("User selected USD to INR ");
                System.out.println("Enter Amount in USD");
                double amountInUSD=sc.nextInt();
                logger.info("User entered amount  " +amountInUSD );
                if (amountInUSD <= 0)
                {
                    throw new IllegalArgumentException("Amount cannot be negative or zero");
                }
                else
                    System.out.printf(" Amount in Rupees %.2f" ,currencyConvereter.dollarToRupees(amountInUSD));
            }
            else if(choice==3){
                logger.info("User selected INR to AUD ");
                System.out.println("Enter Amount in INR to convert it to AUD");
                double amountInINR=sc.nextDouble();
                logger.info("User entered amount  " +amountInINR );
                if(amountInINR<=0)
                    throw new IllegalArgumentException("Amount cannot be negative or zero");
                else
                    System.out.printf("Amount in AUD  %.2f" ,currencyConvereter.rupeesToAustralianDollar(amountInINR));
            }
            else if (choice == 4) {
                logger.info("User selected AUD to INR ");
                System.out.println("Enter Amount in AUD");
                double amountInAUD=sc.nextDouble();
                logger.info("User entered amount   " +amountInAUD );
                if(amountInAUD<=0)
                    throw new IllegalArgumentException("Amount cannot be negative or zero");
                else
                    System.out.printf("Amount in Rupees  %.2f" ,currencyConvereter.australianDollarToRupess(amountInAUD));
            }
            else if(choice==5){
                logger.info("User selected INR to CAD ");
                System.out.println("Enter Amount in INR to convert it to CAD");
                double amountInINR=sc.nextInt();
                logger.info("User entered amount   " +amountInINR );
                if(amountInINR<=0)
                    throw new IllegalArgumentException("Amount cannot be negative or zero");
                else
                    System.out.printf("Amount in CAD   %.2f" +currencyConvereter.rupeesToCanadianDollar(amountInINR));
            }
            else if(choice==6){
                logger.info("User selected CAD to INR");
                System.out.println("Enter Amount in CAD");
                double amountInCAD=sc.nextInt();
                logger.info("User entered amount  " +amountInCAD );
                if(amountInCAD<=0)
                    throw new IllegalArgumentException("Amount cannot be negative or zero");
                else
                    System.out.printf("Amount in Rupees    %.2f" ,currencyConvereter.canadianDollarToRupees(amountInCAD));
            }
            else if(choice==7) {
                break;
            }
            else
                throw new InputMismatchException("Enter valid Option");
        }
        logger.info("Program Stopped...");
    }
}
