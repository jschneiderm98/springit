package com.julio.springit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Link {
  @Id
  @GeneratedValue
  private Long id;
  private String title;
  private String url;
  

}
