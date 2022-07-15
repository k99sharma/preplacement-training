package com.kalash.StackAndQueue;

import java.util.*;
public class StackImplementation {
    public static class Stack{
        private final int N = 10;
        private int size;
        private int top;
        private int[] arr;

        public Stack(){
            size = 0;
            top = -1;
            arr = new int[N];
        }

        public void push(int data){
            if(top == N){
                int updatedN = 2*N;
                int[] newArray = new int[updatedN];
                for(int i=0; i<arr.length; i++){
                    newArray[i] = arr[i];
                }

                arr = newArray;
            }

            top += 1;
            size += 1;
            arr[top] = data;
        }

        public int pop(){
            if(top == -1){
                System.out.println("Underflow");
                return -1;
            }

            int data = arr[top];

            size = size - 1;
            top = top - 1;

            return data;
        }

        public int peek(){
            return arr[top];
        }

        public int getSize(){
            return size;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack st = new Stack();

        System.out.println("Enter total number of elements");
        int n = in.nextInt();

        for(int i=0; i<n; i++){
            System.out.print("Enter element: ");
            st.push(in.nextInt());
        }

        int stackSize = st.getSize();
        System.out.println("Elements in stack");
        for(int i=0; i<stackSize; i++){
            System.out.println(st.pop());
        }
    }
}
