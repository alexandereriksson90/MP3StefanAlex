package factories;

import docParser.DocumentBuilder;

public class DocumentBuilderFactory
{

	public static DocumentBuilder getInstance()
	{
		 try {
	            return (DocumentBuilder) Class.forName("docParser.DocumentBuilder").newInstance();
	        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
	            throw new RuntimeException(ex);
	        }
	}

}
