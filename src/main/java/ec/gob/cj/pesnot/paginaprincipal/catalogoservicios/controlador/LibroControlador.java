package ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.Modelo.Libro;
import ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.service.LibroService;

@RestController
@RequestMapping("/v1")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class LibroControlador {

	@Autowired
	private LibroService libroService;

	public LibroControlador(LibroService libroService) {
		super();
		this.libroService = libroService;
	}

	@GetMapping(value="/libros", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Libro> obtenerLibros() {
		List<Libro> ListaLibros = libroService.getLibros();
		return ListaLibros;
	}

	@GetMapping(value="/libros/actos", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Libro> obtenerLibrosConActosN() {
		List<Libro> ListaLibros = libroService.getLibrosWithActN();
		return ListaLibros;
	}

	@GetMapping(value="/libros/activos", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Libro> obtenerLibrosActivos() {
		List<Libro> ListaLibros = libroService.getLibrosActivos();
		return ListaLibros;
	}

	@PostMapping(value="/libros", produces = MediaType.APPLICATION_JSON_VALUE)
	public Libro guardarLibro(@RequestBody Libro objLibro) {

		return libroService.ingresarLibrosL(objLibro);
	}

	/*
	 * @PostMapping("/saveLibrosAdministracion") public Optional<Libro>
	 * guardarLibroAdmin(@RequestBody Libro objLibro) {
	 * 
	 * return libroService.ingresarAdministracion(objLibro); }
	 */

	@GetMapping(value="/libros/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Optional<Libro> obtenerLibroById(@PathVariable("id") Long id) {
		return libroService.libroById(id);
	}

	@GetMapping(value="/libros/nombre/{nombre}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Libro obtenerLibroByNombre(@PathVariable("nombre") String id) {
		return libroService.getLibroByNombre(id);
	}

}
