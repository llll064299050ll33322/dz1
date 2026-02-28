CREATE TABLE Movies (
    movie_id INT PRIMARY KEY,
    title VARCHAR(100) NOT NULL,
    director VARCHAR(100) NOT NULL,
    release_year INT
);

INSERT INTO Movies (movie_id,title, director, release_year) VALUES
(1,'Один', 'Крис Коламбус', 1991),
(2,'Шрэк', 'Эндрю Адамсон', 2001),
(3,'Аватар', 'Джеймс Кэмерон', 2009),
(4,'Матрица', 'Лана Вачовски', 1999);

SELECT * FROM Movies;

UPDATE Movies
SET title = 'Один дома',
    release_year = 1990
WHERE movie_id = 1;

SELECT * FROM Movies;

DELETE FROM Movies
WHERE movie_id = 4;

SELECT * FROM Movies;