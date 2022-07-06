package Hobbies;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
/*Heredamos atributos de la clase "Bailar", ya que esta contiene los de la sueper clase*/
public class Meditación extends Bailar {

    public Meditación(int tiempo, int frecuencia, String nombre, String edad, int diasSemana) {
        super(tiempo, frecuencia, nombre, edad, diasSemana);
    }

    public void IngresoMeditadores() {

        int nMeditadores[];
        int n;
        File archivo;
        archivo=new File("Registro_Meditadores.txt");

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dijite el numero de personas a meditar: ");
        n = teclado.nextInt();
        nMeditadores = new int[n];
       if (!archivo.exists()){

           try {
               archivo.createNewFile();
               String filePath = "C:\\poo\\Registro_Meditadores.txt";
               FileWriter fw = new FileWriter(filePath, true);
               String lineToAppend = "";
               fw.write(lineToAppend);
               fw.write("Numero de meditadores: ");
               fw.write(nMeditadores + "\n");

               for (int i = 0; i < nMeditadores.length; i++) {
                   System.out.println("Dijite el nombre del meditadores " + i + 1 + "°: ");
                   setNombre(teclado.next());
                   fw.write("Nombre " + i + 1 + "°: ");
                   fw.write(getNombre(i) + "\n");
                   System.out.println("Dijite la edad del " + i + 1 + "° meditador: ");
                   setEdad(teclado.next());
                   fw.write("Edad " + i + 1 + "°: ");
                   fw.write(getEdad() + "\n");
                   System.out.println("Dijite el numero de dias de la semana que realiza la actividad: ");
                   setDiasSemana(teclado.nextInt());
                   fw.write("Numero de dias de la semana del " + i + 1 + "° meditador que realiza la actividad: ");
                   fw.write(getDiasSemana() + "\n");
                   System.out.println("Dijite el tiempo en horas que tarda en hacer la actividad: ");
                   setTiempo(teclado.nextInt());
                   fw.write("El corredor " + i + 1 + "° realiza la actividad en: ");
                   fw.write(getTiempo() + " horas\n");

                   System.out.println("====================================");
                   fw.write("=============================================");
               }
               fw.close();
           } catch (Exception e) {
               System.out.println("E R R O R !!!!");
           }
       }else {
           try {
               String filePath = "C:\\poo\\Registro_Meditadores.txt";
               FileWriter fw = new FileWriter(filePath, true);
               String lineToAppend = "";
               fw.write(lineToAppend);
               fw.write("Numero de meditadores: ");
               fw.write(nMeditadores + "\n");

               for (int i = 0; i < nMeditadores.length; i++) {
                   System.out.println("Dijite el nombre del meditadores " + i + 1 + "°: ");
                   setNombre(teclado.next());
                   fw.write("Nombre " + i + 1 + "°: ");
                   fw.write(getNombre(i) + "\n");
                   System.out.println("Dijite la edad del " + i + 1 + "° meditador: ");
                   setEdad(teclado.next());
                   fw.write("Edad " + i + 1 + "°: ");
                   fw.write(getEdad() + "\n");
                   System.out.println("Dijite el numero de dias de la semana que realiza la actividad: ");
                   setDiasSemana(teclado.nextInt());
                   fw.write("Numero de dias de la semana del " + i + 1 + "° meditador que realiza la actividad: ");
                   fw.write(getDiasSemana() + "\n");
                   System.out.println("Dijite el tiempo en horas que tarda en hacer la actividad: ");
                   setTiempo(teclado.nextInt());
                   fw.write("El corredor " + i + 1 + "° realiza la actividad en: ");
                   fw.write(getTiempo() + " horas\n");

                   System.out.println("====================================");
                   fw.write("=============================================");
               }
               fw.close();
           } catch (Exception e) {
               System.out.println("E R R O R !!!!");
           }

       }
    }
}