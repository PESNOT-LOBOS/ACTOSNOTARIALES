package ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.Modelo.Libro;


@Repository
public interface LibroRepository extends JpaRepository<Libro, Long > {
	@Query(nativeQuery = true,value="SELECT TOP 1 * FROM TIPOLIBRO c WHERE c.NOMBRETIPOLIBRO LIKE :nombre%")
	Optional<Libro> getLibroByNombre(@Param("nombre") String nombre);

}