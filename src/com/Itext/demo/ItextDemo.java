package com.Itext.demo;

import java.io.FileOutputStream;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.VerticalPositionMark;

public class ItextDemo {

	public static void main(String[] args) throws Exception {

		Document document = new Document(PageSize.A4);
		document.addAuthor("Rishabh");
		document.addTitle("Test");
		PdfWriter writer = PdfWriter.getInstance(document,new FileOutputStream("C:\\Users\\Rishabh Jain\\Desktop\\New3.pdf"));
			writer.setViewerPreferences( PdfWriter.HideMenubar | PdfWriter.HideToolbar | PdfWriter.HideWindowUI );
			document.open();
			writer.addJavaScript("this.print({bUI : false , bSilent : true , bShrinkToFit : true});",false);
			Font font1 = new Font(Font.FontFamily.HELVETICA  , 15, Font.BOLD);			

			Paragraph para = new Paragraph("Rainbow Mohali",font1);
			para.setIndentationLeft(60);
			Chunk chunk = new Chunk(new VerticalPositionMark());
			para.add(new Chunk(chunk));
			para.add("Rainbow Mohali");
			para.setIndentationRight(56);
			Image img=Image.getInstance("C:\\Users\\Rishabh Jain\\Desktop\\Test3.png");
			
			Paragraph paragraph = new Paragraph(Chunk.NEWLINE);
			document.add(paragraph);
			document.add(paragraph);
			document.add(paragraph);
			document.add(paragraph);
			document.add(para);
			
			img.setAbsolutePosition(40 ,640);
			document.add(img);
			img.setAbsolutePosition(334 ,640);
			document.add(img);

			document.add(paragraph);
			document.add(paragraph);
			document.add(paragraph);
			document.add(paragraph);
			document.add(paragraph);
			document.add(paragraph);
			document.add(paragraph);
			document.add(paragraph);
			document.add(para);
			img.setAbsolutePosition(40 ,480);
			document.add(img);
			img.setAbsolutePosition(334 ,480);
			document.add(img);

			
			document.add(paragraph);
			document.add(paragraph);
			document.add(paragraph);
			document.add(paragraph);
			document.add(paragraph);
			document.add(paragraph);
			document.add(paragraph);
			document.add(paragraph);
			document.add(para);
			img.setAbsolutePosition(40 ,310);
			document.add(img);
			img.setAbsolutePosition(334 ,310);
			document.add(img);

			

			document.add(paragraph);
			document.add(paragraph);
			document.add(paragraph);
			document.add(paragraph);
			document.add(paragraph);
			document.add(paragraph);
			document.add(paragraph);
			document.add(para);
			img.setAbsolutePosition(40 ,160);
			document.add(img);
			img.setAbsolutePosition(334 ,160);
			document.add(img);

			

			document.add(paragraph);
			document.add(paragraph);
			document.add(paragraph);
			document.add(paragraph);
			document.add(paragraph);
			document.add(paragraph);
			document.add(paragraph);
			document.add(paragraph);
			document.add(para);
			img.setAbsolutePosition(40 ,0);
			document.add(img);
			img.setAbsolutePosition(334 ,0);
			document.add(img);
		
			
			document.close();
	}
}
