package Abstraction;

import java.util.List;

public class EmployeeReport implements Report 
{
    @Override
    public List<Object> run(ReportContext reportContext) {
        //Custom Logic
        System.out.println("Executing employee report");
        return null;
    }
}
