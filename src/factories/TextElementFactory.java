package factories;

import documentElements.TextElement;

public class TextElementFactory
{
	public static TextElement getInstance()
	{
		try {
            return (TextElement) Class.forName("documentElements.Element").newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            throw new RuntimeException(ex);
        }
	}
}
