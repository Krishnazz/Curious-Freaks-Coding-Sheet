    import java.util.Arrays;
    import java.util.HashMap;

    class Q1_MaxMin {
    public HashMap<String, Integer> getMinMax(int[] arr) {
        // Code Here
        Arrays.sort(arr);
        HashMap<String, Integer> minMax = new HashMap<>();
        minMax.put("min", arr[0]);
        minMax.put("max", arr[arr.length - 1]);
        return minMax;
    }
}

/*Java users need to return result in Pair class
For Example -> return new Pair(minimum,maximum)
*/
/*
class Solution {
    public Pair<Integer, Integer> getMinMax(int[] arr) {
        // Code Here
        Arrays.sort(arr);
        return new Pair(arr[0],arr[arr.length-1]);
    }
}
*/