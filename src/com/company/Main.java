package com.company;

import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    static Form form = new Form();
    public static void main(String[] args) {
        boolean tryAgain = true;
        /*
        Form to input first name , middle name , last name
        age , status , no of children if married

        output list of above inputs
        */

        System.out.println("Please enter your info: ");
        System.out.println("1 - First name : /t" );
        form.setFirstName(new StringBuffer(in.nextLine()));
        System.out.println("1 - First lastname : /t" );
        form.setLastName(new StringBuffer(in.nextLine()));
        System.out.println("Do you want to change the user yes or no");

        System.out.println(form.getFirstName());

        while(tryAgain){
            System.out.println("Please enter your info: ");
            System.out.println("1 - First name : /t" );
            form.getFirstName().delete(0,form.getFirstName().length());
            form.setFirstName(form.getFirstName().append(in.nextLine()));
            System.out.println("1 - First lastname : /t" );
            form.setLastName(new StringBuffer(in.nextLine()));
            System.out.println(form.getFirstName());

            tryAgain = false;
        }









    }

    void display() {

    }

    private static class Form {

        private StringBuffer firstName;
        private StringBuffer lastName;
        private Integer age;
        private String status ; // single married divorced widower
        private Integer noOFChildren;

        public StringBuffer getFirstName() {
            return firstName;
        }

        public void setFirstName(StringBuffer firstName) {
            this.firstName = firstName;
        }

        public StringBuffer getLastName() {
            return lastName;
        }

        public void setLastName(StringBuffer lastName) {
            this.lastName = lastName;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public Integer getNoOFChildren() {
            return noOFChildren;
        }

        public void setNoOFChildren(Integer noOFChildren) {
            this.noOFChildren = noOFChildren;
        }
    }

}





