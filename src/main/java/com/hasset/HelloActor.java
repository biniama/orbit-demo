package com.hasset;

import cloud.orbit.actors.runtime.AbstractActor;
import cloud.orbit.concurrent.Task;

/**
 * @author Biniam Asnake.
 */
public class HelloActor extends AbstractActor implements Hello {

    public Task<String> sayHello(String greeting) {

        System.out.println("Here:" + greeting);

        return Task.fromValue("You said: '" + greeting
                + "', I say: Hello from " + System.identityHashCode(this) + " !");
    }
}
