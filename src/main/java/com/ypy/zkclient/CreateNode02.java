package com.ypy.zkclient;

import org.I0Itec.zkclient.ZkClient;
import org.apache.zookeeper.CreateMode;

/**
 * 02 创建节点-02
 *
 *
 */
public class CreateNode02 {

    public static void main(String[] args) {

        ZkClient zkClient = new ZkClient("127.0.0.1:2181",5000);

        zkClient.create("/zk-book-persistent","zk-book-persistent", CreateMode.PERSISTENT);

        zkClient.create("/zk-book-persistent-seq","zk-book-persistent", CreateMode.EPHEMERAL_SEQUENTIAL);

        zkClient.create("/zk-book-ephemeral","zk-book-persistent", CreateMode.EPHEMERAL);

        zkClient.create("/zk-book-ephemeral-seq","zk-book-persistent", CreateMode.EPHEMERAL_SEQUENTIAL);
    }

}
