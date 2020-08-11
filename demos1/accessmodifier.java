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
public class accessmodifier {
/*4 access specifier(scope/visibility)
    1----->private-accessed within a class-used for var,methods,constructor not for "cls"
    =>constructor as private -"can't create obj for cls"
    =>private int a;
    2------>default-accessed within the package(one prgm to other prgm)-for var,methods,constructors
    =>no keyword=>can't access outside package
    =>int a;
    3----->public-acceessed anywhere (by importing package for accessing in other packages)-for cls,methods,var,constructors and for all
    =>public int a;
    =>can't have 2 public classes in one prgm
    4----->protected-accessed within package-for methods,variables not for cls-outside package is possible by inheritance concept(keyword extends)
    ==>protected int a;
    
    */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* sample obj=new sample();    ------>private
        System.out.println(obj.i);
        System.out.println(obj.j);
        obj.display();*/
        /*sample obj=new sample();    -------->default
        System.out.println(obj.i);
        System.out.println(obj.j);
        obj.display();//can be accessed throughout the package*/
    }
    
}
class sample
{
    /*private int i=10;  ------>private
    int j=20;
    private sample()//unable to create object 
    {
        System.out.println("Constructor");
    }
    private void display()
    {
        System.out.println(i+j);
    }*/
    /*int i=10;     -------->default
    int j=20;
    sample() 
    {
        System.out.println("Constructor");
    }
    void display()
    {
        System.out.println(i+j);
    }*/
    int i=10;  
    int j=20;
    sample() 
    {
        System.out.println("Constructor");
    }
    public void display()
    {
        System.out.println(i+j);
    }
    /*int i=10;     -------->default
    int j=20;
    sample() 
    {
        System.out.println("Constructor");
    }
    void display()
    {
        System.out.println(i+j);
    }*/
}