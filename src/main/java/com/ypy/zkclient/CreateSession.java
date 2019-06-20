package com.ypy.zkclient;

import org.I0Itec.zkclient.ZkClient;

/**
 * 01 建立会话
 *
 * ZKClient是GitHub上一个开源的zookeeper客户端，
 *
 * https://github.com/sgroschupf/zkclient
 *
 * zkclient在zk原生API接口上封装了一层，是一个更加容易使用的zk客户端。
 *
 * Zkclient在内部实现了诸如session超时重连，watcher反复注册等功能。
 */
public class CreateSession {
    public static void main(String[] args) {

        ZkClient zkClient = new ZkClient("127.0.0.1:2181",5000);

        System.out.println("ZooKeeper session established.");

        System.out.println(zkClient.toString());

        try {
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
