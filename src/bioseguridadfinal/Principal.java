package bioseguridadfinal;

import java.util.List;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Paty
 */
public class Principal {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
DecimalFormat df = new DecimalFormat("#.00");

//Encuesta e1 = new Encuesta();
//Persona p1= new Persona();
Fecha fechaNacimiento = null;
Fecha fechaEncuesta = null;

List<Persona> personas = new ArrayList<Persona>();



boolean salir;
boolean contacto;
boolean fiebre;
boolean fatiga;
boolean tos;
boolean estornudos;
boolean dolorMuscular;
boolean congestion;
boolean dolorGarganta;
boolean diarrea;
boolean dolorCabeza;
boolean dificultadRespirar;
int op;
String cedula;
String nombre;
String genero;
boolean encontrar=false;

do {
System.out.print("\n\t\t\tMenú");
System.out.print("\n1. Agregar persona");
System.out.print("\n2. Realizar encuesta");
System.out.print("\n3. Buscar encuestas previas");
System.out.print("\n4. Buscar persona");
System.out.print("\n5. Mostrar encuestas");
System.out.print("\n6. Mostrar personas");
System.out.print("\n7. Salir");
System.out.print("\nEscoja una opción: ");
op=sc.nextInt();

    switch(op) {
    case 1:
        
        System.out.println("Bienvenido. Por favor ingrese la siguiente información");
        System.out.print("Nombre: ");
        nombre = sc.next();
        
        System.out.print("Cedula: ");
        cedula = sc.next();
        
        System.out.print("Género(seleccione femenino o maculino): ");
        genero = sc.next();
        
        int dia;
        System.out.println("Fecha de nacimiento");
        System.out.print("Día: ");
        dia = sc.nextInt();
        fechaNacimiento.setDia(dia);

        int mes;
        System.out.print("Mes: ");
        mes = sc.nextInt();
        fechaNacimiento.setMes(mes);

        int anio;
        System.out.print("Año: ");
        anio = sc.nextInt();
        fechaNacimiento.setAnio(anio);
        
        personas.add(new Persona(cedula, nombre, genero, fechaNacimiento, new ArrayList<Encuesta>()));


    break;
    case 2 :
        
            System.out.print("Por favor ingrese su Cédula: ");
            cedula = sc.next();
            for (Persona Persona : personas) {
            if ((Persona.getCedula()).equals(cedula)) {
		encontrar = true;
		System.out.println("Fecha de la encuesta");
                System.out.print("Día: ");
                dia = sc.nextInt();
                fechaEncuesta.setDia(dia);


                System.out.print("Mes: ");
                mes = sc.nextInt();
                fechaEncuesta.setMes(mes);


                System.out.print("Año: ");
                anio = sc.nextInt();
                fechaEncuesta.setAnio(anio);


                String valor;
                System.out.println("Responda si o no dependiendo de la presencia de los siguientes síntomas ");
                System.out.print("Fiebre: ");
                valor = sc.next();
                if (valor.equals("si")){
                    fiebre=true;
                }else{
                    fiebre=false;
                }

               System.out.print("Fatiga: ");
                valor = sc.next();
                if (valor.equals("si")){
                    fatiga=true;
                }else{
                    fatiga=false;
                }

                System.out.print("Tos: ");
                valor = sc.next();
                if (valor.equals("si")){
                    tos=true;
                }else{
                    tos=false;
                }

                System.out.print("Estornudos: ");
                valor = sc.next();
                if (valor.equals("si")){
                    estornudos=true;
                }else{
                    estornudos=false;
                }

                System.out.print("Dolor muscular: ");
                valor = sc.next();
                if (valor.equals("si")){
                    dolorMuscular=true;
                }else{
                    dolorMuscular=false;
                }

                System.out.print("Congestión: ");
                valor = sc.next();
                if (valor.equals("si")){
                    congestion=true;
                }else{
                    congestion=false;
                }

                System.out.print("Dolor de garganta: ");
                valor = sc.next();
                if (valor.equals("si")){
                    dolorGarganta=true;
                }else{
                    dolorGarganta=false;
                }

                System.out.print("Diarrea: ");
                valor = sc.next();
                if (valor.equals("si")){
                    diarrea=true;
                }else{
                    diarrea=false;
                }

                System.out.print("Dolor de cabeza: ");
                valor = sc.next();
                if (valor.equals("si")){
                    dolorCabeza=true;
                }else{
                    dolorCabeza=false;
                }

                System.out.print("Dificultad para respirar: ");
                valor = sc.next();
                if (valor.equals("si")){
                    dificultadRespirar=true;
                }else{
                    dificultadRespirar=false;
                }

                System.out.print("¿Ha salido en las últimas 48 horas? ");
                valor = sc.next();
                if (valor.equals("si")){
                    salir=true;
                }else{
                    salir=false;
                }

                System.out.print("¿se ha relacionado con personas que han llegado del extranjero? ");
                valor = sc.next();
                if (valor.equals("si")){
                    contacto=true;
                }else{
                    contacto=false;
                }
                Encuesta encuesta = new Encuesta(salir, contacto, fiebre, fatiga,tos,estornudos, dolorMuscular,congestion,dolorGarganta,diarrea, dolorCabeza,dificultadRespirar, fechaEncuesta);
                Persona.anadirEncuesta(encuesta);
                
                System.out.println(Persona.verResultadoEncuesta(fechaEncuesta));
                
                
                
                break;
            }else{
		encontrar = false;
            }
	}
        if(encontrar==false){
            System.out.println("No se ha encontrado personas con la cédula ingresada");
        } 
        
        
        
        
    break;
    case 3:
        boolean encontrar2 = false;
        System.out.print("Por favor ingrese su Cédula: ");
            cedula = sc.next();
        for (Persona Persona : personas) {
            if ((Persona.getCedula()).equals(cedula)) {
                encontrar2=true;
                System.out.println("Fecha de la encuesta a buscar");
                System.out.print("Día: ");
                dia = sc.nextInt();
                fechaEncuesta.setDia(dia);


                System.out.print("Mes: ");
                mes = sc.nextInt();
                fechaEncuesta.setMes(mes);


                System.out.print("Año: ");
                anio = sc.nextInt();
                fechaEncuesta.setAnio(anio);
                System.out.println(Persona.mostrarInformacionEncuesta(fechaEncuesta));
                System.out.println(Persona.verResultadoEncuesta(fechaEncuesta));
                break;
            }else{
                encontrar2 = false;
            }
        }
        if(encontrar2==false){
            System.out.println("No se ha encontrado personas con la cédula ingresada");
        }
        
        

        
    break;
    case 4:
        
        System.out.print("Por favor ingrese su Cédula: ");
        cedula = sc.next();
        for (Persona Persona : personas) {
            if ((Persona.getCedula()).equals(cedula)) {
		encontrar = true;
		System.out.println(Persona.mostrarInformacion());
                System.out.println(Persona.mostrarRiesgo());
                break;
            }else{
		encontrar = false;
            }
	}
        if(encontrar==false){
            System.out.println("No se ha encontrado personas con la cédula ingresada");
        } 
        
          
    break;
    
    case 5:
        
         System.out.print("Por favor ingrese su Cédula: ");
        cedula = sc.next();
        for (Persona Persona : personas) {
            if ((Persona.getCedula()).equals(cedula)) {
		encontrar = true;
		for (Encuesta encuesta : Persona.getEncuestas()) {
                    fechaEncuesta=encuesta.getFechaEncuesta();
                    System.out.println(Persona.mostrarInformacionEncuesta(fechaEncuesta));
                    System.out.println(Persona.verResultadoEncuesta(fechaEncuesta));
                }
                
                break;
            }else{
		encontrar = false;
            }
	}
        if(encontrar==false){
            System.out.println("No se ha encontrado personas con la cédula ingresada");
        }
        
    break;
    case 6:
        for (Persona Persona : personas) {
            
		System.out.println(Persona.mostrarInformacion());
                System.out.println(Persona.mostrarRiesgo());
                
	}
    break;
    case 7:
    System.out.println("\n\t\t*********Gracias por usar nuestro programa*********");
    break;
    default:
    System.out.println("\nPorfavor ingrese un valor entero del 1 al 4\n");
    
    }   
}while(op!=7);

}
}