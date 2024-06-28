public class MenuOpciones {

    private CambioMonedaData m_cambio;

    public  MenuOpciones (CambioMonedaData cambio)
    {m_cambio = cambio;}

    public void mostrarCambioDeMoneda(CambioMonedaData moneda)
    {
        for (int i = 1; i < 10 ; i++) {

            System.out.println("opcion numero: "+i);

        }
    }
}
