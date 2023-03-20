//                  extiende de
public class Gerente extends Funcionario implements Autentificable{ //herencia
     /*  private String clave;

      public void setClave(String clave){
        this.clave = clave;

      }
      public boolean inciarSesion(String clave){
        return clave == "aluracursos";
      }*/
    //sobreescritura
      public double getBonificacion(){
        //return super.getSalario()+(super.getSalario()*0.1);//de la clase padre funcionario 
        System.out.println("ejecutando desde gerente");
        return 2000;//super.getSalario() + this.getSalario();
    }

      @Override
      public void setClave(String clave) {
        // TODO Auto-generated method stub
        
      }

      @Override
      public boolean inciarSesion(String clave) {
        // TODO Auto-generated method stub
        return false;
      }

}
