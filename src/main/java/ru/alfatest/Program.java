package ru.alfatest;

public class Program {
    public static void main (String[] s) {
        System.out.println("test11");
        System.out.println("Test2");
        int l = 1;
        hello("Semen");
        hello("Ivan");
        System.out.println(are(3.0, 5.0));
        System.out.println(are (3));
        Program p = new Program();
        Program.Test te = new Program().new Test("a", "c");
        System.out.println(te.a);

    }

    public static void hello (String user) {
        System.out.printf("Hello %s!", user);
        System.out.println();
    }

    public static double are(double a, double b) {
        return a*b;
    }

    public static double are(double a) {
        return a*a;
    }

    public class Test {
        String a;
        String b;
        Test(String a, String b) {
            this.a = a;
            this.b = b;
        }
    }

}
