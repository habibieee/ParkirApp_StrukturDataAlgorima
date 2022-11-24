/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkirapp;

import parkirapp.*;

/**
 *
 * @author BobyZhg
 */
public class LinkedQueue
{
    protected Node front, rear;
    public int size;


    public LinkedQueue()
    {
        front = null;
        rear = null;
        size = 0;
    }

    public boolean isEmpty()
    {
        return front == null;
    }

    public int getSize()
    {
        return size;
    }

    public void insert(String data)
    {
        Node nptr = new Node(data, null);
        if (rear == null)
        {
            front = nptr;
            rear = nptr;
        }
        else
        {
            rear.setLink(nptr);
            rear = rear.getLink();
        }
        size++;
    }

    public String remove()
    {
        if (isEmpty())
            System.out.println("Kosong!!");
        Node ptr = front;
        front = ptr.getLink();
        if (front == null)
            rear = null;
        size--;
        return ptr.getData();
    }

    public void display()
    {
        System.out.println("No Parkir\tTipe Kendaraan\tPlat Kendaraan\tJam masuk\tBiaya");
        if (size == 0)
        {
            System.out.print("Kosong\n");
            return;
        }
        Node ptr = front;
        while (ptr != rear.getLink())
        {
            System.out.print(ptr.getData() + " ");
            ptr = ptr.getLink();
            System.out.println("");
        }
        System.out.println();
    }
}

