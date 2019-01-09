package designers.ComanderInti;

import designers.adapter.AdapterMqttToUdp;
import designers.adapter.domain.Udp;
import designers.builder.TestBuilder;
import designers.facade.services.CalcFormula;
import designers.factory.FactoryPessoa;
import designers.factory.interfaces.PessoaFactoryInterface;
import designers.proxy.ProxyPessoa;
import designers.proxy.domain.PessoaDomain;
import designers.proxy.service.PessoaService;
import designers.singleton.Carro;
import designers.strategy.Strategy;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
@Component
@AllArgsConstructor
public class Test implements CommandLineRunner {

    private PessoaService pessoaService;

    private CalcFormula calcFormula;

    @Override
    public void run(String... args) throws Exception {
        testProxy();

        format();

        facade();

        format();

        singleton();

        format();

        adapter();

        format();

        strategy();

        format();

        factory();

        format();

        TestBuilder.testBuilder();
    }

    public void testProxy(){
        pessoaService.deleteAll();

        System.out.println("Proxy Teste:");
        System.out.println();
        List<PessoaDomain> pessoasData = new ArrayList<>();

        IntStream.range(0,10).forEach(
                x->
                        pessoasData.add(new PessoaDomain(null, UUID.randomUUID().toString(),12)));

        pessoasData.forEach(x->pessoaService.insert(x));


        List<ProxyPessoa> proxyPessoaList = new ArrayList<>();

        pessoasData.forEach(x-> {
            proxyPessoaList.add(ProxyPessoa.builder().id(x.getId()).pessoaService(pessoaService).build());
        });
        System.out.println("Carrega Banco");

        System.out.println();

        proxyPessoaList.forEach(x-> x.display());

        System.out.println();
        System.out.println("Carrega Cache");
        System.out.println();

        proxyPessoaList.forEach(x-> x.display());
    }

    public void facade(){
        System.out.println("Facade Test:");
        calcFormula.bhaskara(2D,12D,-14D);
    }

    public void format(){
        System.out.println();
        System.out.println("-------------");
        System.out.println();
    }

    public void singleton(){
        System.out.println("Singleton Teste");

        Carro carro = Carro.getINSTANCE();

        System.out.println(carro);
        System.out.println(Carro.getINSTANCE());

        System.out.println(Carro.getINSTANCE().getAcaoPublic());

        Carro.getINSTANCE().andarParaFrente();
        System.out.println(carro.getAcaoPublic());
    }

    public void adapter(){
        System.out.println("Adapter");

        Udp udp = Udp.builder().port("55056").proxy("localhost").build();
        AdapterMqttToUdp adapterMqttToUdp = new AdapterMqttToUdp(udp);

        adapterMqttToUdp.eniviaMensagemMqtt();
    }

    public void strategy(){
        System.out.println("Strategy");

        Strategy.testStrategy();
    }

    public void factory(){
        System.out.println("Factory");

        FactoryPessoa factoryPessoa = new FactoryPessoa();
        List<PessoaFactoryInterface> pessoas= new ArrayList<>();
        AtomicInteger age = new AtomicInteger(10);
        IntStream.range(0,4).forEach(x->{
            pessoas.add(factoryPessoa.setPessoa(UUID.randomUUID().toString(),age.get()));
            age.addAndGet(20);
        });

        pessoas.forEach(x-> {
            System.out.println(x.getClass());
            System.out.println(x.toString());
        });
    }
}
