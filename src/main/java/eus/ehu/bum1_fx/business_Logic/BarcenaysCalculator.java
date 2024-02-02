package eus.ehu.bum1_fx.business_Logic;


public class BarcenaysCalculator implements ExchangeCalculator {

    private ForexOperator forexOperator;
    private CommissionCalculator commissionCalculator;
    @Override
    public String[] getCurrencyLongNames() {
        return Currency.longNames();
    }

    @Override
    public double getChangeValue(String origCurrency, double amount, String endCurrency) throws Exception {
        forexOperator = new ForexOperator(origCurrency,amount,endCurrency);
        return forexOperator.getChangeValue();
    }

    @Override
    public double calculateCommission(double amount, String origCurrency) {
        commissionCalculator = new CommissionCalculator(amount,origCurrency);
        try {
            return commissionCalculator.calculateCommission();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
