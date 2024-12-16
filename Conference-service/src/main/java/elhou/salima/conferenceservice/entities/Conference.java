package elhou.salima.conferenceservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

@Entity
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @Builder
public class Conference {
    @Id
    private String id;
    private String title;
    private String type;
    private Date date;
    private int duration;
    private int attendeesCount;
    private double score;
}