/*
 ma Guadalupe Brizuela Gamiño
programa que conecte mongo con java
fecha
grupo
 */
package javamongo504;

public class JavaMongo504 {

    public static void main(String[] args) {
      Connection conexion = new Connection();
      
      conexion.Mostrar();
      //conexion.insertar("Nadar");
        System.out.println("Otro");
      //conexion.Mostrar();
        System.out.println("otro mas");
        //conexion.Actualizar("Nadar","Brincar");
        conexion.eliminar("Brincar");
        conexion.Mostrar();
        
    }
    
}
