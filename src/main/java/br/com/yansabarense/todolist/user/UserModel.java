package br.com.yansabarense.todolist.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Data @NoArgsConstructor
@Entity(name = "tb_users")
public class UserModel {

    @Id @GeneratedValue(generator = "UUID")
    private UUID id;

    @Column(unique = true, name = "username")
    private String username;

    @Column(name = "name")
    private String name;

    @Column(name = "password")
    private String password;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
