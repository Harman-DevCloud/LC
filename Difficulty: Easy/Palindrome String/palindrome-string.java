//{ Driver Code Starts
import java.io.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine(); // Use lowercase 's'

            Solution ob = new Solution();
            if (ob.isPalindrome(s)) // Check palindrome
                System.out.println("true");
            else
                System.out.println("false");
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    boolean strPalin(String s,int i,int n){
        if(i>=n/2){
            return true;
        }
        if(s.charAt(i) != s.charAt(n-i-1)){
            return false;
        }
        return strPalin(s,i+1,n);
    }
    boolean isPalindrome(String s) {
        // code here
        int n=s.length();
        boolean ans = strPalin(s,0,n);
        return ans;
    }
};