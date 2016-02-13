package document;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import documentElements.BulletList;
import documentElements.Element;
import documentElements.Heading;
import documentElements.Paragraph;

public class LaTeXDocument extends PlainTextDocument
{
	private FileWriter fw;
	private File file;

	public LaTeXDocument()
	{

		try
		{
			file = new File("testFiles/LaTeXWriteTest.tex");
			fw = new FileWriter(file);

		} catch (IOException e)
		{
			e.printStackTrace();
		}

	}

	public void setUpDocument()
	{
		sb.append("\\documentclass{article} \n\\usepackage[utf8]{inputenc} \n\\usepackage[english,swedish]{babel} \n\\begin{document} \n");
	}

	public void addParagraph(Paragraph pe)
	{
		sb.append("\\par \n"+ pe.getText() +"\n");
	}
	
	public void addBulletList(BulletList bl)
	{
		sb.append("\\begin{itemize} \n");
		
		for(Element bulletElement : bl.getElements())
		{
			sb.append("\\item "+bulletElement.getText()+"\n");
		}
		sb.append("\\end{itemize} \n");
	}

	public void addHeading(Heading he)
	{
		sb.append("\\section*{"+ he.getText() +"}\n");
	}

	public void setEndOfDocument()
	{
		sb.append("\\end{document}");
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
