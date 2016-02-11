package documentElements;

import java.util.ArrayList;

import docParser.DocumentVisitor;

public class CompositeElement extends StructuredTextElement
{
	ArrayList<StructuredTextElement> elements;
	
	public CompositeElement()
	{
		elements = new ArrayList<StructuredTextElement>();
	}
	@Override
	public String getText()
	{
		

		return null;
	}

	@Override
	public void addElement(StructuredTextElement e)
	{
		elements.add(e);
		
	}

	@Override
	public void accept(DocumentVisitor visitor)
	{
		visitor.visit(this);		
	}

}
