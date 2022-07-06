package Hobbies;

import java.io.FileWriter;
import java.util.Scanner;
import java.io.*;
/*Creacion de objeto y llamado de atributos de la super clase*/
public class Bailar extends Hobby_Personas{

    /*Creacion del atributo unico de este medodo*/
    private int DiasSemana;

    public Bailar(int tiempo, int frecuencia, String nombre, String edad, int diasSemana) {
        super(tiempo, frecuencia, nombre, edad);
        DiasSemana = diasSemana;
    }

    public int getDiasSemana() {
        return DiasSemana;
    }

    public void setDiasSemana(int diasSemana) {
        DiasSemana = diasSemana;
    }

    /*Creacion del metodo para el ingreso por teclado*/
    public void IngresoBailarines (){

        int nBailarines[];
        int n;
        File archivo;
        archivo=new File("Registro_Bailarines.txt");

        Scanner teclado=new Scanner(System.in);
        System.out.println("Dijite el numero de personas a bailar: ");
        n=teclado.nextInt();
        nBailarines=new int[n];
        /*Creacion de los ficheros para guardar en un documento los datos ingresados por teclado
        * Esto se repite en los otros objetos*/
        if (!archivo.exists()){
            try {
                archivo.createNewFile();

                String filePath="C:\\poo\\Registro_Bailarines.txt";
                FileWriter fw =new FileWriter(filePath,true);
                String lineToAppend="";
                fw.write(lineToAppend);
                fw.write("Numero de bailarines: ");
                fw.write(nBailarines+"\n");

                for (int i = 0; i <nBailarines.length ; i++) {
                    System.out.println("Dijite el nombre del bailarin "+i+1+": ");
                    setNombre(teclado.next());
                    fw.write("Nombre "+i+1+"°: ");
                    fw.write(getNombre(i)+"\n");
                    System.out.println("Dijite la edad del "+i+1+" bailarin: ");
                    setEdad(teclado.next());
                    fw.write("Edad "+i+1+"°: ");
                    fw.write(getEdad()+"\n");
                    System.out.println("Dijite el numero de dias de la semana que realiza la actividad: ");
                    setDiasSemana(teclado.nextInt());
                    fw.write("Numero de dias de la semana del "+i+1+"° bailarin que realiza la actividad: ");
                    fw.write(getDiasSemana()+"\n");
                    System.out.println("Dijite el timepo en horas que tarda en hacer la actividad: ");
                    setTiempo(teclado.nextInt());
                    fw.write("El bailarin "+i+1+"° realiza la actividad en: ");
                    fw.write(getTiempo()+" horas\n");
                    System.out.println("====================================");
                    fw.write("=============================================");
                }
                fw.close();
            }
            catch (Exception e){
                System.out.println("E R R O R !!!!");
            }

        }
        else {
            try {

                String filePath="C:\\poo\\Registro_Bailarines.txt";
                FileWriter fw =new FileWriter(filePath,true);
                String lineToAppend="";
                fw.write(lineToAppend);
                fw.write("Numero de bailarines: ");
                fw.write(nBailarines+"\n");

                for (int i = 0; i <nBailarines.length ; i++) {
                    System.out.println("Dijite el nombre del bailarin "+i+1+": ");
                    setNombre(teclado.next());
                    fw.write("Nombre "+i+1+"°: ");
                    fw.write(getNombre(i)+"\n");
                    System.out.println("Dijite la edad del "+i+1+" bailarin: ");
                    setEdad(teclado.next());
                    fw.write("Edad "+i+1+"°: ");
                    fw.write(getEdad()+"\n");
                    System.out.println("Dijite el numero de dias de la semana que realiza la actividad: ");
                    setDiasSemana(teclado.nextInt());
                    fw.write("Numero de dias de la semana del "+i+1+"° bailarin que realiza la actividad: ");
                    fw.write(getDiasSemana()+"\n");
                    System.out.println("Dijite el timepo en horas que tarda en hacer la actividad: ");
                    setTiempo(teclado.nextInt());
                    fw.write("El bailarin "+i+1+"° realiza la actividad en: ");
                    fw.write(getTiempo()+" horas\n");
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
