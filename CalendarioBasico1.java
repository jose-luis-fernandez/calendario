
/**
 * Write a description of class CalendarioBasico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CalendarioBasico1
{
    // instance variables - replace the example below with your own
    private int dia;
    
    private int mes;
    
    private int anio;
    
    


    /**
     * Constructor for objects of class CalendarioBasico
     */
    public CalendarioBasico1()
    {
        // initialise instance variables
        dia = 01;
        mes = 01;
        anio = 01;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    
    public void fijarFecha(int diaNuevo, int mesNuevo, int anioNuevo)
    {
        dia = diaNuevo;
        mes = mesNuevo;
        anio = anioNuevo;
    }
    
    public void avanzarDia()
    {
        dia = dia + 1;
        if (dia == 31){
            mes = mes + 1;
            dia = 1;
            if (mes == 13){
                anio = anio + 1;
                mes = 1;
                if (anio == 100){
                    anio = 1;
                }
            }
        }
    }
    
    public String obtenerFecha()
    {
        String fecha = dia + "-" + mes + "-" + anio;
        return fecha;
    }
}
