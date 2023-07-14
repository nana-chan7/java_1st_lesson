package exam47.q7;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class PointHolder {
    int enrollmentYear;
    int enrollmentMonth;
    SortedMap<String, Integer> expirePoint = new TreeMap<String, Integer>();

    public PointHolder(int enrollmentYear, int enrollmentMonth){
        this.enrollmentYear = enrollmentYear;
        this.enrollmentMonth = enrollmentMonth;
    }

    void add(Purchase purchase){
        String expireYearMonth = getExpireYearMonth(purchase.date);
        Integer point = expirePoint.get(expireYearMonth);

        if(point == null){ // Q35
            point = 0;
        }
        Integer nexPoint = purchase.point + point; // Q36
        expirePoint.put(expireYearMonth, nexPoint);
    }
    private String getExpireYearMonth(String date){
        int year = Integer.parseInt((date.substring(0, 4)));
        int month = Integer.parseInt((date.substring(5, 7)));
        int expireYear = getExpireYear(year, month);
        return expireYear + "年" + enrollmentMonth;
    }
    private int getExpireYear(int year, int month){
        if (year == enrollmentYear && month == enrollmentMonth){
            month = enrollmentMonth + 1;
        }
        if(month > enrollmentMonth){
            return  year + 2; // Q37
        }
        return year + 1;
    }
    public void show(){
        for (Map.Entry<String, Integer> expire : expirePoint.entrySet()) {
            System.out.println(expire.getKey() + "月末に失効するポイント=" + expire.getValue()); // Q38
            
        }
    }
}
