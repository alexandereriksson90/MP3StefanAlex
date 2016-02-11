package documentElements;

import docParser.DocumentVisitor;

public abstract class StructuredTextElement implements Element
{
	public abstract void accept(DocumentVisitor visitor);
	
	public abstract String getText();
		
	public abstract void addElement(StructuredTextElement e);
	

}
