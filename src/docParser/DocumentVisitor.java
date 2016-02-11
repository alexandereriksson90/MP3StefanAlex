package docParser;

import documentElements.BulletListElement;
import documentElements.CompositeElement;
import documentElements.HeadingElement;
import documentElements.ParagraphElement;
import documentElements.TableElement;
import documentElements.TextElement;

public interface DocumentVisitor
{
	public void visit(ParagraphElement p);
	public void visit(HeadingElement h);
	public void visit(TextElement t);
	public void visit(BulletListElement b);
	public void visit(TableElement t);
	public void visit(CompositeElement ce);
}
