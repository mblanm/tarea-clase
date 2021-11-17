/**
 * Pasar a limpio la siguiente clase.
 * 
 * Crear clase JuegoArray.java que contenga todo el codigo de esta clase
 * ordenado: - las funciones max y min que devuelven el valor maximo y minimo de
 * un array(deben retornar valor ) (después ya lo imprimís) - los atributos que
 * consideres necesarios - metodo que muestra los elementos del array que se la
 * pasa por parametro
 * 
 * Esta clase ClasePrincipal: - Contendra solamente el main - Creara los objetos
 * necesarios para probar todas las funciones de vuestra clase JuegoArray
 * 
 * Todo debera ser compilado con un build xml (conservar el paquete )
 * 
 * Incluir los comentarios necesarios con estilo javadoc
 * 
 * Podeis renombrar los metodos o las clases a una poli­tica de naming que os
 * guste mas
 */
class ClasePrincipal {

    public static void main(String[] args) {

        int[] numbers = { 2, -9, 0, 5, 12, -25, 22, 9, 8, 12 };
        int[] numbersIntSmaller = new int[3];
        int[][] listado = new int[3][];
        int sumaElementos = 0, sumaElementos2 = 0;
        Double average;


        int a[] = { 33, 3, 4, -5 };// declaring and initializing an array

        JuegoArray miClase = new JuegoArray();
        miClase.min(a);

        System.out.println("Sum = " + miClase.sumarElementos(a));
        System.out.println("Average = " + miClase.avg(a));
        System.out.println("Min = " + miClase.min(a));
        System.out.println("Max = " + miClase.max(a));
        System.out.println("Longitad array = " + miClase.longitudArray(a)); // a.length;
    }

}
