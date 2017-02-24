package recursion;

/**
 * Created by abhishek.ar on 24/02/17.
 */
//Generate all binary strings without consecutive 1’s
//Given a integer K. Task is Print All binary string of size K (Given number).
//Input : K = 3
//        Output : 000 , 001 , 010 , 100 , 101
//
//        Input : K  = 4
//        Output :0000 0001 0010 0100 0101 1000 1001 1010
public class GenerateBinaryString {

    public static void generateBinaryString(char[] ch, int k, int n){
        if (n==k){
            System.out.print(String.valueOf(ch)+ " ");
            return;
        }
        if (ch[n-1] == '1'){
            ch[n] = '0';
            generateBinaryString(ch, k, n+1);
        }
        if (ch[n-1] == '0'){
            ch[n] = '0';
            generateBinaryString(ch, k, n+1);
            ch[n] = '1';
            generateBinaryString(ch, k , n+1);
        }
    }

    public static void helperGenerate(int k){
        if (k <=0)
            return;
        char ch[] = new char[k];
        ch[0] = '0';
        generateBinaryString(ch, k, 1);
        ch[0] = '1';
        generateBinaryString(ch, k, 1);
    }

    public static void main(String [] args){
        helperGenerate(4);
    }
}
