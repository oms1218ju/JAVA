package tarot_3;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;



class JPanel01 extends JPanel{
	Image background = new ImageIcon(Game.class.getResource("../images/tarot.jpg")).getImage();//인트로 이미지 초기화	
	ImageIcon startButtonBasic = new ImageIcon(Game.class.getResource("../images/startButtonBasic.png"));	
	JButton startButton;
	JScrollPane scrollPane1;
	
	private Game win;
	
	public JPanel01(Game win) {
		this.win = win;
		JPanel back = new JPanel() {			
			public void paintComponent(Graphics g) {
				g.drawImage(background,0,0,null);
				setOpaque(false); // 컴포넌트의 불투명을 설정
				paintComponents(g); 
			}
		};
		back.setLayout(null);
		startButton = new JButton(startButtonBasic);
		startButton.setSize(300,150);
		startButton.setBounds(50,250,300,95);
		
		
		back.add(startButton);
		
		MyMouseListener listener = new MyMouseListener();
		startButton.addMouseListener(listener);
		
		startButton.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				win.change("panel02");
				
			}
		});
		
		Music introMusic = new Music(true); //음악 들리게 설정
		introMusic.start(); //음악 틀기
	
	}
}

class JPanel02 extends JPanel{
	private Image test = new ImageIcon(Game.class.getResource("../images/test.jpg")).getImage();
	private Game win;
	
	public JPanel02(Game win) {
	this.win = win;
	JPanel gameback = new JPanel() {
		public void paintComponent(Graphics g) {
			g.drawImage(test,0,0,null);
			setOpaque(false); // 컴포넌트의 불투명을 설정
			paintComponents(g); 
		}
	};
	
	gameback.setLayout(null);
	}
}

public class Game extends JFrame {
	public JPanel01 jpanel01 = null;
	public JPanel02 jpanel02 = null;
	public static final int SCREEN_WIDTH = 700;
	public static final int SCREEN_HEIGHT = 530;
	
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
		}
		
		}
	
	public void main(String[] args) {
		Game win = new Game();
		
		win.jpanel01 = new JPanel01(win);
		win.jpanel02 = new JPanel02(win);
		
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
		// TODO Auto-generated method stub
		
	}
	
}