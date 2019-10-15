/*regiones */

INSERT INTO regiones (id, nombre) VALUES (1, 'Sudamérica');
INSERT INTO regiones (id, nombre) VALUES (2, 'Centroamérica');
INSERT INTO regiones (id, nombre) VALUES (3, 'Norteamérica');
INSERT INTO regiones (id, nombre) VALUES (4, 'Europa');
INSERT INTO regiones (id, nombre) VALUES (5, 'Asia');
INSERT INTO regiones (id, nombre) VALUES (6, 'Africa');
INSERT INTO regiones (id, nombre) VALUES (7, 'Oceanía');
INSERT INTO regiones (id, nombre) VALUES (8, 'Antártida');

/*detalle productos*/
INSERT INTO db_backend.detalle_producto (id_producto, descripcion,dimensiones,peso,volumen) VALUES(1,'Alta calidad de imagen','45 pulgadas','20 kg','ultra delgada');
INSERT INTO db_backend.detalle_producto (id_producto, descripcion,dimensiones,peso,volumen) VALUES(2,'Alta resolucion','5cm alto x 3 cm ancho',' 10 gm','novedoso diseño');
INSERT INTO db_backend.detalle_producto (id_producto, descripcion,dimensiones,peso,volumen) VALUES(3,'Novedoso diseño',' 5 cm alto x 2 cm ancho','5 mm','clasico');
INSERT INTO db_backend.detalle_producto (id_producto, descripcion,dimensiones,peso,volumen) VALUES(4,'Portatil y pequeña','5 púlgadas','1 kg','ultra delgada');
INSERT INTO db_backend.detalle_producto (id_producto, descripcion,dimensiones,peso,volumen) VALUES(5,'Alto rendimiento','80 cm alto x 60 cm ancho','50 kg','diseño ajustable');
INSERT INTO db_backend.detalle_producto (id_producto, descripcion,dimensiones,peso,volumen) VALUES(6,'Alta calidad de imagen','45 pulgadas','20 kg','ultra delgada');
INSERT INTO db_backend.detalle_producto (id_producto, descripcion,dimensiones,peso,volumen) VALUES(7,'Alta calidad de imagen','45 pulgadas','20 kg','ultra delgada');

/*tabla productos */
INSERT INTO db_backend.productos (nombre, precio, create_at, id_producto, stock) VALUES('Panasonic Pantalla LCD', 259990, NOW(),1,150);
INSERT INTO db_backend.productos (nombre, precio, create_at, id_producto, stock) VALUES('Sony Camara digital DSC-W320B', 123490, NOW(),2,13000);
INSERT INTO db_backend.productos (nombre, precio, create_at, id_producto, stock) VALUES('Apple iPod shuffle', 1499990, NOW(),3,800);
INSERT INTO db_backend.productos (nombre, precio, create_at, id_producto, stock) VALUES('Sony Notebook Z110', 37990, NOW(),4,9500);
INSERT INTO db_backend.productos (nombre, precio, create_at, id_producto, stock) VALUES('Hewlett Packard Multifuncional F2280', 69990, NOW(),5,10000);
INSERT INTO db_backend.productos (nombre, precio, create_at, id_producto, stock) VALUES('Bianchi Bicicleta Aro 26', 69990, NOW(),6,589700);
INSERT INTO db_backend.productos (nombre, precio, create_at, id_producto, stock) VALUES('Mica Comoda 5 Cajones', 299990, NOW(),7,41987);

/* Creamos algunas facturas */
INSERT INTO facturas (descripcion, observacion, cliente_id, create_at) VALUES('Factura equipos de oficina', null, 1, NOW());

INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(1, 1, 1);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(2, 1, 4);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(1, 1, 5);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(1, 1, 7);

INSERT INTO facturas (descripcion, observacion, cliente_id, create_at) VALUES('Factura Bicicleta', 'Alguna nota importante!', 1, NOW());
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(3, 2, 6);