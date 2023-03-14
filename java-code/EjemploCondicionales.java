public class EjemploCondicionales {
    
    public static void main(String[] args) {

        System.out.println("hello wordl");

        int edad=17;
        int cant=2;

        if (edad >= 18){
            System.out.println("usted pueden entrar");
        }
        else{
            if(cant >= 2){
                System.out.println("usted es menor de edad "+",pero esta permitido su ingreso");
            }else{
                System.out.println("usted no puede" +"entrar");
            }

        }

        System.out.println("bienvenido");

        
    }
}
