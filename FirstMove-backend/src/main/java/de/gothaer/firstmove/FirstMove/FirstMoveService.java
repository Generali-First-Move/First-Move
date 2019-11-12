package de.gothaer.firstmove.FirstMove;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;
import java.util.List;

//Daten für DB anlegen und verarbeiten

@Service
public class FirstMoveService
{
    final static private Logger LOGGER = LoggerFactory.getLogger("CatService.class");
    //schreibt alle aktivitäten mit
    //logt Infos und steuert die Ausgabe

    private static FirstMoveRepository firstMoveRepository;
    public FirstMoveService(FirstMoveRepository firstMoveRepository)
    {
        this.firstMoveRepository = firstMoveRepository;
    }
    @PostConstruct
    public void init()
    {
        FirstMoveClass FirstMoveClass = new FirstMoveClass("31.12.2019","Julia", "Pfad 4","Aachen");
        FirstMoveClass firstMoveClass1 = new FirstMoveClass("01.01.1999","Philip", "Straße 2", "Köln");
        FirstMoveClass firstMoveClass2 = new FirstMoveClass("01.05.1987","Tamara", "Weg 1", "Berlin");

        firstMoveRepository.save(FirstMoveClass);
        firstMoveRepository.save(firstMoveClass1);
        firstMoveRepository.save(firstMoveClass2);

        LOGGER.info("******************");
        List<FirstMoveClass> all = firstMoveRepository.findAll();
        all.forEach(c -> LOGGER.info(c.toString()));

        LOGGER.info("*****************************");
        List<FirstMoveClass> list_address = firstMoveRepository.findByAddress ("Weg 1");
        list_address.forEach(c-> LOGGER.info(c.toString()));

    }

    public List<FirstMoveClass> findAll()
    {
        return firstMoveRepository.findAll();
    }

    public static FirstMoveClass save(FirstMoveClass s)
    {
        return firstMoveRepository.save(s);
    }

    public static FirstMoveClass findById (Long aLong) { return firstMoveRepository.findById(aLong).orElseThrow(()-> new FirstMoveNotFoundException("Cat with id " + aLong + "does not exist"));}
}
