 package view;
import java.awt.Color;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import control.CachorroThread;

@SuppressWarnings("serial")
public class Janela extends JFrame implements ActionListener {

    private JButton btnCorrida;
    private JButton btnCancel;
    private JLabel lblPista;
    private JLabel lblVelocimetro;
    private ImageIcon imgCachorro1;
    private ImageIcon imgCachorro2;
    private ImageIcon imgCachorro3;
    private ImageIcon pista;
    private ImageIcon velocimetro;
   
    public Janela() {
        super();
               // ADICIONANDO ELEMENTOS AO FORMUL�RIO
        this.setLayout(null);
        this.setSize(1280, 650);
        this.setLocation(50, 50);
        this.setResizable(false);
        getContentPane().setBackground(Color.white);
       
        this.setTitle("Corrida de Threads");
        velocimetro = new ImageIcon("./src/imagens/velocimetro.gif");
        pista = new ImageIcon("./src/imagens/pista.png");
       
        this.lblPista = new JLabel(pista);
        this.lblVelocimetro = new JLabel(velocimetro);
        // POSICIONANDO OS ELEMENTOS DO FORM
        this.lblVelocimetro.setBounds(200, 490, 150, 150);
        this.lblPista.setBounds(0, 0, 1280, 650);
       
        this.add(lblPista);
        this.lblPista.add(lblVelocimetro);
       
        this.lblPista.setBackground(Color.BLACK);

        this.btnCorrida = new JButton("Start Rally");
        this.btnCancel = new JButton("Stop Rally");
        
                  // POSIONADO OS BOT�ES
        this.btnCorrida.setBounds(500, 550, 120, 50);
        this.btnCancel.setBounds(640, 550, 120, 50);
        
                    // INSERINDO AS IMAGENS DOS CACHORROS
        imgCachorro1 = new ImageIcon("./src/imagens/cachorro1.jpg");
        imgCachorro2 = new ImageIcon("./src/imagens/cachorro2.jpg");
        imgCachorro3 = new ImageIcon("./src/imagens/cachorro3.jpg");
       
        this.lblPista.add(btnCorrida);
        this.lblPista.add(btnCancel);

        this.setVisible(true);

        btnCorrida.addActionListener(this);
        btnCancel.addActionListener(this);

        JPanel jPanel = new JPanel();
        jPanel.setSize(300, 70);
        jPanel.setLayout(null);
        jPanel.setLocation(970, 510);
        jPanel.setBorder(BorderFactory.createTitledBorder("[Grupo de Trabalho]"));
        jPanel.setVisible(true);

        this.repaint();

    }
    
     // INSERINDO AS JLABELS DOS CACHORROS
     public JLabel JLabelCachorros(String nome, ImageIcon img, int posX, int posY) {
        CachorroThread cachorro = new CachorroThread(nome, img, posX, posY);
        cachorro.setSize(256, 141);
        cachorro.setVisible(true);
        this.add(cachorro);
        return cachorro;
    }
          // PROGRAMANDO A A��O DOS BOT�ES
    @Override
    public void actionPerformed(ActionEvent dispara) {
        if (dispara.getSource() == this.btnCorrida) {
            this.lblPista.add(JLabelCachorros("Cachorro1", imgCachorro1, 0, 50));
            this.lblPista.add(JLabelCachorros("Cachorro2", imgCachorro2, 0, 200));
            this.lblPista.add(JLabelCachorros("Cachorro3", imgCachorro3, 0, 350));
        }
        if (dispara.getSource() == this.btnCancel) {
            System.exit(0);
        }
    }
}