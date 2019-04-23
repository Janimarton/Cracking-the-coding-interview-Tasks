package linkedlists;

import java.util.LinkedList;

public class LinkedLists {

    public static LinkedList removeDups(LinkedList givenLinkedList) {
        LinkedList resultLinkedList = new LinkedList();

        for (Object item : givenLinkedList) if (!resultLinkedList.contains(item)) resultLinkedList.add(item);
        return resultLinkedList;

    }

}
