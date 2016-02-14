package factories;

import documentElements.BulletList;
import documentElements.Element;
import documentElements.Heading;
import documentElements.Paragraph;
import documentElements.TextElement;

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
		return new Heading(heading);
	}

	public Element createParagraph(String paragraph)
	{
		return new Paragraph(paragraph);
	}


	public Element createBulletList()
	{
		return new BulletList();
	}

	@Override
	public Element createTextElement(String string)
	{
		return new TextElement(string);
	}
	
}
