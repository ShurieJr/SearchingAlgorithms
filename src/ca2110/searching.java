package ca2110;
public class searching<T> {
    public static void main(String[] args) {

        Integer[] numbers = {10 , 20 , 90 , 100 , 120}; //Asc
        Integer[] numbers2 = {120 , 100 , 90 , 20 , 10}; //Decs
//     boolean result=searching.<Integer>linearSearch(numbers , 0,numbers.length-1 ,
//             80   );

     boolean result = searching.binarySearchDesc(numbers2,0, numbers2.length-1,10 );

     if(result)
         System.out.println("item found");
     else
         System.out.println("item not found");
    }

    //linear search
    public static <T extends Comparable<T>> boolean linearSearch(T[] data ,
                                           int min, int max , T target){
        boolean found = false;
        int index = min;
        while (!found && index <= max){
            System.out.println(data[index]);
            found = data[index].equals(target);

            if(data[index].compareTo(target) > 0)
                break;
            index++;
        }
        return found;
    }

    public static <T extends Comparable<T>> boolean binarySearch(T[] data , int min,int max , T target){
        boolean found = false;
        int low = min;
        int high = max;
        while(!found && low <= high){
            int mid = (low + high) /2;
            if(target.compareTo(data[mid]) == 0)
                found = true;
            else if (target.compareTo(data[mid]) > 0)
                low  = mid + 1;
            else
                high = mid - 1;
        }
        return found;
    }

    public static <T extends Comparable<T>> boolean binarySearchDesc(T[] data , int min,int max , T target){
        boolean found = false;
        int low = min;
        int high = max;
        while(!found && low <= high){
            int mid = (low + high) /2;
            if(target.compareTo(data[mid]) == 0)
                found = true;
            else if (target.compareTo(data[mid]) > 0)
                high = mid - 1;
            else
                low  = mid + 1;
        }
        return found;
    }
}
