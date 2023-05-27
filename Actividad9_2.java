import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Actividad9_2{
    Actividad9_2() {
        Frame frame1 = new Frame();
        frame1.setBackground(Color.black);
        frame1.setLayout(null);
        frame1.setSize(500,350);
        frame1.setVisible(true);
        frame1.setTitle("Iniciar Sesion");

        Frame frame2 = new Frame();
        frame2.setBackground(Color.ORANGE);
        frame2.setLayout(null);
        frame2.setSize(500,35);
        frame2.setVisible(false);
        frame2.setTitle("Bienvenido");


        Label user = new Label("Usuario");
        user.setBounds(25,65,70,25);
        TextField textoUser = new TextField();
        textoUser.setBounds(125,65,200,25);
        user.setBackground(Color.CYAN);

        Label clave = new Label("Contraseña");
        clave.setBounds(25,115,70,25);
        TextField textoClave = new TextField();
        textoClave.setBounds(125,115,200,25);
        clave.setBackground(Color.CYAN);

        Button cancelar = new Button("Cancelar");
        cancelar.setBounds(50,175,100,25);
        cancelar.setBackground(Color.RED);

        Button acceder = new Button("Acceder");
        acceder.setBounds(225,175,100,25);
        acceder.setBackground(Color.GREEN);

        frame1.add(user);
        frame1.add(textoUser);
        frame1.add(clave);
        frame1.add(textoClave);
        frame1.add(cancelar);
        frame1.add(acceder);

        acceder.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = textoUser.getText();
                String password = textoClave.getText();

                if (username.equals("JuanMMP") && password.equals("jmatpon")) {
                    System.out.println("Usted ha iniciado sesion correctamente");
                } else {
                    System.out.println("El nombre de usuario o contraseña son incorrectos");
                }
            }
        });

        cancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        frame1.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame1.dispose();
            }
        });

        frame2.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame2.dispose();
            }
        });

        cancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textoUser.setText(null);
                textoClave.setText(null);
            }
        });

        acceder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame1.setVisible(false);
                frame2.setVisible(true);
            }
        });

    }
    public static void main(String[] args) {
        Actividad9_2 awt_object = new Actividad9_2();
    }
}
