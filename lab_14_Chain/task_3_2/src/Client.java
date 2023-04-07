

public class Client {
    public static void main(String[] args) {

        String[] files = {
                "image.jpg",
                "image.png",
                "document.docx",
                "document.doc",
                "table.xls",
                "table.xlsx",
                "presentation.pptx",
                "document.pdf",
                "presentation1.ppt",
                "file.unknown"
        };
        HandlersManager handlersManager = new HandlersManager();
        Handler handler = handlersManager.getHandler();
        // Create Chain of responsibility to open file by correct program according to the extension.
        for (String file : files) {
            handler.open(file);
        }


    }
}
