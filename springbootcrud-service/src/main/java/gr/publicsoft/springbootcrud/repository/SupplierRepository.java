package gr.publicsoft.springbootcrud.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import gr.publicsoft.springbootcrud.model.Supplier;

@CrossOrigin(origins = "http://localhost:9000")
@RepositoryRestResource
public interface SupplierRepository extends JpaRepository<Supplier, Long> {
	
	Supplier findBycompanyName(String companyName);

	Supplier findByvatNumber(String vatNumber);

    @Query("SELECT s FROM Supplier s "
            + "WHERE s.companyName LIKE CONCAT('%',?1,'%') "
            + "     OR s.vatNumber LIKE CONCAT('%',?1,'%')")
    Page<Supplier> findByQuery(@Param("query") String query, Pageable pageable);
}
