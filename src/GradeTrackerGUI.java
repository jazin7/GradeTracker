import javax.swing.*;
import java.awt.event.*;
import java.awt.Dimension;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;


public class GradeTrackerGUI extends JDialog {
    private JPanel contentPane;
    private JRadioButton Informatik1RadioButton2;
    private JRadioButton Informatik1RadioButton1;
    private JTextField Informatik1CPTextField;
    private JTextField Mathematik1CPTextField;
    private JTextField RechnerarchitekturCPTextField;
    private JTextField WirtschaftCPTextField;
    private JTextField Informatik3CPTextField;
    private JTextField LogikCPTextField;
    private JTextField StatistikCPTextField;
    private JTextField SoftwareEngCPTextField;
    private JTextField ProjektmanagCPTextField;
    private JTextField DatenschutzCPTextField;
    private JRadioButton Mathematik1RadioButton1;
    private JRadioButton Mathematik1RadioButton2;
    private JRadioButton RechnerarchitekturRadioButton1;
    private JRadioButton RechnerarchitekturRadioButton2;
    private JRadioButton WirtschaftRadioButton1;
    private JRadioButton Informatik3RadioButton1;
    private JRadioButton LogikRadioButton1;
    private JRadioButton StatistikRadioButton1;
    private JRadioButton SoftwareEngRadioButton1;
    private JRadioButton ProjektmanagRadioButton1;
    private JRadioButton DatenschutzRadioButton1;
    private JRadioButton WirtschaftRadioButton2;
    private JRadioButton Informatik3RadioButton2;
    private JRadioButton LogikRadioButton2;
    private JRadioButton StatistikRadioButton2;
    private JRadioButton SoftwareEngRadioButton2;
    private JRadioButton ProjektmanagRadioButton2;
    private JRadioButton DatenschutzRadioButton2;
    private JTextField Informatik2CPTextField;
    private JTextField Mathematik2CPTextField;
    private JTextField ComputernetzeCPTextField;
    private JTextField ProgrammierungCPTextField;
    private JTextField SoftwareLabCPTextField;
    private JTextField WebEngCPTextField;
    private JTextField BetriebssystemeCPTextField;
    private JTextField AICPTextField;
    private JTextField DatenbankenCPTextField;
    private JTextField StudienprojektCPTextField;
    private JTextField Anwendung1CPTextField;
    private JTextField Anwendung2CPTextField;
    private JTextField Anwendung3CPTextField;
    private JTextField Anwendung4CPTextField;
    private JTextField Anwendung5CPTextField;
    private JTextField SeminarCPTextField;
    private JTextField PraktikumCPTextField;
    private JTextField NTW1CPTextField;
    private JTextField NTW2CPTextField;
    private JTextField BachelorarbeitCPTextField;
    private JButton berechneButton;
    private JTextField PythonPraktikumCPTextField;
    private JTextField Informatik1NoteTextField;
    private JTextField Mathematik1NoteTextField;
    private JTextField RechnerarchitekturNoteTextField;
    private JTextField WirtschaftNoteTextField;
    private JTextField Informatik3NoteTextField;
    private JTextField LogikNoteTextField;
    private JTextField StatistikNoteTextField;
    private JTextField SoftwareEngNoteTextField;
    private JTextField ProjektmanagNoteTextField;
    private JTextField DatenschutzNoteTextField;
    private JTextField PythonPraktikumNoteTextField;
    private JTextField Informatik2NoteTextField;
    private JTextField Mathematik2NoteTextField;
    private JTextField ComputernetzeNoteTextField;
    private JTextField ProgrammierungNoteTextField;
    private JTextField SoftwareLabNoteTextField;
    private JTextField WebEngNoteTextField;
    private JTextField BetriebssystemeNoteTextField;
    private JTextField AINoteTextField;
    private JTextField DatenbankenNoteTextField;
    private JTextField StudienprojektNoteTextField;
    private JTextField Anwendung1NoteTextField;
    private JTextField Anwendung2NoteTextField;
    private JTextField Anwendung3NoteTextField;
    private JTextField Anwendung4NoteTextField;
    private JTextField Anwendung5NoteTextField;
    private JTextField SeminarNoteTextField;
    private JTextField PraktikumNoteTextField;
    private JTextField NTW1NoteTextField;
    private JTextField NTW2NoteTextField;
    private JTextField BachelorarbeitNoteTextField;
    private JRadioButton PythonPraktikumRadioButton1;
    private JRadioButton Informatik2RadioButton1;
    private JRadioButton Mathematik2RadioButton1;
    private JRadioButton ComputernetzeRadioButton1;
    private JRadioButton ProgrammierungRadioButton1;
    private JRadioButton SoftwareLabRadioButton1;
    private JRadioButton WebEngRadioButton1;
    private JRadioButton BetriebssystemeRadioButton1;
    private JRadioButton AIRadioButton1;
    private JRadioButton DatenbankenRadioButton1;
    private JRadioButton StudienprojektRadioButton1;
    private JRadioButton Anwendung1RadioButton1;
    private JRadioButton Anwendung2RadioButton1;
    private JRadioButton Anwendung3RadioButton1;
    private JRadioButton Anwendung4RadioButton1;
    private JRadioButton Anwendung5RadioButton1;
    private JRadioButton SeminarRadioButton1;
    private JRadioButton PraktikumRadioButton1;
    private JRadioButton NTW1RadioButton1;
    private JRadioButton NTW2RadioButton1;
    private JRadioButton BachelorarbeitRadioButton1;
    private JRadioButton PythonPraktikumRadioButton2;
    private JRadioButton Informatik2RadioButton2;
    private JRadioButton Mathematik2RadioButton2;
    private JRadioButton ComputernetzeRadioButton2;
    private JRadioButton ProgrammierungRadioButton2;
    private JRadioButton SoftwareLabRadioButton2;
    private JRadioButton WebEngRadioButton2;
    private JRadioButton BetriebssystemeRadioButton2;
    private JRadioButton AIRadioButton2;
    private JRadioButton DatenbankenRadioButton2;
    private JRadioButton StudienprojektRadioButton2;
    private JRadioButton Anwendung1RadioButton2;
    private JRadioButton Anwendung2RadioButton2;
    private JRadioButton Anwendung3RadioButton2;
    private JRadioButton Anwendung4RadioButton2;
    private JRadioButton Anwendung5RadioButton2;
    private JRadioButton SeminarRadioButton2;
    private JRadioButton PraktikumRadioButton2;
    private JRadioButton NTW1RadioButton2;
    private JRadioButton NTW2RadioButton2;
    private JRadioButton BachelorarbeitRadioButton2;
    private JLabel gesamtCPField;
    private JLabel noteField;

    private List<Subject> subjects;



    public void berechne() {
        int gesamtCP = 0;
        int benoteteCP = 0;
        double totaleNote = 0;

        for (Subject subject : subjects) {
            if (subject.getBestandenRadioButton().isSelected()) {
                gesamtCP += Integer.parseInt(subject.getCpTextField().getText());

                if (!"PythonPraktikum".equals(subject.getSubjectName()) &&
                        !"Praktikum".equals(subject.getSubjectName()) &&
                        !"NTW1".equals(subject.getSubjectName()) &&
                        !"NTW2".equals(subject.getSubjectName())) {
                        benoteteCP += Integer.parseInt(subject.getCpTextField().getText());
                        totaleNote += Double.parseDouble(subject.getCpTextField().getText()) * Double.parseDouble(subject.getNoteTextField().getText());

                }
            }
        }
        double durchschnitt = totaleNote/benoteteCP;
        BigDecimal bd = new BigDecimal(durchschnitt).setScale(2, RoundingMode.DOWN);
        noteField.setText(String.valueOf(bd));
        gesamtCPField.setText(String.valueOf(gesamtCP));
    }



    public GradeTrackerGUI() {

        berechneButton.addActionListener(e -> {
            berechne();
        });


        subjects = new ArrayList<>();

        subjects.add(new Subject("Informatik1", Informatik1CPTextField, Informatik1NoteTextField, Informatik1RadioButton1, Informatik1RadioButton2));
        subjects.add(new Subject("Mathematik1", Mathematik1CPTextField, Mathematik1NoteTextField, Mathematik1RadioButton1, Mathematik1RadioButton2));
        subjects.add(new Subject("Rechnerarchitektur", RechnerarchitekturCPTextField, RechnerarchitekturNoteTextField, RechnerarchitekturRadioButton1, RechnerarchitekturRadioButton2));
        subjects.add(new Subject("Wirtschaft", WirtschaftCPTextField, WirtschaftNoteTextField, WirtschaftRadioButton1, WirtschaftRadioButton2));
        subjects.add(new Subject("Informatik3", Informatik3CPTextField, Informatik3NoteTextField, Informatik3RadioButton1, Informatik3RadioButton2));
        subjects.add(new Subject("Logik", LogikCPTextField, LogikNoteTextField, LogikRadioButton1, LogikRadioButton2));
        subjects.add(new Subject("Statistik", StatistikCPTextField, StatistikNoteTextField, StatistikRadioButton1, StatistikRadioButton2));
        subjects.add(new Subject("SoftwareEng", SoftwareEngCPTextField, SoftwareEngNoteTextField, SoftwareEngRadioButton1, SoftwareEngRadioButton2));
        subjects.add(new Subject("Projektmanag", ProjektmanagCPTextField, ProjektmanagNoteTextField, ProjektmanagRadioButton1, ProjektmanagRadioButton2));
        subjects.add(new Subject("Datenschutz", DatenschutzCPTextField, DatenschutzNoteTextField, DatenschutzRadioButton1, DatenschutzRadioButton2));
        subjects.add(new Subject("PythonPraktikum", PythonPraktikumCPTextField, PythonPraktikumNoteTextField, PythonPraktikumRadioButton1, PythonPraktikumRadioButton2));
        subjects.add(new Subject("Informatik2", Informatik2CPTextField, Informatik2NoteTextField, Informatik2RadioButton1, Informatik2RadioButton2));
        subjects.add(new Subject("Mathematik2", Mathematik2CPTextField, Mathematik2NoteTextField, Mathematik2RadioButton1, Mathematik2RadioButton2));
        subjects.add(new Subject("Computernetze", ComputernetzeCPTextField, ComputernetzeNoteTextField, ComputernetzeRadioButton1, ComputernetzeRadioButton2));
        subjects.add(new Subject("Programmierung", ProgrammierungCPTextField, ProgrammierungNoteTextField, ProgrammierungRadioButton1, ProgrammierungRadioButton2));
        subjects.add(new Subject("SoftwareLab", SoftwareLabCPTextField, SoftwareLabNoteTextField, SoftwareLabRadioButton1, SoftwareLabRadioButton2));
        subjects.add(new Subject("WebEng", WebEngCPTextField, WebEngNoteTextField, WebEngRadioButton1, WebEngRadioButton2));
        subjects.add(new Subject("Betriebssysteme", BetriebssystemeCPTextField, BetriebssystemeNoteTextField, BetriebssystemeRadioButton1, BetriebssystemeRadioButton2));
        subjects.add(new Subject("AI", AICPTextField, AINoteTextField, AIRadioButton1, AIRadioButton2));
        subjects.add(new Subject("Datenbanken", DatenbankenCPTextField, DatenbankenNoteTextField, DatenbankenRadioButton1, DatenbankenRadioButton2));
        subjects.add(new Subject("Studienprojekt", StudienprojektCPTextField, StudienprojektNoteTextField, StudienprojektRadioButton1, StudienprojektRadioButton2));
        subjects.add(new Subject("Anwendung1", Anwendung1CPTextField, Anwendung1NoteTextField, Anwendung1RadioButton1, Anwendung1RadioButton2));
        subjects.add(new Subject("Anwendung2", Anwendung2CPTextField, Anwendung2NoteTextField, Anwendung2RadioButton1, Anwendung2RadioButton2));
        subjects.add(new Subject("Anwendung3", Anwendung3CPTextField, Anwendung3NoteTextField, Anwendung3RadioButton1, Anwendung3RadioButton2));
        subjects.add(new Subject("Anwendung4", Anwendung4CPTextField, Anwendung4NoteTextField, Anwendung4RadioButton1, Anwendung4RadioButton2));
        subjects.add(new Subject("Anwendung5", Anwendung5CPTextField, Anwendung5NoteTextField, Anwendung5RadioButton1, Anwendung5RadioButton2));
        subjects.add(new Subject("Seminar", SeminarCPTextField, SeminarNoteTextField, SeminarRadioButton1, SeminarRadioButton2));
        subjects.add(new Subject("Praktikum", PraktikumCPTextField, PraktikumNoteTextField, PraktikumRadioButton1, PraktikumRadioButton2));
        subjects.add(new Subject("NTW1", NTW1CPTextField, NTW1NoteTextField, NTW1RadioButton1, NTW1RadioButton2));
        subjects.add(new Subject("NTW2", NTW2CPTextField, NTW2NoteTextField, NTW2RadioButton1, NTW2RadioButton2));
        subjects.add(new Subject("Bachelorarbeit", BachelorarbeitCPTextField, BachelorarbeitNoteTextField, BachelorarbeitRadioButton1, BachelorarbeitRadioButton2));



        setContentPane(contentPane);
        setModal(true);
        setMinimumSize(new Dimension(540, 360));
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

   private void onCancel() {
        dispose();
    }

    public static void main(String[] args) {

        GradeTrackerGUI dialog = new GradeTrackerGUI();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
