package stacksandqueues;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

class StackAndQueuesTest {

    private StackAndQueues.FixedMultiStack fixedMultiStack;

    @BeforeEach
    public void setUp() {
        fixedMultiStack = new StackAndQueues.FixedMultiStack(3);
        fixedMultiStack.push(1, 2);
        fixedMultiStack.push(2, 3);


    }

    @Test
    public void fixedMultiStackPushSample() {
        fixedMultiStack.push(0, 1);
        int[] actualValues = fixedMultiStack.getValues();
        int[] expectedArr = {1, 0, 0, 2, 0, 0, 3, 0, 0};
        assertArrayEquals(expectedArr, actualValues);
    }

    @Test
    public void fixedMultiStackPushToFullStack() {
        fixedMultiStack.push(1, 3);
        fixedMultiStack.push(1, 4);
        Exception exception = assertThrows(ArrayIndexOutOfBoundsException.class, () -> fixedMultiStack.push(1, 5));
        assertTrue(exception.getMessage().contains("Stack is full!"));
    }

    @Test
    public void fixedMultiStackPopSample() {
        int poppedItem = fixedMultiStack.pop(2);
        assertEquals(3, poppedItem);
        assertThrows(EmptyStackException.class, () -> fixedMultiStack.pop(2));
    }

    @Test
    public void fixedMultiStackPopEmptyStack() {
        assertThrows(EmptyStackException.class, () -> fixedMultiStack.pop(0));
    }

    @Test
    public void fixedMultipleStackPeekSample() {
        int peekedItem = fixedMultiStack.peek(2);
        assertEquals(3, peekedItem);
        assertEquals(3, peekedItem);
    }

    @Test
    public void fixedMultipleStackPeekEmptyStack() {
        assertThrows(EmptyStackException.class, () -> fixedMultiStack.peek(0));
    }


}