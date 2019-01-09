package designers.adapter.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Mqtt {
    public String proxy;
    public String deposit;
    public String port;

    public void eniviaMensagemMqtt(){
        System.out.println("Mensagem eviada por Mqtt");
    }
}
