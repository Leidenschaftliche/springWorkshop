// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        if(args.length!=4)
        {
            System.out.print("Give 4 arguments as follows:\n");
            System.out.print("Birth-year, this-year, gender, name.\n");
            return;
        }

        final int birthYear=Integer.parseInt(args[0]);
        final int thisYear=Integer.parseInt(args[1]);
        final char gender=(args[2]).toCharArray()[0];
        final String name = args[3];

        System.out.printf("%-25s\n","Hello and welcome "+name+"!");
        System.out.printf("%-25s\n","Your Information are below");
        System.out.printf("You are %d years old\n",thisYear-birthYear);
        if(gender=='M')
            System.out.printf("You are a %-5s.\n","male");
        else if(gender=='F')
            System.out.printf("You are an %-7s.\n","female");
    }
}