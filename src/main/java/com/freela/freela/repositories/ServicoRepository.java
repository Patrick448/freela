package com.freela.freela.repositories;

import com.freela.freela.model.Servico;
import com.freela.freela.model.Usuario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;
import java.util.List;

public interface ServicoRepository extends JpaRepository<Servico, Long> {

    @Query("SELECT s FROM Servico s WHERE s.buscaPrestador = true")
    Page<Servico> findServicesLookingForProviders(Pageable pageable);

    @Query("SELECT s FROM Servico s WHERE s.buscaContratante = true")
    Page<Servico> findServicesLookingForContractors(Pageable pageable);

    @Query("SELECT s FROM Servico s WHERE s.anunciante.email = ?1")
    List<Servico> findServicesByUserEmail(String email);

}
