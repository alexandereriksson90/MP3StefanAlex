package documentElements;

import docParser.DocumentVisitor;

public class TextElement extends Element
{
	protected String elementText;

	public TextElement(String elementText)
	{
		this.elementText = elementText;
	}

	@Override
	public void accept(DocumentVisitor visitor)
	{
		visitor.visit(this);
	}

	@Override
	public String getText()
	{
		return elementText;
	}

}
