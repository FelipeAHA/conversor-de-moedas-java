public class ConsultaEConverte {

    public void consultarEConverter(String moedaBase, String moedaConverter, double valor){

        Consulta consulta = new Consulta();
        ConvertorJson convertorJson = new ConvertorJson();

        String resposta = consulta.realizarConsulta(moedaBase);

        ConversorDeMoedasJson conversorDeMoedasJson = convertorJson.converterDoJson(resposta);
        ConversorDeMoedas conversorMoeda = new ConversorDeMoedas(conversorDeMoedasJson, valor);

        double valorMoedaBase = 1;
        double valorMoedaConverter = 1;

        switch (moedaBase){
            case ("BRL"):
                valorMoedaBase = conversorMoeda.getReal();
                break;
            case ("USD"):
                valorMoedaBase = conversorMoeda.getDolar();
                break;
            case ("EUR"):
                valorMoedaBase = conversorMoeda.getEuro();
                break;
            case ("CNY"):
                valorMoedaBase = conversorMoeda.getYuan();
                break;
        }

        switch (moedaConverter){
            case ("BRL"):
                valorMoedaConverter = conversorMoeda.getReal();
                break;
            case ("USD"):
                valorMoedaConverter = conversorMoeda.getDolar();
                break;
            case ("EUR"):
                valorMoedaConverter = conversorMoeda.getEuro();
                break;
            case ("CNY"):
                valorMoedaConverter = conversorMoeda.getYuan();
                break;
        }

        System.out.println("O valor de " + moedaBase + " " + valorMoedaBase + " corresponde a " + moedaConverter + " " + valorMoedaConverter);
    }
}
