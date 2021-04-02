drop table category;
CREATE TABLE IF NOT EXISTS category (
  id_category BINARY(16) NOT NULL,
 description VARCHAR(45) NULL,
 status TINYINT(1) NULL,
  PRIMARY KEY (id_category));

  INSERT INTO category (id_category, description, status) VALUES (1, 'envasados', 1);
  INSERT INTO category (id_category, description, status) VALUES (2, 'agregados', 1);
  INSERT INTO category (id_category, description, status) VALUES (3, 'aceros', 1);
  INSERT INTO category (id_category, description, status) VALUES (4, 'prefabricados', 1);
  INSERT INTO category (id_category, description, status) VALUES (5, 'otros', 1);
drop table unit;
CREATE TABLE IF NOT EXISTS unit (
  id_unit BINARY(16) NOT NULL,
  name VARCHAR(45) NULL,
  status TINYINT(1) NULL,
  PRIMARY KEY (id_unit));

  INSERT INTO unit (id_unit, name, status) VALUES (1, 'piece', 1);
  INSERT INTO unit (id_unit, name, status) VALUES (2, 'bag', 1);
  INSERT INTO unit (id_unit, name, status) VALUES (3, 'kilogram', 1);
  INSERT INTO unit (id_unit, name, status) VALUES (4, 'ton', 1);

	drop table product;

  CREATE TABLE IF NOT EXISTS product (
    id_product BINARY(16) NOT NULL,
    id_category BINARY(16) NOT NULL,
    id_unit BINARY(16) NOT NULL,
    name_product VARCHAR(45) NULL,
    sku VARCHAR(45) NULL,
    description VARCHAR(45) NULL,
    price DECIMAL(10,2) NULL,
    status TINYINT(1) NULL,
    stock INT(15) NULL,
    discount INT(10) NULL,
    img VARCHAR(3000) NULL,
    PRIMARY KEY (id_product));

    INSERT INTO product (id_product, id_category, id_unit, name_product, sku, description, price, status, stock, discount,img) VALUES (1, 1, 2, 'Cemento', 'env-000001', 'cemento', 100, 1, 1000, 0,'https://360view.hum3d.com/zoom/Tools/Cement_Bag_1000_0001.jpg');
    INSERT INTO product (id_product, id_category, id_unit, name_product, sku, description, price, status, stock, discount,img) VALUES (2, 1, 3, 'Yeso', 'env-000002', 'yeso', 56, 1, 500, 0,'https://www.toloflorit.com/static/catalogo/fotos_productos/17799.g.jpg?1504257519');
    INSERT INTO product (id_product, id_category, id_unit, name_product, sku, description, price, status, stock, discount,img) VALUES (3, 1, 1, 'Pegazulejo', 'env-000003', 'pegazulejo', 35, 1, 600, 0,'https://i1.wp.com/www.materialesconstruccion.mx/wp-content/uploads/2018/10/Pegazulejo-cemix.png?fit=800%2C800&ssl=1');
    INSERT INTO product (id_product, id_category, id_unit, name_product, sku, description, price, status, stock, discount,img) VALUES (4, 2, 4, 'Arena', 'agre-00001', 'arena', 30000, 1, 20000, 0, 'https://www.elparana.com/wp-content/uploads/2017/02/arena.jpg');
    INSERT INTO product (id_product, id_category, id_unit, name_product, sku, description, price, status, stock, discount,img) VALUES (5, 2, 4, 'Grava', 'agre-00002', 'grava', 30000, 1, 60000, 50, 'https://media.istockphoto.com/photos/texture-river-gravel-textura-de-grava-de-rio-picture-id516639033');
    INSERT INTO product (id_product, id_category, id_unit, name_product, sku, description, price, status, stock, discount,img) VALUES (6, 3, 1, 'Armex', 'ace-000001', 'armex', 100, 1, 10000, 50, 'http://www.construlandia.com/images/detalle/armex.jpg');
    INSERT INTO product (id_product, id_category, id_unit, name_product, sku, description, price, status, stock, discount,img) VALUES (7, 3, 1, 'Alambron', 'ace-000002', 'alambron', 120.5, 1, 3000, 0, 'https://acerosycomplementos.com.mx/wp-content/uploads/2018/04/Alambron_image_1.jpg');
    INSERT INTO product (id_product, id_category, id_unit, name_product, sku, description, price, status, stock, discount,img) VALUES (8, 3, 1, 'CLavo', 'ace-000003', 'clavos para concreto', 5, 1, 80000, 0, 'https://www.mariorubio.com.ec/wp-content/uploads/2017/07/CLAVO-PARA-CONSTRUCCION-1-12-2.jpg');
    INSERT INTO product (id_product, id_category, id_unit, name_product, sku, description, price, status, stock, discount,img) VALUES (9, 4, 1, 'Tabique Gris', 'pre-000001', 'tabique gris', 10, 1, 3000, 0, 'https://i2.wp.com/www.materialesconstruccion.mx/wp-content/uploads/2018/10/tabique-lig-9.jpg?fit=360%2C240&ssl=1');
    INSERT INTO product (id_product, id_category, id_unit, name_product, sku, description, price, status, stock, discount,img) VALUES (10, 4, 1, 'Tabique Rojo', 'pre-000002', 'tabique rojo', 10.5, 1, 6000, 0, 'https://construramagrupovelco.com/wp-content/uploads/2018/05/thumb-tabique.jpg');
    INSERT INTO product (id_product, id_category, id_unit, name_product, sku, description, price, status, stock, discount,img) VALUES (11, 4, 1, 'Ladrillo Rojo', 'pre-000003', 'ladrillo rojo', 12.3, 1, 6000, 0, 'http://www.mndelgolfo.com/wp-content/uploads/2017/07/ladrillo-de-adobe.jpg');
    INSERT INTO product (id_product, id_category, id_unit, name_product, sku, description, price, status, stock, discount,img) VALUES (12, 5, 1, 'Tubo pvc', 'otr-000001', 'tubo pvc', 15, 1, 5000, 0, 'https://aquatronics.com.co/wp-content/uploads/2016/11/tubopvc.jpg');
    INSERT INTO product (id_product, id_category, id_unit, name_product, sku, description, price, status, stock, discount,img) VALUES (13, 5, 1, 'Coladera', 'otr-000002', 'coladera', 16, 1, 5003, 0, 'https://ferreteriaonofre.com/wp-content/uploads/2020/01/COLADERA-DE-REJILLA-24-HELVEX-FERRETERIA-ONOFRE@2x.png');
    INSERT INTO product (id_product, id_category, id_unit, name_product, sku, description, price, status, stock, discount,img) VALUES (14, 5, 1, 'Lavadero de granito', 'otr-000003', 'lavadero', 250, 1, 100, 0, 'http://www.mndelgolfo.com/wp-content/uploads/2016/11/lavadero_granito_chico-768x768.jpg');
drop table customer;
    CREATE TABLE IF NOT EXISTS customer (
      id_customer BINARY(16) NOT NULL,
      name VARCHAR(45) NULL,
      last_name VARCHAR(45) NULL,
      phone VARCHAR(45) NULL,
      address VARCHAR(45) NULL,
      email VARCHAR(45) NULL,
      password VARCHAR(5000) NULL,
      PRIMARY KEY (id_customer));

      INSERT INTO customer (id_customer, name, last_name, phone, address, email, password) VALUES (1, 'GUESS', 'GUESS', '5523654584', 'GUESS', 'guess@gmail.com', 'dsfsdafds');
drop table purchase;
CREATE TABLE IF NOT EXISTS purchase (
  id_purchase BINARY(16) NOT NULL,
  id_customer BINARY(16) NOT NULL,
  date_purchase DATETIME NULL,
  payment_method CHAR(1) NULL,
  comments VARCHAR(3000) NULL,
  status_purchase CHAR(1) NULL,
  PRIMARY KEY (id_purchase));

drop table purchases_products;
CREATE TABLE IF NOT EXISTS purchases_products (
  id_purchases_products BINARY(16) NOT NULL,
  id_purchase BINARY(16) NOT NULL,
  id_product BINARY(16) NOT NULL,
  quantity INT(15) NULL,
  total FLOAT(12,2) NULL,
  status TINYINT(1) NULL,
  PRIMARY KEY (id_purchases_products, id_purchase, id_product));


CREATE  OR REPLACE VIEW purchases_customer AS
select
	P.id_purchase,
	P.id_customer,
	P.date_purchase,
	P.payment_method,
	P.comments,
	P.status_purchase,
	PP.quantity,
	PP.total,
	Prod.name_product,
	Prod.sku,
	Prod.description,
	Prod.price
from
	purchase P
inner join
	purchases_products PP
on
	P.id_purchase = PP.id_purchase
inner join
	product Prod
on
	prod.id_product = PP.id_product;