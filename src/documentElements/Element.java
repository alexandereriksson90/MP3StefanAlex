package documentElements;

import docParser.DocumentVisitor;

public abstract class Element
{
	public abstract void accept(DocumentVisitor visitor);

	public abstract String getText();

	public void addElement(Element e)
	{

	}
}
