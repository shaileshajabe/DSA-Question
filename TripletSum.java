public class TripletSum {
    
public class Solution {
    
    public static int findTriplet(int[] arr, int x) {
    	//Your code goes here
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int g=j+1;g<arr.length;g++){
                       if(arr[i]+arr[j]+arr[g]==x){
                           sum++;
                       }
                }
            }
        }
        return sum;
    }

}
}
