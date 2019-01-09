package designers.adapter;

import designers.adapter.domain.Mqtt;
import designers.adapter.domain.Udp;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdapterMqttToUdp extends Mqtt {

    private Udp udp;

    @Override
    public void eniviaMensagemMqtt() {
        udp.enviarMensagemUdp();
    }
}
