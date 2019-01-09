package designers.adapter.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Udp {

    public String proxy;
    public String port;

    public void enviarMensagemUdp(){
        System.out.println("Mensagem Enviada por Udp");
    }
}
