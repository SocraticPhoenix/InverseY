/*
 * This file is an auto-generated element of InverseY
 */
package com.gmail.socraticphoenix.inversey.many;

public interface Consumer5<P1, P2, P3, P4, P5> extends DangerousConsumer5<P1, P2, P3, P4, P5, RuntimeException> {

    void call(P1 p1, P2 p2, P3 p3, P4 p4, P5 p5);

    default <T extends Throwable> DangerousConsumer5<P1, P2, P3, P4, P5, T> cast() {
        return (DangerousConsumer5<P1, P2, P3, P4, P5, T>) this;
    }
}