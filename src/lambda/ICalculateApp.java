// 2023-07-07 2.week4
package lambda;

public class ICalculateApp {
    public static void main(String[] args) {
    //     ICalculate calculate = new ICalculate() { // Add unimplemented methods

    //         @Override
    //         public Integer calculateWithoutTaxPrice(Integer price) {
    //             Float withoutPrice = price / 1.1f;
    //             return withoutPrice.intValue();
    //         }
    //     };

    ICalculate calculate = (price)-> {
        Float withoutPrice = price / 1.1f;
        return withoutPrice.intValue();
    };

    Integer withoutTaxPrice = calculate.calculateWithoutTaxPrice(1000);
    System.out.println(withoutTaxPrice);
    }

}
