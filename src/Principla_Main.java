/*Importamos las librerias*/
import Hobbies.Bailar;
import Hobbies.Meditación;
import Hobbies.Salir_A_Correr;

public class Principla_Main {

    /*SE DEVE CREAR UNA CARPETA LLAMADA "poo" EN EL DISCO LOCAL C PARA QUE MUESTRE LOS ARCHIVOS*/

    public static void main(String[] args) {

        /*Creacion de variables e inicializacion de las mismas*/
        int tiempo=0;
        int frecuencia=0;
        String nombre="";
        String edad="";
        String parque="";
        int diasSemana=0;
        /*Lamado de los metodos*/
        Bailar bailarin1=new Bailar(tiempo,frecuencia,nombre,edad,diasSemana);
        Salir_A_Correr corredor1=new Salir_A_Correr(tiempo,frecuencia,nombre,edad,diasSemana,parque);
        Meditación meditación=new Meditación(tiempo,frecuencia,nombre,edad,diasSemana);
        meditación.IngresoMeditadores();
        corredor1.IngresoCorredores();
        bailarin1.IngresoBailarines();

    }
}
