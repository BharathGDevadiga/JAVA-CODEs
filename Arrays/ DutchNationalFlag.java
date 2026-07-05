import java.util.Scanner;

public class  DutchNationalFlag{
    
    public static void sort(int[] arr){
        
        int low=0;
        int mid=0;
        int high=arr.length-1;
        
        while(mid<=high){
            
            switch(arr[mid]){
                    
                case 0:
                    int temp1=arr[low];
                    arr[low]=arr[mid];
                    arr[mid]=temp1;
                    low++;
                    mid++;
                    break;
                    
                case 1:
                    mid++;
                    break;
                    
                case 2:
                    int temp2=arr[mid];
                    arr[mid]=arr[high];
                    arr[high]=temp2;
                    high--;
                    break;
                    
            }   
        }
        
        for(int i=0; i<arr.length; i++){
            
            System.out.print(arr[i]+" ");
            
        }
    }
    
    public static void main(String[] args) {
        
            Scanner sc=new Scanner(System.in);
        
            int size= sc.nextInt();
            int[] arr=new int[size];
        
            for(int j=0; j<size; j++){
                
                arr[j]=sc.nextInt();
                
            }
        
            sort(arr);
    } 
}
