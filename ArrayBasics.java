import java.util.Arrays;

public class ArrayBasics {
    public static void main(String[] args) {
        System.out.println("ARRAYS**************************");
    String[] colors = new String[5];
    colors[0] = "purple";
    colors[1] = "blue";
        System.out.println(Arrays.toString(colors));
            //Arrays.toString(colors) prints the entire array

        System.out.println(colors[0]);
            //prints the first element of colors

        int[] numbers = {100, 200};
            /*Shorter way of defining an array if you know all the elements.
            * Downside is you can't change the size to be more than the known number
            * of elements*/

        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }//a way of looping through the array. This loop prints the value at each index

        System.out.println("2D ARRAYS**************************");
        char[][] board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }  //loops through the columns and rows of the array and places a dash in each place

        System.out.println(Arrays.deepToString(board));
        System.out.println("[" + board[0][0] +"]" + "[" + board[0][1] + "]" + "[" + board[0][2] + "]");
        System.out.println("[" + board[1][0] +"]" + "[" + board[1][1] + "]" + "[" + board[1][2] + "]");
        System.out.println("[" + board[2][0] +"]" + "[" + board[2][1] + "]" + "[" + board[2][2] + "]");
    }
}
