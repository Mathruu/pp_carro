package test;

import classes.AcoplePerifericos;
import classes.Carro;
import classes.Cor;
import classes.FabricaAbstrata;
import classes.FabricaCarroCombustao;
import classes.FabricaCarroEletrico;
import classes.MontagemCarcaca;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarroTest {
    

    // Padrao abstract factory

    @Test
    void deveEmitirComprovanteCombustao() {
        FabricaAbstrata fabrica = new FabricaCarroCombustao();
        Carro carro = new Carro(fabrica);
        assertEquals("Comprovante de carro a combustão emitido", carro.emitirComprovante());
    }

    @Test
    void deveEmitirValidacaoCombustao() {
        FabricaAbstrata fabrica = new FabricaCarroCombustao();
        Carro carro = new Carro(fabrica);
        assertEquals("Validação de carro a combustão realizada com sucesso!", carro.EmitirValidacao());
    }

    @Test
    void deveEmitirComprovanteEletrico() {
        FabricaAbstrata fabrica = new FabricaCarroEletrico();
        Carro carro = new Carro(fabrica);
        assertEquals("Comprovante de carro elétrico emitido", carro.emitirComprovante());
    }

    @Test   
    void deveEmitirValidacaoEletrica() {
        FabricaAbstrata fabrica = new FabricaCarroEletrico();
        Carro carro = new Carro(fabrica);
        assertEquals("Validação de carro elétrico realizada com sucesso!", carro.EmitirValidacao());
    }

    // Padrao prototype

    @Test
    void testClone() throws CloneNotSupportedException {
        Carro carro = new Carro("Combustão", "Corolla", "Toyotta", 2021,  new Cor("prata", "#c0c0c0"));

        Carro carroClone = carro.clone();
        carroClone.setTipo("Elétrico");
        carroClone.setModelo("Model S");
        carroClone.setMarca("Tesla");
        carroClone.setAno(2022);
        carroClone.setCor(new Cor("preto", "#000000"));

        assertEquals("Carro{tipo='Combustão', modelo='Corolla', marca='Toyotta', ano=2021, cor=Cor{cor='prata', codigoCor='#c0c0c0'}}", carro.toString());
        assertEquals("Carro{tipo='Elétrico', modelo='Model S', marca='Tesla', ano=2022, cor=Cor{cor='preto', codigoCor='#000000'}}", carroClone.toString());
    }


    // Padrao facade

    @Test
    void deveRetornaPendenciaMontagemCarcaca() {
        Carro carro = new Carro("Combustão", "Corolla", "Toyotta", 2021,  new Cor("prata", "#c0c0c0"));
        MontagemCarcaca.getInstance().adicionarCarroComPendência(carro);
        assertEquals(false, carro.verificar());
    }

    @Test
    void deveRetornarPendenciaAcoplePerifericos() {
        Carro carro = new Carro("Combustão", "Corolla", "Toyotta", 2021,  new Cor("prata", "#c0c0c0"));
        AcoplePerifericos.getInstance().adicionarCarroComPendência(carro);
        assertEquals(false, carro.verificar());
    }

    @Test
    void deveRetornarCarroSemPendencia() {
        Carro carro = new Carro("Combustão", "Corolla", "Toyotta", 2021,  new Cor("prata", "#c0c0c0"));
        assertEquals(true, carro.verificar());
    }
}
