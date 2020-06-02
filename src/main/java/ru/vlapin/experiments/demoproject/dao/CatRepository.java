package ru.vlapin.experiments.demoproject.dao;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.vlapin.experiments.demoproject.model.Cat;

public interface CatRepository extends JpaRepository<Cat, UUID> {
}
