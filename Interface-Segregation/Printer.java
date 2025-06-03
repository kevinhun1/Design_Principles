// This example demonstrates the Interface Segregation Principle (ISP) in Java.
// We intend to create smaller, more specific interfaces that cater to the needs of individual clients.

// The `Printer` interface defines a contract for printing documents.
public interface Printer {
    void printDocument(String document);
}

public class DocumentPrinter implements Printer {
    @Override
    public void printDocument(String document) {
        System.out.println("Printing document: " + document);
    }
}
