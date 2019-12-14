package project6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Student> b = new ArrayList<>();
        Student temp = new Student();
        Dars dars = new Dars();

        boolean f = true;
        boolean f2 = true;

        while (f) {
            Scanner input = new Scanner(System.in);
            System.out.print("\n\nname dars ra vard konid : ");
            String n = input.nextLine();
            dars.name = n;
            System.out.print("\nnomreh dars ra vared konid : ");
            n = input.nextLine();
            dars.nomreh = Float.parseFloat(n);

            if (dars.nomreh >= 10) {
                dars.ghaboli = true;
            } else {
                dars.ghaboli = false;
            }

            System.out.print("\nEnter student name for save : ");
            n = input.nextLine();
            temp.setName(n);
            temp.setDoros(dars);


            System.out.print("\nDars digari baraye in daneshjo vared mikonid ? (y | n) : ");
            n = input.nextLine();

            if (n.equals("y") == true) {

                while (f2) {
                    System.out.print("\n\nname dars ra vard konid : ");
                    n = input.nextLine();
                    dars.name = n;
                    System.out.print("\nnomreh dars ra vared konid : ");
                    n = input.nextLine();
                    dars.nomreh = Float.parseFloat(n);

                    if (dars.nomreh >= 10) {
                        dars.ghaboli = true;
                    } else {
                        dars.ghaboli = false;
                    }


                    System.out.print("\nDars digari baraye in daneshjo vared mikonid ? (y | n) : ");
                    n = input.nextLine();


                    if (n.equals("y") == false) {
                        f2 = false;

                    }

                }

            }


            System.out.print("\nAfzodan Daneshjo digar ? y | n : ");
            n = input.nextLine();
            b.add(temp);
            if (n.equals("y") == false) {
                f = false;
            }

        }

    }
    static class Dars {

        public String name;
        public float nomreh;
        public boolean ghaboli;
    }

    static class Student {

        private String name;
        private ArrayList<Dars> Doros;

        public Student() {

            Doros = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public ArrayList<Dars> getDoros() {
            return Doros;
        }

        public void setDoros(Dars dars) {
            this.Doros.add(dars);
        }

    }
}
