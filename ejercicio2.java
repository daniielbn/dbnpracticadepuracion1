public class ejercicio2 {
    public static void mostrartablashasta(int a){
        int valor;
        for (int i=1; i<=a; i++){
            for (int j=1; j<=a;j++){
                valor = i * j;
                valor = valor+1;
                System.out.println(i + " * " + j + " = "+ valor);
            }
            System.out.println("--------");
        }
    }
}
