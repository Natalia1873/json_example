import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class Job {
    private LocalDate since;
    private String city;
    private BigDecimal salary;
}

