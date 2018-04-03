# md_blockchain_manager
对应于md_blockchain项目，该项目是节点管理端，用于维护联盟链的各节点信息。

需要导入sql文件后，直接在数据库member表中修改ip、name、app_id三个字段为你的区块链中各个节点的ip，port不要改。

name字段代表一个联盟链中的一个公司，app_id代表该公司下的一台服务器节点。一般情况下是一对一关系。

设置完ip后，譬如有2个节点或者4个节点（因为将来生成区块，要除自己外，过半同意才行），然后启动项目即可。

之后，在md_blockchain项目里application.yml设置name、appId和该项目启动后的服务地址，或者通过设置环境变量方式、或者
java -DAPP_ID=mingyi -DNAME=mingyi -Dserver.port=8888 -jar md_blockchain-0.0.1-SNAPSHOT.jar
这种方式启动md_blockchain项目即可。
