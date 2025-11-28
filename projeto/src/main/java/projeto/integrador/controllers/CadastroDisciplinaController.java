package projeto.integrador.controllers;

import io.javalin.http.Context;
import io.javalin.http.Handler;
import projeto.integrador.model.repository.DisciplinaRepository;

public class CadastroDisciplinaController {
    
    private DisciplinaRepository repositorio;

    public CadastroDisciplinaController(DisciplinaRepository repositorio) {
        this.repositorio = repositorio;
    }
    
    public Handler get = (Context ctx)->{
        ctx.render("diciplinas.html");
    };

    public Handler post = (Context ctx)->{
        String nome = ctx.formParam("nome");
    };
}
