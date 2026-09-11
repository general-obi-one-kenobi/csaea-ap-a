import java.util.ArrayList;

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

       //CASTING (converting)
       int g = (int)5.5;
       System.out.println(g);
       double h = (double)5/6;
       System.out.println(h);

       //STRINGS
       String s1 = "Goodnight";
       String s2 = " and ";
       String s3 = "goodbye";
       String result = s1 + s2 + s3;
       result += ", friend";
       System.out.println(result + "\n");

       //
       int[] arry1 = new int[10];
       System.out.println("length:" + arry1.length);

       arry1[0] = 11;
       arry1[1] = 2;

       System.out.println("remainder" + arry1[0] % arry1[1]);

       int[] arry2 = {34, 52, 3, 64, 32};
       System.out.println(arry2);

       // 2D ARRAYS (grid or a table)

       int [][] arryGrid1 = new int[4][3]; //[rows][columns]
       // 0 0 0
       // 0 0 0
       // 0 0 0
       // 0 0 0

       System.out.println("rows: " + arryGrid1.length);
       System.out.println("columns: " + arryGrid1[0].length);

       int [][] arryGrid2 = { {7,8,9}, {4,5,6}, {1,2,3} };

       System.out.println(arryGrid2[0][1]);
       System.out.println(arryGrid2[2][2]);

       //ARRAYLISTS
       //can be any size and there are a lot of functions to work with
       //avoid primitive data types, special classes for integer, double, etc.
       ArrayList<String> arryList = new ArrayList<>();

       arryList.add("Word 1");
       arryList.add("Word 2");
       arryList.add("Word 3");
       arryList.remove(0);
       arryList.add(0, "Word 4");
       arryList.set(2,"Word 5");

       System.out.println(arryList);
       System.out.println(arryList.size());
       System.out.println(arryList.get(2));

       // Math class
       Math.max(5,9);
       Math.min(7,3);
       Math.sqrt(14);
       Math.abs(-67);

       // CONDITIONALS

       // if  else if  else

        boolean tru = true;
        boolean fal = false;

        if(fal) {
            System.out.println("Reached first condition");
        } else if(fal) {
            System.out.println("Reached second condition");
        }
        else {
            System.out.println("Reached else");
        }
        // ITERATION

        //while loop

        int x = 5;

        while(x < 10) {
            System.out.println(x + " ");
            x++;
        }

        // for loop
        //initialize variable for an index; conditional; increment; decrement
        for(int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        //enhanced for loop (only for reading values)
        ArrayList<String> animals = new ArrayList<>();
        animals.add("sheep");
        animals.add("deer");
        animals.add("moose");
        System.out.println("ArrayList: " + animals);

        for(String s: animals) {
            System.out.println("We saw " + s);
        }

        double[] arry = {1.1, 2.2, 3.3, 4.4, 5.5};
        System.out.println("Memory address: " + arry);

        for(int i = 0; i < arry.length; i++) {
            System.out.println(arry[i]);
        }

        int[][] arryMatrix = { {0, 32, 12}, {7, 33, 22}, {6, 77, 100} };
        System.out.println(arryMatrix);

        for(int row = 0; row < arryMatrix.length; row++) {
            for(int col = 0; col < arryMatrix[row].length; col++) {
                System.out.print(arryMatrix[row][col] + " ");
            }
            System.out.println();
        }



    }

}