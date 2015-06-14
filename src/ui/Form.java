package ui;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Form extends JFrame implements View {

    private JPanel mainPanel;

    private JButton gerarFabulaButton;
    private JTextArea sceneTextArea;
    private JList sceneList;

    private Mediator mediator;

    public Form() {
        this.initComponents();
        this.mediator = new Mediator(this);
    }

    private void initComponents() {
        this.initListeners();
        this.initLookAndFeel("Nimbus");
        this.initWindow("Compiler agents");
    }

    private void initWindow(String title) {
        JFrame frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(this.mainPanel);
        frame.pack();
        frame.setVisible(true);
    }

    private void initLookAndFeel(String name) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if (info.getName().equals(name)) {
                    UIManager.setLookAndFeel(info.getClassName());
                    return;
                }
            }
        }
        catch (Exception exception)
        {
            System.out.println(exception.toString());
        }
    }

    private void initListeners() {
        gerarFabulaButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                mediator.notifyPresenter(EventType.GenerateTale);
            }
        });
    }

}
