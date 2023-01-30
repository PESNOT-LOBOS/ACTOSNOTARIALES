package ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.Modelo;

public class ReporteLibros {
    private Long idTipoLibro;
    private String nombreAdjuntoLibro;
    private String nombreTipoLibro;
    private Boolean estadoActivo;

    public ReporteLibros() {
    }

    public ReporteLibros(Long idTipoLibro, String nombreAdjuntoLibro, String nombreTipoLibro, Boolean estadoActivo) {
        this.idTipoLibro = idTipoLibro;
        this.nombreAdjuntoLibro = nombreAdjuntoLibro;
        this.nombreTipoLibro = nombreTipoLibro;
        this.estadoActivo = estadoActivo;
    }

    public Long getIdTipoLibro() {
        return idTipoLibro;
    }

    public void setIdTipoLibro(Long idTipoLibro) {
        this.idTipoLibro = idTipoLibro;
    }

    public String getNombreAdjuntoLibro() {
        return nombreAdjuntoLibro;
    }

    public void setNombreAdjuntoLibro(String nombreAdjuntoLibro) {
        this.nombreAdjuntoLibro = nombreAdjuntoLibro;
    }

    public String getNombreTipoLibro() {
        return nombreTipoLibro;
    }

    public void setNombreTipoLibro(String nombreTipoLibro) {
        this.nombreTipoLibro = nombreTipoLibro;
    }

    public String getEstadoActivo() {
        return estadoActivo ? "Activo" : "Inactivo";
    }

    public void setEstadoActivo(Boolean estadoActivo) {
        this.estadoActivo = estadoActivo;
    }
}
