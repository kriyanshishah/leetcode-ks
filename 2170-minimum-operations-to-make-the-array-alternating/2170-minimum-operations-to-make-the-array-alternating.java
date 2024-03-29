class Solution {
    public int minimumOperations(int[] nums) {
 int maxOdd = 0,maxEven=0,max=0;
        int n= nums.length;
        for(int i=0;i<n;i++)max= Math.max(max,nums[i]);
        int even[]=new int[max+1];
        int odd[]=new int[max+1];
        for(int i=0;i<n;i++){
            if(i%2==0)even[nums[i]]++;
            else odd[nums[i]]++;
        }
        int t1=0,t2=0;
        for(int i=0;i<max+1;i++){
            if(even[i]>maxEven){
                maxEven=even[i];t1=i;
            }
            if(odd[i]>maxOdd){
                maxOdd=odd[i];t2=i;
            }
        }
        int ans=0;
        if(t1==t2){
            int secondEven=0,secondOdd=0;
            for(int i=0;i<max+1;i++){
                if(i!=t1 && even[i]>secondEven)secondEven=even[i];
                if(i!=t2 && odd[i]>secondOdd)secondOdd=odd[i];
            }
            ans = Math.min((n/2+n%2-maxEven)+ (n/2-secondOdd),(n/2+n%2-secondEven)+(n/2-maxOdd));
        }
        else{
            ans = ((n/2+n%2)-maxEven)+ ((n/2)-maxOdd);  
        } 
        return ans;
    }
}