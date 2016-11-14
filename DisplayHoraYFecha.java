
/**
 * Write a description of class DisplayHoraYFecha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DisplayHoraYFecha
{
    // instance variables - replace the example below with your own
    private NumberDisplay horas;
    private NumberDisplay minutos;
    private DisplayDosDigitos dia;
    private DisplayDosDigitos mes;
    private DisplayDosDigitos year;

    /**
     * Constructor for objects of class DisplayHoraYFecha
     */
    public DisplayHoraYFecha()    {
        // initialise instance variables
        horas = new NumberDisplay(24);
        minutos = new NumberDisplay(60);
        dia = new DisplayDosDigitos(31);
        mes = new DisplayDosDigitos(13); 
        year = new DisplayDosDigitos(100);
    }
    public void setMomento(int nuevoDia, int nuevoMes, int nuevoYear, int nuevaHora, int nuevoMinutos){
          if (nuevaHora <= 59 && nuevoMinutos <=23 && nuevoDia <=30 && nuevoMes <=12 && nuevoYear <=99){
            horas.setValue(nuevaHora);
            minutos.setValue(nuevoMinutos);
            dia.setValor(nuevoDia);
            mes.setValor(nuevoMes);
            year.setValor(nuevoYear);
          }
    }
    public void avanzarMinuto(){
        minutos.increment();
        if (minutos.getValue() == 0){
            horas.increment();
            if (horas.getValue() == 0){
                 dia.incrementaValor();
                 if (dia.getValor() == 1){
                     mes.incrementaValor();
                     if (mes.getValor() == 1){
                         year.incrementaValor();
                        }
                    }
            }
        }
    }
    public String getMomento(){
        return horas.getDisplayValue() + ":" + minutos.getDisplayValue() + " " + dia.getValorDelDisplay() + "-" + mes.getValorDelDisplay() + "-" + year.getValorDelDisplay();
    }
}
