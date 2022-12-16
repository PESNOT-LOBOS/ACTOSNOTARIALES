package ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.Modelo.ActoNotarial;

@Repository
public interface ActoNotarialRepository extends JpaRepository<ActoNotarial, Long> {
	
	
	@Query(nativeQuery = true,value = "SELECT * FROM CATALOGOACTONOTARIAL a WHERE a.NOMBRECATALOGOACTONOTARIAL LIKE :nombre%")
	List<ActoNotarial> getActosLike(@Param("nombre") String nombre);	
	
	@Query(nativeQuery = true,value = "SELECT * FROM CATALOGOACTONOTARIAL a WHERE a.IDTIPOLIBRO = :libro")
	List<ActoNotarial> getActosByIdLibro(@Param("libro") String libro);
	
	@Query(nativeQuery = true,value = "SELECT * from CATALOGOACTONOTARIAL where ESTADOCATALAGOACTONOTARIAL='true'")
	List<ActoNotarial> getActosActivos();
	
	@Query(nativeQuery = true,value = "SELECT DISTINCT A.IDCATALOGOACTONOTARIAL, A.ARTICULOCATALOGOACTONOTARIAL, A.ESTADOCATALAGOACTONOTARIAL, A.GRAVAIVACATALOGOACTONOTARIAL, A.HABILITANTECIUDADANOCATALOGOACTONOTARIAL,A.NOMBRECATALOGOACTONOTARIAL, A.TARIFACATALOGOACTONOTARIAL,A.TRAMITEUNILATERALCATALOGOACTONOTARIAL,A.USACALCULOTABLACATALOGOACTONOTARIAL,A.VALOREXONERACIONCATALOGOACTONOTARIAL,A.VALOREXTRACATALOGOACTONOTARIAL, A.IDBASECOBROACTO,A.IDCLASIFICACIONNUMEROINTERVIENTEACTO, A.IDTIPOLIBRO from CATALOGOACTONOTARIAL as a join MOTIVOCOBROCATALOGOACTO as m on a.IDCATALOGOACTONOTARIAL=m.IDCATALOGOACTONOTARIAL UNION SELECT DISTINCT A.IDCATALOGOACTONOTARIAL, A.ARTICULOCATALOGOACTONOTARIAL, A.ESTADOCATALAGOACTONOTARIAL, A.GRAVAIVACATALOGOACTONOTARIAL, A.HABILITANTECIUDADANOCATALOGOACTONOTARIAL,A.NOMBRECATALOGOACTONOTARIAL, A.TARIFACATALOGOACTONOTARIAL, A.TRAMITEUNILATERALCATALOGOACTONOTARIAL,A.USACALCULOTABLACATALOGOACTONOTARIAL,A.VALOREXONERACIONCATALOGOACTONOTARIAL, A.VALOREXTRACATALOGOACTONOTARIAL, A.IDBASECOBROACTO,A.IDCLASIFICACIONNUMEROINTERVIENTEACTO,A.IDTIPOLIBRO from CATALOGOACTONOTARIAL as a join ACTORANGOTARIFA as m on a.IDCATALOGOACTONOTARIAL=m.IDCATALOGOACTONOTARIAL") //revisar si es "a" o "as a"
	List<ActoNotarial> getActosConTarifa();

}
