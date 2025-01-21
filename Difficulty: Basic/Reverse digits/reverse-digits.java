//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.reverseDigits(n);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int reverseDigits(int n) {
        // Code here
        int revNo = 0;
        int pre = 0;
        
        while(n!=0){
            pre = revNo;
            revNo = (revNo*10) + n%10;
            n /= 10;
            if(revNo/10 != pre){
                return 0;
            }
        }
        return revNo;
    }
}