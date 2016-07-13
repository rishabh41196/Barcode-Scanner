package com.generator;
	
import java.awt.Rectangle;
import java.io.File;

import com.itextpdf.awt.geom.Dimension;

import net.sourceforge.barbecue.Barcode;
import net.sourceforge.barbecue.BarcodeFactory;
import net.sourceforge.barbecue.BarcodeImageHandler;

public class Barbeque {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//Barcode barcode = BarcodeFactory.createCode128("0201D0240B1000003");
		Barcode barcode = BarcodeFactory.createEAN13("123412341234");
		//barcode.setBarWidth(3);
		//barcode.setBounds(0, 0, 0, 0);
		File f = new File("C:\\Users\\Rishabh Jain\\Desktop\\Test3.png");
        BarcodeImageHandler.savePNG(barcode, f);
	}

}
