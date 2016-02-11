package document;

import java.util.List;

import documentElements.Element;

public class PlainTextDocument extends TextDocument
{
	private StringBuffer sb;
	public PlainTextDocument()
	{
		sb = new StringBuffer();
	}
	@Override
	public void print()
	{
		
		
	}
	public void addElement(Element ste)
	{
		sb.append(ste.getText());
	}
	@Override
	public List<Element> getElements()
	{
		
		return null;
	}

	

}
