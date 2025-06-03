//this example violates the Interface Segregation Principle
//To violate the interface segregation principle, the interface is designed to be too broad.
// This means that clients are forced to implement methods they do not use.

public interface MultiFunctionPrinter {
    void printDocument(String document);
    void scanDocument(String document);
    void faxDocument(String document);
}

public class MultiFunctionPrinterImpl implements MultiFunctionPrinter {
    @Override
    public void printDocument(String document) {
        System.out.println("Printing document: " + document);
    }

    @Override
    public void scanDocument(String document) {
        System.out.println("Scanning document: " + document);
    }

    @Override
    public void faxDocument(String document) {
        System.out.println("Faxing document: " + document);
    }
}
