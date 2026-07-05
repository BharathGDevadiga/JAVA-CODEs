import java.util.*;

public class FindDuplicatesUsingHashMap{
    
    public static void findDuplicates(int[] arr){
        
        HashMap<Integer,Integer>map=new HashMap<>();
        for (int ele:arr){
            
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            
            if(entry.getValue()>1)
            {
                
                System.out.println(entry.getKey()+" ");
            }
        }
    }
    
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []arr=new int[size];
        for(int i=0;i<size;i++)
            arr[i]=sc.nextInt();
        findDuplicates(arr);
        
    }
}
