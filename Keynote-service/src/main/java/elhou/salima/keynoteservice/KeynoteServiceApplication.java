package elhou.salima.keynoteservice;

import elhou.salima.keynoteservice.entities.Keynote;
import elhou.salima.keynoteservice.repository.KeynoteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;



//app = main + TEST -> Bean

@SpringBootApplication
public class KeynoteServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(KeynoteServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(KeynoteRepository keynoteRepository){
        return args -> {
            keynoteRepository.save(Keynote.builder()
                    .id(UUID.randomUUID().toString())
                    .firstName("salima")
                    .lastName("el hou")
                    .email("salima@example.com")
                    .function("Software Engineer")
                    .build());

            keynoteRepository.save(Keynote.builder()
                    .id(UUID.randomUUID().toString())
                    .firstName("salma")
                    .lastName("chafic")
                    .email("chafic@example.com")
                    .function("Project Manager")
                    .build());

            keynoteRepository.save(Keynote.builder()
                    .id(UUID.randomUUID().toString())
                    .firstName("amine")
                    .lastName("mohammed")
                    .email("amine@example.com")
                    .function("Data Scientist")
                    .build());
        };
    }
}
