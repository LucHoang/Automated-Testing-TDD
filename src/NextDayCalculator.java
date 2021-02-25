public class NextDayCalculator {
    public static String nextDayCalculator(int day, int month, int year) {
        //throw new UnsupportedOperationException();
        if ((day<1 || day>31) || (month<1 || month>12) || year<1) {
            return "Input error";
        } else if (day>0 && day < 28) {
            return day+1+"/"+month+"/"+year;
        } else if (day == 28) {
            if (month != 2) {
                return day+1+"/"+month+"/"+year;
            } else {
                if (year%400==0 || (year%4==0 && year%100!=0)) {
                    return day+1+"/"+month+"/"+year;
                } else return "1/"+(month+1)+"/"+year;
            }
        } else if (day == 29) {
            if (month != 2) {
                return day+1+"/"+month+"/"+year;
            } else return "1/"+(month+1)+"/"+year;
        } else if (day == 30) {
            if (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) {
                return day+"/"+month+"/"+year;
            } else return "1/"+(month+1)+"/"+year;
        } else {
            if (month==12) {
                return "1/1/"+(year+1);
            } else return "1/"+(month+1)+"/"+year;
        }
    }
}
