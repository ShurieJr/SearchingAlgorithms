package ca219;

public class LinearSearching <T>  {
    public static <T extends Comparable> boolean linearSearch(T[] data , int minIndex,
                                           int maxIndex , T target){
        int index = minIndex;  //0
        boolean found = false;
        while ( !found && index <= maxIndex){
//            System.out.println(data[index]);
            found  = data[index].equals(target);
//            if(target.compareTo(data[index]) == 0)
//                found = true;
//            else
//                found =  false;
//            if(target.compareTo(data[index]) < 0)
//                index = maxIndex;
            index++;
        }

        return found;
    }
}
