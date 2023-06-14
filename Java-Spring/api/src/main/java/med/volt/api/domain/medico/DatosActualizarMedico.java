package med.volt.api.domain.medico;

import jakarta.validation.constraints.NotNull;
import med.volt.api.domain.direccion.DatosDireccion;

public record DatosActualizarMedico(@NotNull Long id, String nombre, String documento, DatosDireccion direccion) {
    
}
/*public record DatosActualizacionMedico(
    Long id,
    String nombre,
    String telefono,
    @Valid DatosActualizacionDireccion direccion
) {
} */