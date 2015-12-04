-- Table: public.preco

-- DROP TABLE public.preco;

CREATE TABLE public.preco
(
  tipo_combustivel character varying,
  data_coleta character varying,
  preco_venda character varying,
  id_preco character varying NOT NULL,
  p_cnpj character varying,
  CONSTRAINT pk_id_preco PRIMARY KEY (id_preco),
  CONSTRAINT fk_p_cnpj FOREIGN KEY (p_cnpj)
      REFERENCES public.posto (cnpj) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.preco
  OWNER TO postgres;
