package CU_LMS;

import java.util.ArrayList;

public class array_list_intro {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(34);
        list.add(56);
        System.out.println(list);
        System.out.println(list.size());// will return the size of the list !

        // get Method ! :-
        System.out.println(list.get(2)); // will return the value stored at index 2 ;

        // printing using for loop :-
        for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i)+" "); // to return as discrete values !
        }
    }
}
