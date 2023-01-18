CREATE TABLE veiculos (
    id INT NOT NULL AUTO_INCREMENT,
    placa VARCHAR(7) NOT NULL,
    modelo VARCHAR(50) NOT NULL,
    fabricante VARCHAR(20) NOT NULL,
    ano_fabricacao INTEGER NOT NULL,
    PRIMARY KEY (id)
);
