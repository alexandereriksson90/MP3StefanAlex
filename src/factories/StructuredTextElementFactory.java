package factories;

import documentElements.Element;
import documentElements.HeadingElement;
import documentElements.ParagraphElement;

public class StructuredTextElementFactory extends ElementFactory
{

	public static ElementFactory getInstance()
	{
		try {
            return (ElementFactory) Class.forName("factories.StructuredTextElementFactory").newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            throw new RuntimeException(ex);
        }
	}

	public Element createHeading(String heading)
	{
		return new HeadingElement(heading);
	}


	public Element createParagraph(String paragraph)
	{
		return new ParagraphElement(paragraph);
	}
	
}
