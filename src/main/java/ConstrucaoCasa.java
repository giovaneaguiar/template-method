public abstract class ConstrucaoCasa {

    public String construirCasa() {
        StringBuilder resultado = new StringBuilder();
        resultado.append(prepararTerreno());
        resultado.append(construirEstrutura());
        resultado.append(realizarAcabamento());
        resultado.append(realizarLimpeza());
        return resultado.toString();
    }

    protected abstract String prepararTerreno();

    protected abstract String construirEstrutura();

    protected abstract String realizarAcabamento();

    protected String realizarLimpeza() {
        return "Realizando limpeza da obra.";
    }
}