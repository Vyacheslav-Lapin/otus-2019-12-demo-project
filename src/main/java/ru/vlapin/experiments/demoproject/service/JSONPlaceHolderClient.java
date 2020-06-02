package ru.vlapin.experiments.reacttraining.services;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ru.vlapin.experiments.reacttraining.model.Post;

@FeignClient(
    name = "JSONPlaceHolder",
    url = "https://jsonplaceholder.typicode.com/posts")
public interface JSONPlaceHolderClient {

  @GetMapping
  List<Post> getPosts();

  @GetMapping("{postId}")
  Post getPostById(@PathVariable Long postId);
}
