package tema7_8_9;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Ejercicio 0
        String cadena = "cadena";
        System.out.println(reverse(cadena));

        //Ejercicio 1
        String[] animales = {"caballo", "cocodrilo", "ballena"};
        recorrerArrayUnidimensional(animales);

        //Ejercicio 2
        int[][] numeros = new int[3][2];
        recorrerArrayBidimensional(numeros);

        //Ejercicio 3
        Vector paises = new Vector();
        paises.add("Perú");
        paises.add("Brasil");
        paises.add("Canadá");
        paises.add("Ecuador");
        paises.add("Francia");
        recorrerVector(paises);

        //Ejercicio 5
        ArrayList<String> elementos = new ArrayList<String>();
        elementos.add("elemento1");
        elementos.add("elemento2");
        elementos.add("elemento3");
        elementos.add("elemento4");
        recorrerArrayList(elementos);

        //Ejercicio 6
        ArrayList<Integer> elementosInt = new ArrayList<>();
        operarArrayList(elementosInt);

        //Ejercicio 7
        try {
            double res = dividePorCero(5, 5);
            System.out.println("El resultado es: " + res);
        } catch (ArithmeticException e) {
            System.out.println("Error de división por cero: " + e.getMessage());
        } finally {
            System.out.println("Demo de código");
        }

        //Ejercicio 8
        try {
            InputStream file = new FileInputStream("c:\\file.txt");
            PrintStream out = new PrintStream("destino.txt");
            ejecutarFile(file, out);
        } catch (IOException e) {
            System.out.println("Error impresión");
        }


    }

    /**
     * Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo",
     * debe retornar "odnum aloh".
     *
     * @param cadena
     * @return cadenaInvertida
     */
    public static String reverse(String cadena) {
        String cadenaInvertida = "";

        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaInvertida = cadenaInvertida + cadena.charAt(i);
        }
        return cadenaInvertida;
    }

    /**
     * 2. Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
     *
     * @param animales
     */
    public static void recorrerArrayUnidimensional(String[] animales) {
        int i = 0;
        for (String animal : animales) {
            i++;
            System.out.println("Animal " + i + " : " + animal);
        }
    }

    /**
     * 3. Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor
     * de cada elemento en ambas dimensiones.
     *
     * @param numeros
     */
    public static void recorrerArrayBidimensional(int[][] numeros) {

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                int valor = i + j;
                System.out.println("Posición : [" + i + "] [" + j + "] = " + valor);
            }
        }
    }

    /**
     * 3. Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2do
     * y 3er elemento y muestra el resultado final.
     *
     * @param paises
     */
    public static void recorrerVector(Vector paises) {
        System.out.println("Elementos del vector, antes de ejecutar el remove: ");

        for (Object pais : paises) {
            System.out.println(pais);
        }
        paises.remove(1);
        paises.remove(1);
        System.out.println("Elementos del vector, despues de ejecutar el remove: ");
        System.out.println(paises);
    }

    /**
     * 5. Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos
     * mostrando únicamente el valor de cada elemento.
     *
     * @param elementos
     */
    public static void recorrerArrayList(List<String> elementos) {
        System.out.println("Lista de ArrayList: ");
        for (String objeto : elementos) {
            System.out.println(objeto);
        }

        LinkedList<String> lista = new LinkedList<>(elementos);
        System.out.println("Lista LinkedList: ");
        for (String object : lista) {
            System.out.println(object);
        }
    }

    /**
     * 6. Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación,
     * con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el
     * ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for"
     * de relleno.
     *
     * @param elementos
     */
    public static void operarArrayList(ArrayList<Integer> elementos) {
        System.out.println("Array antes de eliminar pares: ");
        for (int i = 0; i < 10; i++) {
            elementos.add(i + 1);
            System.out.println(elementos.get(i));
        }

        for (int i = 0; i < elementos.size(); i++) {
            if (elementos.get(i) % 2 == 0) {
                elementos.remove(i);
            }
        }

        System.out.println("Array despues de eliminar pares: ");
        for (int i = 0; i < elementos.size(); i++) {
            System.out.println(elementos.get(i));
        }

    }

    /**
     * 7. Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante
     * del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo).
     * Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente,
     * mostraremos en cualquier caso: "Demo de código".
     *
     * @param a
     * @param b
     * @return res
     */
    public static double dividePorCero(int a, int b) {
        double res = 0;
        if (b == 0) {
            throw new ArithmeticException("Esto no puede hacerse");
        }
        res = a / b;

        return res;
    }

    /**
     * 8. Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros:
     *    "fileIn" y "fileOut". La tarea de la función será realizar la copia del fichero dado
     *    en el parámetro "fileIn" al fichero dado en "fileOut".
     * @param file
     * @param out
     * @throws IOException
     */
    public static void ejecutarFile(InputStream file, PrintStream out) throws IOException {

        try {
            byte[] datos = file.readAllBytes();
            file.close();
            out.write(datos);
            out.close();
        } catch (IOException ex) {
            System.out.printf("Archivo no se logra ubicar " + ex.getMessage());
        }
    }

}

