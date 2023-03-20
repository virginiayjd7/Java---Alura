public class TestSistemaInterno {
   public static void main(String[] args) {
    
    SistemaInterno sistemaInterno = new SistemaInterno();
    Gerente gerente1 = new Gerente();
    Administrador administrador = new Administrador();
    
    sistemaInterno.autenticar(gerente1);
    sistemaInterno.autenticar(administrador);
   }

    
    
}
