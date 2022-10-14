package de.mi.ur.bouncer.runningaround;

import de.ur.mi.bouncer.apps.BouncerApp;
import de.ur.mi.bouncer.apps.BouncerLauncher;

public class RunningAround  extends BouncerApp {

    @Override
    public void bounce() {
        loadMap("Empty");
        runAround();
    }

    /**
     * Bouncer bewegt sich in einer endlosen Folge am Kartenrand entlang
     *
     * Pre-Condition: Bouncer befindet sich auf dem Feld in der linken, unteren Ecke und blickt nach Westen
     * Post-Condition: -
     */
    private void runAround() {
        while(bouncer.canMoveForward()) {
            moveForward();
            bouncer.turnLeft();
        }
    }

    /**
     * Bouncer bewegt sich schrittweise nach vorn, bis er auf ein Hindernis stößt
     *
     * Pre-Conditions: -
     * Post-Conditions: Bouncer steht vor einem nicht betretbarem Feld
     */
    private void moveForward() {
        while(bouncer.canMoveForward()) {
            bouncer.move();
        }
    }

    public static void main(String[] args) {
        BouncerLauncher.launch();
    }
}