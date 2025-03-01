//{ Driver Code Starts
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Number of test cases

        Solution ob = new Solution();

        while (T-- > 0) {
            int n = sc.nextInt();
            boolean ans = ob.isPalindrome(n);
            System.out.println(ans ? "true" : "false");
            System.out.println("~");
        }

        sc.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public boolean isPalindrome(int n) {
        // Code here
        int rev = 0;
        int pre = 0;
        int temp = n;
        while(temp!=0){
            pre = rev;
            rev = (rev*10)+temp%10;
            temp /= 10;
            if(rev/10 != pre){
                return false;
            }
        }
        if(n == rev){
            return true;
        } else{
            return false;
        }
    }
}