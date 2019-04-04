/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SList;

/**
 *
 * @author Huei Ching
 */
public class SList<E> {
    private SNode<E> head;
    private SNode<E> tail;
    private int size = 0;

    public SList() {
    }
    
    public void appendEnd(E e){
        SNode<E> newNode = new SNode<>(e);
        if(tail==null){
            head = tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    
    public E removeInitial(){
        if(size==0){
            return null;
        }
        else{
            SNode<E> temp = new SNode<>();
            temp = head;
            head = head.next;
            size--;
            if(head==null) tail = null;
            return temp.element;
        }
    }
    
    public boolean contains(E e){
        SNode<E> current = head;
        for(int i=0; i<size; i++){
            if(current.element.equals(e)) return true;
            current = current.next;
        }
        return false;
    }
    
    public void clear(){
        size = 0;
        head = tail = null;
        System.out.println("The list is empty now.");
    }
    
    public void display(){
        SNode<E> current = head;
        System.out.print("All values: ");
        for(int i=0; i<size; i++){
            System.out.print(current.element+" ");
            current = current.next;
        }
        System.out.println("");
    }
}
