package med.volt.api.domain.paciente;

import med.volt.api.domain.direccion.Direccion;

public record DatosDetalladoPaciente(String nombre, String email, String telefono, String documentoIdentidad, Direccion direccion) { 
   /*  public DatosDetalladoPaciente(Paciente paciente) { 
        this(paciente.getNombre(), paciente.getEmail(), paciente.getTelefono(), paciente.getDocumentoIdentidad(), paciente.getDireccion()); 
    }*/
} 
