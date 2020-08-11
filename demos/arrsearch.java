/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demos;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ELCOT
 */
public class arrsearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        search obj=new search();
        Scanner val=new Scanner(System.in);
        int a[]={2,4,3,5,6,7,8,9};
        System.out.println("Array:\n"+Arrays.toString(a));
        System.out.println("Enter the element to be searched:");
        int ele=val.nextInt();
        obj.searchelt(a, ele);
    }
    
}
class search
{
    boolean flag=false;
    void searchelt(int b[],int key)
    {
        for(int i=0;i<b.length;i++)
        {
           if(b[i]==key)    
                flag=true;
        }
        if(flag)
            System.out.println("Searched element found!!");
        else
            System.out.println("Searched element not found!!");
    }
}