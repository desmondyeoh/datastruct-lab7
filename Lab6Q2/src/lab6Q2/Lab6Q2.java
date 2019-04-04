/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6zul;

import java.util.Scanner;

/**
 *
 * @author Abdul Aziz
 */
public class Lab6lol {

    /**
     * @param args the command line arguments
     */
    
    public static class SList<E> {
        private Node head;
        private Node tail;
        private int size;
        
        public SList() {
            size =0;
        }
        
        private class Node<E> {
            E element;
            Node next;
            
            public Node(E element) {
                this.element = element;
                this.next = next;
            }
        }
       
        public void add(E e) {
            if(tail==null) {
                head = tail = new Node<E>(e);
            } else {
                tail.next = new Node<E>(e);
                tail = tail.next;
            }
            size++;
        }
        
        public void removeElement(E e) {
            Node<E> previous = head;      
            
            if(head.element.equals(e)) {
                head=previous.next;
                size--;
            }
            
            else {
                for(int i=1; i < size; i++) {
                if(previous.next.element.equals(e)){
                    Node<E> current = previous.next;
                    previous.next=current.next;
                    size--;
                    if((i-1)==(size-1)) {
                        tail=previous;
                    }
                }
                previous=previous.next;
            }
        }
        }
        
        public void printList() {
            Node<E> current = head;
            while(current!=null) {
                System.out.print(current.element + ", ");
                current.next = current;
            }
        }
        
        public int getSize() {
            return size;
        }
        
        public boolean contains(E e) {
            Node<E> current = head;
            boolean found = false;
            while(current!=null) {
                if(current.element.equals(e)) {
                    found=true;
                    break;
                }
                current = current.next;
            }
            return found;
        }
        
        public void replace(E e, E newE) {
            Node<E> current = head;
            while(current!=null) {
                if(current.element.equals(e)) {
                    current.element=(newE);
                    break;
                }
                current = current.next;
            }
        }
        
    }
        
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        SList<String> list = new SList<>();
        System.out.println("Enter your student name list: Enter 'n' to end.....");
        String input = "";
        
        while (!input.equals("n")) {
            input = s.nextLine();
            if(input.equals("n")) {
                break;
            }
            list.add(input);
        }       
        
        System.out.println("You have entered the following students' name :");
        list.printList();
        System.out.println("");
        
        System.out.println("The number of students entered is : " + list.getSize());
        
        System.out.println("All the names entered are correct? Enter 'r' to rename the student name, 'n' to proceed.");
        input = s.nextLine();
        if(input.equals("r")) {
            System.out.println("Enter the existing student name that u want to rename :");
            input = s.nextLine();
            System.out.println("Enter the new name: ");
            String newName = s.nextLine();
            list.replace(input, newName);
            System.out.println("The new student list is :");
            list.printList();
        }
        
        System.out.println("Do you want to remove any of your student name? Enter 'y' for yes, 'n' to proceed.");
        input = s.nextLine();
        if(input.equals("y")) {
            System.out.println("Enter a student name to remove :");
            input = s.nextLine();
            list.removeElement(input);
        }
        
        System.out.println("The number of updated student is :" + list.getSize());
        System.out.println("The updated student list is :");
        list.printList();
        
        System.out.println("All student data captured complete. Thank you!");
    }
    
}
