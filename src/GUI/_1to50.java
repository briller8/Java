package GUI;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class StopWatch extends Thread{
	
	static String timeText;
	long time=0l;
	static long preTime = 0l;
	boolean play=true;
	
	public void run() {
		preTime = System.currentTimeMillis();
		while(true) {
			try {
				sleep(10);
				if(Board.isStopWatch) {
					time = System.currentTimeMillis();
					int m = (int)(time/10000.0/60.0);
					int s = (int)(time%(10000.0/60.0)/10000.0);
					int ms = (int)(time%10000.0/10.0);
					
					timeText= m+":"+s+":"+ms;
					Board.timeTextLb.setText(timeText);
				}
				System.out.println();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Board extends JPanel implements ActionListener{
	
	JButton[][] arBtn;
	int[][] front;
	int[][] back;
	
	JButton reset;
	JPanel topPanel;
	
	JLabel mainText;
	JLabel subText;
	static JLabel timeTextLb;
	JLabel answerText;
	
	int gameNum;
	static boolean isStopWatch = false;
	 
	public Board() {
		setLayout(null);
		setBackground(Color.WHITE);
		
		gameNum = 1;
		
		topPanel = new JPanel();
		topPanel.setLayout(null);
		topPanel.setBackground(Color.LIGHT_GRAY);
		topPanel.setSize(600,100);
		topPanel.setLocation(0,0);
		add(topPanel);
		
		
		arBtn = new JButton[5][5];
		front = new int[5][5];
		back = new int[5][5];
		
		reset= new JButton();
		reset.setText("reset");
		reset.setSize(100,50);
		reset.setLocation(50,220);
		reset.addActionListener(this);
		add(reset);
		
		Font font = new Font("",Font.BOLD,35);
		mainText = new JLabel("1 to 50");
		mainText.setFont(font);
		mainText.setSize(200, 100);
		mainText.setLocation(240,200);
		add(mainText);
		
		font = new Font("",Font.PLAIN,20);
		subText = new JLabel("1부터 50까지 순서대로 클릭하세요. 숫자가 사라집니다.");
		subText.setFont(font);
		subText.setForeground(Color.LIGHT_GRAY);
		subText.setSize(500,50);
		subText.setLocation(50, 160);
		add(subText);
		
		font = new Font("",Font.BOLD,40);
		timeTextLb = new JLabel("0");
		timeTextLb.setFont(font);
		timeTextLb.setForeground(Color.LIGHT_GRAY);
		timeTextLb.setSize(200, 100);
		timeTextLb.setLocation(20, 0);
		topPanel.add(timeTextLb);
		
		font = new Font("",Font.BOLD,50);
		answerText = new JLabel();
		answerText.setText(gameNum+"");
		answerText.setFont(font);
		answerText.setSize(100,100);
		answerText.setLocation(500, 0);
		topPanel.add(answerText);
		
		setNum();
		shuffle();
		setBasic();

	}
	
	public void setNum() {
		int k=0; 
		for(int i=0; i<5; i++) {
			for(int j=0;j<5;j++) {
				front[i][j]=1+k;
				back[i][j]=26+k;
				k+=1;
			}
		}
	}
	public void setBasic() {
		Font font = new Font("",Font.BOLD,45);
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				arBtn[i][j] = new JButton();
				arBtn[i][j].setFont(font);
				arBtn[i][j].setBorder(null);
				arBtn[i][j].setForeground(Color.WHITE);
				arBtn[i][j].setBackground(new Color(49,98,199));
				arBtn[i][j].setSize(95,95);
				arBtn[i][j].setLocation(50+100*j, 300+100*i);
				arBtn[i][j].setText(front[i][j]+"");
				
				arBtn[i][j].addActionListener(this);
				add(arBtn[i][j]);
			}
		}
	}
	public void shuffle() {
		Random ran = new Random();
		
		for(int i=0;i<1000;i++) {
			int rX = ran.nextInt(5);
			int rY = ran.nextInt(5);
			
			int temp = front[0][0];
			front[0][0] = front[rY][rX];
			front[rY][rX] = temp;
			
			rX = ran.nextInt(5);
			rY = ran.nextInt(5);
			
			temp = back[0][0];
			back[0][0] = back[rY][rX];
			back[rY][rX] = temp;
		}
	}
	public void reset() {
		gameNum = 1;
		answerText.setText(gameNum+"");
		timeTextLb.setText("0");
		isStopWatch = false;
		
		Font font = new Font("",Font.BOLD,45);
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				arBtn[i][j].setVisible(true);
				arBtn[i][j].setForeground(Color.WHITE);
				arBtn[i][j].setBackground(new Color(49,98,199));
				arBtn[i][j].setText(front[i][j]+"");
			}
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(e.getSource()==arBtn[i][j]) {
					if(front[i][j]==gameNum) {
						if(gameNum==1) {
							isStopWatch=true;
							StopWatch.preTime =System.currentTimeMillis();
						}
						if(1<=gameNum&&gameNum<=25) {
							front[i][j] = back[i][j];
							arBtn[i][j].setText(front[i][j]+"");
							arBtn[i][j].setBackground(new Color(0,44,145));
						}else {
							front[i][j]=0;
							arBtn[i][j].setText("");
							arBtn[i][j].setVisible(false);
						}
						gameNum+=1;
						if(gameNum>50) {
							gameNum=50;
							isStopWatch=false;
							timeTextLb.setText(StopWatch.timeText);
						}
						answerText.setText(gameNum+"");
					}
				}
			}
		}
		if(e.getSource()==reset) {
			setNum();
			shuffle();
			reset();
		}
	}
}

public class _1to50 extends JFrame{
	public _1to50(){
		setTitle("추억의 1to50");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.add(new Board());
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation(screenSize.width/2-300, screenSize.height/2-450);
		
		setSize(600,900);
		setVisible(true);
	}
	static boolean isStopWatch = false;
	public static void main(String[] args) {
		
		new _1to50();
		
		StopWatch sw = new StopWatch();
		sw.run();
	}
}
