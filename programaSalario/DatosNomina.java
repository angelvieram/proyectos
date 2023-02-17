package varios.personal.programaSalario;

public enum DatosNomina {
    HED("Hora extra diurna ordinaria"),
    HENO("Hora extra nocturna ordinaria"),
    RHNO("Recargo por hora nocturna ordinaria"),
    HEDD("Hora extra diurna dominical"),
    HEND("Hora extra nocturna dominical"),
    HRNDF("Hora recargo nocturno, dominical o festivo"),
    DD("Día dominical"),
    HD("Hora dominical");

    private final String datosNomina;

    DatosNomina(String datosNomina) {
        this.datosNomina = datosNomina;
    }

    public String getDatosNomina() {
        return datosNomina;
    }
}
