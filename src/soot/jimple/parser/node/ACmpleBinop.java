package soot.jimple.parser.node;

import ca.mcgill.sable.util.*;
import java.util.*;
import soot.jimple.parser.analysis.*;

public final class ACmpleBinop extends PBinop
{
    private TCmple _cmple_;

    public ACmpleBinop()
    {
    }

    public ACmpleBinop(
        TCmple _cmple_)
    {
        setCmple(_cmple_);

    }
    public Object clone()
    {
        return new ACmpleBinop(
            (TCmple) cloneNode(_cmple_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACmpleBinop(this);
    }

    public TCmple getCmple()
    {
        return _cmple_;
    }

    public void setCmple(TCmple node)
    {
        if(_cmple_ != null)
        {
            _cmple_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _cmple_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_cmple_);
    }

    void removeChild(Node child)
    {
        if(_cmple_ == child)
        {
            _cmple_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_cmple_ == oldChild)
        {
            setCmple((TCmple) newChild);
            return;
        }

    }
}
