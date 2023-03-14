public class EjemploCiclos {
    public static void main(String[] args) {
        
        int contador = 0;
        int total=0;

        while(contador <= 10 ){ ///se puede usar con un variablefuera
            total = total +contador;
            
            //contador = contador + 1;
            //contador += 1;
            contador++;

        }
        System.out.println(total);

    }
}
