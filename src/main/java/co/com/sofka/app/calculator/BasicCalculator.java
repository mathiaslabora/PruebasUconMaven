package co.com.sofka.app.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicCalculator {
    private static final Logger logger =  LoggerFactory.getLogger(BasicCalculator.class);
    public long sum(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        return number1 + number2;
    }
    public long res(Long number1, Long number2) {
        logger.info( "Subtracting {} + {}", number1, number2 );
        return number1 - number2;
    }
    public long div(Long number1, Long number2) {
        logger.info( "dividing {} + {}", number1, number2 );
        if(number1 == 0 || number2==0){
            return 0;
        }
        return number1 / number2;
    }
    public long mul(Long number1, Long number2) {
        logger.info( "multiplying {} + {}", number1, number2 );
        return number1 * number2;
    }


}
