#User function Template for python3
class Solution:
    def commonSum(self,n1,n2,arr1,arr2):
        #code here
        s1=set()
        s2=set()
        
        for i in arr1:
            s1.add(i)
            
        for i in arr2:
            s2.add(i)
            
        sum=0
        
        for i in s1:
            if i in s2:
                sum=sum+i
                
        return (sum%1000000007)
        
        

#{ 
 # Driver Code Starts

if __name__ == '__main__':
    for _ in range(int(input())):
        n1,n2 = map(int,input().split())
        arr1 = list(map(int,input().split()))
        arr2 = list(map(int,input().split()))
        obj = Solution()
        print(obj.commonSum(n1,n2,arr1,arr2))

        print("~")
# } Driver Code Ends