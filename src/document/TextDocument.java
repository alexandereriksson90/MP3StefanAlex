package document;

import java.util.List;

import documentElements.Element;

public abstract class TextDocument
{
	public abstract void print();
	
	public abstract void addElement(Element element);
	
	public abstract List<Element> getElements();

}
