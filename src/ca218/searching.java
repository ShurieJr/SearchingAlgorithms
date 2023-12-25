package ca218;

public class searching<T> {
    public static void main(String[] args) {
        Integer[] list = {12  , 90 ,300 , 500 , 600};
      boolean result=  searching.<Integer>linearSearch(list,0,
                list.length-1, 80);

       if(result)
           System.out.println("item found");
       else
           System.out.println("item not found");
    }
    public static <T extends Comparable<T>> boolean linearSearch(T[] data , int min,
                                           int max , T target){
        boolean found = false;
        int index = min;
        while (!found && index<=max){
            System.out.println(data[index]);
           found = target.equals(data[index]);

           if(target.compareTo(data[index]) < 0)
               break;

           index++;
        }
        return found;
    }

    //binary search
    public static <T extends Comparable<T>> boolean binarySearch(T[] data , int min,
                                           int max , T target){
        boolean found =false;
        int low= min;
        int high = max;
        while (!found && low <= high){
            int mid = (low + high) /2;
            if(data[mid].compareTo(target) == 0)
                found = true;
            else if(target.compareTo(data[mid]) > 0)
                low = mid + 1;
            else
                high = mid -1;
        }

        return found;
    }
}
