package io.github.socraticphoenix.inversey;

import io.github.socraticphoenix.inversey.interfaces.FunctionX;

public interface Function17<R, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17> extends FunctionX<R>, DangerousFunction17<R, RuntimeException, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17> {

    R apply(P1 p1, P2 p2, P3 p3, P4 p4, P5 p5, P6 p6, P7 p7, P8 p8, P9 p9, P10 p10, P11 p11, P12 p12, P13 p13, P14 p14, P15 p15, P16 p16, P17 p17);

    @Override
    default R applyArray(Object... params) {
        if ((params.length != 17)) {
            throw new IllegalArgumentException("Expected exactly 17 parameters");
        }
        return this.apply((P1) params[0], (P2) params[1], (P3) params[2], (P4) params[3], (P5) params[4], (P6) params[5], (P7) params[6], (P8) params[7], (P9) params[8], (P10) params[9], (P11) params[10], (P12) params[11], (P13) params[12], (P14) params[13], (P15) params[14], (P16) params[15], (P17) params[16]);
    }

    @Override
    default void acceptArray(Object... params) {
        if ((params.length != 17)) {
            throw new IllegalArgumentException("Expected exactly 17 parameters");
        }
        this.accept((P1) params[0], (P2) params[1], (P3) params[2], (P4) params[3], (P5) params[4], (P6) params[5], (P7) params[6], (P8) params[7], (P9) params[8], (P10) params[9], (P11) params[10], (P12) params[11], (P13) params[12], (P14) params[13], (P15) params[14], (P16) params[15], (P17) params[16]);
    }

    @Override
    default void accept(P1 p1, P2 p2, P3 p3, P4 p4, P5 p5, P6 p6, P7 p7, P8 p8, P9 p9, P10 p10, P11 p11, P12 p12, P13 p13, P14 p14, P15 p15, P16 p16, P17 p17) {
        this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17);
    }

    @Override
    default int parameterCount() {
        return 17;
    }

}
