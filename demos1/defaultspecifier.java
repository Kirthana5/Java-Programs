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
public class defaultspecifier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        defspc obj=new defspc();
        obj.display();
    }
    
}
class defspc         //exception case @demos.test------test case @demos1.example
{
    int a=10;
    int b=20;
    void display()
    {
        System.out.println(a+b);
    }
}