package linkedlists;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListsTest {

    private List evenList;
    private List oddList;
    private LinkedList rawEvenLinkedList;
    private LinkedList rawOddLinkedList;

    @BeforeEach
    public void setUp() {
        evenList = Arrays.asList("1", "2", "3", "2", "1", "1");
        oddList = Arrays.asList("9", "8", "7", "5", "75", "84", "90");
        rawEvenLinkedList = new LinkedList(evenList);
        rawOddLinkedList = new LinkedList(oddList);
    }

    @Test
    public void removeDupsRemovesTheDuplicates() {
        LinkedList removeDups = LinkedLists.removeDups(rawEvenLinkedList);
        assertEquals(3, removeDups.size());
    }

    @Test
    public void returnKthToLastWorkingWell() {
        LinkedList returnedKthToLast = LinkedLists.returnKthToLast(rawEvenLinkedList, 3);
        LinkedList expectedResult = new LinkedList(Arrays.asList("2", "1", "1"));
        assertEquals(expectedResult, returnedKthToLast);
    }

    @Test
    public void deleteMiddleNodeDeletesMiddleNode() {
        LinkedLists.deleteMiddleNode(rawOddLinkedList);
        LinkedList expectedResult = new LinkedList(Arrays.asList("9", "8", "7", "75", "84", "90"));
        assertEquals(expectedResult, rawOddLinkedList);
    }

    @Test
    public void deleteMiddleNodeDeletesTwoMiddleNode() {
        LinkedLists.deleteMiddleNode(rawEvenLinkedList);
        LinkedList expectedResult = new LinkedList(Arrays.asList("1", "2", "1", "1"));
        assertEquals(expectedResult, rawEvenLinkedList);
    }

}