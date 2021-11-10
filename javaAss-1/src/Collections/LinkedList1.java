package Collections;
import java.text.*;
import java.util.*;
public class LinkedList1 {
	
	    public static void main(String args[]) throws ParseException {
	        String BirthDate1="02-03-2000";
	        String BirthDate2="04-08-1997";
	        Date x=new SimpleDateFormat("dd-mm-yyyy").parse(BirthDate1);
	        Date y=new SimpleDateFormat("dd-mm-yyyy").parse(BirthDate2);

	        LinkedList<Date> dateList = new LinkedList<Date>();
	        dateList.add(x);
	        dateList.add(y);
	        
	        int i=dateList.size()-1;
	        while(i>=0)
	        {
	            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
	            String strDate= formatter.format(dateList.get(i));
	            System.out.print("Your date of Birth is "+strDate + " ");
	            int year=1900+dateList.get(i).getYear();
	            if(year%4==0)
	            {
	                System.out.println("it was a leap year");
	            }
	            else
	            {
	                System.out.println("It was not a leap year");
	            }
	            i--;
	        }

	    }

	}

