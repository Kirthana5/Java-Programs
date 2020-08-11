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
public class staticblock {  //all static blocks are executed in sequential order
     static                //static block---->executed first before everything,but if stmts present 
    {                      //inside static main() that's included in static block 
        System.out.println("Static block 1");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Inside main before static");
        xyz.add();
        System.out.println("Inside main");
    }
    static 
    {
        System.out.println("Static block 2");
    }
    
}
class xyz
{
    static int a=20,b=22;
    static void add()
    {
        System.out.println(a+b);
    }
    static 
    {
        System.out.println("Static block 3");
    }
}