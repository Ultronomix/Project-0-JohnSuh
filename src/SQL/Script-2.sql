CREATE TABLE logs (
	log_date varchar PRIMARY KEY NOT NULL,
	county varchar NOT NULL,
	species varchar NOT NULL,
	id_log uuid,
	FOREIGN KEY(id_log) REFERENCES cicada_users(id)
);

	SELECT * FROM logs;