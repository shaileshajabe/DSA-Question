public class Solution {
    
    public static void swapAlternate(int arr[]) {
    	//Your code goes here
        // int temp[]=new int[100];
        int temp;
        
        int n  = arr.length;
        // for(int i=0;i<=n-1;i++){
            for(int j=0;j<n-1;j=j+2){
                temp=arr[j];
                arr[j]=arr[j+1]; 
                arr[j+1]=temp;
                
            // }
            
        }
        
        
        
    }
}