package soot.jimple.parser.node;

import ca.mcgill.sable.util.*;
import java.util.*;
import soot.jimple.parser.analysis.*;

public abstract class Node implements Switchable, Cloneable
{
    private Node parent;

    public abstract Object clone();

    public Node parent()
    {
        return parent;
    }

    void parent(Node parent)
    {
        this.parent = parent;
    }

    abstract void removeChild(Node child);
    abstract void replaceChild(Node oldChild, Node newChild);

    public void replaceBy(Node node)
    {
        if(parent != null)
        {
            parent.replaceChild(this, node);
        }
    }

    protected String toString(Node node)
    {
        if(node != null)
        {
            return node.toString();
        }

        return "";
    }

    protected String toString(List list)
    {
        StringBuffer s = new StringBuffer();

        for(Iterator i = list.iterator(); i.hasNext();)
        {
            s.append(i.next());
        }

        return s.toString();
    }

    protected Node cloneNode(Node node)
    {
        if(node != null)
        {
            return (Node) node.clone();
        }

        return null;
    }

    protected List cloneList(List list)
    {
        List clone = new LinkedList();

        for(Iterator i = list.iterator(); i.hasNext();)
        {
            clone.add(((Node) i.next()).clone());
        }

        return clone;
    }
}
