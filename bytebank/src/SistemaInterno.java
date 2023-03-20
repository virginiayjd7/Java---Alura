public class SistemaInterno {
    
    private String clave = "aluracursos";
    public boolean autenticar(Autentificable gerente){
        boolean puedeIniciarSesion = gerente.inciarSesion(clave);
        if (puedeIniciarSesion){
            System.out.println("Login exitoso");
            return true;
        } else {
            System.out.println("error en login");
            return false;
        }
    }
}
