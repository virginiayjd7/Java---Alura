package med.volt.api.domain.paciente;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.val;
import med.volt.api.domain.direccion.DatosDireccion;

public record DatosRegistroPaciente (

    @NotBlank
    String nombre,
    @NotBlank
    @Email
    String email,
    @NotBlank
    String telefono,
    @NotBlank @Pattern(regexp = "\\d{3}\\.?\\d{3}\\.?\\d{3}\\-?\\d{2}")
    String documentoIdentidad,
    @NotBlank @val
    DatosDireccion direccion){
    
}
