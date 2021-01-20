ALTER TABLE `jerocrm`.`pessoa`
ADD COLUMN `relacionamento` INT NOT NULL AFTER `nascimento`,
ADD INDEX `id_relacionamento_empresarial_idx` (`relacionamento` ASC) VISIBLE,
ADD INDEX `id_estados_idx` (`uf` ASC) VISIBLE,
DROP INDEX `id_estados_idx` ;
ALTER TABLE `jerocrm`.`pessoa`
ADD CONSTRAINT `id_relacionamento_empresarial`
  FOREIGN KEY (`relacionamento`)
  REFERENCES `jerocrm`.`relacionamento_empresarial` (`id_relacionamento_empresarial`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;