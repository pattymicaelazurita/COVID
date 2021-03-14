package bioseguridadfinal;



import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Persona {

    //Inicialización de variables
    private String nombre;
    private String genero;
    private String cedula;
    private Fecha fechaNacimiento;
    private List<Encuesta> encuestas = new ArrayList<Encuesta>();
    
    public Persona(){
        
    }
    
    //Constructor
    public Persona(String cedula, String nombre, String genero, Fecha fechaNacimiento,List<Encuesta> encuestas){
        setCedula(cedula);
        setNombre(nombre);
        setGenero(genero);
        setFechaNacimiento(fechaNacimiento);
        setEncuestas(encuestas);
    }

    //Métodos set y get
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public List<Encuesta> getEncuestas() {
        return encuestas;
    }

    public void setEncuestas(List<Encuesta> encuestas) {
        this.encuestas = encuestas;
    }
    

    //Este método muestra el porcentaje de riesgo en base al género y edad (se obtiene la edad en base a la diferencia de fechas de la clase fecha)
    public String mostrarRiesgo() {
        double riesgo=0;
        if(genero.equals("masculino")){
            if(fechaNacimiento.calcularDiferenciaFechas()<=29){
                riesgo=riesgo+0;
            }else if (fechaNacimiento.calcularDiferenciaFechas()<=39){
                riesgo=riesgo+0.4;   
            }else if (fechaNacimiento.calcularDiferenciaFechas()<=49){
                riesgo=riesgo+0.9;
            }else if (fechaNacimiento.calcularDiferenciaFechas()<=59){
                riesgo=riesgo+3.1;
            }else if (fechaNacimiento.calcularDiferenciaFechas()<=69){
                riesgo=riesgo+10;
            }else if (fechaNacimiento.calcularDiferenciaFechas()<=79){
                riesgo=riesgo+32;
            }else if (fechaNacimiento.calcularDiferenciaFechas()<=89){
                riesgo=riesgo+41.4;
            }else{
                riesgo=riesgo+11.5;
            }
        }
        else{
            if(fechaNacimiento.calcularDiferenciaFechas()<=29){
                riesgo=riesgo+0;
            }else if (fechaNacimiento.calcularDiferenciaFechas()<=39){
                riesgo=riesgo+0.4;   
            }else if (fechaNacimiento.calcularDiferenciaFechas()<=49){
                riesgo=riesgo+1.2;
            }else if (fechaNacimiento.calcularDiferenciaFechas()<=59){
                riesgo=riesgo+2.5;
            }else if (fechaNacimiento.calcularDiferenciaFechas()<=69){
                riesgo=riesgo+7.3;
            }else if (fechaNacimiento.calcularDiferenciaFechas()<=79){
                riesgo=riesgo+21.9;
            }else if (fechaNacimiento.calcularDiferenciaFechas()<=89){
                riesgo=riesgo+44;
            }else{
                riesgo=riesgo+22.2;
            }
        }
        
        
        return ("En caso de contraer Covid su riesgo de mortalidad es "+riesgo+"%");
    }

    //Esté método nos permite añadir encuestas a un usuario mediante el ingreso de un objeto tipo encuesta
    public void anadirEncuesta(Encuesta encuesta) {
        encuestas.add(new Encuesta(encuesta.getSalir(), encuesta.getContacto(), encuesta.getFiebre(), encuesta.getFatiga(),
                encuesta.getTos(),encuesta.getEstornudos(), encuesta.getDolorMuscular(),
                encuesta.getCongestion(),encuesta.getDolorGarganta(),encuesta.getDiarrea(),
                encuesta.getDolorCabeza(),encuesta.getDificultadRespirar(), 
                encuesta.getFechaEncuesta()));
    }

   //Este método permite mostrar la información de la encuesta
    public String mostrarInformacionEncuesta(Fecha fechaEncuesta) {
        boolean encontrar=false;
        String resultado="";
        String fi, fa,to, es, dm, co, dg, di, dc, dr, sa, con;
        for (Encuesta Encuesta : encuestas) {
            if (Encuesta.getFechaEncuesta()==(fechaEncuesta)) {
                encontrar = true;
                if ((Encuesta.getFiebre())==(true)){
                    fi="si";
                }else{
                    fi="no";
                }
                
                if ((Encuesta.getFatiga())==(true)){
                    fa="si";
                }else{
                    fa="no";
                }
                if ((Encuesta.getTos())==(true)){
                    to="si";
                }else{
                   to="no";
                }
                
                if ((Encuesta.getEstornudos())==(true)){
                    es="si";
                }else{
                    es="no";
                }
               
                if ((Encuesta.getDolorMuscular())==(true)){
                    dm="si";
                }else{
                    dm="no";
                }
                
                if ((Encuesta.getCongestion())==(true)){
                    co="si";
                }else{
                    co="no";
                }

                if ((Encuesta.getDolorGarganta())==(true)){
                    dg="si";
                }else{
                    dg="no";
                }
                
                if ((Encuesta.getDiarrea())==(true)){
                    di="si";
                }else{
                    di="no";
                }

                if ((Encuesta.getDolorCabeza())==(true)){
                    dc="si";
                }else{
                    dc="no";
                }
                
                if ((Encuesta.getDificultadRespirar())==(true)){
                    dr="si";
                }else{
                    dr="no";
                }

                if ((Encuesta.getSalir())==(true)){
                    sa="si";
                }else{
                    sa="no";
                }
                
                if ((Encuesta.getContacto())==(true)){
                    con="si";
                }else{
                    con="no";
                }
                
                resultado=("\nFecha encuesta: "+Encuesta.getFechaEncuesta().getDia()+"/"+Encuesta.getFechaEncuesta().getMes()+"/"+Encuesta.getFechaEncuesta().getAnio()+"\n*****Respuestas***"+"\nFiebre: "+fi+"\nFatiga: "+fa+"\nTos: "+to+"\nEstornudos: "+es+"\nDolor muscular: "+dm+"\nCongestion: " +con+"\nDolor de garganta: "+dg+"\nDiarrea: "+di+"\nDolor de cabeza: "+dc+"\nDificultadRespirar: "+dr+"\n¿se ha relacionado con personas que han llegado del extranjero?: "+sa+"\n¿se ha relacionado con personas que han llegado del extranjero?: "+co);
                break;
            }else{
                encontrar = false;

            }
        }
        if(encontrar==false){
            resultado = ("No se ha encontrado encuesta con la fecha ingresada");
        }
        return resultado;
    }

    //este método nos devuelve las probabilidades de cada enfermedada en base a la encuesta
    public String verResultadoEncuesta(Fecha fechaEncuesta) {
        boolean encontrar=false;
        String resultado="";
        DecimalFormat df = new DecimalFormat("#.00");
        for (Encuesta Encuesta : encuestas) {
            if (Encuesta.getFechaEncuesta()==(fechaEncuesta)) {
                encontrar = true;
                resultado = ("\nProbabilidad Covid: %"+df.format(Encuesta.calcularProbabilidadCovid())+"\nProbabilidad Resfriado: %"+df.format(Encuesta.calcularProbabilidadResfriado())+"\nProbabilidad Gripe: %"+df.format(Encuesta.calcularProbabilidadGripe())+"\n\n"+Encuesta.mostrarProbabilidadMasAlta());
                break;
            }else{
                encontrar = false;

            }
        }
        if(encontrar==false){
            resultado = ("No se ha encontrado encuesta con la fecha ingresada");
        }
        return resultado;
        
    }
    //Este método muestra la información de cada persona
    public String mostrarInformacion() {
        return ("Nombre: "+nombre+"\nCédula: "+cedula+"\nGénero: "+genero+"\nFecha: "+fechaNacimiento.getDia()+"/"+fechaNacimiento.getMes()+"/"+fechaNacimiento.getAnio());
    }
    
    //Método para verificar cédula real
    public static boolean verificarCedula(String cedula) {  
     int total = 0;  
     int tamanoLongitudCedula = 10;  
     int[] coeficientes = {2, 1, 2, 1, 2, 1, 2, 1, 2};  
     int numeroProviancias = 24;  
     int tercerdigito = 6;  
     if (cedula.matches("[0-9]*") && cedula.length() == tamanoLongitudCedula) {  
       int provincia = Integer.parseInt(cedula.charAt(0) + "" + cedula.charAt(1));  
       int digitoTres = Integer.parseInt(cedula.charAt(2) + "");  
       if ((provincia > 0 && provincia <= numeroProviancias) && digitoTres < tercerdigito) {  
         int digitoVerificadorRecibido = Integer.parseInt(cedula.charAt(9) + "");  
         for (int i = 0; i < coeficientes.length; i++) {  
           int valor = Integer.parseInt(coeficientes[i] + "") * Integer.parseInt(cedula.charAt(i) + "");  
           total = valor >= 10 ? total + (valor - 9) : total + valor;  
         }  
         int digitoVerificadorObtenido = total >= 10 ? (total % 10) != 0 ? 10 - (total % 10) : (total % 10) : total;  
         if (digitoVerificadorObtenido == digitoVerificadorRecibido) {  
           return true;  
         }  
       }  
       return false;  
     }  
     return false;  
   } 
    
    
}
