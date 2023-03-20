public abstract class Funcionario {
    private String nombre;
    private String documento;
    private double salario;
    private int tipo;

    public int getTipo() {
        return tipo;
    }
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    public Funcionario(){//constructo dela misma clase

    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    //sobreescritura
     public abstract double getBonificacion();//{ //metodo abstractp
         // si tipi=1 es gerente//esto ya no es nesesario
         //si tipo =0 es funcionario
         /*if (this.tipo ==0){*/
            // return this.salario * 0.05;
         /* }else if (this.tipo==1){
             return this.salario; 
         }else{
             return 0;
         }
         
     }*/
}