package com.ypy.zkclient;

import org.I0Itec.zkclient.ZkClient;

/**
 * 02 创建节点-01
 *
 * （1）zookeeper里面包含四种类型的节点：
 * 分别是持久节点（PERSISTENT）、持久顺序节点（PERSISTENT_SEQUENTIAL）
 * 临时节点（EPHEMERAL）、临时顺序节点（EPHEMERAL_SEQUENTIAL）
 *
 * （2）持久节点：是指在节点创建后，就一直存在，直到有删除操作来主动清除这个节点——不会因为创建该节点的客户端会话失效而消失。
 * （3）持久顺序节点（PERSISTENT_SEQUENTIAL）：这类节点的基本特性和上面的节点类型是一致的。ZK会自动为给定节点名加上一个数字后缀，作为新的节点名。
 * （4）临时节点（EPHEMERAL）：和持久节点不同的是，临时节点的生命周期和客户端会话绑定。另外，在临时节点下面不能创建子节点。
 * （5）临时顺序节点（EPHEMERAL_SEQUENTIAL）：此节点是属于临时节点，不过带有顺序，客户端会话结束节点就消失。
 *
 *  注意：
 *  （1）临时节点不能创建子节点
 *  （2）可以使用递归的方式，创建节点
 */
public class CreateNode {

    public static void main(String[] args) {

        ZkClient zkClient = new ZkClient("127.0.0.1:2181",5000);

//        zkClient.createPersistent("/zk-book-persistent","persistent-node");

//        zkClient.createPersistentSequential("/zk-book-persistent-se","persistent-seq-node");

//        zkClient.createEphemeral("/zk-book-ephemeral","ephemeral-node");

//        zkClient.createEphemeralSequential("/zk-book-ephemeral-se","ephemeral-seq-node");

        // 自动给节点名添加一个数字后缀，作为新的节点名
//        zkClient.createPersistentSequential("/zk-book-persistent-se","persistent-seq-node");

        // 自动给节点名添加一个数字后缀，作为新的节点名
//        zkClient.createEphemeralSequential("/zk-book-ephemeral-se","ephemeral-seq-node");

        // 持久节点可以创建子节点
//        zkClient.createPersistent("/zk-book-persistent/son","persistent-node-son");

        // 临时节点不可以创建子节点
//        zkClient.createEphemeral("/zk-book-ephemeral/son","ephemeral-node-son");

        // 递归创建节点
        zkClient.createPersistent("/parent/son",true);

        try {
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
