public class EjemploFiltro2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] valoresAFiltrar = {3, 5, 7, 2};

        EjemploFiltro2 ejemplo = new EjemploFiltro2();
        ejemplo.filtrarValores(arr, valoresAFiltrar);
    }

    public void filtrarValores(int[] arr, int[] valoresAFiltrar) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < valoresAFiltrar.length; j++) {
                if (arr[i] == valoresAFiltrar[j]) {
                    System.out.println("Se encontró el valor: " + arr[i]);
                }
            }
        }
    }
}