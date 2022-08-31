import java.util.Scanner;

public class HargaDiskon
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int harga, jumlah,jmlhrg,diskon,total;
        
        System.out.print("Harga barang = ");
        harga = input.nextInt();
        
        System.out.print("Jumlah barang = ");
        jumlah = input.nextInt();
               
        jmlhrg = harga*jumlah;
        diskon = jmlhrg*15/100;
        total = jmlhrg-diskon;
        
        System.out.println("Total harga(disc 15%) adalah  " +total);
 }
}