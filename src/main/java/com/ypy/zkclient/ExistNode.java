package com.ypy.zkclient;

import org.I0Itec.zkclient.ZkClient;

/**
 * 07 节点是否存在
 */
public class ExistNode {

    public static void main(String[] args) {

        ZkClient zkClient = new ZkClient("127.0.0.1:2181", 2000);

        zkClient.createEphemeral("/zk-book");

        System.out.println(zkClient.exists("/zk-book"));

    }

}
