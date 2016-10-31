package com.hasset;

import cloud.orbit.actors.Actor;
import cloud.orbit.concurrent.Task;

/**
 * @author Biniam Asnake.
 */
public interface Hello extends Actor {

    Task<String> sayHello(String greeting);
}
