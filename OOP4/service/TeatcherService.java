package service;

import model.Teatcher;

public class TeatcherService {

    public Teatcher createTeatcher(int id, String name, String last) {
        return new Teatcher (id, name, last);
    }

    
}
