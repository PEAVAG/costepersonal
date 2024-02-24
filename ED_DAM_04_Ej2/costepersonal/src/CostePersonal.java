public class CostePersonal {

    // primera letra del metodo cambiado a minuscula
    static float costeDelPersonal(Trabajador trabajadores[]) {
        float costeFinal = 0;

        Trabajador trabajador;
        // cambio Y por i
        for (int i = 0; i < trabajadores.length; i++) {
            trabajador = trabajadores[i];
            // salto de linea para que ajuste al ancho
            if (trabajador.getTipoTrabajador() == Trabajador.DIRECTOR ||
                    trabajador.getTipoTrabajador() == Trabajador.SUBDIRECTOR) {
                costeFinal += trabajador.getNomina();
            }
            // apertura de la llave en la misma linea del else
            else {
                costeFinal += trabajador.getNomina() + (trabajador.getHorasExtras() * 20);
            }
        }
        return costeFinal;
    }
}