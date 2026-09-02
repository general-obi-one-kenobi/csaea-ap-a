public class CrashCourse {

    public static void main(String[] args) {

        // comments
        /* multi-line
        comments
        */

       System.out.println("hello world");

       //Variable declaration
       // PRIMITIVE VARIABLES
       int a; //integer
       double b; //decimal or float
       boolean c; //true or false

       a = 4;
       b = 5.5;
       c = false;

       // arithmetic operators
       // + - / * %
       // += -= /= %=

       int d = 3;
       d += 7;
       System.out.println("d is equal to " + d);

       // increment and decrement by 1:
       // ++  --
       d--;
       d++;
       d++;
       System.out.println("d is now equal to "+d);

       // COMPARISONS (always returns true or false)
       // < > <= >= == !=
       System.out.println(4 < 5);
       System.out.println(7 == 4);
       System.out.println(1 != 2);

       //LOGICAL OPERATORS
       // In order of precedence: NOT: ! AND: && OR: ||
       boolean e = false; boolean f = true;

       System.out.println(!e);
       System.out.println(e && f);
       System.out.println(e || f);
       System.out.println(e || f && !e);

       System.out.println(e && f); //short circuits after checking e - java does not need to check f



    }

}