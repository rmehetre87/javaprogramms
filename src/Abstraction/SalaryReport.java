package Abstraction;

import java.util.List;

public class SalaryReport implements Report 
{
    @Override
    public List<Object> run(ReportContext reportContext) {
        //Custom logic
        System.out.println("Executing salary report");
        return null;
    }
}
