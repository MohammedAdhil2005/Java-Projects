package main;

import java.util.List;
import java.util.Scanner;

import daoimpl.customerDAOIMP;
import dto.customerDTO;

public class CustomerManagementSystem {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("   WELCOME TO CUSTOMER MANAGEMENT SYSTEM");
        System.out.println("========================================");

        System.out.println("ENTER 1 TO ADD NEW CUSTOMER");
        System.out.println("ENTER 2 TO GET ALL CUSTOMER DETAIL");
        System.out.println("ENTER 3 TO DELETE CUSTOMER FROM DATABASE");
        System.out.println("ENTER 4 TO UPDATE THE CUSTOMER");
        System.out.println("ENTER 5 TO COUNT THE CUSTOMER");
        System.out.println("ENTER 6 TO SEARCH BY NAME");
        System.out.println("ENTER 7 TO SEARCH BY ID");

        System.out.print("\nEnter your choice here: ");
        int key = sc.nextInt();

        switch (key) {

        case 1: {

            customerDAOIMP c = new customerDAOIMP();

            System.out.print("ENTER A CUSTOMER ID: ");
            int id = sc.nextInt();

            System.out.print("ENTER CUSTOMER NAME: ");
            String name = sc.next();

            System.out.print("ENTER CUSTOMER EMAIL: ");
            String gmail = sc.next();

            System.out.print("ENTER CUSTOMER PHONE: ");
            String phone = sc.next();

            System.out.print("ENTER CUSTOMER AGE: ");
            String age = sc.next();

            System.out.print("ENTER CUSTOMER GENDER: ");
            String gender = sc.next();

            c.congra(id);

            customerDTO c1 =
                    new customerDTO(id, name, gmail, phone, age, gender);

            c.add(c1);

            break;
        }

        case 2: {

            customerDAOIMP cs = new customerDAOIMP();
            List<customerDTO> l1 = cs.getallcustomer();

            for (customerDTO cu : l1) {
                System.out.println(cu);
            }

            break;
        }

        case 3: {

            customerDAOIMP cs = new customerDAOIMP();
            System.out.println("ENTER A ID TO DELETE THE RECORD");
            int id = sc.nextInt();

            cs.delete(id);

            break;
        }

        case 4: {

            customerDAOIMP ccs = new customerDAOIMP();
            System.out.println("ENTER A ID TO UPDATE THE RECORDS:");
            int id = sc.nextInt();

            System.out.println("ENTER A NAME TO UPDATE A NAME:");
            String name = sc.next();

            System.out.println("ENTER A EMAIL TO UPDATE THE EMAIL:");
            String email = sc.next();

            System.out.println("ENTER A PHONE NUMBER TO UPDATE:");
            String phone = sc.next();

            System.out.println("ENTER A AGE TO UPDATE:");
            String age = sc.next();

            System.out.println("ENTER A GENDER TO UPDATE:");
            String gender = sc.next();

            customerDTO c =
                    new customerDTO(id, name, email, phone, age, gender);

            System.out.println("Congratulations, your records are updated successfully.");

            break;
        }

        case 5: {

            customerDAOIMP c = new customerDAOIMP();
            int count = c.count();

            System.out.println("The number of customers is: " + count);

            break;
        }

        case 6: {

            customerDAOIMP cs = new customerDAOIMP();
            System.out.println("ENTER THE NAME OF THE CUSTOMER TO GET DETAIL");

            String name = sc.next();

            List<customerDTO> l = cs.searchbyname(name);

            for (customerDTO m : l) {
                System.out.println(m);
            }

            break;
        }

        case 7: {

            customerDAOIMP cs = new customerDAOIMP();
            System.out.println("ENTER A ID TO SEARCH FOR THE CUSTOMER:");

            int id = sc.nextInt();

            List<customerDTO> l = cs.searchbyid(id);

            for (customerDTO cust : l) {
                System.out.println(cust);
            }

            break;
        }

        default:
            throw new IllegalArgumentException(
                    "Unexpected value: " + key
            );
        }
    }
}