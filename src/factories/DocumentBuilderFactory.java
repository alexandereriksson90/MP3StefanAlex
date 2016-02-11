package factories;

import docParser.DocumentBuilder;

public class DocumentBuilderFactory
{

	public static DocumentBuilder getInstance(String id)
	{
		 try {
	            return (DocumentBuilder) Class.forName("docParser."+ id +"Builder").newInstance();
	        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
	            throw new RuntimeException(ex);
	        }
	}

}
