import java.util.HashMap;
import java.util.Map;

public class ReportGenerator {
    private Map<String, Report> reports = new HashMap<>();

    public ReportGenerator(){}

    public Report generateReport(String data,String format,String type) throws InterruptedException {
        Report reportsToReturn = reports.get(type);
        if(reportsToReturn==null)
        {
            System.out.println("Reports need to be created");
            if(type=="SalesReport")
                reportsToReturn = new SalesReport();
            else
            {
                //other case(s)
            }
            this.reports.put(type, reportsToReturn);
        }
        return reportsToReturn.clone();
    }

}
