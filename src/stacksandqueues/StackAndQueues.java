package stacksandqueues;

import java.util.EmptyStackException;

public class StackAndQueues {

    public static class FixedMultiStack {
        private int numberOfStacks = 3;
        private int stackCapacity;
        private int[] values;
        private int[] sizes;

        public int[] getValues() {
            return values;
        }

        public FixedMultiStack(int stackSize) {
            stackCapacity = stackSize;
            values = new int[stackSize * numberOfStacks];
            sizes = new int[numberOfStacks];
        }

        public void push(int stackNum, int value) {
            if (isFull(stackNum)) {
                throw new ArrayIndexOutOfBoundsException("Stack is full!");
            }
            sizes[stackNum]++;
            values[indexOfTop(stackNum)] = value;
        }

        public int pop(int stackNum) {
            if (isEmpty(stackNum)) {
                throw new EmptyStackException();
            }
            int topIndex = indexOfTop(stackNum);
            int value = values[topIndex];
            values[topIndex] = 0;
            sizes[stackNum]--;
            return value;
        }

        public int peek(int stackNum) {
            if (isEmpty(stackNum)) {
                throw new EmptyStackException();
            }
            return values[indexOfTop(stackNum)];
        }

        private int indexOfTop(int stackNum) {
            int offSet = stackNum * stackCapacity;
            int size = sizes[stackNum];
            return offSet + size - 1;
        }

        private boolean isFull(int stackNum) {
            return sizes[stackNum] == stackCapacity;
        }

        private boolean isEmpty(int stackNum) {
            return sizes[stackNum] == 0;
        }

    }
}
