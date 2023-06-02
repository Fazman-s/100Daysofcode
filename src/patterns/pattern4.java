package patterns;

public class pattern4 {
    public static void main(String[] args) {

        Pattern2(5);
    }
    static void Pattern2(int n){
        for(int row=1;row<=n;row++){
            //for every row run the col
            for (int col = 1; col <= row; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }

    }
}

/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
 */