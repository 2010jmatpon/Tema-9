import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Actividad9_1 extends Frame{

    Actividad9_1() {

        Frame frame1 = new Frame();
        frame1.setBackground(Color.ORANGE);

        Label usuario = new Label("Usuario:");
        usuario.setBackground(Color.CYAN);
        TextField textoUsuario = new TextField();

        Label clave = new Label("Contraseña:");
        clave.setBackground(Color.PINK);
        TextField textoClave = new TextField();

        Button cancelar = new Button("Cancelar");
        Button acceder = new Button("Acceder");


        usuario.setBounds(90, 80, 70, 30);
        frame1.add(usuario);

        textoUsuario.setBounds(210, 85, 100, 20);
        frame1.add(textoUsuario);

        clave.setBounds(90, 140, 70, 30);
        frame1.add(clave);

        textoClave.setBounds(210, 145, 100, 20);
        frame1.add(textoClave);

        cancelar.setBounds(100,250,80,30);
        frame1.add(cancelar);

        acceder.setBounds(210,250,80,30);
        frame1.add(acceder);


        frame1.setSize(400, 300);
        frame1.setTitle("Inicio de Sesión");
        frame1.setLayout(null);
        frame1.setVisible(true);

        acceder.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = textoUsuario.getText();
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
    }

    public static void main(String args[]) {

        Actividad9_1 awt_obj = new Actividad9_1();
    }
}