CREATE TABLE cicada_users (
	id uuid PRIMARY KEY  DEFAULT gen_random_uuid(),
	username varchar NOT NULL UNIQUE CHECK (length (username) >= 4),
	given_name varchar NOT NULL,
	email varchar NOT NULL UNIQUE,
	PASSWORD varchar NOT NULL CHECK (length (password) >= 8)
);

	SELECT * FROM cicada_users;
