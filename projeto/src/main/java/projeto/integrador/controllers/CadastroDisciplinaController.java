package projeto.integrador.controllers;

import projeto.integrador.model.repository.DisciplinaRepository;

public class CadastroDisciplinaController {
    
    private DisciplinaRepository repositorio;

    public CadastroDisciplinaController(DisciplinaRepository repositorio) {
        this.repositorio = repositorio;
    }

    /*public Handler get = (Context ctx)->{
        ctx.render("");
    }*/
}
