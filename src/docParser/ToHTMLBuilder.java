package docParser;

import document.HTMLDocument;
import document.TextDocument;
import documentElements.BulletList;
import documentElements.CompositeElement;
import documentElements.Heading;
import documentElements.Paragraph;
import documentElements.Table;

public class ToHTMLBuilder implements DocumentBuilder
{
	HTMLDocument document;
	public ToHTMLBuilder()
	{
		document = new HTMLDocument();
	}
	
	@Override
	public TextDocument build()
	{
		return document;
	}
	@Override
	public void preamble() 
	{
		document.setUpDocument();
	}
	
	@Override
	public void postamble()
	{
		document.setEndOfDocument();
	}
	
	@Override
	public void addParagraph(Paragraph p)
	{
		document.addParagraph(p);
	}
	
	@Override
	public void addBulletList(BulletList b)
	{
		
	}
	
	@Override
	public void addHeading(Heading h)
	{
		document.addHeading(h);
	}
	
	@Override
	public void addTable(Table t)
	{
		
	}

	@Override
	public void addCompositeElement(CompositeElement ce)
	{
		
	}

}
