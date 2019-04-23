package linkedlists;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListsTest {

    @Test
    public void removeDupsRemovesTheDuplicates() {
        List list = Arrays.asList("1", "2", "3", "2", "1", "1");
        LinkedList rawLinkedList = new LinkedList(list);
        LinkedList removeDups = LinkedLists.removeDups(rawLinkedList);
        assertEquals(3, removeDups.size());
    }

}