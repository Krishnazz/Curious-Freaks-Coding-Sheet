import java.util.Arrays;
class Q4_MissingNum {
    static int missingNum(int arr[]) {
        Arrays.sort(arr);
        for(int i=1;i<=arr.length;i++){
            if(arr[i-1]!=i)
                return i;
        }
         return arr[arr.length-1]+1;
    }
}