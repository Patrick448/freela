package com.freela.freela.repositories;


import com.freela.freela.model.Contrato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ContratoRepository extends JpaRepository<Contrato, Long> {

    @Query("SELECT c FROM Contrato c WHERE c.prestador.email = ?1 OR c.contratante.email = ?1")
    List<Contrato> findContractsByUserEmail(String email);
}
