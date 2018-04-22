

import java.util.Calendar;


public class Solution {


    public static String getDay(String day, String month, String year) {


        Calendar c=Calendar.getInstance();


        String result="";


            if(Integer.parseInt(year)>



 && Integer.parseInt(year)<



){


            c.set(Integer.parseInt(year),Integer.parseInt(month)-
,Integer.parseInt(day));



            String[] strDays = new String[] { "","Sunday", "Monday", "Tuesday", "Wednesday", "Thursday",



                    "Friday", "Saturday" };



        result=(strDays[c.get(Calendar.DAY_OF_WEEK)].toUpperCase());



    }



           return result;



        


    }
