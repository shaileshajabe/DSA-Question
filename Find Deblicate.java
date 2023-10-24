public class Solution{  
    
    public static int duplicateNumber(int arr[]) {
    	//Your code goes here
        //int flag =0;
        int r=0;
                for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i!=j){
                    if(arr[i]==arr[j]){
                        r=arr[j];
                       // System.out.println(arr[j]);
                        flag++;
                        break;
                    }
                }
            }
            // if(flag!=0){
            //     r=arr[i];
            // }
        }
        return r;
}

}