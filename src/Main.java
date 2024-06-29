import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        //CambioMonedaData data = new CambioMonedaData();

        HashMap<String, Double> moneda = new HashMap<>();
        moneda.put("USD", 1.0);
        moneda.put("EUR", 0.85);
        moneda.put("JPY", 110.0);
        moneda.put("GBP", 0.75);
        moneda.put("AUD", 1.35);
        moneda.put("CAD", 1.25);
        moneda.put("CHF", 0.92);
        moneda.put("CNY", 6.45);
        moneda.put("SEK", 8.75);
        moneda.put("NZD", 1.42);

        Menu menu = new Menu();

        menu.mostrarInterfazUsuario(moneda);
        CambioMonedaCalculo cambioMonedaCalculo = new CambioMonedaCalculo(menu.getM_monedaActual(),menu.getM_monedaACambiar(),menu.getM_monto(),moneda);
        double montoCambiado = cambioMonedaCalculo.getM_montoCambiado();
        menu.MostrarResultados(montoCambiado);
    }
}