package EmailApp;

import java.util.Scanner;

public class Email {
    private String firstname;
    private String lastname;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity;
    private int defaultPasswordLength =10;
    private String alternateEmail;
    private String companySuffix= "company.com";

    // Constructor to receive the first name and last name
    public Email(String firstname, String lastname){
        this.firstname= firstname;
        this.lastname= lastname;
        System.out.println("Email created: " + this.firstname + " "+ this.lastname);

        // Call a method asking for the department - return the department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is:" + this.password);
        //Combine elements to generate email
        email= firstname.toLowerCase() + "." + lastname.toLowerCase() + "@" + department + "." + companySuffix;
        System.out.println("Your email is: "+ email);
    }


    // Ask for department
    private String setDepartment () {
        System.out.print("enter the department \n1 For Sales\n2 For Development\n3 For Accounting\n0 For none\nEnter Department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {
            return "Sales";
        } else if (depChoice == 2) {
            return "Development";
        } else if (depChoice == 3) {
            return "Accounting";
        } else {
            return "";
        }
    }
    // Generate a random password
            private String randomPassword(int length){
            String passwordSet = "ABCDEFGHIJKMNOPQRSTUWXYZ0123456789!@#$%^&*()";
            char [] password = new char [length];
            for (int i=0; i<length; i++) {
               int rand=  (int) (Math.random() * passwordSet.length());
               password[i] = passwordSet.charAt(rand);
            }
            return new String(password);
        }

    // Set the mailbox capacity

    // Change the password

   }
