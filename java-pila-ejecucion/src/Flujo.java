public class Flujo {
  public static void main(String[] args) {
    System.out.println("Ini do main");
    try {
      metodo1();
    } catch (MiException | ArithmeticException  e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    System.out.println("Fim do main");
  }
  public static void metodo1() throws MiException{
    System.out.println("Ini do metodo1");
    /*try{
      metodo2();
    }catch (MiException mException){
      mException.printStackTrace();

    }*/
    metodo2();
    System.out.println("Fim do metodo1");
  }
  public static void metodo2() throws MiException{
    System.out.println("Ini do metodo2");
     //ArithmeticException ae = new ArithmeticException();
    /*for(int i =1; i<= 5; i++){
      System.out.println("i");
      try{//intenta esto
        if (i==3){
          int num =0;//nose puede dividir en cero
          int resultado =30/num;
          System.out.println(resultado);

        }
       
        String test = null;
        System.out.println(test.toString());

      }catch(ArithmeticException | NullPointerException exception){//atrapa el error
         System.out.println("atrapo excepcion");
         System.out.println(exception.getMessage());
         exception.printStackTrace();
      }/*catch(NullPointerException exception){//atrapa el error
        System.out.println("atrapo null pointer");
        System.out.println(exception.getMessage());
        exception.printStackTrace();
     }*/
     //Cuenta cuenta = new Cuenta();
    //int a = 50/0; //arimeticexception
    //Cuenta c = null;
    //c.depositar();
    throw new MiException("mi excepcion fue lanzada");
    //System.out.println("Fim do metodo2");
    //metodo2();
  }
}