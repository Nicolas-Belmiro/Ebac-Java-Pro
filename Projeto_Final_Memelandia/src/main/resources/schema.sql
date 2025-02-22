CREATE TABLE public.categoria_meme
(
id bigint NOT NULL,
nome character varying(100) NOT NULL,
descricao character varying(100) NOT NULL,
data_cadastro date DEFAULT CURRENT_DATE,
usuario_id bigint,
CONSTRAINT pk_categoriameme PRIMARY KEY (id)
);

ALTER TABLE IF EXISTS public.categoria_meme
OWNER to postgres;