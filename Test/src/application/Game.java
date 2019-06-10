
package application;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;



class JPanel01 extends JPanel{
	Image background = new ImageIcon(Game.class.getResource("../images/tarot.jpg")).getImage();//인트로 이미지 초기화	
	ImageIcon startButtonBasic = new ImageIcon(Game.class.getResource("../images/startButtonBasic.png"));	
	JButton startButton;
	JScrollPane scrollPane1;
	
	private Game win;
	
	public JPanel01(Game win) {
		this.win = win;
		setLayout(null);
		startButton = new JButton(startButtonBasic);
		startButton.setSize(300,150);
		startButton.setBounds(200,300,300,95);
		
		
		add(startButton);
		
		MyMouseListener listener = new MyMouseListener();
		startButton.addMouseListener(listener);
		
		startButton.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					
					Thread.sleep(1500);
					win.change("panel02");
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
		Music introMusic = new Music(true); //음악 들리게 설정
		introMusic.start(); //음악 틀기
		
	}
	
	public void paintComponent(Graphics g) {
		g.drawImage(background,0,0,null);
		setOpaque(false); // 컴포넌트의 불투명을 설정
		paintComponents(g); 
	}
}

class JPanel02 extends JPanel{
	private Image cardpick = new ImageIcon(Game.class.getResource("../images/cardpick.jpg")).getImage();
	private Game win;
	private ImageIcon tarotback = new ImageIcon(Game.class.getResource("../images/tarotBack.png"));
	
	
	
	public JPanel02(Game win) {
				
		setBorder(BorderFactory.createEmptyBorder(110 , 30 , 10 , 30));
	
		GridLayout card = new GridLayout(2,11,10,10);		
		setLayout(card);
		JButton[] cardbutton = new JButton[22];
		
		
		for(int i=0;i<22;i++) {
			cardbutton[i] = new JButton(tarotback);
			add(cardbutton[i]);
			cardbutton[i].addActionListener(new ActionListener() {				
				@Override
				public void actionPerformed(ActionEvent e) {					
					try {
						
						Thread.sleep(1500);
						win.change("panel03");
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
										
				}
			});
		}
			
	}
	
	public void paintComponent(Graphics g) {
		g.drawImage(cardpick,0,0,null);
		setOpaque(false); // 컴포넌트의 불투명을 설정
		paintComponents(g); 
	}
	
}
class JPanel03 extends JPanel{
	private Game win;
	private Image interpret = new ImageIcon(Game.class.getResource("../images/interpretback.png")).getImage();	
	
	
	public JPanel03(Game win) {
		setLayout(null);
		
		Deck jp = new Deck();
		Card pick = jp.setCard();
		JLabel name = new JLabel(pick.getName());
		Font f1 = new Font("Serif",Font.ITALIC,35);
		name.setFont(f1);
		name.setBounds(230,70,300,100);
		name.setBackground(Color.WHITE);
		name.setForeground(Color.BLACK);
		
		JLabel image = new JLabel(pick.getImageIcon());
		image.setBounds(110,100,100,175);
		
		JLabel intro = new JLabel(pick.getIntro());
		Font f2 = new Font("Serif",Font.BOLD,13);
		intro.setFont(f2);
		intro.setBounds(230,90,500,130);
		
		
		JTextPane description = new JTextPane(); //JLabel은 줄바꿈이 지원이 안되므로 JTextPane 사용
		description.setText(pick.getDescription());
		Font f3 = new Font("Serif",Font.BOLD,13);
		description.setFont(f3);
		description.setBounds(110,290,500,150);
		
		add(intro);
		add(image);
		add(name);
		add(description);
		
				
	}
	
	public void paintComponent(Graphics g) {
		g.drawImage(interpret,0,0,null);
		setOpaque(false); // 컴포넌트의 불투명을 설정
		paintComponents(g); 
	}
	
}

public class Game extends JFrame {
	public JPanel01 jpanel01 = null;
	public JPanel02 jpanel02 = null;
	public JPanel03 jpanel03 = null;
	
	public static final int SCREEN_WIDTH = 700;
	public static final int SCREEN_HEIGHT = 560;
	
	public void change(String panelName) {
		if(panelName.equals("panel01")) {
			getContentPane().removeAll();
			getContentPane().add(jpanel01);			
			revalidate();
			repaint();
		} else if(panelName.equals("panel02")) {
			getContentPane().removeAll();
			getContentPane().add(jpanel02);
			revalidate();
			repaint();
			} else if(panelName.equals("panel03")) {
				getContentPane().removeAll();
				getContentPane().add(jpanel03);
				revalidate();
				repaint();
				}
		
		}
	
	public static void main(String[] args) {
		Game win = new Game();
		
		win.jpanel01 = new JPanel01(win);
		win.jpanel02 = new JPanel02(win);
		win.jpanel03 = new JPanel03(win);
		
		win.add(win.jpanel01);
		
		win.setTitle("Tarot");
		win.setSize(Game.SCREEN_WIDTH,Game.SCREEN_HEIGHT);
		win.setResizable(false); // 사이즈를 사용자가 조절할 수 없음
		win.setLocationRelativeTo(null); // 실행시 모니터 가운데에 위치
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //종료창을 누르면 프로그램 전체 종료
		win.setVisible(true); //인터페이스 표출
		
		
		}

}


class MyMouseListener implements MouseListener{

	private ImageIcon startButtonBasic = new ImageIcon(Game.class.getResource("../images/startButtonBasic.png"));
	private ImageIcon startButtonEntered = new ImageIcon(Game.class.getResource("../images/startButtonEntered.png"));
	
	@Override
	public void mouseClicked(MouseEvent e) {
				
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		JButton b = (JButton)e.getSource();
		b.setIcon(startButtonEntered);
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		JButton b = (JButton)e.getSource();
		b.setIcon(startButtonBasic);
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
				
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
		
	}
	
}
