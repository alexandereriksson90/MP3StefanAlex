package documentElements;

import docParser.DocumentVisitor;

public class Paragraph implements Element
{
	private String paragraph;

	public Paragraph(String paragraph)
	{
		this.paragraph = paragraph;
	}
	
	@Override
	public String getText()
	{
		return paragraph;
	}

	

	@Override
	public void accept(DocumentVisitor visitor)
	{
		visitor.visit(this);
	}

	@Override
	public void addElement(Element e)
	{
		
	}

}
