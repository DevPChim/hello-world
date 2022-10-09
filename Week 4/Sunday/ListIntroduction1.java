import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class ListIntroduction1 {
    public static void main(String[] args) {

        //Create an empty list which will contain names (strings)

        List<String> names = new ArrayList<>();

        //Print out the number of elements in the list

        int size = names.size();

        System.out.println(size);

        //Add "William" to the list

        names.add("William");

        //Print out whether the list is empty or not

        boolean ans = names.isEmpty();


            System.out.println(ans);

        //Add "John" to the list
        //Add "Amanda" to the list

        names.add("John");

        names.add("Amanda");

        //Print out the number of elements in the list

        size = names.size();

        System.out.println(size);

       // Print out the 3rd element

        System.out.println(names.get(2));

        //Iterate through the list and print out each name

        for(String i : names) {
            System.out.println(i);
        }

        //Iterate through the list and print

        int index = 1;

        Iterator<String> it = names.iterator();

        while (it.hasNext()) {


            System.out.println(index++ +": "+ it.next());
        }

        //Remove the 2nd element

        names.remove(1);

        //Iterate through the list in a reversed order and print out each name

        Iterator li = names.listIterator(names.size());

        // Iterate in reverse.
        while(((ListIterator<?>) li).hasPrevious()) {
            System.out.println(((ListIterator<?>) li).previous());
        }

        names.clear();

        size = names.size();

        System.out.println(size);

    }
}