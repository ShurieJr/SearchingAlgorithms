package ca2110;

public class searching<T> {
    public static void main(String[] args) {
        Integer[] numbers = {10 , 20 , 90 , 100 , 120};
     boolean result=searching.<Integer>linearSearch(numbers , 0,numbers.length-1 ,
             80   );

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
}
