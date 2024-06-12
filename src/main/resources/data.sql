-- Beispiel Daten in die Quiz Tabelle einfügen
INSERT INTO Quiz (id, name, description)
VALUES ('123e4567-e89b-12d3-a456-426614174000', 'Allgemeinwissen', 'Ein Quiz über Allgemeinwissen'),
       ('123e4567-e89b-12d3-a456-426614174001', 'Geografie', 'Ein Quiz über Weltgeografie');

-- Beispiel Daten in die Question Tabelle einfügen
INSERT INTO Question (id, quizid, text)
VALUES ('223e4567-e89b-12d3-a456-426614174000', '123e4567-e89b-12d3-a456-426614174000',
        'Was ist die Hauptstadt von Frankreich?'),
       ('223e4567-e89b-12d3-a456-426614174001', '123e4567-e89b-12d3-a456-426614174000',
        'Wie viele Kontinente gibt es auf der Erde?'),
       ('223e4567-e89b-12d3-a456-426614174002', '123e4567-e89b-12d3-a456-426614174001',
        'Welcher Fluss fließt durch Kairo?');

-- Beispiel Daten in die Answer Tabelle einfügen
INSERT INTO Answer (id, questionid, text, istrue)
VALUES ('323e4567-e89b-12d3-a456-426614174000', '223e4567-e89b-12d3-a456-426614174000', 'Paris', TRUE),
       ('323e4567-e89b-12d3-a456-426614174001', '223e4567-e89b-12d3-a456-426614174000', 'Berlin', FALSE),
       ('323e4567-e89b-12d3-a456-426614174002', '223e4567-e89b-12d3-a456-426614174001', '5', FALSE),
       ('323e4567-e89b-12d3-a456-426614174003', '223e4567-e89b-12d3-a456-426614174001', '7', TRUE),
       ('323e4567-e89b-12d3-a456-426614174004', '223e4567-e89b-12d3-a456-426614174002', 'Nil', TRUE),
       ('323e4567-e89b-12d3-a456-426614174005', '223e4567-e89b-12d3-a456-426614174002', 'Amazonas', FALSE);

-- Beispiel Daten in die Player Tabelle einfügen
INSERT INTO Player (id, name, password)
VALUES ('423e4567-e89b-12d3-a456-426614174000', 'Max Mustermann', 'password123'),
       ('423e4567-e89b-12d3-a456-426614174001', 'Erika Mustermann', 'password456');

-- Beispiel Daten in die PlayertoQuiz Tabelle einfügen
INSERT INTO PlayertoQuiz (id, playerid, quizid, score)
VALUES ('523e4567-e89b-12d3-a456-426614174000', '423e4567-e89b-12d3-a456-426614174000',
        '123e4567-e89b-12d3-a456-426614174000', 10),
       ('523e4567-e89b-12d3-a456-426614174001', '423e4567-e89b-12d3-a456-426614174001',
        '123e4567-e89b-12d3-a456-426614174001', 15);
