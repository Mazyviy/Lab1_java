interface Pupil {
    void FalenameOut();
    void FilenameMod();
    void MarksMod() throws MarkOutOfBoundsException;
    void SubjectsMod() throws DuplicateSubjectException;
    void SubjectsAndMarksOut();
    void MarksSubjectsAdd();
    void ArrLength();
    void MeanArithmeticMarks();
}