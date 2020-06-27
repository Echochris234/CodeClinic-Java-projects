import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
public class BpTrend {

	public static void main(String[] args) {
		//String result;
		//Date from,to;
		String from, to=null;
		ArrayList<WeatherEntry> collectedData = new ArrayList<>();
		String f1="./2012.txt";
		String f2="./2013.txt";
		String f3="./2014.txt";
		String f4="./2015.txt";
		
		//static DateFormat format = new SimpleDateFormat("YYYY_MM_DD HH:MM:SS");
		readData(f1, collectedData);
		readData(f2, collectedData);
		readData(f3, collectedData);
		readData(f4, collectedData);
		
		System.out.println("There are "+collectedData.size()+" Records currently read in");
		System.out.println();
		Scanner in = new Scanner(System.in);
		
		//Enter a date of the form "yyyy/MM/dd  HH:mm:ss"
		// yyyy '/' 4 digit date starting from 2012->2015
		
		// MM '/'  2 digit month code 01->12
		// dd 2 digit day code 01->30
		// (space)
		
		// HH ':' 2 digit hour code 00(12)-(11)
		// mm ':' 2 digit minuite code 00-60
		// ss 2 digit second code 00-60
		// as a string 
		
		/*    EXAMPLE INPUT
		 * 	
		 	from ="2013/05/03 00:20:43";
		
			to= "2013/07/03 00:20:32";
		 * 
		 */
		String start=null;
		String year,month,day="0";
		
		//DATE INPUT
		
		do {
		System.out.println("enter 4 digit year ranging from 2012-2015");
		 year = in.next();
		}while(Integer.parseInt(year)<2012 || Integer.parseInt(year)>2015);
		
		
		do {
			System.out.println("enter 2 digit Month ranging from 01-12");
			 month = in.next();
			 if(month.length()==1) {
				 month="0"+month;
			 }
			}while(Integer.parseInt(month)<01 || Integer.parseInt(month)>12);
		
		
		do {
			System.out.println("enter 2 digit day ranging from 01-30");
			 day = in.next();
			 if(day.length()==1) {
				 day="0"+day;
			 }
			}while(Integer.parseInt(day)<01 || Integer.parseInt(day)>30);
		
		
		
		//TIME INPUT
		String hour,min,sec="0";
		
		do {
			System.out.println("enter 2 digit hour ranging from 0-23");
			 hour = in.next();
			 if(hour.length()==1) {
				 hour="0"+hour;
			 }
			}while(Integer.parseInt(hour)<0 || Integer.parseInt(hour)>23);
		//	
		
		do {
			System.out.println("enter 2 digit minutes ranging from 0-59");
			 min = in.next();
			 if(min.length()==1) {
				 min="0"+min;
			 }
			}while(Integer.parseInt(min)<0 || Integer.parseInt(min)>59);
		//	
		
		do {
			System.out.println("enter 2 digit seconds ranging from 0-59");
			 sec = in.next();
			 if(sec.length()==1) {
				 sec="0"+sec;
			 }
			}while(Integer.parseInt(sec)<0 || Integer.parseInt(sec)>59);
	
		//from =year+month+day+hour+min+sec;
		
		
		
		
		// TO//
		String year2,month2,day2="0";
		
		
		do {
			System.out.println("enter 4 digit year ranging from"+ year+"-2015");
			 year2 = in.next();
			 if(Integer.parseInt(year2)<Integer.parseInt(year)) {
				 System.out.println("Plese choose a year at or after year: "+ year);
			 }
			}while(Integer.parseInt(year)<2012 || Integer.parseInt(year)>2015
					||Integer.parseInt(year2)<Integer.parseInt(year));
			//year+="/";
		
		
		do {
			System.out.println("enter 2 digit Month ranging from 01-12");
			 month2 = in.next();
			 
			 if(month2.length()==1) {
				 month2="0"+month2;
			 }
			 
			 if(Integer.parseInt(year2)==Integer.parseInt(year)&&
					 Integer.parseInt(month2)<Integer.parseInt(month)) {
				
					 System.out.println(" please choose a month after month or at month "+ month);
					 month2+="100"; 
			 }
			}while(Integer.parseInt(month2)<01 || Integer.parseInt(month2)>12);
		
		
		
		
		
		do {
			System.out.println("enter 2 digit day ranging from 01-30");
			 day2 = in.next();
			 if(day2.length()==1) {
				 day="0"+day;
			 }
			 if(Integer.parseInt(year2)==Integer.parseInt(year)&&
				Integer.parseInt(month2)==Integer.parseInt(month)&&
				Integer.parseInt(day2)<Integer.parseInt(day)) {
				 
						System.out.println(" please choose a day after or at day: "+ day);
					 day2+="100"; 
					 }
					
			 
			}while(Integer.parseInt(day2)<01 || Integer.parseInt(day2)>30);
		
		
		
		String hour2,min2,sec2="0";
		
		do {
			System.out.println("enter 2 digit hour ranging from 0-23");
			 hour2 = in.next();
			 if(hour2.length()==1) {
				 hour2="0"+hour2;
			 }
			 if(Integer.parseInt(year2)==Integer.parseInt(year)&&
				Integer.parseInt(month2)==Integer.parseInt(month)&&
				Integer.parseInt(day2)==Integer.parseInt(day)&&
				Integer.parseInt(hour2)<Integer.parseInt(hour)) {
				 System.out.println(" please choose an hour after or at hour: "+ hour);
				 hour2+="100"; 
				 
			 }
			 
			 
			}while(Integer.parseInt(hour2)<0 || Integer.parseInt(hour2)>23);
		
		
		
		do {
			System.out.println("enter 2 digit minutes ranging from 0-59");
			 min2 = in.next();
			 if(min2.length()==1) {
				 min2="0"+min2;
			 }
			 
			 if(Integer.parseInt(year2)==Integer.parseInt(year)&&
				Integer.parseInt(month2)==Integer.parseInt(month)&&
				Integer.parseInt(day2)==Integer.parseInt(day)&&
				Integer.parseInt(hour2)==Integer.parseInt(hour)&&
				Integer.parseInt(min2)<Integer.parseInt(min)) {
						
				 System.out.println(" please choose minutes after or at minute: "+ min);
						 min2+="100"; 
						 
					 }
			 
			 
			 
			}while(Integer.parseInt(min2)<0 || Integer.parseInt(min2)>59);
		
		
		
		do {
			System.out.println("enter 2 digit seconds ranging from 0-59");
			 sec2 = in.next();
			 if(sec2.length()==1) {
				 sec2="0"+sec2;
				 
				 if(Integer.parseInt(year2)==Integer.parseInt(year)&&
					Integer.parseInt(month2)==Integer.parseInt(month)&&
					Integer.parseInt(day2)==Integer.parseInt(day)&&
					Integer.parseInt(hour2)==Integer.parseInt(hour)&&
					Integer.parseInt(min2)==Integer.parseInt(min)&&
					Integer.parseInt(sec2)<Integer.parseInt(sec)){
									
					System.out.println(" please choose seconds after or at seconds: "+ sec);
					sec2+="100"; 
									 
								 }
						 
				 
				 
				 
			 }
			}while(Integer.parseInt(sec)<0 || Integer.parseInt(sec)>59);
		//year+="/";//month+="/";//day+=" ";hour+=":";min+=":";
		
		year+="/";
		month+="/";
		day+=" ";
		hour+=":";
		min+=":";
		from=year+month+day+hour+min+sec;
		
		
		year2+="/";
		month2+="/";
		day2+=" ";
		hour2+=":";
		min2+=":";
		to=year2+month2+day2+hour2+min2+sec2;
		
		//from ="2012/12/03 00:20:43";
		
		//to= "2013/07/03 00:20:32";
		//System.out.println(from+"\t\t"+to);
		
		// enter second date with similar format as previous make sure date
		// is after the first date 
		
		System.out.println(docalc(from,  to, collectedData));
		
		from ="2012/12/03 00:20:43";
		
		to= "2012/12/03 00:20:52";
				
		
		System.out.println(docalc(from,  to, collectedData));
		
		
		from ="2012/12/03 00:20:43";
		
		to= "2012/12/03 00:40:52";
				
		
		System.out.println(docalc(from,  to, collectedData));
		
		from ="2013/1/03 00:20:43";
		
		to= "2013/2/03 00:40:52";
				
		
		System.out.println(docalc(from,  to, collectedData));
		
		

	}
	
	
	private static String docalc(String from, String to, ArrayList<WeatherEntry> collectedData) {
		DateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date d1= null;
		Date d2=null;
		try {
			d1 = (format.parse(from));
			d2 = (format.parse(to));
		}catch(Exception e){
			e.getMessage();
			
		}
		
		String result="from : "+ format.format(d1)+" to: "+format.format(d2)+"\n";
		
		WeatherEntry y1 =null;
		WeatherEntry y2=null;
		int idx =0, x1=0, x2=0;
		
		// traverse through the collection(collectedData)
		for(WeatherEntry x: collectedData) {
			if( (y1==null)&& x.getDate().compareTo(d1)>=0) {
				y1=x;
				x1=idx;
			}if(x.getDate().compareTo(d2)>=0) {
				x2=idx;
				y2=x;
				break;
			}
			idx++;
			
		}
		
		
		double slope =((y2.getBp()-y1.getBp())/(x2-x1));
		result+="The Barometric pressure slope is "+
		String.format("%.6f",slope) + "\n the forecast is: ";
		if(slope<0) {
			result+= "Bad weather is coming in";
		}else if(slope==0) {
			result+="Continious steady weather";
		}else {
			result+="Good weather is heading our way"; 
		}
		
		//System.out.println(result);
		return result;
	}


	public static void readData(String fileName,ArrayList<WeatherEntry> collectedData) {
	DateFormat format = new SimpleDateFormat("yyyy_MM_dd hh:mm:ss");
		try {
			BufferedReader in = new BufferedReader(new FileReader (fileName));
			String line = null;
			String [] tokens;
			Date date = new Date ();
		
			do {
				line= in.readLine();
				if(Character.isLetter(line.charAt(0))) {
					line=in.readLine();
				}else {
			
			
					tokens = line.split("\t");
			
					
					date= format.parse(tokens[0]);
					//System.out.println("formated"+date.toString());
					double airTemp = Double.valueOf(tokens[1]);
					double pressure = Double.valueOf(tokens[2]);
					double dewPoint = Double.valueOf(tokens[3]);
					double rH = Double.valueOf(tokens[4]);
					double windDir = Double.valueOf(tokens[5]);
					double windGust = Double.valueOf(tokens[6]);
					double windSpeed= Double.valueOf(tokens[7]);
		
					
					WeatherEntry data = new WeatherEntry(date,airTemp,
							pressure,dewPoint,rH,windDir,windGust,windSpeed);
					
				//System.out.println(data);
					collectedData.add(data);
					
				}
				
				}while(in.readLine()!=null);
				in.close();
				
				
			}catch(Exception e) {
				e.getMessage();
			
				
			
			
		}
	}

}
