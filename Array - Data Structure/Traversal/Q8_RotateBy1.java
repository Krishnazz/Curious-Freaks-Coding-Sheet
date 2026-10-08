class Q8_RotateBy1 {
    public void rotate(int[] arr) {
       for(int i=arr.length-1;i>0;i--){
           int temp=arr[i];
           arr[i]=arr[i-1];
           arr[i-1]=temp;
       }

   /*  Another way to do it is to store the last element in a variable and
     then shift all elements to the right and finally assign the stored value to the first index. 
   
      int tenp = arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
       arr[0]=tenp;
        } */
    }
}