# 阿里云高校计划视觉AI五天训练营 Day 4

## 创建一个简易的身份证车牌和驾照识别项目

### 重构之前的项目

将零散的java程序组装起来，方法构造参数外提。

单独拎出accessKeyId和accessSecret，以及各种oss调用地址。

![image-20200519233357603](https://tva1.sinaimg.cn/large/007S8ZIlly1gey6kpm6ghj31hc0u0du0.jpg)

![image-20200519233406224](https://tva1.sinaimg.cn/large/007S8ZIlly1gey6ku7c6oj31hc0u0gxi.jpg)

![image-20200519233422595](https://tva1.sinaimg.cn/large/007S8ZIlly1gey6l4se5aj31hc0u0aog.jpg)

### 使用方法

导入项目后，进入config.java配置accessKeyId和accessSecret，进入runMe.java配置三个url（必须为阿里OSS地址），就可以运行了。

### 运行结果

![image-20200519233920259](https://tva1.sinaimg.cn/large/007S8ZIlly1gey6qai41nj313d07ndi5.jpg)

PS：没找到驾照的OSS地址，就暂时先放放吧。

### 待改进

- Json解析并按需输出

项目其实并不完整，时间比较紧促，明后天就期中考了，就暂时做这样吧，待更新。。。



