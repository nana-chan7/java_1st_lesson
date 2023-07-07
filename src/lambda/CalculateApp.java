// 2023-07-07 2.week4
package lambda;

public class CalculateApp {
    public static void main(String[] args) {
        ICalculate calculate = new ICalculate() { // Add unimplemented methods

            @Override
            public Integer calculateWithoutTaxPrice(Integer price) {
                return 0;
            }
        };
        Integer withoutTaxPrice = calculate.calculateWithoutTaxPrice(1000);
        System.out.println(withoutTaxPrice);
    }
}
