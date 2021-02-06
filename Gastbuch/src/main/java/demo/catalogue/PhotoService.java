package demo.catalogue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

@Service
@Transactional
public class PhotoService{
    @Autowired
    PhotoRepository photos;
    PhotoService(PhotoRepository photos){
        Assert.notNull(photos,"PhotoRepository must not be null");
        this.photos= photos;
    }
     public Streamable<Photo> findAll(){
        return photos.findAll();
     }
}
