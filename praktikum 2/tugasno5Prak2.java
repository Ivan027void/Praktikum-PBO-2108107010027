/*program menampilkan bilangan genap dan bukan kelipatan 6 */
public class tugasno5Prak2 
{
  public static void main(String args[]){
    System.out.println("Deret Bilangan Genap");
        for(int i=1;i<=20;i++){
            if (i%2==0 && i%6!=0)
            System.out.print(i+" ");
       }
  }
}
