package com.juangv.factories;

import com.juangv.products.Daemon;
import com.juangv.products.Witch;

public interface EnemyAbstractFactory {
    public Daemon createDaemon();
    public Witch createWitch();
    public double getProbabilidadDaemon();
    public double getProbabilidadWitch();
}