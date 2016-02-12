package docParser;

import documentElements.BulletList;
import documentElements.CompositeElement;
import documentElements.Heading;
import documentElements.Paragraph;
import documentElements.Table;

public interface DocumentVisitor
{
	public void visit(Paragraph p);
	public void visit(Heading h);
	public void visit(BulletList b);
	public void visit(Table t);
	public void visit(CompositeElement ce);
}
