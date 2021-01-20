CREATE TABLE `jerocrm`.`relacionamento_empresarial` (
  `id_relacionamento_empresarial` INT NOT NULL,
  `relacionamento` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`id_relacionamento_empresarial`))
COMMENT = 'Tipo de relacionamento que a pessoa tem com a empresa: Fornecedor, empregado/colaborador, Cliente, socio,';
