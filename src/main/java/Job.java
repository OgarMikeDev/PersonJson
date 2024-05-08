import java.math.BigDecimal;
import java.time.LocalDate;

public class Job {
    private LocalDate since;
    private String city;
    private BigDecimal salary;

    public LocalDate getSince() {
        return since;
    }

    public void setSince(LocalDate since) {
        this.since = since;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Date work start \"" + getSince() + "\"" +
                "\nCity \"" + getCity() + "\"" +
                "\nSalary \"" + getSalary() + "\"";
    }
}
