-- Table: public.posto

-- DROP TABLE public.posto;

CREATE TABLE public.posto
(
  cnpj character varying NOT NULL,
  razao_social character varying,
  nome_fantasia character varying,
  bandeira character varying,
  endereco character varying,
  bairro character varying,
  imagem character varying,
  cep character varying,
  CONSTRAINT pk_cnpj PRIMARY KEY (cnpj)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.posto
  OWNER TO postgres;
