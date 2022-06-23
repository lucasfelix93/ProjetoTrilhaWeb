CREATE DATABASE IF NOT EXISTS bdcoldigo DEFAULT CHARACTER SET utf8 ;
USE bdcoldigo;
CREATE TABLE IF NOT EXISTS marcas (id INT UNSIGNED NOT NULL AUTO_INCREMENT, nome VARCHAR(45) NOT NULL, PRIMARY KEY (id));
CREATE TABLE IF NOT EXISTS produtos (id INT(5) UNSIGNED ZEROFILL NOT NULL AUTO_INCREMENT, 
categoria TINYINT(1) UNSIGNED NOT NULL,
modelo VARCHAR(45) NOT NULL,
capacidade INT(4) UNSIGNED NOT NULL,
valor DECIMAL (7,2) UNSIGNED NOT NULL,
marcas_id INT UNSIGNED NOT NULL,
PRIMARY KEY (id),
INDEX fk_produtos_marcas_idx (marcas_id ASC),
CONSTRAINT fk_produtos_marcas
	FOREIGN KEY (marcas_id)
    REFERENCES marcas (id)
);

SELECT * FROM marcas;
select * from produtos;

INSERT INTO marcas (id, nome) VALUES (01, "Consul");
INSERT INTO marcas (id, nome) VALUES (02, "BrasClim");
INSERT INTO marcas (id, nome) VALUES (03, "EletroSombra");

UPDATE marcas SET nome="Brastemp" WHERE id=02;