package factories;

import documentElements.StructuredTextElement;

public class StructuredTextElementFactory
{

	public static StructuredTextElement getInstance()
	{
		try {
            return (StructuredTextElement) Class.forName("documentElements.StructuredTextElement").newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            throw new RuntimeException(ex);
        }
	}

}
