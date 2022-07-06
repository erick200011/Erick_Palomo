package Hobbies;
import java.io.*;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
/*Heredamos atributos de la clase "Bailar", ya que esta contiene los de la sueper clase*/
public class Salir_A_Correr extends Bailar{

    /*Vreacion del atributo unico de esta clase*/
    private String parque;

    public Salir_A_Correr(int tiempo, int frecuencia, String nombre, String edad, int diasSemana, String parque) {
        super(tiempo, frecuencia, nombre, edad, diasSemana);
        this.parque = parque;
    }

    public String getParque() {
        return parque;
    }

    public void setParque(String parque) {
        this.parque = parque;
    }

    public void IngresoCorredores(){

        int nCorredores[];
        int n;
        File archivos;
        archivos=new File("Registro_Corredores.txt");

        Scanner teclado=new Scanner(System.in);
        System.out.println("Dijite el numero de personas a correr: ");
        n=teclado.nextInt();
        nCorredores=new int[n];
       if (!archivos.exists()){
           try {
               archivos.createNewFile();
               String filePath="C:\\poo\\Registro_Corredores.txt";
               FileWriter fw =new FileWriter(filePath,true);
               String lineToAppend="";
               fw.write(lineToAppend);
               fw.write("Numero de bailarines: ");
               fw.write(nCorredores+"\n");

               for (int i = 0; i <nCorredores.length ; i++) {
                   System.out.println("Dijite el nombre del corredor "+i+1+"°: ");
                   setNombre(teclado.next());
                   fw.write("Nombre "+i+1+"°: ");
                   fw.write(getNombre(i)+"\n");
                   System.out.println("Dijite la edad del "+i+1+"° corredor: ");
                   setEdad(teclado.next());
                   fw.write("Edad "+i+1+"°: ");
                   fw.write(getEdad()+"\n");
                   System.out.println("Dijite el numero de dias de la semana que realiza la actividad: ");
                   setDiasSemana(teclado.nextInt());
                   fw.write("Numero de dias de la semana del "+i+1+"°corredor que realiza la actividad: ");
                   fw.write(getDiasSemana()+"\n");
                   System.out.println("Dijite el tiempo en horas que tarda en hacer la actividad: ");
                   setTiempo(teclado.nextInt());
                   fw.write("El corredor "+i+1+"° realiza la actividad en: ");
                   fw.write(getTiempo()+" horas\n");
                   System.out.println("Dijite el parque en el que corre: ");
                   setParque(teclado.next());
                   fw.write("El parque del corredor "+i+1+"°: ");
                   fw.write(getParque());
                   System.out.println("====================================");
                   fw.write("=============================================");
               }
               fw.close();
           }
           catch (Exception e){
               System.out.println("E R R O R !!!!");
           }
       }else {
           try {
               String filePath="C:\\poo\\Registro_Corredores.txt";
               FileWriter fw =new FileWriter(filePath,true);
               String lineToAppend="";
               fw.write(lineToAppend);
               fw.write("Numero de bailarines: ");
               fw.write(nCorredores+"\n");

               for (int i = 0; i <nCorredores.length ; i++) {
                   System.out.println("Dijite el nombre del corredor "+i+1+"°: ");
                   setNombre(teclado.next());
                   fw.write("Nombre "+i+1+"°: ");
                   fw.write(getNombre(i)+"\n");
                   System.out.println("Dijite la edad del "+i+1+"° corredor: ");
                   setEdad(teclado.next());
                   fw.write("Edad "+i+1+"°: ");
                   fw.write(getEdad()+"\n");
                   System.out.println("Dijite el numero de dias de la semana que realiza la actividad: ");
                   setDiasSemana(teclado.nextInt());
                   fw.write("Numero de dias de la semana del "+i+1+"°corredor que realiza la actividad: ");
                   fw.write(getDiasSemana()+"\n");
                   System.out.println("Dijite el tiempo en horas que tarda en hacer la actividad: ");
                   setTiempo(teclado.nextInt());
                   fw.write("El corredor "+i+1+"° realiza la actividad en: ");
                   fw.write(getTiempo()+" horas\n");
                   System.out.println("Dijite el parque en el que corre: ");
                   setParque(teclado.next());
                   fw.write("El parque del corredor "+i+1+"°: ");
                   fw.write(getParque());
                   System.out.println("====================================");
                   fw.write("=============================================");
               }
               fw.close();
           }
           catch (Exception e){
               System.out.println("E R R O R !!!!");
           }

       }
    }
}


