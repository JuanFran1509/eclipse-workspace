package persistencia.interfaces;

import java.util.List;

import entidad.coche;

public interface DaoCoche {
boolean alta(coche c);
boolean baja(String matricula);
boolean modificar(coche c);
coche obtener(String matricula);
List<coche> listar();
 
}
