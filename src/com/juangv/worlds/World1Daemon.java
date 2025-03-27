package com.juangv.worlds;

import com.juangv.products.Daemon;

public class World1Daemon implements Daemon {
    //ATRIBUTOS
    public static final String COLOR_POR_DEFECTO = "rojo";
    private String  name;
    private Integer power;
    private Integer lives;
    private String  color;

    //GETTER
    public String getName()     {return this.name;}
    public Integer getPower()   {return this.power;}
    public Integer getLives()   {return this.lives;}
    public String getColor()    {return this.color;}

    //SETTER
    public void setName(String name)    {this.name  = name;}
    public void setPower(Integer power) {this.power = power;}
    public void setLives(Integer lives) {this.lives = lives;}
    public void setColor(String color)  {this.color = color;}

    //CONSTRUCTORES
    public World1Daemon(String name){
        this(name, World1Daemon.COLOR_POR_DEFECTO);
    }

    public World1Daemon(String name, String color){
        super();
        this.name = name;
        this.color = color;
        this.power = 10 * World.LEVEL1.getComplexFactor();
        this.lives = 1 * World.LEVEL1.getComplexFactor();
    }

    @Override
    public String toString(){
        return " com.juangv.worlds.World1Daemon [name=" + name + ", power=" + power + ", lives=" + lives + ", color=" + color + "]";
    }
}