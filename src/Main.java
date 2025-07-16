class FacturationHelper {
    public static void processFacturation(String item) {
        System.out.println("Start invoicing: " + item);
        System.out.println("Invoice created for " + item);
    }
}

class InvoicingService {
    public void invoiceProduct(String product) {
        FacturationHelper.processFacturation(product);
    }

    public void invoiceService(String service) {
        FacturationHelper.processFacturation(service);
    }
}

public class Main {
    public static void main(String[] args) {
        InvoicingService service = new InvoicingService();
        service.invoiceProduct("Laptop");
        service.invoiceService("Maintenance contract");
    }
}