public class TestConexion {
    public static void main(String[] args) throws Exception {
        
        try(Conexion con = new Conexion()){
          con.leerDatos();
        } catch(IllegalStateException ex){
            System.out.println("ejecutando chath");
            ex.printStackTrace();

        }
        /*Conexion con = null;
        try {
            con = new Conexion();
            con.leerDatos();
            
        } catch (IllegalStateException ex) {
            // TODO: handle exception
            System.out.println("recibiendo excepcion");
            ex.printStackTrace();
            
        }finally{
            System.out.println("ejecutanco finly");
            if(con != null){
            con.cerrar();
            }
        }*/


        
    }
}
