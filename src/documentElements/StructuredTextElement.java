package documentElements;

import docParser.DocumentVisitor;

public abstract class StructuredTextElement
{

	public void accept(DocumentVisitor visitor)
	{
		
		
	}
	
	public abstract String getText();
		
	public abstract void addElement();
	

}
