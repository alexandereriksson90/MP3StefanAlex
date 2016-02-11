package document;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import documentElements.HeadingElement;
import documentElements.ParagraphElement;

public class HTMLDocument extends PlainTextDocument
{
	private FileWriter fw;
	private BufferedWriter bw;
	private File file;
	
	public HTMLDocument()
	{
		try
		{
			file = new File("testFiles/HTMLWriteTest.html");
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}
	public void setUpDocument()
	{
		try
		{
			bw.write("<!DOCTYPE html> \n <html> \n <head> \n <meta charset=ISO-8859-1\n");
			bw.write("<title>HtmlTest</title> \n</head><body>\n");
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void addParagraph(ParagraphElement pe)
	{
		try
		{
			System.out.println("i doc" + pe.getText());
			bw.write("<p>"+ pe.getText() +"</p> \n ");
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void addHeading(HeadingElement he)
	{
		try
		{
			System.out.println("i doc" + he.getText());
			bw.write("<h1>"+ he.getText() +"</h1> \n ");
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void setEndOfDocument()
	{
		try
		{
			bw.write("</body></html>");
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	@Override
	public void print()
	{
		try
		{
			bw.close();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
}
