CREATE TABLE log_collection (
	number_logs int PRIMARY KEY,
	collection_id uuid,
	FOREIGN KEY(collection_id) REFERENCES cicada_users(id)
);

ALTER TABLE log_collection
ADD COLUMN 

SELECT * FROM log_collection;