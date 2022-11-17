package com.tcc.petPlusBackEnd.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.tcc.petPlusBackEnd.model.Servico;

@Repository
public interface ServicoRepository extends JpaRepository<Servico, Long>{
	@Query(
		value="SELECT * FROM tb_servico s WHERE s.id_clinica = ?1", 
		nativeQuery = true
	) 
	public List<Servico> findByclinicaServico(Long idCLinica); 
}
