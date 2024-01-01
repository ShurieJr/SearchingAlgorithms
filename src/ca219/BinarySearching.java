package ca219;

public class BinarySearching <T>{
    public static void main(String[] args) {
        Integer[] numbers = {100 , 200 , 300 ,400};
        boolean result = BinarySearching.<Integer> binarysearch(numbers , 0 ,
                numbers.length-1,300 );
    if(result == true)
        System.out.printf("item found");
    else
        System.out.printf("item not found");
    }

    //binary search
    public static <T extends Comparable<T>> boolean binarysearch(T[] data , int min , int max , T target){
        boolean found = false   ;
        int low = min;
        int high = max;

        while(!found && low <= high){
            int mid = (low + high) /2;
            if(target.compareTo(data[mid]) == 0)
                found = true;
            else if(target.compareTo(data[mid]) > 0)
                low  = mid+1;
            else
                high = mid - 1;
        }
        return found;
    }
}
