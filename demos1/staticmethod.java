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
public class staticmethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(yyy.a);    //accessing class var and methods without creating an 
        System.out.println(yyy.b);    //object but by using static keyword
        yyy.add();
    }
    
}
class yyy
{
    static int a=10,b=20;
    static void add()
    {
        System.out.println(a+b);
    }
}