import java.util.Arrays;

public class House {
    private int floorsNumber;
    private String address;
    private String[] residentsNames;



    @Override
    public String toString() {
        return "House{" +
                "floorsNumber=" + getFloorsNumber() +
                ", address='" + getAddress() + '\'' +
                ", residentsNames=" + Arrays.toString(getResidentsNames()) +
                '}';
    }

    public int getFloorsNumber() {
        return floorsNumber;
    }

    public void setFloorsNumber(int floorsNumber) {
        this.floorsNumber = floorsNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String[] getResidentsNames() {
        return residentsNames;
    }

    public void setResidentsNames(String[] residentsNames) {
        this.residentsNames = residentsNames;
    }
}
