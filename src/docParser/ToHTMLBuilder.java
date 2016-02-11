package docParser;

import document.HTMLDocument;
import document.TextDocument;
import documentElements.BulletListElement;
import documentElements.HeadingElement;
import documentElements.ParagraphElement;
import documentElements.TableElement;
import documentElements.TextElement;

public class ToHTMLBuilder extends DocumentBuilder
{
	HTMLDocument doc;
	public ToHTMLBuilder()
	{
		doc = new HTMLDocument();
	}
	
	@Override
	public TextDocument build()
	{
		return doc;
	}
	@Override
	public void preamble() 
	{
		doc.setUpDocument();
		System.out.println("i preamblen ");
	}
	
	@Override
	public void postamble()
	{
		System.out.println("i postamblen ");
		doc.setEndOfDocument();
	}
	
	@Override
	public void addParagraph(ParagraphElement p)
	{
		System.out.println("i paran " +p.getText());
		doc.addParagraph(p);
	}
	
	@Override
	public void addBulletList(BulletListElement b)
	{
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void addHeading(HeadingElement h)
	{
		System.out.println("i headingen " +h.getText());
		doc.addHeading(h);
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

}
