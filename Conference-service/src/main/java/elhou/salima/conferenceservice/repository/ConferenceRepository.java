package elhou.salima.conferenceservice.repository;

import elhou.salima.conferenceservice.entities.Conference;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConferenceRepository extends JpaRepository<Conference,String> {
}
