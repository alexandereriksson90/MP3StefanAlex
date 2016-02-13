package documentElements;

import docParser.DocumentVisitor;

public class Heading extends Element
{
	private String heading;
	
	public Heading(String heading)
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
	

}
