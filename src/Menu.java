import java.util.HashMap;
import java.util.Scanner;

public class Menu {

    private String m_monedaActual;
    private String m_monedaACambiar;
    private double m_montoActual;

    public String getM_monedaActual() {
        return m_monedaActual;
    }

    public String getM_monedaACambiar() {
        return m_monedaACambiar;
    }

    public double getM_monto() {
        return m_montoActual;
    }

    public void mostrarInterfazUsuario(HashMap<String, Double> data)
    {

        Scanner scanner = new Scanner(System.in);

        int monedaActual = 0;
        while(monedaActual != 0)
        {
            System.out.println("*****************************");
            System.out.println("Ingrese la moneda actual, segun la norma ISO 4217 ");
            System.out.println("Por ejemplo: ARS (Peso Argentino)");
            System.out.println("Por ejemplo: USD (Dolar Estado Unidense)");
            System.out.println("Por ejemplo: PEN (Sol Peruano)");

            String monedaByUser  = scanner.nextLine();
            if(data.containsKey(monedaByUser))
            {
                m_monedaActual=monedaByUser;
                monedaActual = 1;
            }

        }
        int montoValido = 0;
        while(montoValido != 0)
        {
            System.out.println("*****************************");
            System.out.println("Ingrese el monto");
            if(scanner.hasNextDouble())
            {
                double montoByUser = scanner.nextDouble();
                if(montoByUser >= 0)
                {
                    m_montoActual = montoByUser;
                    montoValido = 1;
                }
                else {
                    System.out.println("Monto invalido, intente de nuevo.");
                }
            }
            if(scanner.hasNextInt())
            {
                int montoByUser = scanner.nextInt();
                if(montoByUser >=0 )
                {
                    m_montoActual = (double)montoByUser;
                    montoValido = 1;
                }
                else
                {
                    System.out.println("Monto invalido, intente de nuevo.");
                }
            }

        }

        int monedaACambiar = 0;
        while(monedaACambiar != 0)
        {
            System.out.println("*****************************");
            System.out.println("Escoja la moneda a cambiar, segun la norma ISO 4217 ");

            for(String currentKey :  data.keySet())
            {
                System.out.println(data.get(currentKey) + "\n");
            }
        }
            String monedaCambio  = scanner.nextLine();
            if(data.containsKey(monedaCambio))
            {
                m_monedaACambiar = monedaCambio;
                monedaACambiar = 1;
            }

    }
}
