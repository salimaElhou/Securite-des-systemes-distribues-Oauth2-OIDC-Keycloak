package elhou.salima.keynoteservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @Builder
public class Keynote {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String function;
}