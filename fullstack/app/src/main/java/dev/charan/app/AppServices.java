package dev.charan.app;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppServices  {
    @Autowired
    AppRepository repo;

    public List<AppItem> getAllitems(){
        return repo.findAll();
    }


}
