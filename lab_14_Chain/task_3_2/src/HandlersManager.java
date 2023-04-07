public class HandlersManager {
    public Handler getHandler(){
        Handler docHandler = new DOCHandler();
        Handler docxHandler = new DOCXHandler();
        Handler jpgHandler = new JPGHandler();
        Handler pngHandler = new PNGHandler();
        Handler pdfHandler = new PDFHandler();
        Handler pptxHandler = new PPTXHandler();
        Handler pptHandler = new PPTHandler();
        Handler xlsHandler = new XLSHandler();
        Handler xlsxHandler = new XLSXHandler();

        docHandler.setNext(docxHandler);
        docxHandler.setNext(jpgHandler);
        jpgHandler.setNext(pngHandler);
        pngHandler.setNext(pdfHandler);
        pdfHandler.setNext(pptxHandler);
        pptxHandler.setNext(pptHandler);
        pptHandler.setNext(xlsHandler);
        xlsHandler.setNext(xlsxHandler);

        return docHandler;
    }
}
