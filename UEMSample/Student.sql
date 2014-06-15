--Student Profile creation
CREATE TABLE Student
(
    StudentID              INT PRIMARY KEY AUTO_INCREMENT,
    StudentName    VARCHAR(255),
    StudentAge    INT,
    SchoolName   VARCHAR(255),
    PhotoPath    VARCHAR(255),
    CreatedDate     TIMESTAMP DEFAULT NOW()
);

--Insert Query
INSERT INTO Student(StudentName,StudentAge,SchoolName,PhotoPath)
VALUES ("Michael", 12,"St.John's Mat.Hr.Sec.School","C:\Program Files");

--Select
SELECT * FROM Student