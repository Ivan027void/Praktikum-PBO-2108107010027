import java.util.Scanner;
/*operator aritmatika dari inputan 2 integer */
public class angka1{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int num1,num2;
        int hasil;

        System.out.print("masukkan nilai num1: ");
        num1 = input.nextInt();

        System.out.print("masukkan nilai num2: ");
        num2 = input.nextInt();
        
    /* num1 + num2 = 5;
        num1 – num2 = 1;
        num1 * num2 = 6;
        num1 / num2 = 1,5;
        num1 % num2 = 1;*/

        hasil=num1 + num2;
        System.out.println("num1 + num2= " + hasil);

        hasil=num1 - num2;
        System.out.println("num1 - num2= " + hasil);
        hasil=num1 * num2;
        System.out.println("num1 * num2= " + hasil);
        double hasil1;
        hasil1= (float)num1 / num2;
        System.out.println("num1 / num2= " + hasil1);
        hasil=num1 % num2;
        System.out.println("num1 % num2= " + hasil);


    }
}