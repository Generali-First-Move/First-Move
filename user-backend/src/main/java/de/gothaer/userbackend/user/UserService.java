package de.gothaer.userbackend.user;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;
import java.util.List;

//Daten für DB anlegen und verarbeiten

@Service
public class UserService
{
    final static private Logger LOGGER = LoggerFactory.getLogger("CatService.class");
    //schreibt alle aktivitäten mit
    //logt Infos und steuert die Ausgabe

    private static UserRepository userRepository;
    public UserService(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }
    @PostConstruct
    public void init()
    {
        User User = new User("31.12.2019","Julia", "Pfad 4","Aachen");
        User User1 = new User("01.01.1999","Philip", "Straße 2", "Köln");
        User User2 = new User("01.05.1987","Tamara", "Weg 1", "Berlin");

        userRepository.save(User);
        userRepository.save(User1);
        userRepository.save(User2);

        LOGGER.info("******************");
        List<User> all = userRepository.findAll();
        all.forEach(c -> LOGGER.info(c.toString()));

        LOGGER.info("*****************************");
        List<User> list_address = userRepository.findByAddress ("Weg 1");
        list_address.forEach(c-> LOGGER.info(c.toString()));

    }

    public List<User> findAll()
    {
        return userRepository.findAll();
    }

    public static User save(User s)
    {
        return userRepository.save(s);
    }

    public static User findById (Long aLong) { return userRepository.findById(aLong).orElseThrow(()-> new UserNotFoundException("Cat with id " + aLong + "does not exist"));}
}
