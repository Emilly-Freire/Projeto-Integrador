package projeto.integrador;

import projeto.integrador.controllers.IndexController;
import projeto.integrador.utils.JavalinUtils;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        var app = JavalinUtils.makeApp(7072);
        IndexController indexController = new IndexController();

        app.get("/", indexController.get);
    }
}
