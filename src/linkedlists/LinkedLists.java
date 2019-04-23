package linkedlists;

import java.util.LinkedList;

public class LinkedLists {

    public static LinkedList removeDups(LinkedList givenLinkedList) {
        LinkedList resultLinkedList = new LinkedList();

        for (Object item : givenLinkedList) if (!resultLinkedList.contains(item)) resultLinkedList.add(item);
        return resultLinkedList;

    }

    public static LinkedList returnKthToLast(LinkedList givenLinkedList, int givenIndex) {
        LinkedList resultLinkedList = new LinkedList();

        for (int i = givenIndex; i < givenLinkedList.size(); i++) resultLinkedList.add(givenLinkedList.get(i));
        return resultLinkedList;
    }
}
