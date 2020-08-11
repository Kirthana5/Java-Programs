/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demos1;

/**
 *
 * @author ELCOT
 */
public class operators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=6,b=6,c=4;                    //assignment operators
        System.out.println(a++);            //increment &decrement (pre,post)
        System.out.println(++b);
        System.out.println(a--);           
        System.out.println(--b);            
        System.out.println(9<<4);            //bitwise operators
        System.out.println(-1>>>29);
        System.out.println((double)b/4);   //typecasting  to have complete quotient
    }
    
}
