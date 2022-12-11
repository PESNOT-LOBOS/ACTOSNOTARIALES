package ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.Modelo.MotivoCobroCatalogoActo;

@Repository
public interface MotivoCobroCatalogoActoRepository extends JpaRepository <MotivoCobroCatalogoActo,Long> {
	
    @Modifying
	@Query(nativeQuery = true,value = "update MOTIVOCOBROCATALOGOACTO set ESTADOMOTIVOCOBROCATALOGOACTO=0 where IDCATALOGOACTONOTARIAL =:idActo") 
	void deshabilitar(@Param("idActo") String idActo);
	
}