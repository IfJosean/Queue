package com.edu.dsa.Modelo;
package com.edu.dsa.s2;

import sun.misc.*;
import java.util.EmptyQueueException;

/**
 * Created by Josean on 02/10/2017.
 */
public class QueueImpl <E> extends Queue <E>{

    private E[] el;
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
        return null;
    }

    public int size() {
        return this.i;
    }
}
