package elhou.salima.keynoteservice.repository;

import elhou.salima.keynoteservice.entities.Keynote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KeynoteRepository extends JpaRepository<Keynote,String> {
}
