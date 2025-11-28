package projeto.integrador.controllers;

<<<<<<< HEAD
=======
import io.javalin.http.Context;
import io.javalin.http.Handler;
>>>>>>> d0ed33ceb067f9def86e1b334fb5ba9d982bd996
import projeto.integrador.model.repository.DisciplinaRepository;

public class CadastroDisciplinaController {
    
    private DisciplinaRepository repositorio;

    public CadastroDisciplinaController(DisciplinaRepository repositorio) {
        this.repositorio = repositorio;
    }
<<<<<<< HEAD

    /*public Handler get = (Context ctx)->{
        ctx.render("");
    }*/
=======
    
    public Handler get = (Context ctx)->{
        ctx.render("diciplinas.html");
    };

    public Handler post = (Context ctx)->{
        String nome = ctx.formParam("nome");
    };
>>>>>>> d0ed33ceb067f9def86e1b334fb5ba9d982bd996
}
