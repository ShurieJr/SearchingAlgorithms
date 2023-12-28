package ca214;

public class Searching<T> {
    public static void main(String[] args) {
        Integer []list  = {2 ,10 ,23, 69,100};
      boolean result =  Searching.<Integer>linearSearch(list , 0 ,
              list.length-1,10 );
      //display output
        if(result)
            System.out.println("item found");
        else
            System.out.println("item not found");
    }

    //Linear search
    static <T extends Comparable<T>> boolean linearSearch(T[] data , int min,int max, T target){
        boolean found = false;
        int index = min;
        while(!found && index <= max){
            System.out.println(data[index]);
            found = target.equals(data[index]);

            if(target.compareTo(data[index]) < 0)
                break;

            index++;
        }
        return found;
    }

    //Binary search
    static <T extends Comparable<T>> boolean binarySearch(T[] data, int min, int max , T target){

        boolean found = false;
        int low = min;
        int high = max;
        while(!found && low <= high ){
            int mid = (low + high) / 2;
            if(target.compareTo(data[mid]) == 0)
                found = true;
            else if(target.compareTo(data[mid]) > 0)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return found;
    }
}
