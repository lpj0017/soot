package soot.jimple.parser.node;

import ca.mcgill.sable.util.*;
import java.util.*;
import soot.jimple.parser.analysis.*;

public final class TShl extends Token
{
    public TShl()
    {
        super.setText("<<");
    }

    public TShl(int line, int pos)
    {
        super.setText("<<");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TShl(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTShl(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TShl text.");
    }
}
