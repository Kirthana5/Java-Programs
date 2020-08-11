/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demos;

import java.util.Scanner;

/**
 *
 * @author ELCOT
 */
public class stackclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner val=new Scanner(System.in);
        System.out.println("Enter the size of stack:");
        int size=val.nextInt();
        stack obj=new stack(size);
        char ch;
        do{
        System.out.println("1.Push\n2.Pop\n3.Display\nEnter your choice:");
        int choice=val.nextInt();
        switch(choice)
        {
            case 1:
                if(!obj.isfull())
                {
                    System.out.println("Enter element to be inserted:");
                    int i=val.nextInt();
                    obj.push(i);
                }
                else
                    System.out.println("Stack is full.Can't delete!!");
                break;
            case 2:
                if(!obj.isempty()) 
                {
                    System.out.println("Deleted element:"+(obj.pop()));
                } 
                else 
                    System.out.println("Stack is empty.Can't delete!!");
                break;
            case 3:
                obj.display();
                break;
            default:
                System.out.println("Enter valid option !!(i.e.,from 1 to 3)");
                break;
        }System.out.println("======================");
        System.out.println("Do you wanna continue??");
        ch=val.next().charAt(0);
        }while(ch=='y' || ch=='Y');            
            
        }
    }
    

class stack
{
    int top=-1;
    int a[];
    int size;
    stack(int size)
    {
        this.size=size;
        a=new int[size];
    }
    void push(int i)
    {
        a[++top]=i;
    }
    int pop()
    {
        return a[top--];
    }     
    boolean isfull()
    { 
        return top==size-1;
    }
    boolean isempty()
    {
        return top==-1;
    }
    void display()
    {
        System.out.println("Stack is:");
        for(int i=top;i>=0;i--)
        {
            System.out.print(a[i]+" ");
        }
    }
}
