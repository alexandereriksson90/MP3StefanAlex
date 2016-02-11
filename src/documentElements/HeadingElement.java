package documentElements;

import docParser.DocumentVisitor;

public class HeadingElement extends StructuredTextElement
{
	private String heading;
	
	public HeadingElement(String heading)
	{
		this.heading = heading;
	}
	@Override
	public String getText()
	{
		return heading;
	}
	
	@Override
	public void accept(DocumentVisitor visitor)
	{
		visitor.visit(this);
		
	}
	@Override
	public void addElement(StructuredTextElement e)
	{
		// TODO Auto-generated method stub
		
	}

}
