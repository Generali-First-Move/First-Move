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
        FirstMove FirstMove = new FirstMove("31.12.2019","Julia", "Pfad 4","Aachen");
        FirstMove firstMove1 = new FirstMove("01.01.1999","Philip", "Straße 2", "Köln");
        FirstMove firstMove2 = new FirstMove("01.05.1987","Tamara", "Weg 1", "Berlin");

        firstMoveRepository.save(FirstMove);
        firstMoveRepository.save(firstMove1);
        firstMoveRepository.save(firstMove2);

        LOGGER.info("******************");
        List<FirstMove> all = firstMoveRepository.findAll();
        all.forEach(c -> LOGGER.info(c.toString()));

        LOGGER.info("*****************************");
        List<FirstMove> list_address = firstMoveRepository.findByAddress ("Weg 1");
        list_address.forEach(c-> LOGGER.info(c.toString()));

    }

    public List<FirstMove> findAll()
    {
        return firstMoveRepository.findAll();
    }

    public static FirstMove save(FirstMove s)
    {
        return firstMoveRepository.save(s);
    }

    public static FirstMove findById (Long aLong) { return firstMoveRepository.findById(aLong).orElseThrow(()-> new FirstMoveNotFoundException("Cat with id " + aLong + "does not exist"));}
}
