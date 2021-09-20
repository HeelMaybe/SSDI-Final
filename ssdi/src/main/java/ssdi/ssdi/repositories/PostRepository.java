package ssdi.ssdi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ssdi.ssdi.entities.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
