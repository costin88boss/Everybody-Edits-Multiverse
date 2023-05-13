package com.costin.eem.net;

import com.esotericsoftware.kryonetty.kryo.KryoNetty;

public class Net {
    private static Net singleton;
    private final KryoNetty kryoNetty;

    private Net() {
        kryoNetty = new KryoNetty()
            .useLogging()
            .useExecution()
            .threadSize(16)
            .inputSize(4096)
            .outputSize(4096)
            .maxOutputSize(-1)
            .register(
                // TODO: 5/8/2023 this
            );
    }

    public static Net instance() {
        if (singleton == null) {
            singleton = new Net();
        }
        return singleton;
    }

    public KryoNetty getKryoNettyConfig() {
        // don't access any of its methods :(
        return kryoNetty;
    }

}
