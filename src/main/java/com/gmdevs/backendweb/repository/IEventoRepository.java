package com.gmdevs.backendweb.repository;

import com.gmdevs.backendweb.domain.entity.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEventoRepository extends JpaRepository<Evento, Integer> {
}
