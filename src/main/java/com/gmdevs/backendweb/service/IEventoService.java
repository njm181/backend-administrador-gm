package com.gmdevs.backendweb.service;

import com.gmdevs.backendweb.domain.entity.Evento;
import com.gmdevs.backendweb.exception.ServiceException;

public interface IEventoService {
    Evento guardarEvento(Evento evento) throws ServiceException;

}
