CREATE TABLE toDoList (
  id    INT          NOT NULL AUTO_INCREMENT PRIMARY KEY,
  value VARCHAR(100) NOT NULL
);

INSERT INTO toDoList (value) VALUES
  ('Learn more about Spring'),
  ('Create ToDoApp'),
  ('Push project on GitHub');
