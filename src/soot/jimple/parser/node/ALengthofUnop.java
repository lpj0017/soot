package soot.jimple.parser.node;

import ca.mcgill.sable.util.*;
import java.util.*;
import soot.jimple.parser.analysis.*;

public final class ALengthofUnop extends PUnop
{
    private TLengthof _lengthof_;

    public ALengthofUnop()
    {
    }

    public ALengthofUnop(
        TLengthof _lengthof_)
    {
        setLengthof(_lengthof_);

    }
    public Object clone()
    {
        return new ALengthofUnop(
            (TLengthof) cloneNode(_lengthof_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALengthofUnop(this);
    }

    public TLengthof getLengthof()
    {
        return _lengthof_;
    }

    public void setLengthof(TLengthof node)
    {
        if(_lengthof_ != null)
        {
            _lengthof_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _lengthof_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_lengthof_);
    }

    void removeChild(Node child)
    {
        if(_lengthof_ == child)
        {
            _lengthof_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_lengthof_ == oldChild)
        {
            setLengthof((TLengthof) newChild);
            return;
        }

    }
}
