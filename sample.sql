-- Create a SQLite database and table
CREATE TABLE people (
                             name TEXT NOT NULL,
                             is_active BOOLEAN NOT NULL,
                             has_subscription BOOLEAN,
                             is_verified BOOLEAN
);

-- Insert some sample data
INSERT INTO people (name, is_active, has_subscription, is_verified) VALUES
                                                                             ('Alice', 1, NULL, 0),
                                                                             ('Bob', 0, 1, NULL),
                                                                             ('Charlie', 1, 0, 1),
                                                                             ('Diana', 0, NULL, NULL),
                                                                             ('Eve', 1, 1, 1);

-- Select all data to verify
SELECT * FROM people;