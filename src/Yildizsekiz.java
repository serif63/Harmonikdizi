public class Yildizsekiz {
    public static void main(String[] args) {
        String[][] yaz = new String[7][4];
        for (int i = 0; i < yaz.length; i++) {
            for (int j = 0; j<yaz[i].length; j++) {
                if (i == 0 || i == 3 || i == 6) {
                    yaz[i][j] = " * ";
                } else if (j == 0 || j == 3) {
                    yaz[i][j] = " * ";
                } else {
                    yaz[i][j] = "   ";
                }


            }
        }
        for (String[] row : yaz) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
