package docParser;

import document.LaTeXDocument;
import document.TextDocument;
import documentElements.BulletList;
import documentElements.CompositeElement;
import documentElements.Heading;
import documentElements.Paragraph;
import documentElements.Table;

public class ToLaTeXBuilder implements DocumentBuilder
{
	
	LaTeXDocument document;
	public ToLaTeXBuilder()
	{
		document = new LaTeXDocument();
	}
	
	@Override
	public void postamble()
	{
		
	}
	
	@Override
	public void addParagraph(Paragraph p)
	{
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void addBulletList(BulletList b)
	{
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void addHeading(Heading h)
	{
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void addTable(Table t)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public TextDocument build()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addCompositeElement(CompositeElement ce)
	{
		// TODO Auto-generated method stub
		
	}


	@Override
	public void preamble()
	{
		// TODO Auto-generated method stub
		
	}


}
