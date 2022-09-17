import java.util.Arrays;

public class MatrisTranspoz {
    public static void main(String[] args) {
        int[][] dizi={{2,3,5,11},{36,45,5,46}};
        System.out.println("Matris :");
           for (int i=0;i< dizi.length;i++){
               System.out.println();
               for (int j=0;j<dizi[0].length;j++){
                   System.out.print(dizi[i][j]+"\t");
               }
           }
        System.out.println("\nTranspozu :");
        int k=dizi[0].length;
        for (int i=0;i< k;i++) {
            System.out.println();
            for (int j = 0; j < dizi.length; j++) {
                System.out.print(dizi[j][i]+" ");

            }
        }

    }
}
