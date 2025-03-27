package com.juangv.factories;

import com.juangv.products.Daemon;
import com.juangv.products.Witch;
import com.juangv.worlds.World2Daemon;
import com.juangv.worlds.World2Witch;

public class World2AbstractFactory implements EnemyAbstractFactory {

    @Override
    public double getProbabilidadDaemon() {
        return 0.25; //25% de generar un demonio
    }

    @Override
    public double getProbabilidadWitch() {
        return 0.75; //75% de generar una bruja
    }

    public Daemon createDaemon(){
        return new World2Daemon("Big com.juangv.products.Daemon");
    }

    public Witch createWitch(){
        return new World2Witch("Big com.juangv.products.Witch");
    }
}