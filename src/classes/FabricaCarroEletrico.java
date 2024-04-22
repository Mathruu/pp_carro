package classes;

public class FabricaCarroEletrico implements FabricaAbstrata{

    @Override
    public Comprovante criarComprovante() {
        return new ComprovanteEletrico();
    }

    @Override
    public Validacao criarValidacao() {
        return new ValidacaoEletrica();
    }
    
}
