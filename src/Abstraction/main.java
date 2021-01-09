package Abstraction;

public class main {
	
		    public static void main(String[] args) {
	         
	        ReportContext reportContext = new ReportContext();
	        //Populate context
	         
	        Report eReport = new EmployeeReport();
	        eReport.run(reportContext);
	         
	        Report sReport = new SalaryReport();
	        sReport.run(reportContext);
	    }
	}


