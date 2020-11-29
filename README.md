# SpringbootProject
SSM框架，VUE，前后端分离实践  
***Reproduced from: [bilibili](https://www.bilibili.com/video/BV1y7411y7am?from=search&seid=12705559201586858813)***
***VUE: [VUE](https://www.bilibili.com/video/BV12J411m7MG?from=search&seid=10768844227077221349)***

## 依赖
1. JDK: 1.8
2. maven: 3.6.3
3. Springboot: 2.2.1

## 分支
1. master: 稳定版
2. dev: 开发版
3. wzq: 个人开发
4. lxc: 个人开发
5. wzqTest: 测试分支
6. lxcTest: 测试分支

## JAVA
1. JAVA摩登网: http://www.javaclimb.com
2. JAVA NOTES FROM WZQ : [JAVA NOTES](https://github.com/Alex-Wzq/Notes/tree/master/Interview/Java).

## JAVA面试要求
1. Java 基础扎实，掌握常见数据结构、多线程等知识，有多线程、高并发应用系统的设计、开发经验者优先 
2. 熟练使用java web框架并了解其原理，例如spring、springmvc、struts2、mybatis等 
3. 熟悉主流的分布式、缓存、消息等开源框架，如：kafka、zooKeeper、redis等，有实时计算经验者优先（使用过storm flink） 
4. 了解http协议及常用的开发组件，如：http client等。 
5. 对JVM原理及调优有一定了解。 
6. 熟练使用git,maven 等工具。 
7. 了解分布式应用系统的设计和开发。

## 主键自动生成
1. [分布式系统唯一ID生成方案汇总](https://www.cnblogs.com/haoxinyue/p/5208136.html)
2. DB: AUTO INCREMENT
3. UUID: 每次操作生成一个随机位置值 (id值无法排序)
4. Redis生成ID
5. mp自动生成19位 (Twitter的snowflake算法)
```java
    // @TableId(type = IdType.INPUT) // 需要自己输入
    // @TableId(type = IdType.NONE)  // 需要自己输入
    // @TableId(type = IdType.UUID) 
    // @TableId(type = IdType.ID_WORKER) // mp自带，生成19位，数字类型使用这种策略
    // @TableId(type = IdType.ID_WORKER_STR) // mp自带，生成19位，字符串类型使用这种策略
    // @TableId(type = IdType.AUTO) // 自动增长，默认，雪花算法
```

## 自动装配
MyBatis Plus提供了MetaObjectHandler接口实现字段在创建和更新时的自动装配

## 三种环境
1. dev: 开发环境
2. test: 测试环境
3. prod: 生产环境