package soot.jimple.parser.node;

import ca.mcgill.sable.util.*;
import java.util.*;
import soot.jimple.parser.analysis.*;

public final class TStaticinvoke extends Token
{
    public TStaticinvoke()
    {
        super.setText("staticinvoke");
    }

    public TStaticinvoke(int line, int pos)
    {
        super.setText("staticinvoke");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TStaticinvoke(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTStaticinvoke(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TStaticinvoke text.");
    }
}
