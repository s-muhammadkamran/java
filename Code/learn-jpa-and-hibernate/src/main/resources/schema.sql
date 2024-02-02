CREATE TABLE COURSE (
  id BIGINT NOT NULL PRIMARY KEY, --IDENTITY,
  name NVARCHAR(MAX) NOT NULL,
  author NVARCHAR(MAX) NOT NULL
);

--INSERT INTO COURSE (name, author)
--VALUES ('AWS', 'in28minutes'), ('Java', 'in28minutes'),
--('Spring', 'in28minutes'), ('DevOps', 'in28minutes');