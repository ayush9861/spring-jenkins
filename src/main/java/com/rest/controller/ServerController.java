package com.rest.controller;

import com.rest.entities.Server;
import com.rest.service.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/server")
@CrossOrigin(origins = "*")

public class ServerController {

    @Autowired
    private ServerService serverService;



    @GetMapping("/")
    private List<Server> getServer()
    {
        return serverService.getAllServer();
    }



    @GetMapping("/{id}")
    private Server getById(@PathVariable String id)
    {
        return serverService.getServerById(id);
    }


    @PostMapping("/add")
     public Server addServer(@RequestBody Server server) {
        return serverService.AddServer(server);
    }

    @PutMapping("/update/{id}")
    private Server UpdateServer(@RequestBody Server server, @PathVariable String id)
    {
        server.setId(id);
        this.serverService.AddServer(server);
        return server;
    }


    @DeleteMapping("/{id}")
    private void delete (@PathVariable String id)
    {
        serverService.deleteServer(id);

    }
    @GetMapping("/getByName/{name}")
    public List<Server> getServerByName(@PathVariable (value = "name") String name)
    {
        return serverService.getServerbyName(name);
    }
}


