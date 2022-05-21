import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        int n1, n2, select;

        Scanner input = new Scanner(System.in);
        System.out.print(" Please enter first value : ");
        n1 = input.nextInt();
        System.out.print(" Please enter second value : ");
        n2 = input.nextInt();

        System.out.println("1-Addition\n2-Extraction\n3-Multiplication\n4-Divide");
        System.out.print("Your choice : ");
        select = input.nextInt();
        System.out.println(select);

        //------------- We can use if condition like below------------

        //if (select == 1) {
        //System.out.println(" Addition :" + (n1 + n2));
        //}else if (select == 2) {
        //System.out.println(" Total : " + (n1 - n2));
        //}else if (select == 3) {
        //System.out.println(" Total : " + (n1 * n2));
        //}else if (select == 4) {
        //if (n2 != 0); {
        //System.out.println(" Total : " + (n1 / n2));
        //{else}
        //System.out.println("You can not divide zero");


        //------------We will arrange with swift case---------------

        switch (select){
            case 1:
                System.out.println("Addition :" + (n1 + n2) );
                break;
            case 2:
                System.out.println("Extraction :" + (n1 - n2) );
                break;
            case 3:
                System.out.println("Multiplication :" + (n1 * n2) );
                break;
            case 4:
                System.out.println("Divide :" + (n1 / n2) );
                break;
            default:
                System.out.println("You entered false value , please try again");

        }
    }
}