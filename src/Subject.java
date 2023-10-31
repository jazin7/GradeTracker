import javax.swing.*;

public class Subject {

    private String subjectName;
    private JTextField cpTextField;
    private JTextField noteTextField;
    private JRadioButton bestandenRadioButton;
    private JRadioButton nichtBestandenRadioButton;

    public Subject(String subjectName, JTextField cpTextField, JTextField noteTextField, JRadioButton bestandenRadioButton, JRadioButton nichtBestandenRadioButton) {
        this.subjectName = subjectName;
        this.cpTextField = cpTextField;
        this.noteTextField = noteTextField;
        this.bestandenRadioButton = bestandenRadioButton;
        this.nichtBestandenRadioButton = nichtBestandenRadioButton;
    }
    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
    public JTextField getCpTextField() {
        return cpTextField;
    }

    public void setCpTextField(JTextField cpTextField) {
        this.cpTextField = cpTextField;
    }

    public JTextField getNoteTextField() {
        return noteTextField;
    }

    public void setNoteTextField(JTextField noteTextField) {
        this.noteTextField = noteTextField;
    }

    public JRadioButton getBestandenRadioButton() {
        return bestandenRadioButton;
    }

    public void setBestandenRadioButton(JRadioButton bestandenRadioButton) {
        this.bestandenRadioButton = bestandenRadioButton;
    }

    public JRadioButton getNichtBestandenRadioButton() {
        return nichtBestandenRadioButton;
    }

    public void setNichtBestandenRadioButton(JRadioButton nichtBestandenRadioButton) {
        this.nichtBestandenRadioButton = nichtBestandenRadioButton;
    }

}
