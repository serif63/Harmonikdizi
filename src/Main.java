public class Main {
    public static void main(String[] args) {
        int[] sayi={1,2,3,4};
      double sum=0;

        for(int i=0;i<sayi.length;i++)
            sum+=1.0/sayi[i];
        System.out.println(sum/sayi.length);

    }
}
