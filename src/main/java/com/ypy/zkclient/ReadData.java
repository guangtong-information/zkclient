package com.ypy.zkclient;

import org.I0Itec.zkclient.ZkClient;

/**
 * 05 获取节点的数据
 */
public class ReadData {

    public static void main(String[] args) {

        ZkClient zkClient = new ZkClient("127.0.0.1:2181", 5000);

        zkClient.createEphemeral("/zk-book", "123");

        System.out.println(zkClient.readData("/zk-book"));

    }

}
