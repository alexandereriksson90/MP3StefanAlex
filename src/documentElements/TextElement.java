package documentElements;

import docParser.DocumentVisitor;

public class TextElement extends StructuredTextElement
{
	private String text;
	
	public TextElement(String text)
	{
		this.text = text;
	}
	@Override
	public String getText()
	{
		return text;
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
