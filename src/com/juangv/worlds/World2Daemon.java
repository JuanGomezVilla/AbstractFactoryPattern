package com.juangv.worlds;

import com.juangv.products.Daemon;

public class World2Daemon implements Daemon {
    //ATRIBUTOS
    public static final String COLOR_POR_DEFECTO = "verde";
    private String  name;
    private Integer power;
    private Integer lives;
    private String  color;

    //GETTER
    public String getName()     {return name;}
    public Integer getPower()   {return power;}
    public Integer getLives()   {return lives;}
    public String getColor()    {return color;}

    //SETTER
    public void setName(String name)    {this.name = name;}
    public void setPower(Integer power) {this.power = power;}
    public void setLives(Integer lives) {this.lives = lives;}
    public void setColor(String color)  {this.color = color;}

    //CONSTRUCTORES
    public World2Daemon(String name){
        this(name,World2Daemon.COLOR_POR_DEFECTO);
    }

    public World2Daemon(String name, String color){
        super();
        this.name = name;
        this.color = color;
        this.power = 10 * World.LEVEL2.getComplexFactor();
        this.lives = 1 * World.LEVEL2.getComplexFactor();
    }

    @Override
    public String toString(){
        return " com.juangv.worlds.World2Daemon [name=" + name + ", power=" + power + ", lives=" + lives + ", color=" + color + "]";
    }
}