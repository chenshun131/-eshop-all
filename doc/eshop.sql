CREATE DATABASE IF NOT EXISTS eshop;

USE eshop;

CREATE TABLE brand (
  id int(11) NOT NULL AUTO_INCREMENT COMMENT '品牌id',
  name varchar(255) DEFAULT NULL COMMENT '品牌名称',
  description varchar(255) DEFAULT NULL COMMENT '品牌描述',
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT '品牌';
INSERT INTO brand(id,name,description) VALUES (1,'三星','韩国品牌22');
INSERT INTO brand(id,name,description) VALUES (2,'iPhone','美国品牌99');
INSERT INTO brand(id,name,description) VALUES (3,'测试品牌1111','测试品牌1111');
INSERT INTO brand(id,name,description) VALUES (4,'测试品牌2','测试品牌2');


CREATE TABLE category (
  id int(11) NOT NULL AUTO_INCREMENT COMMENT '产品种类id',
  name varchar(255) DEFAULT NULL COMMENT '产品种类名称',
  description varchar(255) DEFAULT NULL COMMENT '产品种类描述',
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT '产品种类';
INSERT INTO category(id,name,description) VALUES (1,'平板电脑','电子产品');
INSERT INTO category(id,name,description) VALUES (2,'手机','电子类');
INSERT INTO category(id,name,description) VALUES (4,'汽车','出行类');
INSERT INTO category(id,name,description) VALUES (5,'笔记本电脑','电子产品');
INSERT INTO category(id,name,description) VALUES (6,'iPhone','热门手机分类');


CREATE TABLE product (
  id int(11) NOT NULL AUTO_INCREMENT COMMENT '产品id',
  name varchar(255) DEFAULT NULL COMMENT '产品名',
  category_id int(11) DEFAULT NULL COMMENT '产品种类id',
  brand_id int(11) DEFAULT NULL COMMENT '品牌id',
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT '产品';
INSERT INTO product(id,name,category_id,brand_id) VALUES (1,'Apple/苹果 iPhone 7 中国红亮黑色磨砂黑 国行全网通 港版未激活222',6,2);


CREATE TABLE product_intro (
  id int(11) NOT NULL AUTO_INCREMENT COMMENT '产品描述id',
  content varchar(255) DEFAULT NULL COMMENT '产品描述内容',
  product_id int(11) DEFAULT NULL COMMENT '产品id',
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT '产品描述';
INSERT INTO product_intro(id,content,product_id) VALUES (1,'1.jpg,2.jpg,3.jpg,4.jpg,5.jpg,6.jpg,7.png',1);


CREATE TABLE product_inventory (
  id int(11) NOT NULL AUTO_INCREMENT COMMENT '产品库存id',
  value int(11) DEFAULT NULL COMMENT '产品库存数量',
  product_id int(11) DEFAULT NULL COMMENT '产品id',
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT '产品库存';
INSERT INTO product_inventory(id,value,product_id) VALUES (1,755,1);


CREATE TABLE product_price (
  id int(11) NOT NULL AUTO_INCREMENT  COMMENT '产品价格id',
  value decimal(11,2) DEFAULT NULL COMMENT '产品价格',
  product_id int(11) DEFAULT NULL COMMENT '产品id',
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT '产品价格';
INSERT INTO product_price(id,value,product_id) VALUES (1,'7480.00',1);


CREATE TABLE product_property (
  id int(11) NOT NULL AUTO_INCREMENT COMMENT '产品属性id',
  name varchar(255) DEFAULT NULL COMMENT '产品属性名',
  value varchar(255) DEFAULT NULL COMMENT '产品属性值',
  product_id int(11) DEFAULT NULL COMMENT '产品id',
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT '产品属性';
INSERT  INTO product_property(id,name,value,product_id) VALUES (1,'ihpone手机的属性','\"机身颜色=金色,银色;存储容量=32GB,128GB;版本类型=港澳台,中国大陆\"',1);


CREATE TABLE product_specification (
  id int(11) NOT NULL AUTO_INCREMENT COMMENT '产品规格id',
  name varchar(255) DEFAULT NULL COMMENT '产品规格名',
  value varchar(255) DEFAULT NULL COMMENT '产品规格值',
  product_id int(11) DEFAULT NULL COMMENT '产品id',
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT '产品规格';
INSERT  INTO product_specification(id,name,value,product_id) VALUES (1,'iphone手机的规格','上市时间=2017-03,机身厚度=0.7cm,售后保障=五星服务',1);


CREATE TABLE user (
  id int(11) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  name varchar(255) DEFAULT NULL COMMENT '用户名',
  age int(11) DEFAULT NULL COMMENT '用户年龄',
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '用户';
