public class MenuOpciones {

    private CambioMoneda m_cambio;

    public  MenuOpciones (CambioMoneda cambio)
    {m_cambio = cambio;}

    public void mostrarCambioDeMoneda(CambioMoneda moneda)
    {
        for (int i = 1; i < 10 ; i++) {

            System.out.println("opcion numero: "+i);

        }
    }
}
