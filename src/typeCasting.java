import java.util.Scanner;

public class typeCasting {
    public static void main(String[] args) { //float is always Greater than int
        Scanner input = new Scanner(System.in);
////        float num  =  input.nextFloat();
//          int num  = input.nextInt();
//          System.out.println();

             //Type-Casting
        int num = (int)(84.52f);
        System.out.println(num);

        //automatic type promotion in Expressitions
        int a = 257;
        byte b = (byte) (a);//257 % 256 = 1

        byte a = 40;
        byte b = 50;
        byte c =100;
        int d = (a + b) / c;

        System.out.println(d);

//        byte b = 50;
//        b = b * 2;
    }
}
