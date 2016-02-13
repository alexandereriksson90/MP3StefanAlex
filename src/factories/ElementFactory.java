package factories;

import java.util.ArrayList;

import documentElements.Element;

public abstract class ElementFactory
{
	public static ElementFactory getInstance()
	{
		try {
            return (ElementFactory) Class.forName("factories.ElementFactory").newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            throw new RuntimeException(ex);
        }
	}

	public abstract Element createHeading(String string);

	public abstract Element createParagraph(String string);
	
	public abstract Element createBulletList();
	
	public abstract Element createTextElement(String string);


	
}
