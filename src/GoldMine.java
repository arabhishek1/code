/**
 * Created by abhishek.ar on 17/02/17.
 */
//.Given a gold mine of n*m dimensions. Each field in this mine contains an integer which is the amount of gold in tons.
// Initially the miner is in first column but can be at any row i. He can move only (right , right up , right down )
// that is from a given cell,the miner can move to the cell diagonally up towards the right or right or diagonally
// down towards the right. Find out maximum amount of gold he can collect.
public class GoldMine {
    public static int maxGoldCoins(int [][] arr, int pos){
        int sol[][] = new int[arr.length+1][arr[0].length+1];
        for(int i=0; i < arr.length;++i){
            for (int j=0; j < arr[i].length; ++j){
                sol[i][j] = Math.max(Math.max(arr[i][j+1], arr[i+1][j]), arr[i-1][j]);
            }
        }
        return  -1;
    }
}
