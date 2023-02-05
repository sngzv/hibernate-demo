package org.example.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.OffsetDateTime;

@Table(name = "t_sequence_generator")
@Entity
@Setter
@Getter
public class SequenceGeneratorEntity implements Serializable {

    @Id
    @GeneratedValue(generator = "SeqGen")
    @SequenceGenerator(name = "SeqGen", sequenceName = "my_seq", allocationSize = 1)
    private Long id;

    private String value;

    @Column(name = "start_date")
    private OffsetDateTime startDate;
}
