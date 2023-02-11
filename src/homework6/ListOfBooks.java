package homework6;

import java.util.ArrayList;
import java.util.HashMap;

public class ListOfBooks {

    public static HashMap<Integer, String> catalogue(ArrayList<String> list) {
        HashMap<Integer, String> bookShelf = new HashMap<>();
        for (String i : list) {
            list.indexOf(i);
            bookShelf.put(list.indexOf(i), i);
        }
        return bookShelf;
    }

    public static void main(String[] args) {
        ArrayList<String> listOfBooks = new ArrayList<>();
        listOfBooks.add("Lord of the rings");
        listOfBooks.add("Hobbit");
        listOfBooks.add("Shadow and bones");
        listOfBooks.add("Conan-barbarian");
        listOfBooks.add("Dune");
        System.out.println(catalogue(listOfBooks).get(3));
    }
}
