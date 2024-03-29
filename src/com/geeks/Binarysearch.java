package com.geeks;

// Java program to demonstrate working of Collections.
// binarySearch() in a list of user defined objects
import java.util.*;

class Binarysearch {
    public static void main(String[] args)
    {
        // Create a list
        List<Domain> l = new ArrayList<Domain>();
        l.add(new Domain(10, "quiz.geeksforgeeks.org"));
        l.add(new Domain(20, "practice.geeksforgeeks.org"));
        l.add(new Domain(30, "code.geeksforgeeks.org"));
        l.add(new Domain(40, "www.geeksforgeeks.org"));

        Comparator<Domain> c = new Comparator<Domain>() {
            public int compare(Domain u1, Domain u2)
            {
                return u1.getId().compareTo(u2.getId());
            }
        };

        // Searching a domain with key value 10. To search
        // we create an object of domain with key 10.
        int index = Collections.binarySearch(
                l, new Domain(10, null), c);
        System.out.println("Found at index " + index);

        // Searching an item with key 5
        index = Collections.binarySearch(
                l, new Domain(5, null), c);
        System.out.println(index);
    }
}

// A user-defined class to store domains with url and id
class Domain {
    private int id;
    private String url;

    // Constructor
    public Domain(int id, String url)
    {
        this.id = id;
        this.url = url;
    }

    public Integer getId() { return Integer.valueOf(id); }
}
