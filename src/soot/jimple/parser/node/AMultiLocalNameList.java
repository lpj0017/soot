package soot.jimple.parser.node;

import ca.mcgill.sable.util.*;
import java.util.*;
import soot.jimple.parser.analysis.*;

public final class AMultiLocalNameList extends PLocalNameList
{
    private PLocalName _localName_;
    private TComma _comma_;
    private PLocalNameList _localNameList_;

    public AMultiLocalNameList()
    {
    }

    public AMultiLocalNameList(
        PLocalName _localName_,
        TComma _comma_,
        PLocalNameList _localNameList_)
    {
        setLocalName(_localName_);

        setComma(_comma_);

        setLocalNameList(_localNameList_);

    }
    public Object clone()
    {
        return new AMultiLocalNameList(
            (PLocalName) cloneNode(_localName_),
            (TComma) cloneNode(_comma_),
            (PLocalNameList) cloneNode(_localNameList_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMultiLocalNameList(this);
    }

    public PLocalName getLocalName()
    {
        return _localName_;
    }

    public void setLocalName(PLocalName node)
    {
        if(_localName_ != null)
        {
            _localName_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _localName_ = node;
    }

    public TComma getComma()
    {
        return _comma_;
    }

    public void setComma(TComma node)
    {
        if(_comma_ != null)
        {
            _comma_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _comma_ = node;
    }

    public PLocalNameList getLocalNameList()
    {
        return _localNameList_;
    }

    public void setLocalNameList(PLocalNameList node)
    {
        if(_localNameList_ != null)
        {
            _localNameList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _localNameList_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_localName_)
            + toString(_comma_)
            + toString(_localNameList_);
    }

    void removeChild(Node child)
    {
        if(_localName_ == child)
        {
            _localName_ = null;
            return;
        }

        if(_comma_ == child)
        {
            _comma_ = null;
            return;
        }

        if(_localNameList_ == child)
        {
            _localNameList_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_localName_ == oldChild)
        {
            setLocalName((PLocalName) newChild);
            return;
        }

        if(_comma_ == oldChild)
        {
            setComma((TComma) newChild);
            return;
        }

        if(_localNameList_ == oldChild)
        {
            setLocalNameList((PLocalNameList) newChild);
            return;
        }

    }
}
