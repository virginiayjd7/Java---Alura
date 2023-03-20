public class Administrador extends Funcionario implements Autentificable{

    //private String clave;

    private AutenticacionUtil util;

    public Administrador(){
      this.util = new AutenticacionUtil();
    }

    /*public void setClave(String clave){
      this.clave = clave;

    }
    public boolean inciarSesion(String clave){
      return clave == "aluracursos";
    }
    */
    @Override
    public double getBonificacion() {
        // TODO Auto-generated method stub
        return this.getSalario();
    }

    @Override
    public void setClave(String clave) {
      // TODO Auto-generated method stub
      this.util.setClave(clave);
    }

    @Override
    public boolean inciarSesion(String clave) {
      // TODO Auto-generated method stub
      /*if(this.clave == clave){
        return true;
      }
      return false;*/
      return this.util.inciarSesion(clave);
    }

    
}
