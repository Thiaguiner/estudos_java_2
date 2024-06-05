package default_methods.entities;

public class BrazilInterestService implements InterestService {

    private double interestRate = 2.0;

    public BrazilInterestService() {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }
}
