package com.example.shoppingmall.used.entity;

import com.example.shoppingmall.auth.entity.UserEntity;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class ItemEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Setter
  private String title;
  @Setter
  private String description;
  @Setter
  private String postImage;
  @Setter
  private Integer price;
  @Setter
  private String status;

  @ManyToOne
  private UserEntity user;
}
