package RegularExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateDate {

	public static void main(String[] args) {
		
		//Java date validation regex – allow leading zeros to be omitted
		
		List<String> dates = new ArrayList();
		
		dates.add("1/1/11");
		dates.add("01/01/11");
		dates.add("01/01/2011");
		dates.add("01/1/2011");
		dates.add("1/11/2011");
		dates.add("1/11/11");
		dates.add("11/1/11");
		 
		String regex = "^[0-3]?[0-9]/[0-3]?[0-9]/(?:[0-9]{2})?[0-9]{2}$";
		 
		Pattern pattern = Pattern.compile(regex);
		 
		for(String date : dates)
		{
		    Matcher matcher = pattern.matcher(date);
		    System.out.println(date +" : "+ matcher.matches());
		}

	}

}
