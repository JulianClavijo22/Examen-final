public class ConsumoGasolina {

    public static int contarConsumosAltos(int[][] matriz) {
        int contador = 0;
        for (int[] fila : matriz) {
            for (int consumo : fila) {
                if (consumo > 8) {
                    contador++;
                }
            }
        }
        return contador;
    }

    public static double promedioConsumoModerado(int[][] matriz) {
        int suma = 0, cantidad = 0;
        for (int[] fila : matriz) {
            for (int consumo : fila) {
                if (consumo >= 4 && consumo <= 7) {
                    suma += consumo;
                    cantidad++;
                }
            }
        }
        return cantidad > 0 ? (double) suma / cantidad : 0;
    }

    public static void imprimirConsumoBajo(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 3) {
                    System.out.println("Consumo bajo en posición [" + i + "][" + j + "]: " + matriz[i][j]);
                }
            }
        }
    }

    public static int[] posicionConsumoMaximo(int[][] matriz) {
        int max = Integer.MIN_VALUE;


        int[] posicion = new int[2];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                    posicion[0] = i;
                    posicion[1] = j;
                }
            }
        }
        return posicion;
    }

    public static void main(String[] args) {
        int[][] consumo = {
            {5, 2, 9},
            {8, 6, 4},
            {10, 1, 3}
        };

        System.out.println("Consumos altos: " + contarConsumosAltos(consumo));
        System.out.println("Promedio consumo moderado: " + promedioConsumoModerado(consumo));
        imprimirConsumoBajo(consumo);
        int[] posicionMaxima = posicionConsumoMaximo(consumo);
        System.out.println("Posición del consumo máximo: [" + posicionMaxima[0] + "][" + posicionMaxima[1] + "]");
    }
}

    


