interface ReportExporter {

    void exportToCSV(String data);
    void exportToPDF(String data);

    // New default feature
    default void exportToJSON(String data) {
        System.out.println("Exporting data to JSON (default): " + data);
    }
}

class CSVExporter implements ReportExporter {
    public void exportToCSV(String data) {
        System.out.println("CSV Export: " + data);
    }
    public void exportToPDF(String data) {
        System.out.println("PDF Export: " + data);
    }
}

public class ExportTest{
    public static void main(String[] args){
        ReportExporter exporter = new CSVExporter();
        exporter.exportToCSV("Sales Report");
        exporter.exportToPDF("Sales Report");
        exporter.exportToJSON("Sales Report"); // Uses default method
    }
}
