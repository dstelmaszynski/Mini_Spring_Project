package pl.zajavka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.zajavka.configuration.ApplicationConfiguration;
import pl.zajavka.service.DataProcessingService;
import pl.zajavka.service.DataRepository;
import pl.zajavka.service.MainProcessor;
import pl.zajavka.service.StringPreparationService;

public class Main {
    public static void main(String[] args) {

        //:::::::::::Podejście bez Springa:::::::::::
//        MainProcessor mainProcessor = new MainProcessor(
//                new DataRepository(),
//                new DataProcessingService(
//                        new StringPreparationService()
//                )
//        );
        //:::::::::::Podejście bez Springa koniec:::::::::::


        //:::::::::::Podejście z Springiem:::::::::::
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        MainProcessor mainProcessor = context.getBean(MainProcessor.class);
        mainProcessor.calculate();
    }
}
