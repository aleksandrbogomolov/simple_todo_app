CREATE TABLE toDoList (
  id    INT          NOT NULL AUTO_INCREMENT PRIMARY KEY,
  value VARCHAR(100) NOT NULL
);

INSERT INTO toDoList (value) VALUES
  ('Create ToDoApp'),
  ('Learn more about Spring'),
  ('Push project on GitHub');
