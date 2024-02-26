package patterns;

public class pattern18 {
    public static void main(String[] args) {

        Pattern2(5);
    }
    static void Pattern2(int n){
        for(int row=1;row<=n;row++){
            //for every row run the col
            for (int col = 1; col <= row; col++){
                System.out.print(row+" ");
            }
            System.out.println();
        }

    }
}

/*
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
 */
