package com.ypy.zkclient;

import org.I0Itec.zkclient.ZkClient;

/**
 * 06 更新节点数据
 */
public class WriteData {

    public static void main(String[] args) {

        ZkClient zkClient = new ZkClient("127.0.0.1:2181", 2000);

        zkClient.createEphemeral("/zk-book", "123");

        zkClient.writeData("/zk-book","456");

        System.out.println(zkClient.readData("/zk-book"));
    }

}
