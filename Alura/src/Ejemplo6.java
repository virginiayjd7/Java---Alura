
import java.util.ArrayList;
import model.Clase;
import model.Curso;


public class Ejemplo6 {
    public static void main(String[] args) {

        Curso curso1 = new Curso("Java", 30);
        curso1.addClase(new Clase("Golang"));
        curso1.addClase(new Clase("Python"));
        //Curso curso2 = new Curso("Golang", 10);
        //Curso curso3 = new Curso("Python", 20);
        //Curso curso4 = new Curso("Ruby", 50);

        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);
        /*cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);*/
        
        System.out.println(cursos.get(0).getClaseList());

        //Collections.sort(cursos, Collections.reverseOrder());

        //System.out.println(cursos);
    
    }
    
}
