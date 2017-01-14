//Check if a number can be expressed as x^y
//http://www.practice.geeksforgeeks.org/problem-page.php?pid=1600
public class NumberAsXY {

    public static boolean number(int n){
        if (n ==1)
            return true;
        for(int x=2; x <= Math.sqrt(n); ++x){
            int p=x;
            while(p <=n){
                p *= x;
                if (p == n)
                    return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(number(48));
    }
}
