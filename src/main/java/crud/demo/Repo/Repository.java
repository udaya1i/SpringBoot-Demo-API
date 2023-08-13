package crud.demo.Repo;

import crud.demo.Entity.Model;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Model, Long> {
}
