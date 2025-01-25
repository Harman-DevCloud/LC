//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long N = sc.nextLong();

            Solution ob = new Solution();
            ArrayList<Long> ans = ob.factorialNumbers(N);
            for (long num : ans) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    static long fact(int i) {
        if (i == 0 || i == 1) { // Base case for 0! and 1!
            return 1;
        }
        return i * fact(i - 1); // Recursive calculation
    }

    static ArrayList<Long> factorialNumbers(long n) {
        ArrayList<Long> list = new ArrayList<>();
        
        for (int i = 1; ; i++) {
            long ans = fact(i);
            if (ans <= n) {
                list.add(ans); // Add factorial to the list if it is <= n
            } else {
                break; // Stop once factorial exceeds n
            }
        }
        return list;
    }
}