package kh.com.wa.rest.service;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.spi.LoggingEvent;
import kh.com.wa.data.jpa.enity.Pet;
import kh.com.wa.rest.repo.IPetRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.ILoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PetServices {

    private final IPetRepository petRepository;


    public List<Pet> getAllPet(){
       List<Pet> list = petRepository.findAll();
       return list;
    }
}
