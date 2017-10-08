package com.edu.dsa.Modelo;


import sun.misc.*;
import java.util.EmptyQueueException;

/**
 * Created by Josean on 02/10/2017.
 */
public class QueueImpl <E> extends Queue <E>{

    private E[] el;
    private E[] ek;
    private int i=0;

    public QueueImpl (int q)
    {
        this.el = (E[])new Object[q];
    }


    public void push(E e) {

        this.el[this.i++]=e;
    }

    public E pop() {

        if (i == 0)
            throw new EmptyQueueException();
            return this.el[--this.i];
    }

    public int size() {
        return this.i;
    }
}
