/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner in = new Scanner(System.in);
         System.out.print("размер массива=");
        Array mass=new Array(in.nextInt());
        
        System.out.print("выберите команду:"
                + "\n1.показать массив\n"
                + "2.добавить элемент в конец массива\n"
                + "3.удалить элемент заданного индекса\n"
                + "4.заменить элемент заданного индекса\n"
                + "5.завершить программу\n");

        
        int x=in.nextInt();
        while (x!=5)
        {
        switch(x) 
        {
            case 1:
                mass.show();
		break;
            case 2:  
                System.out.print("элемент=");
                mass.addToEnd(in.nextInt());
		break;
            case 3:   
                System.out.print("индекс=");
                mass.deleteIndex(in.nextInt());
		break;
            case 4:
               System.out.print("элемент=");int el=in.nextInt();
               System.out.print("индекс=");
               mass.substitute(el, in.nextInt());
               break;
            case 5: 
                System.exit(0);
            default: 
	    break;
        }
        System.out.print("выберите команду:"
                + "\n1.показать массив\n"
                + "2.добавить элемент в конец массива\n"
                + "3.удалить элемент заданного индекса\n"
                + "4.заменить элемент заданного индекса\n"
                + "5.завершить программу\n");
        x=in.nextInt();
        
        }
    

        
        //mass=mass.writeA();
        //System.out.println(mass.rtn_elem(5));
        
    }
}
