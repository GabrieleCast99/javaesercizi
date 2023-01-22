import java.util.Objects;

public class SmartphonePrice implements Cloneable {
    String priceType;
    double priceInEuros;

    @Override
    public SmartphonePrice clone() throws CloneNotSupportedException {
        SmartphonePrice clonedSmartphonePrice = (SmartphonePrice)super.clone();
        clonedSmartphonePrice.priceType = this.priceType;
        clonedSmartphonePrice.priceInEuros = this.priceInEuros;

        return clonedSmartphonePrice;
    }

    @Override
    public String toString() {
        return
                "priceType='" + priceType + '\'' +
                        ", priceInEuros=" + priceInEuros +
                        ' ';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartphonePrice that = (SmartphonePrice) o;
        return Double.compare(that.priceInEuros, priceInEuros) == 0 && Objects.equals(priceType, that.priceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priceType, priceInEuros);
    }

    public SmartphonePrice(String type, double price) {
        this.priceType = type;
        this.priceInEuros = price;
    }
}