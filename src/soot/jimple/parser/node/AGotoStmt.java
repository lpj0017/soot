package soot.jimple.parser.node;

import ca.mcgill.sable.util.*;
import java.util.*;
import soot.jimple.parser.analysis.*;

public final class AGotoStmt extends PGotoStmt
{
    private TGoto _goto_;
    private PLabelName _labelName_;
    private TSemicolon _semicolon_;

    public AGotoStmt()
    {
    }

    public AGotoStmt(
        TGoto _goto_,
        PLabelName _labelName_,
        TSemicolon _semicolon_)
    {
        setGoto(_goto_);

        setLabelName(_labelName_);

        setSemicolon(_semicolon_);

    }
    public Object clone()
    {
        return new AGotoStmt(
            (TGoto) cloneNode(_goto_),
            (PLabelName) cloneNode(_labelName_),
            (TSemicolon) cloneNode(_semicolon_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAGotoStmt(this);
    }

    public TGoto getGoto()
    {
        return _goto_;
    }

    public void setGoto(TGoto node)
    {
        if(_goto_ != null)
        {
            _goto_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _goto_ = node;
    }

    public PLabelName getLabelName()
    {
        return _labelName_;
    }

    public void setLabelName(PLabelName node)
    {
        if(_labelName_ != null)
        {
            _labelName_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _labelName_ = node;
    }

    public TSemicolon getSemicolon()
    {
        return _semicolon_;
    }

    public void setSemicolon(TSemicolon node)
    {
        if(_semicolon_ != null)
        {
            _semicolon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _semicolon_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_goto_)
            + toString(_labelName_)
            + toString(_semicolon_);
    }

    void removeChild(Node child)
    {
        if(_goto_ == child)
        {
            _goto_ = null;
            return;
        }

        if(_labelName_ == child)
        {
            _labelName_ = null;
            return;
        }

        if(_semicolon_ == child)
        {
            _semicolon_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_goto_ == oldChild)
        {
            setGoto((TGoto) newChild);
            return;
        }

        if(_labelName_ == oldChild)
        {
            setLabelName((PLabelName) newChild);
            return;
        }

        if(_semicolon_ == oldChild)
        {
            setSemicolon((TSemicolon) newChild);
            return;
        }

    }
}
