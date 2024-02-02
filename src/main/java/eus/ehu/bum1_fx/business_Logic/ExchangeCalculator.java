package eus.ehu.bum1_fx.business_Logic;

public interface ExchangeCalculator {
        String[] getCurrencyLongNames();

        double getChangeValue(String origCurrency, double amount, String endCurrency) throws Exception;

        double calculateCommission(double amount, String origCurrency);
}
