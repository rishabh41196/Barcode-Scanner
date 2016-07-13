package com.generator;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

import org.krysalis.barcode4j.impl.code128.Code128Bean;
import org.krysalis.barcode4j.output.bitmap.BitmapCanvasProvider;

public class Code128Generator {
	public static void main(String[] args) throws Exception {
			Code128Bean bean2 = new Code128Bean();
	
	final int dpi = 150;


	// Open output file
	File outputFile = new File("C:\\Users\\Rishabh Jain\\Desktop\\Test1.png");
	OutputStream out2 = new FileOutputStream(outputFile);
	try {
		BitmapCanvasProvider canvas2 = new BitmapCanvasProvider(out2, "image/x-png", dpi,
				BufferedImage.TYPE_BYTE_BINARY, false, 0);

		// Generate the barcode	
		bean2.setBarHeight(10);
		bean2.generateBarcode(canvas2, "123412341ADC234");
		
		// Signal end of generation
		canvas2.finish();
	} finally {
		out2.close();
	}
}

}
