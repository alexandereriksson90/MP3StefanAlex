package document;

import java.util.ArrayList;
import java.util.List;

import documentElements.StructuredTextElement;

public class StructuredTextDocument extends TextDocument
{
	ArrayList<StructuredTextElement> elementList = new ArrayList<StructuredTextElement>();
	
	public List<StructuredTextElement> getElements()
	{
		return elementList;
	}
	@Override
	public void addElement(StructuredTextElement ste)
	{
		elementList.add(ste);
	}
	@Override
	public void print()
	{
		// TODO Auto-generated method stub
		
	}
	
}
