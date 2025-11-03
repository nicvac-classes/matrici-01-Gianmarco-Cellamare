
public class Esercizio {
    
    public static void esercizio1() {
        public static void main(String[] args) {
        int[][] miaMatrice = new int[3][5];  
        miaMatrice[0][3] = 7;
        miaMatrice[1][3] = 7;
        miaMatrice[2][3] = 7;
    }
    
    UtilsMatrice.visualizza(miaMatrice);
    }
    
    public static void esercizio2() {
        int [][] miaMatrice = new int[3][5];
        while(j<=4){
            miaMatrice[1][j] = 7;
            ++j;
        }

    }
    
    public static void esercizio3() {
        int [][] miaMatrice = new int[3][5];
        while(i<=2){
            miaMatrice[i][3] = 7;
            ++i;
        }
        
    }
    
    public static void main(String[] args) {

        System.out.println();
        System.out.println("ESERCIZIO 1: ");
        System.out.println("----- ----- -----");
        esercizio1();
        
        System.out.println();
        System.out.println("ESERCIZIO 2: ");
        System.out.println("----- ----- -----");
        esercizio2();
        
        System.out.println();
        System.out.println("ESERCIZIO 3: ");
        System.out.println("----- ----- -----");
        esercizio3();
    }
}