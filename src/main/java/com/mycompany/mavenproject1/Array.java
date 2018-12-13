/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author User
 */
public class Array {
    /** размер массива*/
    public int size;
    /** массив*/
    public int [] array;
    
    
    
    
    public Array() {
        array = null;
        size = 0;
    }
    /** 
     * конструктор
     * инициализирует поля {@link Array#size} {@link Array#array}
     * последнее заполняет случайными числами
     */
    public Array(int size)
    {
       
        this.size=size;
        array = new int[size];
        for(int i=0;i<size;i++)
        {
            array[i]= i;
            //array[i]=0 + (int) (Math.random() * 10);
        }
     
    }
    
   /** 
     * выводит значения массива
     */
    public void show ()
    {
        for(int i=0;i<size;i++)
        {System.out.print(array[i]+" ");}
        System.out.println();
    }
    
    /** 
     * побавляет дополнительный элемент в конеч массива
     */
    public void addToEnd (int elem)
    {
        
        int [] massA = new int[size+1];
        System.arraycopy(array, 0, massA, 0, size);
        massA[size]=elem;
        size++;
        array=new int[size];
        System.arraycopy(massA, 0, array, 0, size);
        show();
        
    }
    
    /** 
     * удаляет элемент заданного индекса
     */
    public void deleteIndex (int index)
    {
        checkIndex(index);
        int [] massA = new int[size];
        System.arraycopy(array, 0, massA, 0, size);
        size--;
        array=new int[size];
        System.arraycopy(massA, 0, array, 0, index);
        System.arraycopy(massA, index+1, array, index, size-index);
        show();
    }
    
    /** 
     * заменяет значение элемента заданного индекса
     */
    public void substitute(int elem,int index)
    {
        checkIndex(index);
        array[index]=elem;
        show();
    }
    
    /** 
     * Функция получения значения поля {@link Array#array[index]}
     * @return возвращает элемент заданного индекса
     */
    public int rtnElem (int index)
    {
        return array[index];
    }
    
    /** 
     * проверяет существует ли данный индекс
     */
    public void checkIndex (int index)
    {
        if (index>=size) 
    {
        System.out.println("неправильный индекс");
        System.exit(0);
    }
    }
    
    public boolean find (int x)
    { 
        for (int i=0;i<size;i++)
        {
            if (x == array[i])
            {return true;}
        }
        
        return false;
        
    }
    
}
