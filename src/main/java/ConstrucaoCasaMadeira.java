public class ConstrucaoCasaMadeira extends ConstrucaoCasa {

    @Override
    protected String prepararTerreno() {
        return "Preparando terreno para construção de casa de madeira.";
    }

    @Override
    protected String construirEstrutura() {
        return "Construindo estrutura de madeira.";
    }

    @Override
    protected String realizarAcabamento() {
        return "Realizando acabamento em uma casa de madeira.";
    }
}