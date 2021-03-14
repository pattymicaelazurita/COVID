package bioseguridadfinal;


import java.text.DecimalFormat;

//Inicialización de variables

public class Encuesta {

    private boolean salir;

    private boolean contacto;

    private boolean fiebre;

    private boolean fatiga;

    private boolean tos;

    private boolean estornudos;

    private boolean dolorMuscular;

    private boolean congestion;

    private boolean dolorGarganta;

    private boolean diarrea;

    private boolean dolorCabeza;

    private boolean dificultadRespirar;

    private Fecha fechaEncuesta;

    private double probabilidadCovid;

    private double probabilidadResfriado;

    private double probabilidadGripe;
    
    
    //Constructor
    
    public Encuesta(){
           
    }
    
    public Encuesta(boolean salir, boolean contacto, boolean fiebre, boolean fatiga,boolean tos, 
                    boolean estornudos, boolean dolorMuscular, boolean congestion, 
                    boolean dolorGarganta, boolean diarrea, boolean dolorCabeza,
                    boolean dificultadRespirar, Fecha fechaEncuesta){
        setSalir(salir);
        setContacto(contacto);
        setFiebre(fiebre);
        setFatiga(fatiga);
        setTos(tos);
        setEstornudos(estornudos);
        setDolorMuscular(dolorMuscular);
        setCongestion(congestion);
        setDolorGarganta(dolorGarganta);
        setDiarrea(diarrea);
        setDolorCabeza(dolorCabeza);
        setDificultadRespirar(dificultadRespirar);
        setFechaEncuesta(fechaEncuesta);
       
        
    }

    //Métodos set y get
    public void setSalir(boolean salir) {
        this.salir= salir;
    }

    public void setContacto(boolean contacto) {
        this.contacto= contacto;
    }

    public void setFiebre(boolean fiebre) {
        this.fiebre= fiebre;
    }

    public void setFatiga(boolean fatiga) {
        this.fatiga= fatiga;
    }

    public void setTos(boolean tos) {
        this.tos= tos;
    }

    public void setEstornudos(boolean estornudos) {
        this.estornudos= estornudos;
    }

    public void setDolorMuscular(boolean dolorMuscular) {
        this.dolorMuscular= dolorMuscular;
    }

    public void setCongestion(boolean congestion) {
        this.congestion= congestion;
    }

    public void setDolorGarganta(boolean dolorGarganta) {
        this.dolorGarganta= dolorGarganta;
    }

    public void setDiarrea(boolean diarrea) {
        this.diarrea= diarrea;
    }

    public void setDolorCabeza(boolean dolorCabeza) {
        this.dolorCabeza= dolorCabeza;
    }

    public void setDificultadRespirar(boolean dificultadRespirar) {
        this.dificultadRespirar= dificultadRespirar;
    }

    public void setFechaEncuesta(Fecha fechaEncuesta) {
        this.fechaEncuesta= fechaEncuesta;
    }

    private void setProbabilidadCovid(double probabilidadCovid) {
        this.probabilidadCovid= probabilidadCovid;
    }
    private void setProbabilidadResfriado(double probabilidadResfriado) {
        this.probabilidadResfriado= probabilidadResfriado; 
    }

    private void setProbabilidadGripe(double probabilidadGripe) {
        this.probabilidadGripe= probabilidadGripe;
    }

    public boolean getSalir() {
        return salir;
    }

    public boolean getContacto() {
        return contacto;
    }

    public boolean getFiebre() {
        return fiebre;
    }

    public boolean getFatiga() {
         return fatiga;
    }

    public boolean getTos() {
        return tos;
    }

    public boolean getEstornudos() {
        return estornudos;
    }

    public boolean getDolorMuscular() {
        return dolorMuscular;
    }

    public boolean getCongestion() {
        return congestion;
    }

    public boolean getDolorGarganta() {
        return dolorGarganta;
    }

    public boolean getDiarrea() {
        return diarrea;
    }

    public boolean getDolorCabeza() {
        return dolorCabeza;
    }

    public boolean getDificultadRespirar() {
        return dificultadRespirar;
    }

    public Fecha getFechaEncuesta() {
        return fechaEncuesta;
    }

    public double getProbabilidadCovid() {
        return probabilidadCovid;
    }

    

    public double getProbabilidadResfriado() {
        return probabilidadResfriado;
    }

    public double getProbabilidadGripe() {
        return probabilidadGripe;
    }

    //Este método permite mostrar la probabilidad más alta en base a la encuesta
    public String mostrarProbabilidadMasAlta() {
        DecimalFormat df = new DecimalFormat("#.00");
        if((getProbabilidadCovid()>getProbabilidadResfriado())&&(getProbabilidadCovid()>getProbabilidadGripe()))
            return "La probabilidad más alta es de COVID con un porcentaje de: %"+(df.format(getProbabilidadCovid()));
        else if((getProbabilidadResfriado()>getProbabilidadCovid())&&(getProbabilidadResfriado()>getProbabilidadGripe()))
            return "La probabilidad más alta es de RESFRIADO con un porcentaje de: %"+(df.format(getProbabilidadResfriado()));
        else if((getProbabilidadGripe()>getProbabilidadResfriado())&&(getProbabilidadGripe()>getProbabilidadCovid()))
            return "La probabilidad más alta es de GRIPE con un porcentaje de: %"+(df.format(getProbabilidadGripe()));
        else
            return "No se ha podido identificar la probabilidad más alta";
    }

    //Este método permite calcular la probabilidad de resfriado en base a los sintomas de la encuesta
    public double calcularProbabilidadResfriado() {
        probabilidadResfriado=0;
        if (getSalir()==true)
            probabilidadResfriado=probabilidadResfriado+1;
            
        if (getContacto()==true)
            probabilidadResfriado=probabilidadResfriado+0;
            
        if (getFiebre()==true)
            probabilidadResfriado=probabilidadResfriado+0;
          
        if (getFatiga()==true)
            probabilidadResfriado=probabilidadResfriado+1;
           
        if (getTos()==true)
            probabilidadResfriado=probabilidadResfriado+1;
            
        if (getEstornudos()==true)
            probabilidadResfriado=probabilidadResfriado+2;
            
        if (getDolorMuscular()==true)
            probabilidadResfriado=probabilidadResfriado+2;
            
        if (getCongestion()==true)
            probabilidadResfriado=probabilidadResfriado+2;
            
        if (getDolorGarganta()==true)
            probabilidadResfriado=probabilidadResfriado+2;
            
        if (getDiarrea()==true)
            probabilidadResfriado=probabilidadResfriado+0;
            
        if (getDolorCabeza()==true)
            probabilidadResfriado=probabilidadResfriado+0;
            
        if (getDificultadRespirar()==true)
            probabilidadResfriado=probabilidadResfriado+0;
         
        probabilidadResfriado=probabilidadResfriado*100/11;
        
        setProbabilidadResfriado(probabilidadResfriado);
        return probabilidadResfriado;
    }

    //Este método permite calcular la probabilidad de gripe en base a los sintomas de la encuesta
    public double calcularProbabilidadGripe() {
        probabilidadGripe=0;
        
        if (getSalir()==true)
            probabilidadGripe=probabilidadGripe+1;
        
        if (getContacto()==true)
            probabilidadGripe=probabilidadGripe+0;
        
        if (getFiebre()==true)
            probabilidadGripe=probabilidadGripe+2;
        
        if (getFatiga()==true)
            probabilidadGripe=probabilidadGripe+2;
 
        if (getTos()==true)
            probabilidadGripe=probabilidadGripe+2;
        
        if (getEstornudos()==true)
            probabilidadGripe=probabilidadGripe+0;
        
        if (getDolorMuscular()==true)
            probabilidadGripe=probabilidadGripe+2;
        
        if (getCongestion()==true)
            probabilidadGripe=probabilidadGripe+1;
        
        if (getDolorGarganta()==true)
            probabilidadGripe=probabilidadGripe+1;
        
        if (getDiarrea()==true)
            probabilidadGripe=probabilidadGripe+1;
        
        if (getDolorCabeza()==true)
            probabilidadGripe=probabilidadGripe+2;
        
        if (getDificultadRespirar()==true)
            probabilidadGripe=probabilidadGripe+0;
       
        probabilidadGripe=probabilidadGripe*100/14;
        
        setProbabilidadGripe(probabilidadGripe);
        return probabilidadGripe;
    }

    //Este método permite calcular la probabilidad de covid en base a los sintomas de la encuesta
    public double calcularProbabilidadCovid() {
        probabilidadCovid=0;
        if (getSalir()==true)
            probabilidadCovid=probabilidadCovid+2;
        
        if (getContacto()==true)
            probabilidadCovid=probabilidadCovid+1;
            
        if (getFiebre()==true)
            probabilidadCovid=probabilidadCovid+2;
           
        if (getFatiga()==true)
            probabilidadCovid=probabilidadCovid+1;
            
        if (getTos()==true)
            probabilidadCovid=probabilidadCovid+2;
            
        if (getEstornudos()==true)
            probabilidadCovid=probabilidadCovid+0;
            
        if (getDolorMuscular()==true)
            probabilidadCovid=probabilidadCovid+1;
            
        if (getCongestion()==true)
            probabilidadCovid=probabilidadCovid+0;
            
        if (getDolorGarganta()==true)
            probabilidadCovid=probabilidadCovid+1;
            
        if (getDiarrea()==true)
            probabilidadCovid=probabilidadCovid+0;
            
        if (getDolorCabeza()==true)
            probabilidadCovid=probabilidadCovid+1;
            
        if (getDificultadRespirar()==true)
            probabilidadCovid=probabilidadCovid+1;
            
        probabilidadCovid=probabilidadCovid*100/12;
         
        setProbabilidadCovid(probabilidadCovid);
        return probabilidadCovid;
    }

    
    }