package com.gmdevs.backendweb.service;

import com.gmdevs.backendweb.domain.entity.Evento;
import com.gmdevs.backendweb.exception.ServiceException;
import com.gmdevs.backendweb.repository.IEventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EventoService implements IEventoService{

    @Autowired
    private IEventoRepository iEventoRepository;

    @Override
    public Evento guardarEvento(Evento evento) throws ServiceException {
        try{
            return iEventoRepository.save(evento);
        }catch(Exception e){
            throw new ServiceException(e.getMessage());
        }
    }

    /*
    * public Chruch getById(Long idChruch) throws NotFoundException, ServiceException {
        Optional<Chruch> chruch;
        try{
            chruch = chruchRepository.findById(idChruch);
            if(chruch.isPresent()){
                return chruch.get();
            }else{
                throw new NotFoundException("No hay resultados asignados");
            }
        }catch (Exception e){
            throw new ServiceException(e.getMessage());
        }
    }
*/
}
