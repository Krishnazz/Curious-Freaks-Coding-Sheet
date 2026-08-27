
import java.util.ArrayList;

public class Q5_RepeatNum {
    ArrayList<Integer> findTwoElement(int arr[]) {
        int[] count=new int[arr.length+1];
        int repeat=-1;
        int missing=-1;
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        for(int i=1;i<=arr.length;i++){
            if(count[i]==0){
                missing=i;
            }
            if(count[i]==2){
                repeat=i;
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        result.add(repeat);
        result.add(missing);
       return result;
    }
}
