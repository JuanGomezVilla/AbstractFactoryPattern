package com.juangv.worlds;

import com.juangv.products.Witch;

public class World2Witch implements Witch {
    //ATRIBUTOS
    public static final String MAGIC_POWER_POR_DEFECTO = "Magic wand and magic broom";
    private String  name;
    private Integer power;
    private Integer lives;
    private String  magicPower;

    //GETTER
    public String getName()         {return name;}
    public Integer getPower()       {return power;}
    public Integer getLives()       {return lives;}
    public String getMagicPower()   {return magicPower;}

    //SETTER
    public void setName(String name)                {this.name = name;}
    public void setPower(Integer power)             {this.power = power;}
    public void setLives(Integer lives)             {this.lives = lives;}
    public void setMagicPower(String magicPower)    {this.magicPower = magicPower;}

    //CONSTRUCTORES
    public World2Witch(String name) {
        this(name,World2Witch.MAGIC_POWER_POR_DEFECTO);
    }

    public World2Witch(String name, String magicPower) {
        super();
        this.name = name;
        this.magicPower = magicPower;
        this.power = 15 * World.LEVEL2.getComplexFactor();
        this.lives = 2 * World.LEVEL2.getComplexFactor();
    }

    @Override
    public String toString() {
        return " com.juangv.worlds.World2Witch [name=" + name + ", power=" + power + ", lives=" + lives + ", magicPower=" + magicPower + "]";
    }
}