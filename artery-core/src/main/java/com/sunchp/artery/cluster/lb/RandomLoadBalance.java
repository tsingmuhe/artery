package com.sunchp.artery.cluster.lb;

import com.sunchp.artery.cluster.LoadBalance;
import com.sunchp.artery.rpc.Request;
import com.sunchp.artery.transport.client.netty.NettyClient;
import com.sunchp.artery.utils.RandomNumeric;

import java.util.List;

public class RandomLoadBalance implements LoadBalance {
    @Override
    public NettyClient select(Request request, List<NettyClient> clients) {
        if (clients == null || clients.size() == 0) {
            throw new RuntimeException("null client");
        }

        if (clients.size() == 1) {
            return clients.get(0);
        }

        int idx = RandomNumeric.getInstance().random(0, clients.size() - 1);
        return clients.get(idx);
    }
}
