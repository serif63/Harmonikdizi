import java.util.Arrays;
public class DizidekiTekrarlar {
    public static void main(String[] args) {
        int[] dizi = {10, 20, 10, 30, 30, 20, 10, 30,50,50};
        for (int yaz : dizi) {
            System.out.print(yaz + ",");
        }
        System.out.println();
        Arrays.sort(dizi);
        int i = 0;
        int count = 0;
        for (int j = i + 1; j < dizi.length; j++) {
            count++;

                if (dizi[i] != dizi[j]) {
                    System.out.println(dizi[i] + " den " + count + " tane var");
                    i = j;
                    count = 0;
                }

            }
        if(dizi[dizi.length-2]!=dizi[dizi.length-1]){
            System.out.println(dizi[dizi.length - 1] + " den " + 1 + " tane var");
        } else {
            System.out.println(dizi[dizi.length - 1] + " den " + (++count)+ " tane var");
        }
    }
}



