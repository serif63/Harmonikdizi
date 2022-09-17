import java.util.Scanner;
import java.util.Arrays;
public class DiziElemanSırala {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Dizinin Uzunlığunu Giriniz:");
        int sayi= input.nextInt();
        int[] dizi=new int[sayi];
        for(int i=0;i< dizi.length;i++){
            System.out.print("Dizinin "+(i+1)+".elemanını giriniz:");
            dizi[i]=input.nextInt();
        }
        Arrays.sort(dizi);
        System.out.println(Arrays.toString(dizi));


    }
}
