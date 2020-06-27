# CodeClinic-Java-projects

Bp-Trends:

The data stored in the files labled 2012-2015 hold weather data from Lake Pend Orieille in northern Idaho. The goal of the project is to read
in the data and parse the data into a class called weatherEntry.
<br><br>
weatherEntery stores the data as follows:
   Date date; date is stored in the format of (yyyy_MM_dd HH:mm:ss)
	 double airTemp;
	 double bp;
	 double dewPoint;
	 double relativeHumidity;
	 double windDir;
	 double windGust;
	 double windSpeed;
   
   data is parsed into the apporpriate container, but will only take use of the bp and the date;
   
   The user is asked a series of questions for inputting data;2x's)
   year(ranging 2012-2015)
   month(01-12)
   day(1-30)
   Hour(0-23)
   Minuite(0-59)
   Seconds(0-59)
   
   the first series of questions the user can choose any specified date, The second date has limitations 
    ie. ( the selected date has to be after the initial date for comparison)
   
   
   once data has been inputed the (doCalc) method takes the date and pulls the stored Biometric pressure from the record stored
   and the index its stored in;
   
   the slope is calculated and returned is the slope along with a message
   if(slope<0)-bad weather
     (slope>0)-good weather
     (slope==0)-stable weather 
    
   
   
	

