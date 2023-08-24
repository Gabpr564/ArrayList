import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import java.util.Scanner;

public class ArrayListCollections{
    
    public static void main(String[] args){
        String searchString ;
        ArrayList<String> namesList = new ArrayList<>(Arrays.asList("Gabriel", "Eliu", "Karina", "Amanda", "German", "Iris", "Rosita", "EliuSr"));
        String[] namesArray = new String[namesList.size()];
        

        // Original List
        for(String i : namesList){
            System.out.println(i);
        }

        // Space Maker
        System.out.println("\n");

        // Sorted List
        Collections.sort(namesList);
          for(String i : namesList){
            System.out.println(i);
        }

        // Space Maker
        System.out.println("\n");

        // Shuffled List
        Collections.shuffle(namesList);
          for(String i : namesList){
            System.out.println(i);
        }

        // Space Maker
        System.out.println("\n");

        // Search Index
        System.out.println("Enter Name:");
        Scanner search = new Scanner(System.in);
        searchString = search.nextLine();    
        if(namesList.contains(searchString)){
            System.out.println(namesList.indexOf(searchString));
        }        
        
        // Space Maker
        System.out.println("\n");

        // toArray method
        namesList.toArray(namesArray);

           for(String i : namesArray){
            System.out.println(i);
        }

        // Space Maker
        System.out.println("\n");

        //toList
        List<String> namesList2 = Arrays.asList(namesArray);
        for(String i : namesList2){
            System.out.println(i);
        }

        // Space Maker
        System.out.println("\n");

   
    }

/* Collection are used more to refer to a single group of objects. Collection,
 * on the other hand, are used more for their utility methods. Classes are where
 * the functions and the tools are put together as instructions for the computer 
 * to read. Interfaces are a little bit like the instructions for the classes, while 
 * also providing added functionality in the form of methods and functions.
 */



}