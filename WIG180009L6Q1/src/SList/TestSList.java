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
public class TestSList {
    public static void main(String [] args){
        SList<String> a = new SList<>();
        a.appendEnd("Linked list");
        a.appendEnd("is");
        a.appendEnd("easy");
        a.display();
        System.out.println("Removed value: "+a.removeInitial());
        System.out.println("Is 'difficult' in the list? "+a.contains("difficult"));
        a.clear();
    }
}
