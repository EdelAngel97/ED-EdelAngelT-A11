/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.edelangelt.a11;

/**
 *
 * @author LuisGuillermo
 */
public class Node<T> {
    Node next;
    T data;
    
    Node(){
    next = null;
}
    Node(T d){
        this.next = null;
        this.data = d; 
    }
    
    public void print(){
        System.out.println(data + "->");
    }
    
    public void printS(){
        System.out.println(data);
        System.out.println("↓");
    }
}
