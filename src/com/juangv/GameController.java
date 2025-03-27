package com.juangv;

import com.juangv.factories.EnemyAbstractFactory;
import com.juangv.factories.World1AbstractFactory;
import com.juangv.factories.World2AbstractFactory;
import com.juangv.products.Daemon;
import com.juangv.products.Witch;

public class GameController {
    //ATRIBUTOS
    private static GameController gameController;
    private EnemyAbstractFactory enemyAbstractFactory;

    //CONSTRUCTOR PRIVADO
    private GameController(){}

    //Obtención de la instancia
    public static GameController getInstance(){
        //Si no hay instancia del controlador, lo creamos
        if(gameController == null){
            gameController = new GameController();
            gameController.setEnemyAbstractFactory(new World1AbstractFactory());

        }
        //Devolver el controlador
        return gameController;
    }


    public EnemyAbstractFactory getEnemyAbstractFactory() {
        //Devolver la factoría
        return this.enemyAbstractFactory;
    }

    public void setEnemyAbstractFactory(EnemyAbstractFactory enemyAbstractFactory) {
        //Establecer la factoría
        this.enemyAbstractFactory = enemyAbstractFactory;
    }

    public Daemon createDaemon() {
        //Crear un demonio y devolverlo
        return this.enemyAbstractFactory.createDaemon();
    }

    public Witch createWitch() {
        //Crear una bruja y devolverla
        return this.enemyAbstractFactory.createWitch();
    }

    public double getProbabilidadDaemon(){
        return this.enemyAbstractFactory.getProbabilidadDaemon();
    }

    public double getProbabilidadWitch(){
        return this.enemyAbstractFactory.getProbabilidadWitch();
    }

    public void play(){
        //Iniciar el juego
        System.out.println("Empieza el juego en el Mundo 1");
        System.out.println("Creamos un demonio en el mundo 1 " + this.createDaemon());
        System.out.println("Creamos una bruja en el mundo 1 " + this.createWitch());
        System.out.println("Cambiamos de mundo, pasamos al mundo 2");

        //Establecernos en el mundo 2
        this.setEnemyAbstractFactory(new World2AbstractFactory());

        //Crear algunos enemigos y reiniciar
        System.out.println("Creamos un demonio en el mundo 2 " + this.createDaemon());
        System.out.println("Creamos una bruja en el mundo 2 " + this.createWitch());
        System.out.println("Reiniciamos, pasamos al mundo 1");

        //Cambiamos al mundo 1 y mostramos la probabilidad
        this.setEnemyAbstractFactory(new World1AbstractFactory());
        System.out.print("Daemons ("+ (this.getProbabilidadDaemon() * 100) +"%), ");
        System.out.println("Witches ("+ (this.getProbabilidadWitch() * 100) +"%)");

        //Generamos un enemigo aleatorio
        System.out.println("Ejemplo de enemigo aleatorio en el Mundo1");
        boolean crearDaemon = Generador.generarPorDebajo(this.getProbabilidadDaemon());
        if(crearDaemon) System.out.println(this.createDaemon());
        else System.out.println(this.createWitch());

        //Cambiamos al mundo 2 y mostramos las probabilidades
        this.setEnemyAbstractFactory(new World2AbstractFactory());
        System.out.print("Daemons ("+ (this.getProbabilidadDaemon() * 100) +"%), ");
        System.out.println("Witches ("+ (this.getProbabilidadWitch() * 100) +"%)");

        //Generamos un enemigo aleatorio para demostrar el resultado
        System.out.println("Ejemplo de enemigo aleatorio en el Mundo2");
        crearDaemon = Generador.generarPorDebajo(this.getProbabilidadDaemon());
        if(crearDaemon) System.out.println(this.createDaemon());
        else System.out.println(this.createWitch());

        //Fin del juego
        System.out.println("Juego finalizado");
    }
}