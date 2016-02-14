package model;

import docParser.DocumentBuilder;
import docParser.StructuredTextDocumentParser;
import document.StructuredTextDocument;
import document.TextDocument;
import documentElements.Element;
import factories.StructuredTextElementFactory;
import factories.DocumentBuilderSingletonFactory;
import factories.ElementFactory;

public class Test
{

	public void testRun()
	{
		ElementFactory factory = StructuredTextElementFactory.getInstance();
		TextDocument document = new StructuredTextDocument();
		buildDocument(document, factory);
		document.print();
		DocumentBuilder converter = DocumentBuilderSingletonFactory.getInstance().createToHTMLBuilder();
		StructuredTextDocumentParser parser = new StructuredTextDocumentParser();
		parser.parse(document, converter);
		converter.build().print();
		DocumentBuilder converter2 = DocumentBuilderSingletonFactory.getInstance().createToLaTeXBuilder();
		parser.parse(document, converter2);
		converter2.build().print();
	}

	private void buildDocument(TextDocument doc, ElementFactory factory)
	{ 
		
		
		
		doc.addElement(factory.createHeading("Uppdraget"));
		doc.addElement(factory.createParagraph("Det här är ett roligt miniprojekt ..."));
		doc.addElement(factory.createHeading("Lista över viktiga saker"));		
		

		
		
		Element list = factory.createBulletList();
		list.addElement(factory.createTextElement("För det första..."));
		list.addElement(factory.createTextElement("För det andra..."));
		list.addElement(factory.createTextElement("För det tredje..."));

		
		
		doc.addElement(list);
	
		
	
	}

}
