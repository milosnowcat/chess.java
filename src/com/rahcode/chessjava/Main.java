package com.rahcode.chessjava;

import java.awt.EventQueue;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	JLabel[] sqrs = new JLabel[64];
	int piece = 0;
	
	public void move(int piece, int moveTo){
		if (piece != moveTo) {			
			Icon pieceIcon = sqrs[piece - 1].getIcon();
			
			sqrs[moveTo - 1].setIcon(pieceIcon);
			sqrs[piece - 1].setIcon(null);
		}
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 581, 603);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblChessA1 = new JLabel("");
		lblChessA1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (piece == 0) {
					piece = 1;
				} else {
					move(piece, 1);
					piece = 0;
				}
			}
		});
		lblChessA1.setBounds(24, 472, 65, 65);
		lblChessA1.setIcon(new ImageIcon("assets/img/rookW.png"));
		contentPane.add(lblChessA1);
		
		JLabel lblChessB1 = new JLabel("");
		lblChessB1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (piece == 0) {
					piece = 2;
				} else {
					move(piece, 2);
					piece = 0;
				}
			}
		});
		lblChessB1.setBounds(89, 472, 65, 65);
		lblChessB1.setIcon(new ImageIcon("assets/img/knightW.png"));
		contentPane.add(lblChessB1);
		
		JLabel lblChessC1 = new JLabel("");
		lblChessC1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (piece == 0) {
					piece = 3;
				} else {
					move(piece, 3);
					piece = 0;
				}
			}
		});
		lblChessC1.setBounds(154, 472, 65, 65);
		lblChessC1.setIcon(new ImageIcon("assets/img/bishopW.png"));
		contentPane.add(lblChessC1);
		
		JLabel lblChessD1 = new JLabel("");
		lblChessD1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (piece == 0) {
					piece = 4;
				} else {
					move(piece, 4);
					piece = 0;
				}
			}
		});
		lblChessD1.setBounds(219, 472, 65, 65);
		lblChessD1.setIcon(new ImageIcon("assets/img/queenW.png"));
		contentPane.add(lblChessD1);
		
		JLabel lblChessE1 = new JLabel("");
		lblChessE1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (piece == 0) {
					piece = 5;
				} else {
					move(piece, 5);
					piece = 0;
				}
			}
		});
		lblChessE1.setBounds(284, 472, 65, 65);
		lblChessE1.setIcon(new ImageIcon("assets/img/kingW.png"));
		contentPane.add(lblChessE1);
		
		JLabel lblChessF1 = new JLabel("");
		lblChessF1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (piece == 0) {
					piece = 6;
				} else {
					move(piece, 6);
					piece = 0;
				}
			}
		});
		lblChessF1.setBounds(349, 472, 65, 65);
		lblChessF1.setIcon(new ImageIcon("assets/img/bishopW.png"));
		contentPane.add(lblChessF1);
		
		JLabel lblChessG1 = new JLabel("");
		lblChessG1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (piece == 0) {
					piece = 7;
				} else {
					move(piece, 7);
					piece = 0;
				}
			}
		});
		lblChessG1.setBounds(414, 472, 65, 65);
		lblChessG1.setIcon(new ImageIcon("assets/img/knightW.png"));
		contentPane.add(lblChessG1);
		
		JLabel lblChessH1 = new JLabel("");
		lblChessH1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (piece == 0) {
					piece = 8;
				} else {
					move(piece, 8);
					piece = 0;
				}
			}
		});
		lblChessH1.setBounds(479, 472, 65, 65);
		lblChessH1.setIcon(new ImageIcon("assets/img/rookW.png"));
		contentPane.add(lblChessH1);
		
		JLabel lblChessA2 = new JLabel("");
		lblChessA2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (piece == 0) {
					piece = 9;
				} else {
					move(piece, 9);
					piece = 0;
				}
			}
		});
		lblChessA2.setBounds(24, 408, 65, 65);
		lblChessA2.setIcon(new ImageIcon("assets/img/pawnW.png"));
		contentPane.add(lblChessA2);
		
		JLabel lblChessB2 = new JLabel("");
		lblChessB2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (piece == 0) {
					piece = 10;
				} else {
					move(piece, 10);
					piece = 0;
				}
			}
		});
		lblChessB2.setBounds(89, 408, 65, 65);
		lblChessB2.setIcon(new ImageIcon("assets/img/pawnW.png"));
		contentPane.add(lblChessB2);
		
		JLabel lblChessC2 = new JLabel("");
		lblChessC2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (piece == 0) {
					piece = 11;
				} else {
					move(piece, 11);
					piece = 0;
				}
			}
		});
		lblChessC2.setBounds(154, 408, 65, 65);
		lblChessC2.setIcon(new ImageIcon("assets/img/pawnW.png"));
		contentPane.add(lblChessC2);
		
		JLabel lblChessD2 = new JLabel("");
		lblChessD2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (piece == 0) {
					piece = 12;
				} else {
					move(piece, 12);
					piece = 0;
				}
			}
		});
		lblChessD2.setBounds(219, 408, 65, 65);
		lblChessD2.setIcon(new ImageIcon("assets/img/pawnW.png"));
		contentPane.add(lblChessD2);
		
		JLabel lblChessE2 = new JLabel("");
		lblChessE2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (piece == 0) {
					piece = 13;
				} else {
					move(piece, 13);
					piece = 0;
				}
			}
		});
		lblChessE2.setBounds(284, 408, 65, 65);
		lblChessE2.setIcon(new ImageIcon("assets/img/pawnW.png"));
		contentPane.add(lblChessE2);
		
		JLabel lblChessF2 = new JLabel("");
		lblChessF2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (piece == 0) {
					piece = 14;
				} else {
					move(piece, 14);
					piece = 0;
				}
			}
		});
		lblChessF2.setBounds(349, 408, 65, 65);
		lblChessF2.setIcon(new ImageIcon("assets/img/pawnW.png"));
		contentPane.add(lblChessF2);
		
		JLabel lblChessG2 = new JLabel("");
		lblChessG2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (piece == 0) {
					piece = 15;
				} else {
					move(piece, 15);
					piece = 0;
				}
			}
		});
		lblChessG2.setBounds(414, 408, 65, 65);
		lblChessG2.setIcon(new ImageIcon("assets/img/pawnW.png"));
		contentPane.add(lblChessG2);
		
		JLabel lblChessH2 = new JLabel("");
		lblChessH2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (piece == 0) {
					piece = 16;
				} else {
					move(piece, 16);
					piece = 0;
				}
			}
		});
		lblChessH2.setBounds(479, 408, 65, 65);
		lblChessH2.setIcon(new ImageIcon("assets/img/pawnW.png"));
		contentPane.add(lblChessH2);
		
		JLabel lblChessA3 = new JLabel("");
		lblChessA3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (piece == 0) {
					piece = 17;
				} else {
					move(piece, 17);
					piece = 0;
				}
			}
		});
		lblChessA3.setBounds(24, 344, 65, 65);
		contentPane.add(lblChessA3);
		
		JLabel lblChessB3 = new JLabel("");
		lblChessB3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (piece == 0) {
					piece = 18;
				} else {
					move(piece, 18);
					piece = 0;
				}
			}
		});
		lblChessB3.setBounds(89, 344, 65, 65);
		contentPane.add(lblChessB3);
		
		JLabel lblChessC3 = new JLabel("");
		lblChessC3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (piece == 0) {
					piece = 19;
				} else {
					move(piece, 19);
					piece = 0;
				}
			}
		});
		lblChessC3.setBounds(154, 344, 65, 65);
		contentPane.add(lblChessC3);
		
		JLabel lblChessD3 = new JLabel("");
		lblChessD3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (piece == 0) {
					piece = 20;
				} else {
					move(piece, 20);
					piece = 0;
				}
			}
		});
		lblChessD3.setBounds(219, 344, 65, 65);
		contentPane.add(lblChessD3);
		
		JLabel lblChessE3 = new JLabel("");
		lblChessE3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (piece == 0) {
					piece = 21;
				} else {
					move(piece, 21);
					piece = 0;
				}
			}
		});
		lblChessE3.setBounds(284, 344, 65, 65);
		contentPane.add(lblChessE3);
		
		JLabel lblChessF3 = new JLabel("");
		lblChessF3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (piece == 0) {
					piece = 22;
				} else {
					move(piece, 22);
					piece = 0;
				}
			}
		});
		lblChessF3.setBounds(349, 344, 65, 65);
		contentPane.add(lblChessF3);
		
		JLabel lblChessG3 = new JLabel("");
		lblChessG3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (piece == 0) {
					piece = 23;
				} else {
					move(piece, 23);
					piece = 0;
				}
			}
		});
		lblChessG3.setBounds(414, 344, 65, 65);
		contentPane.add(lblChessG3);
		
		JLabel lblChessH3 = new JLabel("");
		lblChessH3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (piece == 0) {
					piece = 24;
				} else {
					move(piece, 24);
					piece = 0;
				}
			}
		});
		lblChessH3.setBounds(479, 344, 65, 65);
		contentPane.add(lblChessH3);
		
		JLabel lblChessA4 = new JLabel("");
		lblChessA4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (piece == 0) {
					piece = 25;
				} else {
					move(piece, 25);
					piece = 0;
				}
			}
		});
		lblChessA4.setBounds(24, 280, 65, 65);
		contentPane.add(lblChessA4);
		
		JLabel lblChessB4 = new JLabel("");
		lblChessB4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (piece == 0) {
					piece = 26;
				} else {
					move(piece, 26);
					piece = 0;
				}
			}
		});
		lblChessB4.setBounds(89, 280, 65, 65);
		contentPane.add(lblChessB4);
		
		JLabel lblChessC4 = new JLabel("");
		lblChessC4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (piece == 0) {
					piece = 27;
				} else {
					move(piece, 27);
					piece = 0;
				}
			}
		});
		lblChessC4.setBounds(154, 280, 65, 65);
		contentPane.add(lblChessC4);
		
		JLabel lblChessD4 = new JLabel("");
		lblChessD4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (piece == 0) {
					piece = 28;
				} else {
					move(piece, 28);
					piece = 0;
				}
			}
		});
		lblChessD4.setBounds(219, 280, 65, 65);
		contentPane.add(lblChessD4);
		
		JLabel lblChessE4 = new JLabel("");
		lblChessE4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (piece == 0) {
					piece = 29;
				} else {
					move(piece, 29);
					piece = 0;
				}
			}
		});
		lblChessE4.setBounds(284, 280, 65, 65);
		contentPane.add(lblChessE4);
		
		JLabel lblChessF4 = new JLabel("");
		lblChessF4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (piece == 0) {
					piece = 30;
				} else {
					move(piece, 30);
					piece = 0;
				}
			}
		});
		lblChessF4.setBounds(349, 280, 65, 65);
		contentPane.add(lblChessF4);
		
		JLabel lblChessG4 = new JLabel("");
		lblChessG4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (piece == 0) {
					piece = 31;
				} else {
					move(piece, 31);
					piece = 0;
				}
			}
		});
		lblChessG4.setBounds(414, 280, 65, 65);
		contentPane.add(lblChessG4);
		
		JLabel lblChessH4 = new JLabel("");
		lblChessH4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (piece == 0) {
					piece = 32;
				} else {
					move(piece, 32);
					piece = 0;
				}
			}
		});
		lblChessH4.setBounds(479, 280, 65, 65);
		contentPane.add(lblChessH4);
		
		JLabel lblChessA5 = new JLabel("");
		lblChessA5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (piece == 0) {
					piece = 33;
				} else {
					move(piece, 33);
					piece = 0;
				}
			}
		});
		lblChessA5.setBounds(24, 216, 65, 65);
		contentPane.add(lblChessA5);
		
		JLabel lblChessB5 = new JLabel("");
		lblChessB5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (piece == 0) {
					piece = 34;
				} else {
					move(piece, 34);
					piece = 0;
				}
			}
		});
		lblChessB5.setBounds(89, 216, 65, 65);
		contentPane.add(lblChessB5);
		
		JLabel lblChessC5 = new JLabel("");
		lblChessC5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (piece == 0) {
					piece = 35;
				} else {
					move(piece, 35);
					piece = 0;
				}
			}
		});
		lblChessC5.setBounds(154, 216, 65, 65);
		contentPane.add(lblChessC5);
		
		JLabel lblChessD5 = new JLabel("");
		lblChessD5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (piece == 0) {
					piece = 36;
				} else {
					move(piece, 36);
					piece = 0;
				}
			}
		});
		lblChessD5.setBounds(219, 216, 65, 65);
		contentPane.add(lblChessD5);
		
		JLabel lblChessE5 = new JLabel("");
		lblChessE5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (piece == 0) {
					piece = 37;
				} else {
					move(piece, 37);
					piece = 0;
				}
			}
		});
		lblChessE5.setBounds(284, 216, 65, 65);
		contentPane.add(lblChessE5);
		
		JLabel lblChessF5 = new JLabel("");
		lblChessF5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (piece == 0) {
					piece = 38;
				} else {
					move(piece, 38);
					piece = 0;
				}
			}
		});
		lblChessF5.setBounds(349, 216, 65, 65);
		contentPane.add(lblChessF5);
		
		JLabel lblChessG5 = new JLabel("");
		lblChessG5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (piece == 0) {
					piece = 39;
				} else {
					move(piece, 39);
					piece = 0;
				}
			}
		});
		lblChessG5.setBounds(414, 216, 65, 65);
		contentPane.add(lblChessG5);
		
		JLabel lblChessH5 = new JLabel("");
		lblChessH5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (piece == 0) {
					piece = 40;
				} else {
					move(piece, 40);
					piece = 0;
				}
			}
		});
		lblChessH5.setBounds(479, 216, 65, 65);
		contentPane.add(lblChessH5);
		
		JLabel lblChessA6 = new JLabel("");
		lblChessA6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (piece == 0) {
					piece = 41;
				} else {
					move(piece, 41);
					piece = 0;
				}
			}
		});
		lblChessA6.setBounds(24, 152, 65, 65);
		contentPane.add(lblChessA6);
		
		JLabel lblChessB6 = new JLabel("");
		lblChessB6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (piece == 0) {
					piece = 42;
				} else {
					move(piece, 42);
					piece = 0;
				}
			}
		});
		lblChessB6.setBounds(89, 152, 65, 65);
		contentPane.add(lblChessB6);
		
		JLabel lblChessC6 = new JLabel("");
		lblChessC6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (piece == 0) {
					piece = 43;
				} else {
					move(piece, 43);
					piece = 0;
				}
			}
		});
		lblChessC6.setBounds(154, 152, 65, 65);
		contentPane.add(lblChessC6);
		
		JLabel lblChessD6 = new JLabel("");
		lblChessD6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (piece == 0) {
					piece = 44;
				} else {
					move(piece, 44);
					piece = 0;
				}
			}
		});
		lblChessD6.setBounds(219, 152, 65, 65);
		contentPane.add(lblChessD6);
		
		JLabel lblChessE6 = new JLabel("");
		lblChessE6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (piece == 0) {
					piece = 45;
				} else {
					move(piece, 45);
					piece = 0;
				}
			}
		});
		lblChessE6.setBounds(284, 152, 65, 65);
		contentPane.add(lblChessE6);
		
		JLabel lblChessF6 = new JLabel("");
		lblChessF6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (piece == 0) {
					piece = 46;
				} else {
					move(piece, 46);
					piece = 0;
				}
			}
		});
		lblChessF6.setBounds(349, 152, 65, 65);
		contentPane.add(lblChessF6);
		
		JLabel lblChessG6 = new JLabel("");
		lblChessG6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (piece == 0) {
					piece = 47;
				} else {
					move(piece, 47);
					piece = 0;
				}
			}
		});
		lblChessG6.setBounds(414, 152, 65, 65);
		contentPane.add(lblChessG6);
		
		JLabel lblChessH6 = new JLabel("");
		lblChessH6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (piece == 0) {
					piece = 48;
				} else {
					move(piece, 48);
					piece = 0;
				}
			}
		});
		lblChessH6.setBounds(479, 152, 65, 65);
		contentPane.add(lblChessH6);
		
		JLabel lblChessA7 = new JLabel("");
		lblChessA7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (piece == 0) {
					piece = 49;
				} else {
					move(piece, 49);
					piece = 0;
				}
			}
		});
		lblChessA7.setBounds(24, 88, 65, 65);
		lblChessA7.setIcon(new ImageIcon("assets/img/pawnB.png"));
		contentPane.add(lblChessA7);
		
		JLabel lblChessB7 = new JLabel("");
		lblChessB7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (piece == 0) {
					piece = 50;
				} else {
					move(piece, 50);
					piece = 0;
				}
			}
		});
		lblChessB7.setBounds(89, 88, 65, 65);
		lblChessB7.setIcon(new ImageIcon("assets/img/pawnB.png"));
		contentPane.add(lblChessB7);
		
		JLabel lblChessC7 = new JLabel("");
		lblChessC7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (piece == 0) {
					piece = 51;
				} else {
					move(piece, 51);
					piece = 0;
				}
			}
		});
		lblChessC7.setBounds(154, 88, 65, 65);
		lblChessC7.setIcon(new ImageIcon("assets/img/pawnB.png"));
		contentPane.add(lblChessC7);
		
		JLabel lblChessD7 = new JLabel("");
		lblChessD7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (piece == 0) {
					piece = 52;
				} else {
					move(piece, 52);
					piece = 0;
				}
			}
		});
		lblChessD7.setBounds(219, 88, 65, 65);
		lblChessD7.setIcon(new ImageIcon("assets/img/pawnB.png"));
		contentPane.add(lblChessD7);
		
		JLabel lblChessE7 = new JLabel("");
		lblChessE7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (piece == 0) {
					piece = 53;
				} else {
					move(piece, 53);
					piece = 0;
				}
			}
		});
		lblChessE7.setBounds(284, 88, 65, 65);
		lblChessE7.setIcon(new ImageIcon("assets/img/pawnB.png"));
		contentPane.add(lblChessE7);
		
		JLabel lblChessF7 = new JLabel("");
		lblChessF7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (piece == 0) {
					piece = 54;
				} else {
					move(piece, 54);
					piece = 0;
				}
			}
		});
		lblChessF7.setBounds(349, 88, 65, 65);
		lblChessF7.setIcon(new ImageIcon("assets/img/pawnB.png"));
		contentPane.add(lblChessF7);
		
		JLabel lblChessG7 = new JLabel("");
		lblChessG7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (piece == 0) {
					piece = 55;
				} else {
					move(piece, 55);
					piece = 0;
				}
			}
		});
		lblChessG7.setBounds(414, 88, 65, 65);
		lblChessG7.setIcon(new ImageIcon("assets/img/pawnB.png"));
		contentPane.add(lblChessG7);
		
		JLabel lblChessH7 = new JLabel("");
		lblChessH7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (piece == 0) {
					piece = 56;
				} else {
					move(piece, 56);
					piece = 0;
				}
			}
		});
		lblChessH7.setBounds(479, 88, 65, 65);
		lblChessH7.setIcon(new ImageIcon("assets/img/pawnB.png"));
		contentPane.add(lblChessH7);
		
		JLabel lblChessA8 = new JLabel("");
		lblChessA8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (piece == 0) {
					piece = 57;
				} else {
					move(piece, 57);
					piece = 0;
				}
			}
		});
		lblChessA8.setBounds(24, 24, 65, 65);
		lblChessA8.setIcon(new ImageIcon("assets/img/rookB.png"));
		contentPane.add(lblChessA8);
		
		JLabel lblChessB8 = new JLabel("");
		lblChessB8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (piece == 0) {
					piece = 58;
				} else {
					move(piece, 58);
					piece = 0;
				}
			}
		});
		lblChessB8.setBounds(89, 24, 65, 65);
		lblChessB8.setIcon(new ImageIcon("assets/img/knightB.png"));
		contentPane.add(lblChessB8);
		
		JLabel lblChessC8 = new JLabel("");
		lblChessC8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (piece == 0) {
					piece = 59;
				} else {
					move(piece, 59);
					piece = 0;
				}
			}
		});
		lblChessC8.setBounds(154, 24, 65, 65);
		lblChessC8.setIcon(new ImageIcon("assets/img/bishopB.png"));
		contentPane.add(lblChessC8);
		
		JLabel lblChessD8 = new JLabel("");
		lblChessD8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (piece == 0) {
					piece = 60;
				} else {
					move(piece, 60);
					piece = 0;
				}
			}
		});
		lblChessD8.setBounds(219, 24, 65, 65);
		lblChessD8.setIcon(new ImageIcon("assets/img/queenB.png"));
		contentPane.add(lblChessD8);
		
		JLabel lblChessE8 = new JLabel("");
		lblChessE8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (piece == 0) {
					piece = 61;
				} else {
					move(piece, 61);
					piece = 0;
				}
			}
		});
		lblChessE8.setBounds(284, 24, 65, 65);
		lblChessE8.setIcon(new ImageIcon("assets/img/kingB.png"));
		contentPane.add(lblChessE8);
		
		JLabel lblChessF8 = new JLabel("");
		lblChessF8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (piece == 0) {
					piece = 62;
				} else {
					move(piece, 62);
					piece = 0;
				}
			}
		});
		lblChessF8.setBounds(349, 24, 65, 65);
		lblChessF8.setIcon(new ImageIcon("assets/img/bishopB.png"));
		contentPane.add(lblChessF8);
		
		JLabel lblChessG8 = new JLabel("");
		lblChessG8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (piece == 0) {
					piece = 63;
				} else {
					move(piece, 63);
					piece = 0;
				}
			}
		});
		lblChessG8.setBounds(414, 24, 65, 65);
		lblChessG8.setIcon(new ImageIcon("assets/img/knightB.png"));
		contentPane.add(lblChessG8);
		
		JLabel lblChessH8 = new JLabel("");
		lblChessH8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (piece == 0) {
					piece = 64;
				} else {
					move(piece, 64);
					piece = 0;
				}
			}
		});
		lblChessH8.setBounds(479, 24, 65, 65);
		lblChessH8.setIcon(new ImageIcon("assets/img/rookB.png"));
		contentPane.add(lblChessH8);
		
		sqrs[0] = lblChessA1;
		sqrs[1] = lblChessB1;
		sqrs[2] = lblChessC1;
		sqrs[3] = lblChessD1;
		sqrs[4] = lblChessE1;
		sqrs[5] = lblChessF1;
		sqrs[6] = lblChessG1;
		sqrs[7] = lblChessH1;
		sqrs[8] = lblChessA2;
		sqrs[9] = lblChessB2;
		sqrs[10] = lblChessC2;
		sqrs[11] = lblChessD2;
		sqrs[12] = lblChessE2;
		sqrs[13] = lblChessF2;
		sqrs[14] = lblChessG2;
		sqrs[15] = lblChessH2;
		sqrs[16] = lblChessA3;
		sqrs[17] = lblChessB3;
		sqrs[18] = lblChessC3;
		sqrs[19] = lblChessD3;
		sqrs[20] = lblChessE3;
		sqrs[21] = lblChessF3;
		sqrs[22] = lblChessG3;
		sqrs[23] = lblChessH3;
		sqrs[24] = lblChessA4;
		sqrs[25] = lblChessB4;
		sqrs[26] = lblChessC4;
		sqrs[27] = lblChessD4;
		sqrs[28] = lblChessE4;
		sqrs[29] = lblChessF4;
		sqrs[30] = lblChessG4;
		sqrs[31] = lblChessH4;
		sqrs[32] = lblChessA5;
		sqrs[33] = lblChessB5;
		sqrs[34] = lblChessC5;
		sqrs[35] = lblChessD5;
		sqrs[36] = lblChessE5;
		sqrs[37] = lblChessF5;
		sqrs[38] = lblChessG5;
		sqrs[39] = lblChessH5;
		sqrs[40] = lblChessA6;
		sqrs[41] = lblChessB6;
		sqrs[42] = lblChessC6;
		sqrs[43] = lblChessD6;
		sqrs[44] = lblChessE6;
		sqrs[45] = lblChessF6;
		sqrs[46] = lblChessG6;
		sqrs[47] = lblChessH6;
		sqrs[48] = lblChessA7;
		sqrs[49] = lblChessB7;
		sqrs[50] = lblChessC7;
		sqrs[51] = lblChessD7;
		sqrs[52] = lblChessE7;
		sqrs[53] = lblChessF7;
		sqrs[54] = lblChessG7;
		sqrs[55] = lblChessH7;
		sqrs[56] = lblChessA8;
		sqrs[57] = lblChessB8;
		sqrs[58] = lblChessC8;
		sqrs[59] = lblChessD8;
		sqrs[60] = lblChessE8;
		sqrs[61] = lblChessF8;
		sqrs[62] = lblChessG8;
		sqrs[63] = lblChessH8;
		
		JLabel board = new JLabel("");
		board.setBounds(0, 0, 568, 568);
		board.setIcon(new ImageIcon("assets/img/board.png"));
		contentPane.add(board);	
	}
}
