package bioseguridadfinal;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Fecha {

    //Inicialización de variable
    private int dia;
    private int mes;
    private int anio;
    
    //Constructor
    public Fecha(int dia, int mes, int anio){
        setDia(dia);
        setMes(mes);
        setAnio(anio);    
    }
    
    //Métodos set y get
    public void setDia(int dia) {
        this.dia = dia;
    }
    
    public void setMes(int mes) {
        this.mes = mes;
    }
    
    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    

    //Este método calcula la diferencia entre la fecha ingresada y la fecha actual, devolviendo su diferencia en años
    

    public int calcularDiferenciaFechas() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        String fNacimiento = (dia+"/"+mes+"/"+anio);
        LocalDate fechaNacimiento = LocalDate.parse(fNacimiento,formatter);
        Period diferencia = Period.between(fechaNacimiento, LocalDate.now());
        return diferencia.getYears();
        
    }
}
