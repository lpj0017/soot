package soot.jimple.parser.node;

import ca.mcgill.sable.util.*;
import java.util.*;
import soot.jimple.parser.analysis.*;

public final class AFieldSignature extends PFieldSignature
{
    private TCmplt _cmplt_;
    private PClassName _className_;
    private TColon _first_;
    private PType _type_;
    private PName _fieldName_;
    private TCmpgt _cmpgt_;

    public AFieldSignature()
    {
    }

    public AFieldSignature(
        TCmplt _cmplt_,
        PClassName _className_,
        TColon _first_,
        PType _type_,
        PName _fieldName_,
        TCmpgt _cmpgt_)
    {
        setCmplt(_cmplt_);

        setClassName(_className_);

        setFirst(_first_);

        setType(_type_);

        setFieldName(_fieldName_);

        setCmpgt(_cmpgt_);

    }
    public Object clone()
    {
        return new AFieldSignature(
            (TCmplt) cloneNode(_cmplt_),
            (PClassName) cloneNode(_className_),
            (TColon) cloneNode(_first_),
            (PType) cloneNode(_type_),
            (PName) cloneNode(_fieldName_),
            (TCmpgt) cloneNode(_cmpgt_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFieldSignature(this);
    }

    public TCmplt getCmplt()
    {
        return _cmplt_;
    }

    public void setCmplt(TCmplt node)
    {
        if(_cmplt_ != null)
        {
            _cmplt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _cmplt_ = node;
    }

    public PClassName getClassName()
    {
        return _className_;
    }

    public void setClassName(PClassName node)
    {
        if(_className_ != null)
        {
            _className_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _className_ = node;
    }

    public TColon getFirst()
    {
        return _first_;
    }

    public void setFirst(TColon node)
    {
        if(_first_ != null)
        {
            _first_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _first_ = node;
    }

    public PType getType()
    {
        return _type_;
    }

    public void setType(PType node)
    {
        if(_type_ != null)
        {
            _type_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _type_ = node;
    }

    public PName getFieldName()
    {
        return _fieldName_;
    }

    public void setFieldName(PName node)
    {
        if(_fieldName_ != null)
        {
            _fieldName_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _fieldName_ = node;
    }

    public TCmpgt getCmpgt()
    {
        return _cmpgt_;
    }

    public void setCmpgt(TCmpgt node)
    {
        if(_cmpgt_ != null)
        {
            _cmpgt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _cmpgt_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_cmplt_)
            + toString(_className_)
            + toString(_first_)
            + toString(_type_)
            + toString(_fieldName_)
            + toString(_cmpgt_);
    }

    void removeChild(Node child)
    {
        if(_cmplt_ == child)
        {
            _cmplt_ = null;
            return;
        }

        if(_className_ == child)
        {
            _className_ = null;
            return;
        }

        if(_first_ == child)
        {
            _first_ = null;
            return;
        }

        if(_type_ == child)
        {
            _type_ = null;
            return;
        }

        if(_fieldName_ == child)
        {
            _fieldName_ = null;
            return;
        }

        if(_cmpgt_ == child)
        {
            _cmpgt_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_cmplt_ == oldChild)
        {
            setCmplt((TCmplt) newChild);
            return;
        }

        if(_className_ == oldChild)
        {
            setClassName((PClassName) newChild);
            return;
        }

        if(_first_ == oldChild)
        {
            setFirst((TColon) newChild);
            return;
        }

        if(_type_ == oldChild)
        {
            setType((PType) newChild);
            return;
        }

        if(_fieldName_ == oldChild)
        {
            setFieldName((PName) newChild);
            return;
        }

        if(_cmpgt_ == oldChild)
        {
            setCmpgt((TCmpgt) newChild);
            return;
        }

    }
}
