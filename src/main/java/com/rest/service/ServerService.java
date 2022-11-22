package com.rest.service;

import com.rest.entities.Server;
import com.rest.repository.ServerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServerService {

    @Autowired
    private ServerRepository serverRepository;

    public List<Server> getAllServer() {
        List<Server> list = this.serverRepository.findAll();
        return list;
    }

    public Server getServerById(String id) {

        return serverRepository.findById(id).get();
    }


    public Server AddServer(Server server) {

        return serverRepository.save(server);

    }
    public void deleteServer(String aid) {
        this.serverRepository.deleteById(aid);
    }


    public List<Server> getServerbyName(String name) {
        // TODO Auto-generated method stub
        return serverRepository.findServersByName(name);
    }


}