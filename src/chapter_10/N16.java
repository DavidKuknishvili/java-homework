package chapter_10;

import java.math.BigDecimal;

public class N16 {
    public static void main(String[] args) {

        String stringNum = "" +1;

        for (int i = 0; i < 49; i++) {
            stringNum += "0";

        }

        BigDecimal number = new BigDecimal(stringNum);

        int numberCount = 0;

        while (numberCount  < 10){
            BigDecimal remainder2 = number.remainder(new BigDecimal(2));
            BigDecimal remainder3 = number.remainder(new BigDecimal(3));

            if(remainder2.equals(BigDecimal.ZERO)|| remainder3.equals(BigDecimal.ZERO)){
                numberCount ++ ;
                System.out.println(number);
            }

            number = number.add(BigDecimal.ONE);
        }


    }
}
