package elhou.salima.conferenceservice.web;

import elhou.salima.conferenceservice.entities.Conference;
import elhou.salima.conferenceservice.repository.ConferenceRepository;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class ConferenceRestController {
    private ConferenceRepository conferenceRepository;

    public ConferenceRestController(ConferenceRepository conferenceRepository) {
        this.conferenceRepository = conferenceRepository;
    }

    @GetMapping("/conferences")
   @PreAuthorize("hasAuthority('ADMIN')")
    public List<Conference> conferences(){
        return conferenceRepository.findAll();
    }

    @GetMapping("/conferences/{id}")
    @PreAuthorize("hasAuthority('USER')")
    public Conference keynoteById(@PathVariable String id){
        return conferenceRepository.findById(id).get();
    }

    @GetMapping("/auth")
    public Authentication authentication(Authentication authentication){
        return authentication;
    }

}
