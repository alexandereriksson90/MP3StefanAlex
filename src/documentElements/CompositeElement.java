package documentElements;

import java.util.ArrayList;

import docParser.DocumentVisitor;

public class CompositeElement implements Element
{
	ArrayList<Element> elements;
	
	public CompositeElement()
	{
		elements = new ArrayList<Element>();
	}
	@Override
	public String getText()
	{
		return null;
	}

	@Override
	public void addElement(Element e)
	{
		elements.add(e);
		
	}

	@Override
	public void accept(DocumentVisitor visitor)
	{
		visitor.visit(this);		
	}


}
