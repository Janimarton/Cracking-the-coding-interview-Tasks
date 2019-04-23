package linkedlists;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListsTest {

    private List list;
    private LinkedList rawLinkedList;

    @BeforeEach
    public void setUp() {
        list = Arrays.asList("1", "2", "3", "2", "1", "1");
        rawLinkedList = new LinkedList(list);
    }

    @Test
    public void removeDupsRemovesTheDuplicates() {
        LinkedList removeDups = LinkedLists.removeDups(rawLinkedList);
        assertEquals(3, removeDups.size());
    }

    @Test
    public void returnKthToLastWorkingWell() {
        LinkedList returnedKthToLast = LinkedLists.returnKthToLast(rawLinkedList, 3);
        LinkedList expectedResult = new LinkedList(Arrays.asList("2", "1", "1"));
        assertEquals(expectedResult, returnedKthToLast);
    }

}