package exercicio_heranca_polimorfismo_abstracts.entities;

public class Individual extends TaxPayer {

    private Double healthExpenditures;

    public Individual() {
        super();
    }

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {
        double basicTax;
        if (getAnualIncome() < 20000) {
            basicTax = getAnualIncome() * 15 / 100;//se a renda for abaixo de 20000
        } else {
            basicTax = getAnualIncome() * 25 / 100;//se a renda for maior que 20000
        }
        basicTax -= getHealthExpenditures() * 0.5;//se teve gastos com saude 50% serao abatidos

        if (basicTax < 0) {
            basicTax = 0;
        }
        return basicTax;
    }
}
