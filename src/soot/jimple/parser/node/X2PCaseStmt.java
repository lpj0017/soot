package soot.jimple.parser.node;

import ca.mcgill.sable.util.*;
import java.util.*;
import soot.jimple.parser.analysis.*;

public final class X2PCaseStmt extends XPCaseStmt
{
    private PCaseStmt _pCaseStmt_;

    public X2PCaseStmt()
    {
    }

    public X2PCaseStmt(
        PCaseStmt _pCaseStmt_)
    {
        setPCaseStmt(_pCaseStmt_);
    }

    public Object clone()
    {
        throw new RuntimeException("Unsupported Operation");
    }

    public void apply(Switch sw)
    {
        throw new RuntimeException("Switch not supported.");
    }

    public PCaseStmt getPCaseStmt()
    {
        return _pCaseStmt_;
    }

    public void setPCaseStmt(PCaseStmt node)
    {
        if(_pCaseStmt_ != null)
        {
            _pCaseStmt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _pCaseStmt_ = node;
    }

    void removeChild(Node child)
    {
        if(_pCaseStmt_ == child)
        {
            _pCaseStmt_ = null;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
    }

    public String toString()
    {
        return "" +
            toString(_pCaseStmt_);
    }
}
