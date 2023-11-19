public class ConstrucaoCasaConcreto extends ConstrucaoCasa {

    @Override
    protected String prepararTerreno() {
        return "Preparando terreno para construção de casa de concreto.";
    }

    @Override
    protected String construirEstrutura() {
        return "Construindo estrutura de concreto.";
    }

    @Override
    protected String realizarAcabamento() {
        return "Realizando acabamento em uma casa de concreto.";
    }
}