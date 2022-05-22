package src;

import java.util.*;

class MinHeightBst {
    public static BST constructMinHeightBst(List<Integer> array) {
        return minHeightBstRecursive(array, 0, array.size() - 1);
    }

    public static BST minHeightBstRecursive(List<Integer> array, int startIdx, int endIdx) {
        if (endIdx < startIdx)
            return null;
        int midIdx = (startIdx + endIdx) / 2;
        BST bst = new BST(array.get(midIdx));
        bst.left = minHeightBstRecursive(array, startIdx, midIdx - 1);
        bst.right = minHeightBstRecursive(array, midIdx + 1, endIdx);
        return bst;
    }

    public static void main(String[] args) {
        BST bstOutput;
        bstOutput = constructMinHeightBst(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11));
        System.out.println("Output " + bstOutput.value + " " + bstOutput.left.value + " " + bstOutput.right.value);
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }
}
