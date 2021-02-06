package demo.catalogue;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.util.Streamable;

public interface PhotoRepository extends CrudRepository<Photo,Long> {

    @Override
    Streamable<Photo> findAll();
    Photo findPhotoById(Long id);
    Photo findPhotoByName(String name);
    Photo findAllByMain_person(String main_person);
    Photo findAllByPlace(String place);
}
