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
public class staticvariable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        xxx o1=new xxx();     //i=10+10=20;   j=10+10=20;
        o1.incr();
        
        xxx o2=new xxx();      //i=20+10=30;  j=10+10=20;
        o2.incr();
        
        xxx o3=new xxx();      //i=30+10=40;   j=10+10=20;
        o3.incr();
    }
    
}
class xxx
{
    static int i=10;    //memory is shared between objects
    int j=10;           //allocates memory each time
    void incr()
    {
        i+=10;
        j+=10;
        System.out.println(i);
        System.out.println(j);
    }
}