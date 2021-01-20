CREATE TABLE `jerocrm`.`pessoa` (
  `idpessoa` INT NOT NULL AUTO_INCREMENT,
  `nomerazao` VARCHAR(70) NOT NULL,
  `tipo` VARCHAR(1) NOT NULL,
  `cpf` VARCHAR(14) NULL,
  `cnpj` VARCHAR(18) NULL,
  `endereco` VARCHAR(100) NOT NULL,
  `numero` VARCHAR(5) NOT NULL,
  `complemento` VARCHAR(15) NULL,
  `bairro` VARCHAR(100) NOT NULL,
  `uf` INT NOT NULL,
  `municipio` INT NOT NULL,
  `cep` VARCHAR(9) NOT NULL,
  `telefone` VARCHAR(14) NOT NULL,
  `email` VARCHAR(100) NOT NULL,
  `nascimento` DATE NOT NULL,
  PRIMARY KEY (`idpessoa`),
  INDEX `id_estados_idx` (`uf` ASC) VISIBLE,
  INDEX `id_cidade_idx` (`municipio` ASC) VISIBLE,
  CONSTRAINT `id_cidade`
    FOREIGN KEY (`municipio`)
    REFERENCES `jerocrm`.`cidades` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `id_estados`
    FOREIGN KEY (`uf`)
    REFERENCES `jerocrm`.`estados` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
COMMENT = 'Tabela de cadastro de pessoas:\ntipo = F ou J';
