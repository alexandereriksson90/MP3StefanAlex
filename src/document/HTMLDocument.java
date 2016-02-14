package document;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import documentElements.BulletList;
import documentElements.Element;
import documentElements.Heading;
import documentElements.Paragraph;

public class HTMLDocument extends PlainTextDocument
{
	private FileWriter fw;
	private File file;

	public HTMLDocument()
	{

		try
		{
			file = new File("testFiles/HTMLWriteTest.html");
			fw = new FileWriter(file);

		} catch (IOException e)
		{
			e.printStackTrace();
		}

	}

	public void setUpDocument()
	{
		sb.append("<!DOCTYPE html> \n <html> \n <head> \n <meta charset=ISO-8859-1\n");
		sb.append("<title></title> \n</head><body>\n");
	}

	public void addParagraph(Paragraph pe)
	{
		sb.append("<p>" + pe.getText() + "</p> \n ");
	}

	public void addHeading(Heading he)
	{
		sb.append("<h1>" + he.getText() + "</h1> \n ");
	}

	public void addBulletList(BulletList bl)
	{
		sb.append("<ul> \n");
		for (Element bulletElement : bl.getElements())
		{
			sb.append("<li>" + bulletElement.getText() + "</li> \n");
		}
		sb.append("</ul> \n");
	}

	public void setEndOfDocument()
	{
		sb.append("</body> \n </html>");
	}

	@Override
	public void print()
	{
		try
		{
			fw.write(sb.toString());
			fw.close();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
