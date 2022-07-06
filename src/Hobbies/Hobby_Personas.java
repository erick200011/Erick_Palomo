package Hobbies;

/*Esta es la super clase*/
public class Hobby_Personas {

     /*Creacion de atributos de la super clace*/
     private int tiempo;
     private int frecuencia;
     private String nombre;
     private String edad;

     /*Creacion del constructor*/
     public Hobby_Personas(int tiempo, int frecuencia, String nombre, String edad) {
          this.tiempo = tiempo;
          this.frecuencia = frecuencia;
          this.nombre = nombre;
          this.edad = edad;
     }
     /*Creacion de los setter y getter*/

     public int getTiempo() {
          return tiempo;
     }

     public void setTiempo(int tiempo) {
          this.tiempo = tiempo;
     }

     public int getFrecuencia() {
          return frecuencia;
     }

     public void setFrecuencia(int frecuencia) {
          this.frecuencia = frecuencia;
     }

     public String getNombre(int i) {
          return nombre;
     }

     public void setNombre(String nombre) {
          this.nombre = nombre;
     }

     public String getEdad() {
          return edad;
     }

     public void setEdad(String edad) {
          this.edad = edad;
     }
}
