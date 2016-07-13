package com.Itext.demo;

import java.io.FileOutputStream;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.VerticalPositionMark;

public class Code128 {

		public static void main(String[] args) throws Exception {

			Document document = new Document(PageSize.A4);
			document.addAuthor("Rishabh");
			document.addTitle("Test");
			PdfWriter writer = PdfWriter.getInstance(document,new FileOutputStream("C:\\Users\\Rishabh Jain\\Desktop\\New1.pdf"));
				writer.setViewerPreferences( PdfWriter.HideMenubar | PdfWriter.HideToolbar | PdfWriter.HideWindowUI );
				document.open();
				writer.addJavaScript("this.print({bUI : false , bSilent : true , bShrinkToFit : true});",false);
				Font font1 = new Font(Font.FontFamily.HELVETICA  , 15, Font.BOLD);			

				Paragraph para = new Paragraph("Rainbow Mohali",font1);
				Chunk chunk = new Chunk(new VerticalPositionMark());
				para.add(new Chunk(chunk));
				para.add("Rainbow Mohali");

				Image img=Image.getInstance("C:\\Users\\Rishabh Jain\\Desktop\\Test1.png");
				
				Paragraph paragraph = new Paragraph(Chunk.NEWLINE);
				document.add(paragraph);
				document.add(paragraph);
				document.add(paragraph);
				
				document.add(para);
				
				img.setAbsolutePosition(10 ,640);
				document.add(img);
				img.setAbsolutePosition(370 ,640);
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
				img.setAbsolutePosition(10 ,480);
				document.add(img);
				img.setAbsolutePosition(370 ,480);
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
				img.setAbsolutePosition(10 ,310);
				document.add(img);
				img.setAbsolutePosition(370 ,310);
				document.add(img);

				

				document.add(paragraph);
				document.add(paragraph);
				document.add(paragraph);
				document.add(paragraph);
				document.add(paragraph);
				document.add(paragraph);
				document.add(paragraph);
				document.add(para);
				img.setAbsolutePosition(10 ,160);
				document.add(img);
				img.setAbsolutePosition(370 ,160);
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
				img.setAbsolutePosition(10 ,0);
				document.add(img);
				img.setAbsolutePosition(370 ,0);
				document.add(img);
			
				
				document.close();
		}
	}
