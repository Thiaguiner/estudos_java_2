package default_methods.entities;

public class UsaInterestService implements InterestService {
    private double interestRate = 1.0;

    public UsaInterestService() {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }
}
