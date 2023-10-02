package pl.designs.behavioral.nullobject;

public class ComplexService {

    private StorageService storage;

    private String reportName;

    public ComplexService(StorageService storage) {
        this.storage = storage;
    }

    public ComplexService(StorageService storage, String reportName) {
        this.storage = storage;
        this.reportName = reportName;
    }

    public void generateReport() {
     storage.save(new Report(reportName));
    }
}
