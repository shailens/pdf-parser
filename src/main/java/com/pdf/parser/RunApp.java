package com.pdf.parser;

import java.io.File;

public class RunApp {

    public static void  main(String[] args) throws Exception{
       /* OCRReader ocr = new OCRReader();
        String val = ocr.doOCR(new File("C:\\workspace\\documents\\PDF1.pdf"));*/
        PDFParser pdfParser = new PDFParser();
        System.out.println(pdfParser.readPDF(new File("C:\\workspace\\documents\\IPruLoanProtect_Form ID 29.pdf")));

    }
}
