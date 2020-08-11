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
public class MULTIDIMENMAT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner val=new Scanner(System.in);
        int row1,col1,row2,col2,i,j;
        System.out.println("Dimensions of A matrix:");
        row1=val.nextInt();col1=val.nextInt();
        int a[][]=new int[row1][col1];
        System.out.println("Dimensions of B matrix:");
        row2=val.nextInt();col2=val.nextInt();
        int b[][]=new int[row2][col2];
        int c[][];
        if(col1==row2)
        {
        c=new int[row1][col2];
        System.out.println("Enter matrix A elements:");
        for(i=0;i<row1;i++)
        {
            for(j=0;j<col1;j++)
            {
                a[i][j]=val.nextInt();
            }
        }
        System.out.println("Enter matrix B elements:");
        for(i=0;i<row2;i++)
        {
            for(j=0;j<col2;j++)
            {
                b[i][j]=val.nextInt();
            }
        }System.out.println("====================");
        System.out.println("MATRIX A:");
        for(i=0;i<row1;i++)
        {
            for(j=0;j<col1;j++)
            {
                System.out.print(a[i][j]+" ");
            }System.out.println();
        }
        System.out.println("\nMATRIX B:");
        for(i=0;i<row2;i++)
        {
            for(j=0;j<col2;j++)
            {
                System.out.print(b[i][j]+" ");
            }System.out.println();
        }System.out.println("====================");


        //MATRIX MULTIPLICATION
        for(i=0;i<row1;i++)
        {
            for(j=0;j<col2;j++)
            {
                int s=0;
                for(int k=0;k<col1;k++)
                {
                    s+=a[i][k]*b[k][j];
                }
                c[i][j]=s;
            }
        }
        System.out.println("\nMATRIX MULTIPLICATION\nRESULTANT MATRIX:");
        for(i=0;i<row1;i++)
        {
            for(j=0;j<col2;j++)
            {
                System.out.print(c[i][j]+" ");
            }System.out.println();
        }
        }
        else
            System.out.println("MATRIX MULTIPLICATION CAN'T BE PERFORMED!!");
                
        }
        
    }
    
