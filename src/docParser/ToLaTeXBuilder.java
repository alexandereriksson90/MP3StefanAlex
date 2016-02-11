package docParser;

import document.LaTeXDocument;
import document.TextDocument;
import documentElements.BulletListElement;
import documentElements.HeadingElement;
import documentElements.ParagraphElement;
import documentElements.TableElement;
import documentElements.TextElement;

public class ToLaTeXBuilder extends DocumentBuilder
{
	
	LaTeXDocument document;
	public ToLaTeXBuilder()
	{
		document = new LaTeXDocument();
	}
	
	@Override
	public void preamble()
	{
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void postamble()
	{
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void addParagraph(ParagraphElement p)
	{
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void addBulletList(BulletListElement b)
	{
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void addHeading(HeadingElement h)
	{
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void addTable(TableElement t)
	{
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void addText(TextElement t)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public TextDocument build()
	{
		// TODO Auto-generated method stub
		return null;
	}


}
