import java.util.*;

public class Q9_RotateByK {

    // Brute Force Approach

    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {

    List<Integer> temp= new ArrayList<>(arr.subList(0,k)) ;
       
      for(int i=k;i<arr.size();i++){
         arr.set(i-k,arr.get(i));
      }
      int j=0;
     
      for(int i=arr.size()-k;i<arr.size();i++){
       
         arr.set(i,temp.get(j));
         j++;
      }
      
   return arr;
        
    }
    // Optimal Approach

    public static ArrayList<Integer> OptimalrotateArray(ArrayList<Integer> arr, int k) {

        Collections.reverse(arr.subList(0, k));
        Collections.reverse(arr.subList(k, arr.size()));
        Collections.reverse(arr);
      
   return arr;
        
    }
    
}
