package classes;

public class FabricaCarroCombustao implements FabricaAbstrata{
    
    @Override
    public Comprovante criarComprovante() {
        return new ComprovanteCombustao();
    }

    @Override
    public Validacao criarValidacao() {
        return new ValidacaoCombustao();
    }
}
