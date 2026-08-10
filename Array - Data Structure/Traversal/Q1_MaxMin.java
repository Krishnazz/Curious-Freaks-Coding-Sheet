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