package document;

import java.util.ArrayList;
import java.util.List;

import documentElements.Element;

public class StructuredTextDocument extends TextDocument
{
	ArrayList<Element> elementList = new ArrayList<Element>();

	public List<Element> getElements()
	{
		return elementList;
	}

	public void addElement(Element e)
	{
		elementList.add(e);
	}

	public void print()
	{
		System.out.println(elementList);

	}

}
