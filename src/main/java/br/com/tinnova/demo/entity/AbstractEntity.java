package br.com.tinnova.demo.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@MappedSuperclass
public abstract class AbstractEntity<Long extends Serializable> implements Serializable {

    private static final long serialVersionUID = -1636465071263209772L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;
}
