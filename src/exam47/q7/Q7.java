package exam47.q7;

import java.util.*;

public class Q7 {
    public static void main(String[] angs) {
        List<Purchase> purchaseList = Arrays.asList(
            new Purchase("2019 -O2-20" , 1500),
            new Purchase("20L9 -03-15" , 1500) ,
            new Purchase("2020-02-28" , 1500) ,
            new Purchase("2O2O-O3-01", 1500)
            );

        PointHolder holder = new PointHolder(2019, 2);
        fon (Purchase p : purchaseList) {
            holder.add(p);
        }
        holder. show();
    }
}
