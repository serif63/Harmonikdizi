import java.util.Arrays;
public class CiftTekrar {
    static boolean isFind(int[] arr, int valu) {
        for (int i : arr) {
            if(i==valu)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] list = {2, 4, 5, 6, 3, 2, 4, 6, 3, 2, 4};
        int[] duplicate=new int[list.length];
        int start=0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if(i != j && list[i]==list[j] &&  0==list[i]%2){
                    if(!isFind(duplicate,list[i])) {
                        duplicate[start++] = list[i];
                    }
                    break;
                }

            }
        }
        for(int valu:duplicate) {
            if (valu!=0)
                System.out.println(valu);
        }
    }
}