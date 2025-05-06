public class ConversorDeMoedas {
    private double dolar;
    private double real;
    private double euro;
    private double yuan;
    private double valor;

    public ConversorDeMoedas(ConversorDeMoedasJson conversorJson, double valor) {
        this.dolar = conversorJson.conversionRates().get("USD");
        this.real = conversorJson.conversionRates().get("BRL");
        this.euro = conversorJson.conversionRates().get("EUR");
        this.yuan = conversorJson.conversionRates().get("CNY");
        this.valor = valor;
    }

    public double getDolar() {
        return dolar * valor;
    }

    public double getReal() {
        return real * valor;
    }

    public double getEuro() {
        return euro * valor;
    }

    public double getYuan() {
        return yuan * valor;
    }
}
