// En este ejemplo, hemos creado una clase llamada EjemploFiltro que contiene un método llamado filtrarValor.
//Este método recibe como argumentos un array y un valor a filtrar, y utiliza un bucle for para recorrer el array 
//y comparar cada elemento con el valor a filtrar. Si se encuentra una coincidencia, se imprime un mensaje indicando 
//que se ha encontrado el valor.valor

public class EjemploFiltro {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int valorAFiltrar = 5;

        EjemploFiltro ejemplo = new EjemploFiltro();
        ejemplo.filtrarValor(arr, valorAFiltrar);
    }

    public void filtrarValor(int[] arr, int valorAFiltrar) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valorAFiltrar) {
                System.out.println("Se encontró el valor: " + arr[i]);
            }
        }
    }

    void filtrarValores(int[] arr, int[] valoresAFiltrar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

// En este ejemplo, hemos creado una clase llamada EjemploFiltro que contiene un método llamado filtrarValores.
// Este método recibe como argumentos un array y un array de valores a filtrar, y utiliza dos bucles for para 
// recorrer ambos arrays. Si se encuentra una coincidencia entre un elemento del primer array y un elemento del 
// segundo array, se imprime un mensaje indicando que se ha encontrado el valor.valor

