/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demos;

/**
 *
 * @author ELCOT
 */
public class minmaxofarray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int l,s,i;
        int a[]=new int[]{1,2,3,4,5};
        int n=a.length;
        l=s=a[0];
        for(i=0;i<n;i++)
        {
            if(a[i]>l)
                l=a[i];
            if(a[i]<s)
                s=a[i];
        }
        System.out.println(l);
        System.out.println(s);
    }
    
}
