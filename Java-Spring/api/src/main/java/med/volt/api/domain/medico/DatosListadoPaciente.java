package med.volt.api.domain.medico;

public record DatosListadoPaciente (Long id,String nombre, String especialidad, String documento, String email){
    
     public DatosListadoPaciente(Medico medico) {
        this(medico.getId(), medico.getNombre(), medico.getEspecialidad().toString(), medico.getDocumento(), medico.getEmail());
    }

}
