package documentElements;

import docParser.DocumentVisitor;

public class ParagraphElement extends StructuredTextElement
{
	private String paragraph;

	public ParagraphElement(String paragraph)
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
	public void addElement(StructuredTextElement e)
	{
		
	}

}
