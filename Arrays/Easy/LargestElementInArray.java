public class LargestElementInArray{
    public static int LargestNum(int [] nums){
        int max = nums[0];



       for(int num : nums){
           if(num>max){
               max = num;
           }
       }



        return max;
    }


    public static void main(String[] args) {
          int arr[]  = {12,11,145,5,78,32,-90,11};

          System.out.println(LargestNum(arr));
    }



}