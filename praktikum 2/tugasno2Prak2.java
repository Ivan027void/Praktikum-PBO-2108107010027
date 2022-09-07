import java.util.Scanner;
/*program menentukan nilai huruf dari mahasiswa */
public class tugasno2Prak2
{
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        int marks;
        System.out.print("masukkan nilai: ");
        marks=input.nextInt();


        if(marks<41){
            System.out.println("E");
        }
        else if(marks>=41 && marks<51){
            System.out.println("D");
        }
        else if(marks>=51 && marks<60){
            System.out.println("C");
        }
        else if(marks>=60 && marks<69){
            System.out.println("BC");
        }
        else if(marks>=69 && marks<78){
            System.out.println("B"); 
        }else if(marks>=78 && marks<87){
            System.out.println("AB");
        }
        else if(marks>=87 && marks<=100){
            System.out.println("A");
        }else{
            System.out.println("Invalid!");
        }
    }
} 