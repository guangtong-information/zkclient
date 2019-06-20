package com.ypy.zkclient;

import org.I0Itec.zkclient.ZkClient;

/**
 * 03 删除节点
 */
public class DeleteNode {

    public static void main(String[] args) {

        ZkClient zkClient = new ZkClient("127.0.0.1:2181", 2000);

        // 递归创建节点
        zkClient.createPersistent("/parent/son",true);

        // 递归删除所有节点
        zkClient.deleteRecursive("/parent");
    }

}
