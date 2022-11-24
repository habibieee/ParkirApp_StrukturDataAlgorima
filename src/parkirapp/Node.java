package parkirapp;

import parkirapp.*;
import java.util.*;

public class Node
{
    protected String data;
    protected Node link;


    public Node()
    {
        link = null;
        data = null;
    }

    public Node(String d, Node n)
    {
        data = d;
        link = n;
    }

    public void setLink(Node n)
    {
        link = n;
    }

    public void setData(String d)
    {
        data = d;
    }

    public Node getLink()
    {
        return link;
    }

    public String getData()
    {
        return data;
    }
}

