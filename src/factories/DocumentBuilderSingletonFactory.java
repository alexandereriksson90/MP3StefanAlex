package factories;

import docParser.DocumentBuilder;
import docParser.ToHTMLBuilder;
import docParser.ToLaTeXBuilder;

public class DocumentBuilderSingletonFactory
{
	private static DocumentBuilderSingletonFactory builderFactory;
	private static ToHTMLBuilder htmlBuilder;
	private static ToLaTeXBuilder laTeXBuilder;

	public static DocumentBuilderSingletonFactory getInstance()
	{
		if (builderFactory == null)
		{
			builderFactory = new DocumentBuilderSingletonFactory();
		}
		return builderFactory;
	}

	public DocumentBuilder createToHTMLBuilder()
	{
		if (htmlBuilder == null)
		{
			htmlBuilder = new ToHTMLBuilder();
		}
		return htmlBuilder;
	}

	public DocumentBuilder createToLaTeXBuilder()
	{
		if (laTeXBuilder == null)
		{
			laTeXBuilder = new ToLaTeXBuilder();
		}
		return laTeXBuilder;
	}

}
