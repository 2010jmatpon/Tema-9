import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Actividad9_1 extends Frame{

    Actividad9_1() {

        Frame f = new Frame();
        f.setBackground(Color.ORANGE);

        Label usuario = new Label("Usuario:");
        usuario.setBackground(Color.CYAN);
        TextField textoUsuario = new TextField();

        Label clave = new Label("Contraseña:");
        clave.setBackground(Color.PINK);
        TextField textoClave = new TextField();

        Button cancel = new Button("Cancelar");
        Button enter = new Button("Acceder");




        usuario.setBounds(90, 80, 70, 30);
        f.add(usuario);

        textoUsuario.setBounds(210, 85, 100, 20);
        f.add(textoUsuario);

        clave.setBounds(90, 140, 70, 30);
        f.add(clave);

        textoClave.setBounds(210, 145, 100, 20);
        f.add(textoClave);

        cancel.setBounds(100,250,80,30);
        f.add(cancel);

        enter.setBounds(210,250,80,30);
        f.add(enter);


        f.setSize(400, 300);
        f.setTitle("Inicio de Sesión");
        f.setLayout(null);
        f.setVisible(true);

        enter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = textoUsuario.getText();
                String password = textoClave.getText();

                // Aquí se puede agregar la lógica de autenticación
                if (username.equals("JuanMMP") && password.equals("jmatpon")) {
                    System.out.println("Usted ha iniciado sesion correctamente");
                } else {
                    System.out.println("El nombre de usuario o contraseña son incorrectos");
                }
            }
        });

        cancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String args[]) {

        // creating instance of Frame class
        Actividad9_1 awt_obj = new Actividad9_1();
    }
}