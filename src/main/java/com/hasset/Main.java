package com.hasset;

import cloud.orbit.actors.Actor;
import cloud.orbit.actors.Stage;

/**
 * @author Biniam Asnake.
 */
public class Main {

    public static void main(String[] args) {

        Stage stage = new Stage.Builder().clusterName("orbit-helloworld-cluster").build();
        stage.start().join();
        stage.bind();

        final String response = Actor.getReference(Hello.class, "0").sayHello("Orbit is easy").join();
        System.out.println(response);

        stage.stop().join();
    }
}
