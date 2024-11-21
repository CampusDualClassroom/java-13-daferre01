package com.campusdual.classroom;

public class FuelTank {

  private int actualFuel = 10;

  public void showDetails() {
    System.out.println("La capacidad actual es de " + this.actualFuel + " litros.");
  }

  public int getActualFuel() {
    return this.actualFuel;
  }

  public void setActualFuel(int actualFuel) {
    if (actualFuel>=0){
      this.actualFuel = actualFuel;
    }else{
      System.out.println("No se puede");
    }
  }
}

//Descripción del ejercicio
//Se debe completar una clase proporcionada para evitar mediante el encapsulamiento el acceso directo a sus propiedades.
//
//        Objetivos
//Dada la clase FuelTank proporcionada, crear un setter en ella que impida el acceso directo a la modificación del valor de su propiedad actualFuel. Será necesario además modificar el tipo de visibilidad a la propiedad correspondiente.
//Métodos a implementar
//El setter a implementar no devolverá nada. Sólo cambiará el valor de la propiedad con lo que reciba por parámetro. El setter debe además asegurarse (con un if-else) de no aceptar posibles valores negativos. En caso de que se reciba por parámetro un valor negativo, no se modificará el valor de la propiedad y se mostrará por pantalla un mensaje informativo.
//
//La propiedad actualFuel debe tener el acceso restringido. Sólo accesible de forma directa desde la propia clase que la contiene.
//
//El método showDetails() de la clase FuelTank debe acceder al valor de la propiedad a través del getter proporcionado.