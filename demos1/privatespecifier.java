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
public class privatespecifier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        prispc obj=new prispc();
        obj.display();
    }
    
}
class prispc
{
    private int a=10;
    int b=20;
    /*private prispc()      ----------->exception case i.e., constructor as PRIVATE can't create obj for that class
    {
        System.out.println("Constructor.....");
    }*/
    void display()
    {
        System.out.println(a+b);
    }

}