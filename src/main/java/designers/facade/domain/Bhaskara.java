package designers.facade.services.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Bhaskara {

    private Double a;
    private Double b;
    private Double c;
    private Double ResultWithPositive;
    private Double ResultWithNegative;
}
