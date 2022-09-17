import java.util.Arrays;
import java.util.Scanner;
public class Enyakinmaxmin {
    public static void main(String[] args) {
        int[] dizi={50,20,-1,-4,6,8,15,2};
        int i=0;
        Scanner input=new Scanner(System.in);
        System.out.println(Arrays.toString(dizi));
        Arrays.sort(dizi);
        System.out.println(Arrays.toString(dizi));
        System.out.println("Sayi Giriniz :");
        int ara=input.nextInt();


        while(ara>dizi[i]){
            i++;
            if(i>=dizi.length)
                break;
        }
        System.out.println(ara+" En yakın küçük sayı:"+dizi[i-1]);
        System.out.println(ara+" En yakın büyük sayı:"+dizi[i]);



    }


}
