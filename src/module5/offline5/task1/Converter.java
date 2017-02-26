package module5.offline5.task1;

import java.math.BigDecimal;

/**
 * Created by citsym on 23.02.17.
 */
public final class Converter {

    final double rate;

    public Converter(double rate) {
        this.rate = rate;
    }

    public final double convert(double amountCurrency){

        double usd = amountCurrency / rate;

        BigDecimal bigDecimal = new BigDecimal(usd).setScale(3, BigDecimal.ROUND_HALF_UP);

        usd = bigDecimal.doubleValue();

        return usd;
    }
}
