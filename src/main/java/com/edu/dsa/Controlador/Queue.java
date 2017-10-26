package com.edu.dsa.Controlador;
import com.edu.dsa.Modelo.EmptyQueueException;
import com.edu.dsa.Modelo.FullQueueException;


/**
 * Created by Josean on 02/10/2017.
 */

public interface Queue <E> {
    void push (E e) throws FullQueueException;
    E pop () throws EmptyQueueException;
    int size();

}