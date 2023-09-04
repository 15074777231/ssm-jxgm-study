> # Mevan  [Maven简介 (biancheng.net)](http://c.biancheng.net/maven2/profile.html)

Maven 是一款基于 Java 平台的项目管理和整合工具，它将项目的开发和管理过程抽象成一个项目对象模型（POM）。开发人员只需要做一些简单的配置，Maven 就可以自动完成项目的编译、测试、打包、发布以及部署等工作。

Maven 是使用 Java 语言编写的，因此它和 Java 一样具有跨平台性，这意味着无论是在 Windows ，还是在 Linux 或者 Mac OS 上，都可以使用相同的命令进行操作。

Maven 使用标准的目录结构和默认构建生命周期，因此开发者几乎不用花费多少时间就能够自动完成项目的基础构建工作。

Maven 能够帮助开发者完成以下任务：

- 构建项目
- 生成文档
- 创建报告
- 维护依赖
- 软件配置管理
- 发布
- 部署
  总而言之，Maven 简化并标准化了项目构建过程。它将项目的编译，生成文档，创建报告，发布，部署等任务无缝衔接，构建成一套完整的生命周期。

### Maven 的目标

Maven 的主要目标是为为开发人员提供如下内容：

- 一个可重复使用，可维护且易于理解的项目综合模型
- 与此模型进行交互的工具和插件

### 约定优于配置

约定优于配置（Convention Over Configuration）是 Maven 最核心的涉及理念之一 ，Maven对项目的目录结构、测试用例命名方式等内容都做了规定，凡是使用 Maven 管理的项目都必须遵守这些规则。

Maven 项目构建过程中，会自动创建默认项目结构，开发人员仅需要在相应目录结构下放置相应的文件即可。

例如，下表显示了项目源代码文件，资源文件和其他配置在 Maven 项目中的默认位置。 



| 文件         | 目录               |
| ------------ | ------------------ |
| Java 源代码  | src/main/java      |
| 资源文件     | src/main/resources |
| 测试源代码   | src/test/java      |
| 测试资源文件 | src/test/resources |
| 打包输出文件 | target             |
| 编译输出文件 | target/classes     |

### Maven 的特点

Maven 具有以下特点：

1. 设置简单。
2. 所有项目的用法一致。
3. 可以管理和自动进行更新依赖。
4. 庞大且不断增长的资源库。
5. 可扩展，使用 Java 或脚本语言可以轻松的编写插件。
6. 几乎无需额外配置，即可立即访问新功能。
7. 基于模型的构建：Maven 能够将任意数量的项目构建为预定义的输出类型，例如 JAR，WAR。
8. 项目信息采取集中式的元数据管理：使用与构建过程相同的元数据，Maven 能够生成一个网站（site）和一个包含完整文档的 PDF。
9. 发布管理和发行发布：Maven 可以与源代码控制系统（例如 Git、SVN）集成并管理项目的发布。
10. 向后兼容性：您可以轻松地将项目从旧版本的 Maven 移植到更高版本的 Maven 中。
11. 并行构建：它能够分析项目依赖关系，并行构建工作，使用此功能，可以将性能提高 20%-50％。
12. 更好的错误和完整性报告：Maven 使用了较为完善的错误报告机制，它提供了指向 Maven Wiki 页面的链接，您将在其中获得有关错误的完整描述。

# Maven安装与配置

Maven是一个基于 Java 的项目管理工具，因此最基本的要求是在计算机上安装 JDK。

Maven 对系统要求如下表：

| JDK      | JDK 7.0 及以上。                                             |
| -------- | ------------------------------------------------------------ |
| 内存     | 没有最低要求。                                               |
| 磁盘空间 | Maven 安装本身大约需要 10MB。除此之外，其他磁盘空间将用于本地 Maven 存储库。本地存储库的大小将根据使用情况而有所不同，但至少应为 500MB。 |
| 操作系统 | 没有最低要求。                                               |



## 1.Java 环境设置 

在 [Java 官方网站](http://java.sun.com/j2se/1.5.0/download.jsp) 下载并安装 JDK 7.0 及以上版本，如果您不了解 JDK 的安装和配置，请参考：

- [Java JDK下载与安装教程](http://c.biancheng.net/view/1286.html)
- [Java JDK环境变量配置](http://c.biancheng.net/view/1290.html)

## 2.下载 Maven

从 https://maven.apache.org/download.cgi 下载 Maven，这里我们以 Maven 3.6.3 为例。下载完成后，解压到合适的位置即可，本教程我们解压到 D:\apache-maven-3.6.3。

| 操作系统 | 下载版本                      |
| -------- | ----------------------------- |
| Windows  | apache-maven-3.6.3-bin.zip    |
| Linux    | apache-maven-3.6.3-bin.tar.gz |
| Mac OS   | apache-maven-3.6.3-bin.tar.gz |

## 3.配置 Maven 环境变量

右键点击“计算机”图标，选择 "属性"，然后点击 "高级系统设置"，点击"环境变量"。

新建系统变量 MAVEN_HOME，变量值为 Maven 的安装目录 ，如下图。

![Maven 环境变量1](http://c.biancheng.net/uploads/allimg/210617/11100340c-0.png)

图1：Maven 环境变量 path
编辑系统变量 Path，添加变量值：`;%MAVEN_HOME%\bin`，如下图。

![Maven path](http://c.biancheng.net/uploads/allimg/210617/1110032C4-1.png)

图2：Maven 设置环境变量


在命令提示符下执行 `mvn -version ` ，输出结果如下图所示，证明 Maven 配置成功。

![Maven 版本](http://c.biancheng.net/uploads/allimg/210617/1110034C8-2.png)

图3：命令行查看 Maven 版本信息

# Maven POM

POM（Project Object Model，项目对象模型）是 Maven 的基本组件，它是以 xml 文件的形式存放在项目的根目录下，名称为 pom.xml。

POM 中定义了项目的基本信息，用于描述项目如何构建、声明项目依赖等等。

当 Maven 执行一个任务时，它会先查找当前项目的 POM 文件，读取所需的配置信息，然后执行任务。在 POM 中可以设置如下配置：

- 项目依赖
- 插件
- 目标
- 构建时的配置文件
- 版本 
- 开发者
- 邮件列表


在创建 POM 之前，首先要确定工程组（groupId），及其名称（artifactId）和版本，在仓库中这些属性是项目的唯一标识。

**选择合适的目录仓库（repository）和maven配置文件（setting.xml）**
在这里，我把目录仓库和配置文件都放在了Maven目录下，即apache-maven同级目录
![这里写图片描述](https://img-blog.csdn.net/20180714180424616?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0ppb2hvX2NoZW4=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)

##### 修改setting.xml

先自己创建一个文件夹用来存放下载的jar包，然后按照下面的操作就可以自定义好自己的本地仓库啦
![在这里插入图片描述](https://img-blog.csdnimg.cn/2019101220194217.png)
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191012202157160.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM1OTcxMjU4,size_16,color_FFFFFF,t_70)

可以添加阿里云的镜像到maven的setting.xml配置中，这样就不需要每次在pom中，添加镜像仓库的配置，在mirrors节点下面添加子节点：

```
<mirror>
    <id>nexus-aliyun</id>
    <mirrorOf>central</mirrorOf>
    <name>Nexus aliyun</name>
    <url>http://maven.aliyun.com/nexus/content/groups/public</url>
</mirror>
```

## POM 示例

```
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>net.biancheng.www</groupId>
    <artifactId>maven</artifactId>
    <version>0.0.1-SNAPSHOT</version>
</project>
```


所有的 Maven 项目都有一个 POM 文件，所有的 POM 文件都必须有 project 元素和 3 个必填字段：groupId、artifactId 以及 version。



| 节点       | 描述                                                         |
| ---------- | ------------------------------------------------------------ |
| groupId    | 项目组 ID，定义当前 Maven 项目隶属的组织或公司，通常是唯一的。它的取值一般是项目所属公司或组织的网址或 URL 的反写，例如 net.biancheng.www。 |
| artifactId | 项目 ID，通常是项目的名称。groupId 和 artifactId 一起定义了项目在仓库中的位置。 |
| version    | 项目版本。                                                   |

目录及文件说明：

- helloMaven：项目名，包含 src 文件夹和 pom.xml。
- src/main/java：用于存放项目的 Java 文件。
- src/main/resources：用于存放项目资源文件。
- src/test/java：用于存放所有测试 Java 文件，如 JUnit 测试类。
- src/test/resources ：用于存放测试资源文件。
- target：项目输出位置，用于存放编译后的文件。
- pom.xml：Maven 项目核心配置文件。