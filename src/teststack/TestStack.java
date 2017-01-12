/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teststack;

/**
 *
 * @author mking
 */
public class TestStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CharStack stack1 = new CharStack(5);
        CharStack stack2 = new CharStack(15);
        
        System.out.println(stack1.isEmpty()); 
        stack1.push('M');
        System.out.println(stack1.peek()); 
        System.out.println(stack1.pop()); 
        if (!stack1.isEmpty()) {System.out.println(stack1.peek());}
        stack1.push('A');
        System.out.println(stack1.peek()); 
        stack1.push('R');
        System.out.println(stack1.peek()); 
        System.out.println();
        System.out.println(stack1.seek(1));
        System.out.println(stack1.seek(2));
        System.out.println(stack1.seek(3));
        System.out.println(stack1.seek(0));
        System.out.println(stack1.seek(4));
        System.out.println(stack1.seek(5));
        System.out.println(stack1.seek(6));
    }
    
    
}
