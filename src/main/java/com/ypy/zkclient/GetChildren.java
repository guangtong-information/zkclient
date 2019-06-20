package com.ypy.zkclient;

import org.I0Itec.zkclient.ZkClient;

import java.util.List;

/**
 * 04 获取子节点（递归方式获取所有子节点）
 */
public class GetChildren {

    public static void main(String[] args) {
        GetChildren getChildren = new GetChildren();
        ZkClient zkClient = new ZkClient("127.0.0.1:2181", 5000);

        zkClient.createPersistent("/parent/son11/son12",true);
        zkClient.createPersistent("/parent/son21/son22",true);

        getChildren.ls(zkClient,"/parent");

    }

    public void ls(ZkClient zkClient,String path)  {
        System.out.println(path);
        List<String> list = zkClient.getChildren(path);
        if(list.isEmpty() || list == null){
            return;
        }
        for(String s : list){
            ls(zkClient,path +"/" + s);
        }
    }

}
