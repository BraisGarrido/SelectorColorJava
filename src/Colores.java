import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Colores extends JFrame implements AdjustmentListener, ActionListener {
    JScrollBar scroll_rojo, scroll_verde, scroll_azul;
    JTextField trojo, tverde, tazul;
    JButton b_negro, b_grisoscuro, b_gris, b_grisclaro, b_blanco, b_magenta, b_azul, b_cian, b_verde, b_amarillo, b_naranja, b_rojo, b_rosa;
    Container cp=getContentPane();

    public Colores() {

        //Valores de la ventana
        super("Colores");
        setSize(600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Panel derecho
        JPanel b_colores = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.fill = GridBagConstraints.BOTH;
        
        b_negro = new JButton("negro");
        b_negro.setBackground(Color.BLACK);
        b_negro.setOpaque(true);
        b_negro.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                cp.setBackground(Color.black);
            }
        });
        
        b_grisoscuro = new JButton("gris oscuro");
        b_grisoscuro.setBackground(Color.DARK_GRAY);
        b_grisoscuro.setOpaque(true);
        b_grisoscuro.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                cp.setBackground(Color.DARK_GRAY);
            }
        });

        b_gris = new JButton("gris");
        b_gris.setBackground(Color.GRAY);
        b_gris.setOpaque(true);
        b_gris.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                cp.setBackground(Color.GRAY);
            }
        });

        b_grisclaro = new JButton("gris claro");
        b_grisclaro.setBackground(Color.LIGHT_GRAY);
        b_grisclaro.setOpaque(true);
        b_grisclaro.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                cp.setBackground(Color.LIGHT_GRAY);
            }
        });

        b_blanco = new JButton("blanco");
        b_blanco.setBackground(Color.WHITE);
        b_blanco.setOpaque(true);
        b_blanco.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                cp.setBackground(Color.WHITE);
            }
        });

        b_magenta = new JButton("magenta");
        b_magenta.setBackground(Color.MAGENTA);
        b_magenta.setOpaque(true);
        b_magenta.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                cp.setBackground(Color.MAGENTA);
            }
        });

        b_azul = new JButton("azul");
        b_azul.setBackground(Color.BLUE);
        b_azul.setOpaque(true);
        b_azul.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                cp.setBackground(Color.BLUE);
            }
        });

        b_cian = new JButton("cian");
        b_cian.setBackground(Color.CYAN);
        b_cian.setOpaque(true);
        b_cian.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                cp.setBackground(Color.CYAN);
            }
        });

        b_verde = new JButton("verde");
        b_verde.setBackground(Color.GREEN);
        b_verde.setOpaque(true);
        b_verde.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                cp.setBackground(Color.GREEN);
            }
        });

        b_amarillo = new JButton("amarillo");
        b_amarillo.setBackground(Color.YELLOW);
        b_amarillo.setOpaque(true);
        b_amarillo.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                cp.setBackground(Color.yellow);
            }
        });

        b_naranja = new JButton("naranja");
        b_naranja.setBackground(Color.ORANGE);
        b_naranja.setOpaque(true);
        b_naranja.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                cp.setBackground(Color.ORANGE);
            }
        });

        b_rojo = new JButton("rojo");
        b_rojo.setBackground(Color.RED);
        b_rojo.setOpaque(true);
        b_rojo.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                cp.setBackground(Color.RED);
            }
        });

        b_rosa = new JButton("rosa");
        b_rosa.setBackground(Color.PINK);
        b_rosa.setOpaque(true);
        b_rosa.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                cp.setBackground(Color.PINK);
            }
        });


        b_colores.add(b_negro, gbc);
        b_colores.add(b_grisoscuro, gbc);
        b_colores.add(b_gris, gbc);
        b_colores.add(b_grisclaro, gbc);
        b_colores.add(b_blanco, gbc);
        b_colores.add(b_magenta, gbc);
        b_colores.add(b_azul, gbc);
        b_colores.add(b_cian, gbc);
        b_colores.add(b_verde, gbc);
        b_colores.add(b_amarillo, gbc);
        b_colores.add(b_naranja, gbc);
        b_colores.add(b_rojo, gbc);
        b_colores.add(b_rosa, gbc);

        //Panel izquierdo
        JPanel barras = new JPanel(new GridLayout());

        scroll_rojo = new JScrollBar(1,255, 5, 0, 255+5);
        scroll_rojo.addAdjustmentListener(this);
        scroll_verde = new JScrollBar( 1,255, 5, 0, 255+5);
        scroll_verde.addAdjustmentListener(this);
        scroll_azul = new JScrollBar( 1,255, 5, 0, 255+5);
        scroll_azul.addAdjustmentListener(this);

        barras.add(scroll_rojo);
        barras.add(scroll_verde);
        barras.add(scroll_azul);

        //Panel inferior
        JPanel botonesinferiores = new JPanel(new GridLayout());

        JLabel rojo = new JLabel("rojo");
        rojo.setBackground(Color.RED);
        rojo.setOpaque(true);
        JLabel verde = new JLabel("verde");
        verde.setBackground(Color.GREEN);
        verde.setOpaque(true);
        JLabel azul = new JLabel("azul");
        azul.setBackground(Color.BLUE);
        azul.setOpaque(true);
        trojo = new JTextField();
        trojo.setText("0");
        tverde = new JTextField();
        tverde.setText("0");
        tazul = new JTextField();
        tazul.setText("0");

        botonesinferiores.add(rojo);
        botonesinferiores.add(trojo);
        botonesinferiores.add(verde);
        botonesinferiores.add(tverde);
        botonesinferiores.add(azul);
        botonesinferiores.add(tazul);

        //Colocacion de paneles
        Container cp=getContentPane();
        cp.add(botonesinferiores, BorderLayout.SOUTH);
        cp.add(b_colores, BorderLayout.EAST);
        cp.add(barras, BorderLayout.WEST);
        cp.setBackground(Color.BLACK);
    }

    public void adjustmentValueChanged(AdjustmentEvent c) {
		if (c.getSource() == scroll_rojo)
            trojo.setText(String.valueOf(255-c.getValue()));
		else if (c.getSource() == scroll_verde)
			tverde.setText(String.valueOf(255-c.getValue()));
		else if (c.getSource() == scroll_azul)
			tazul.setText(String.valueOf(255-c.getValue()));
		 cp.setBackground(new Color(255-scroll_rojo.getValue(),255-scroll_verde.getValue(),255-scroll_azul.getValue()));
	}

    public static void main(String[] args) {
        Colores v = new Colores();
        v.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub  
    }
}
