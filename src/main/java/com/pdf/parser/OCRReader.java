package com.pdf.parser;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.Tesseract1;
import org.apache.log4j.Logger;

import java.io.File;

public class OCRReader {

    private static final Logger LOGGER = Logger.getLogger(OCRReader.class);

    public String doOCR(File file) {
        LOGGER.info("OCR ENGINE reading input file : START");
        String retVal = "";
        try {
            Tesseract tess = new Tesseract();
            retVal = new Tesseract1().doOCR(file);
        } catch (Exception e) {
            LOGGER.error("OCR Engine Failed to read file " + e);
        }
        LOGGER.info("OCR ENGINE reading input file : END");
        return retVal;
    }


}
