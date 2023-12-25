

public class Duplicate {

    public static void main(String[] args){

        int[] arr= {11,12,13,14,11,14};
        int n = arr.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Duplicate Element found is :- " + arr[i]);
                }
            }
        }
    }
    
}
