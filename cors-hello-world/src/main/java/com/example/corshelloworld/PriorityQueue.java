package com.example.corshelloworld;

public class PriorityQueue {

    private int[] heap = new int[100_005];
    private int size = 0;

    public void push(int x) {
        heap[++size] = x;
        int idx = size;

        while (idx != 1) {
            int parent = idx / 2;
            if (heap[parent] <= heap[idx]) {
                break;
            }

            int tmp = heap[parent];
            heap[parent] = heap[idx];
            heap[idx] = tmp;
            idx = parent;
        }
    }

    public int top() {
        return heap[1];
    }

    public void pop() {
        heap[1] = heap[size--];
        int idxPtr = 1;

        while (idxPtr * 2 <= size) {
            int leftChild = 2 * idxPtr;
            int rightChild = 2 * idxPtr + 1;

            int minChild = leftChild;
            if (rightChild <= size && heap[rightChild] < heap[leftChild]) {
                minChild = rightChild;
            }

            if (heap[idxPtr] <= heap[minChild]) {
                break;
            }

            int tmp = heap[idxPtr];
            heap[idxPtr] = heap[minChild];
            heap[minChild] = tmp;
            idxPtr = minChild;
        }
    }
}
