/*
 * This file is an auto-generated element of InverseY
 */
package com.gmail.socraticphoenix.inversey.many;

public interface Consumer13<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13> extends DangerousConsumer13<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, RuntimeException> {

    void call(P1 p1, P2 p2, P3 p3, P4 p4, P5 p5, P6 p6, P7 p7, P8 p8, P9 p9, P10 p10, P11 p11, P12 p12, P13 p13);

    default <T extends Throwable> DangerousConsumer13<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, T> cast() {
        return (DangerousConsumer13<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, T>) this;
    }
}