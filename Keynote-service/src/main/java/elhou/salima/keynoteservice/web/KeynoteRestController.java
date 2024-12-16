package elhou.salima.keynoteservice.web;

import elhou.salima.keynoteservice.entities.Keynote;
import elhou.salima.keynoteservice.repository.KeynoteRepository;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class KeynoteRestController {
    private KeynoteRepository keynoteRepository;

    public KeynoteRestController(KeynoteRepository keynoteRepository) {
        this.keynoteRepository = keynoteRepository;
    }

    @GetMapping("/keynotes")
   @PreAuthorize("hasAuthority('ADMIN')")
    public List<Keynote> keynotes(){
        return keynoteRepository.findAll();
    }

    @GetMapping("/keynotes/{id}")
    @PreAuthorize("hasAuthority('USER')")
    public Keynote keynoteById(@PathVariable String id){
        return keynoteRepository.findById(id).get();
    }

    @GetMapping("/auth")
    public Authentication authentication(Authentication authentication){
        return authentication;
    }

}
