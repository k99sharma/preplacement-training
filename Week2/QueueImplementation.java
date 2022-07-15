package com.kalash.StackAndQueue;

import java.util.*;
public class QueueImplementation {
    public static class Queue{
        private final int N = 10;
        private int[] arr;
        private int start;
        private int end;
        private int size;

        public Queue(){
            arr = new int[N];
            start = 0;
            end = 0;
            size = 0;
        }

        public void add(int data){
            arr[end] = data;
            end += 1;
            size += 1;
        }

        public int poll(){
            if(start > 0 && end == start){
                System.out.println("Queue is empty");
                return -1;
            }

            int data = arr[start];
            start = start + 1;
            size = size - 1;
            return data;
        }

        public int getSize(){
            return size;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Queue queue = new Queue();

        System.out.println("Enter number of elements: ");
        int n = in.nextInt();

        for(int i=0; i<n; i++){
            System.out.print("Enter element: ");
            int data = in.nextInt();

            queue.add(data);
        }

        System.out.println("Data in queue: ");
        for(int i=0; i<=queue.getSize(); i++){
            System.out.println(queue.poll());
        }
    }
}
