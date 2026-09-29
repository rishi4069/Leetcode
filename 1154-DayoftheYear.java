class Solution {
    public int dayOfYear(String date) {
        int[] noOfDays={0,31,59,90,120,151,181,212,243,273,304,334,365};
        int year=Integer.parseInt(date.substring(0,4));
        int month=Integer.parseInt(date.substring(5,7));
        int day=Integer.parseInt(date.substring(8,10));

        if((year%400==0 || (year%4==0 && year%100!=0)) && month>2 ){
            return noOfDays[month-1]+day+1;
        }
        return noOfDays[month-1]+day;


    }
}