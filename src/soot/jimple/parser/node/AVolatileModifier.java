package soot.jimple.parser.node;

import ca.mcgill.sable.util.*;
import java.util.*;
import soot.jimple.parser.analysis.*;

public final class AVolatileModifier extends PModifier
{
    private TVolatile _volatile_;

    public AVolatileModifier()
    {
    }

    public AVolatileModifier(
        TVolatile _volatile_)
    {
        setVolatile(_volatile_);

    }
    public Object clone()
    {
        return new AVolatileModifier(
            (TVolatile) cloneNode(_volatile_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAVolatileModifier(this);
    }

    public TVolatile getVolatile()
    {
        return _volatile_;
    }

    public void setVolatile(TVolatile node)
    {
        if(_volatile_ != null)
        {
            _volatile_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _volatile_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_volatile_);
    }

    void removeChild(Node child)
    {
        if(_volatile_ == child)
        {
            _volatile_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_volatile_ == oldChild)
        {
            setVolatile((TVolatile) newChild);
            return;
        }

    }
}
