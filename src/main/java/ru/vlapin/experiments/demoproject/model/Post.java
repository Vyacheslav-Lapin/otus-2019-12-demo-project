package ru.vlapin.experiments.reacttraining.model;

import lombok.Data;

@Data
public class Post {

  Long id;
  Long userId;
  String title;
  String body;
}
