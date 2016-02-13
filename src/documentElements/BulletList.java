package documentElements;

import java.util.ArrayList;

import docParser.DocumentVisitor;

public class BulletList extends CompositeElement
{
	ArrayList<Element> elements;
	
	public BulletList()
	{
		elements = new ArrayList<Element>();
	}
	@Override
	public void accept(DocumentVisitor visitor)
	{
		visitor.visit(this);		
	}
	
	@Override
	public void addElement(Element element)
	{
		elements.add(element);
	}
	
	public ArrayList<Element> getElements()
	{
		return elements;
	}

}
