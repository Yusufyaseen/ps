import java.util.LinkedList;

public class Zigzag {

    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4, 5},{6,7,8, 9, 10,11}};
        int row = arr.length, col = arr[0].length;
        int n = row + col - 1;
        LinkedList<Integer>[] ls = new LinkedList[n];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(ls[i+j] == null)
                    ls[i+j] = new LinkedList<>();
                ls[i+j].add(arr[i][j]);
            }

        }
        for (int i = 0; i < ls.length; i++) {
            System.out.println(ls[i]);
        }
    }
}

/*
1 2 3 4 5
6 7 8 9 10
 */