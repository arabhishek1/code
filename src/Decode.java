/**
 * Created by abhishek.ar on 18/01/17.
 */
//Total Decoding Messages
    //"123" => 3 no
//http://www.practice.geeksforgeeks.org/problem-page.php?pid=1234
public class Decode {
    public static int recDecode(char[] message, int n) {
        if (n==0 || n==1)
            return 1;
        int count =0;
        if (message[n-1] > '0')
            count = recDecode(message, n-1);
        if (message[n-2]  == '1' || (message[n-2] == '2' && message[n-1] < '7'))
            count +=  recDecode(message, n-2);
        return count;
    }

    public static int dpDecode(char[] message) {
        int result []= new int[message.length+1];
        result[0]=1;
        result[1] =1;
        for(int i=2; i <= message.length; ++i){
            result[i] =0;
           if (message[i-1] > '0')
               result[i] = result[i-1];
           if (message[i-2] == '1' || (message[i-2] == '2' && message[i-1] < '7'))
               result[i] += result[i-2];
        }
        return result[message.length];
    }

    public static void main(String[] args) {
        String str = "1010";
        System.out.println(recDecode(str.toCharArray(), str.length()));
        System.out.println(dpDecode(str.toCharArray()));
    }
}
