package application;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import javax.swing.ImageIcon;

class Deck {
	private ImageIcon The_Fool = new ImageIcon(Game.class.getResource("../cardImages/00_The_Fool.jpg"));
	private ImageIcon Magician = new ImageIcon(Game.class.getResource("../cardImages/01_Magician.jpg"));
	private ImageIcon High_Priestess = new ImageIcon(Game.class.getResource("../cardImages/02_High_Priestess.jpg"));
	private ImageIcon Empress = new ImageIcon(Game.class.getResource("../cardImages/03_Empress.jpg"));
	private ImageIcon Emperor = new ImageIcon(Game.class.getResource("../cardImages/04_Emperor.jpg"));
	private ImageIcon Hierophant = new ImageIcon(Game.class.getResource("../cardImages/05_Hierophant.jpg"));
	private ImageIcon Lovers = new ImageIcon(Game.class.getResource("../cardImages/06_Lovers.jpg"));
	private ImageIcon Chariot = new ImageIcon(Game.class.getResource("../cardImages/07_Chariot.jpg"));
	private ImageIcon Strength = new ImageIcon(Game.class.getResource("../cardImages/08_Strength.jpg"));
	private ImageIcon Hermit = new ImageIcon(Game.class.getResource("../cardImages/09_Hermit.jpg"));
	private ImageIcon Wheel_of_Fortune = new ImageIcon(Game.class.getResource("../cardImages/10_Wheel_of_Fortune.jpg"));
	private ImageIcon Justice = new ImageIcon(Game.class.getResource("../cardImages/11_Justice.jpg"));
	private ImageIcon Hanged_Man = new ImageIcon(Game.class.getResource("../cardImages/12_Hanged_Man.jpg"));
	private ImageIcon Death = new ImageIcon(Game.class.getResource("../cardImages/13_Death.jpg"));
	private ImageIcon Temperance = new ImageIcon(Game.class.getResource("../cardImages/14_Temperance.jpg"));
	private ImageIcon Devil = new ImageIcon(Game.class.getResource("../cardImages/15_Devil.jpg"));
	private ImageIcon Tower = new ImageIcon(Game.class.getResource("../cardImages/16_Tower.jpg"));
	private ImageIcon Star = new ImageIcon(Game.class.getResource("../cardImages/17_Star.jpg"));
	private ImageIcon Moon = new ImageIcon(Game.class.getResource("../cardImages/18_Moon.jpg"));
	private ImageIcon Sun = new ImageIcon(Game.class.getResource("../cardImages/19_Sun.jpg"));
	private ImageIcon Judgement = new ImageIcon(Game.class.getResource("../cardImages/20_Judgement.jpg"));
	private ImageIcon World = new ImageIcon(Game.class.getResource("../cardImages/21_World.jpg"));
	
	private Card[] deck = new Card[] {
			new Card("The Fool","시작과 자유 그리고 홀가분한 마음을 상징하는 0번 카드를 뽑으셨습니다.","갇혀있던 마음이 열리는 카드입니다.\r\n 마음을 비우는 경우도 있으며 새로운 감정이 싹트는 시기지요.\r\n 시작을 상징하는 카드인데 실체가 있는 시작이 이나라 마음을 다지는 일이 있을 것입니다.\r\n 속박되는 일에는 답답함을 느끼는 카드이니 새롭고 흥미로운 것이나 일에서 자유분방한 시도를 하게 될 것입니다.",The_Fool),
			new Card("The Emperor","질서와 권위를 상징하는 4번 황제 카드를 뽑으셨습니다.","스스로 중심이 되는 카드이니 직접 나서야 할 일들이 생기겠군요.\r\n 이 카드는 감정을 죽이고 자신 보다는 조직이나 다른 사람들을 위해 애쓰게 되는 카드입니다.\r\n 그러나 그러한 노력이 결국은 자신에게 돌아오는 카드이니 희생과 봉사를 하더라도 결국은 자신의 공으로 돌아오게 됩니다.\r\n 리더의 카드이며 공과 성과가 큰 카드입니다.",Emperor),
			new Card("Strength","힘과 용기 그리고 인내를 상징하는 8번 카드를 뽑으셨습니다.","자신보다 힘이 강하거나 상급자를 상대하게 된다는 뜻입니다.\r\n 혹은 자신이 감당하기 어려운 일에 봉착하게 된다는 의미를 지니기도 하지요. \r\n 자신의 감정을 조금만 잘 다스리면 원하는 결과를 얻을 수 있는 하루가 될 것입니다.",Strength),
			new Card("The Hanged Man","역발상의 상징인 12번 카드를 뽑으셨습니다.","이 카드의 상징은 정체 입니다.\r\n 지속해 오던 일이 있으면 일시적인 정체를 맞이하게 됩니다.\r\n 발이 묶여 있으니 활동성은 지극히 약한 카드입니다.\r\n 그리고 많은 일들이 제약을 받고 있다는 것을 의미하지요.\r\n 현실적인 상황에 대한 반성을 하게 되거나 스스로를 억제해야 하는 일들이 발생을 합니다.",Hanged_Man),
			new Card("The Tower","급격한 변화를 상징하는 16번 타워 카드를 뽑으셨습니다.","이 카드는 갑작스러운 변화를 상징합니다.\r\n 그리고 그 변화가 예기치 못한 상황에서 발생할 것임을 이야기 하고 있군요. \r\n 이 카드는 시작부터 일이 꼬이지는 않습니다.\r\n 일의 정점에서 어려움에 직면하게 된다는 것이지요.\r\n 상처가 있을 수 있으며 일시적인 충격을 받거나 괴로움을 경험할 수 있는 하루입니다.",Tower),
			new Card("Judgement","부활을 상징하는 20번 심판 카드를 뽑으셨습니다.","이 카드는 노력한 만큼의 결과를 얻게 될 거라는 메세지 입니다.\r\n 새로운 소식을 듣게 되기도 하며 기다리던 연락을 받게 되기도 합니다. \r\n 이 카드는 재생된 새로운 기회의 카드이며 그 기회는 내가 준비했던 만큼 주어진다는 이야기를 하고 있습니다.",Judgement),
			new Card("The Magician","매력과 새로운 창의력을 상징하는 1번 카드를 뽑으셨습니다.","계획한 일이 있다면 긍정적으로 진행이 될 것입니다.\r\n 준비된 시작을 상징하는 카드이며 에너지가 강합니다.\r\n 원하는 일들이 일어날 것입니다.\r\n 나를 중심으로 사람들이 모이는 카드입니다.\r\n 인기가 있는 카드이니 중요한 역할을 하게 되거나 이야기의 중심에 서게 됩니다.",Magician),
			new Card("The Hierophant","결합과 선택을 상징하는 5번 카드를 뽑으셨습니다.","결합의 의미는 단순한 의미에서 고차원적 의미까지 모두를 포함합니다.\r\n 따라서 혼자 보내는 경우 보다는 여러 사람 혹은 단 둘이 보내게 되는 경우가 더 타당하지요.\r\n 전체적으로 유쾌하거나 자유분방한 하루는 아닙니다.\r\n 고전의 틀을 유지하는 카드여서 행동반경이 크지 않습니다.",Hierophant),
			new Card("The Hermit","깊이 있는 지식을 상징하는 9번 운둔자 카드를 뽑으셨습니다.","이 카드는 끝없이 탐구하는 카드입니다.\r\n 자신의 갈 길을 생각하고 정하는 카드지요.\r\n  혼자서 결정하고 해야할 일이 있군요.\r\n 오늘은 스스로 해결해야 할 고민을 안게 되며 이를 풀기 위해 노력하는 하루라는 것입니다.",Hermit),
			new Card("Death","완벽한 재생을 상징하는 13번 죽음 카드를 뽑으셨습니다.","이 카드 역시 변화를 상징합니다.\r\n 그러나 단순한 변화가 아니라 모든 것이 엎어진 뒤의 새로운 시작입니다. \r\n 무언가 놓게 되너가 틀어지거나 자신의 능력 밖에서 어긋나는 일이 발생을 합니다.\r\n 상처받는 일이 생기기도 하지요.\r\n 길게 보면 아무것도 아닐 수 있지만 당장은 힘든 하루가 될 것입니다.",Death),
			new Card("The Star","희망을 상징하는 17번 별 카드를 뽑으셨습니다.","이 카드는 먼 목표를 세우는 카드입니다.\r\n 밝고 명랑한 카드지만 목표까지는 다소 시작이 걸리는 카드지요. \r\n 마음은 차분한 하루입니다.\r\n 희망이 있으니 당장 이루지 못해도 실망하지는 않겠군요.",Star),
			new Card("The World","완성을 상징하는 21번 월드카드를 뽑으셨습니다.","이 카드는 자신만의 세상을 구축하게 되는 카드입니다.\r\n 뜻한 바를 이루게 된다는 상징적 의미를 지니고 있습니다. \r\n 모든 것을 갖춘 카드이니 오늘 하루는 뜻한 바를 이룰 수 있는 날이 되겠군요.\r\n 스스로 만족할 만한 일들이 일어날 것입니다.",World),
			new Card("The High Priestess","비밀과 숭고한 감정을 상징하는 2번 여사제 카드를 뽑으셨습니다.","차마 말하지 못하는 일들이 일어납니다.\r\n 쉽게 움직이지 못하는 카드이니 몸과 마음이 어느 곳에 묶여있는 그림입니다.\r\n 한 곳에 머물러야 하는 일들이 생길 수 있습니다.\r\n 비밀을 듣게 되거나 비밀이 생길 수 있는 카드입니다.",High_Priestess),
			new Card("The Lovers","사랑을 상징하는 6번 연인카드를 뽑으셨습니다.","열정과 결합을 상징하는 카드이며 순수하고 즐거운 카드입니다.\r\n 사람들과 관계를 맺는 카드입니다. \r\n 혼자보다는 다른 사람과 함께 시간을 보내게 될 것이며 함께 하는 시간을 즐기기에 충분히 좋은 시간입니다.",Lovers),
			new Card("Wheel of Fortune","윤회를 상징하는 10번 운명의 수레바퀴카드를 뽑으셨습니다.","자신의 위치를 점검하라는 강력한 메세지를 주는 카드입니다.\r\n 수레바퀴는 끈임없이 반복되는 일상을 상징합니다.\r\n 새로움에 대한 흥미가 많아지며 노력도 많이 하게 됩니다.\r\n 궁금한 것이 생기면 알기 위해 행동하게 될 것이니 지루한 하루가 되지는 않습니다.",Wheel_of_Fortune),
			new Card("Temperance","절제를 상징하는 14번 카드를 뽑으셨습니다.","뜻대로 하지 못하는 일이 발생할 수 있음을 의미하는 카드입니다.\r\n 현실이 받혀주지 못하는 일들을 경험하게 되지요. \r\n 자신이 하고 싶은 일이 분명히 존재하지만 억지로 끌려다니는 하루 입니다.\r\n 당장에 자신이 얻고 싶은 것을 얻을 수 있는 날은 아니네요.",Temperance),
			new Card("The Moon","희생과 인내를 상징하는 18번 달카드를 뽑으셨습니다.","뭔가 시끄러운 상황이 벌어지고 있음을 암시합니다.\r\n 손해 보는 일이 있거나 자신과 무관한 곳에서 시간을 보내게 됩니다. \r\n 후회할 일을 하게 되기도 하며 마음이 불편해 지기도 합니다.\r\n 마음과 다르게 행동해야 할 일들이 있을 것입니다.",Moon),
			new Card("The Empress","풍요를 상징하는 3번 카드를 뽑으셨습니다.","매력과 풍요 그리고 확장을 상징하지요.\r\n 마음에 여유가 느껴지는 하루가 될 것입니다.\r\n 즐거운 일들이 생길 것이며 내가 돋보이는 하루가 될 것입니다.\r\n 새로운 계획을 세우는 것이 좋으며 지루하게 보내기에는 아까운 하루가 될 것입니다.",Empress),
			new Card("The Chariot","승리와 추진력을 상징하는 7번 전차카드를 뽑으셨습니다.","성과를 올리는 카드이며 젊고 강인하고 채기가 넘치는 카드지요.\r\n 추진력이 강한 카드이니 마음먹은 일이 있다면 그대로 밀고 나가도 무방합니다.\r\n 무언가를 얻기위해 노력해야 하는 일이 생길 것입니다.\r\n 그리고 노력한 대가는 얻을수 있습니다.\r\n 결국에는 자신이 얻은 것으로 인해 만족하는 하루가 될 것입니다.",Chariot),
			new Card("Justice","냉정한 판단 그리고 집중을 상징하는 11번 정의 카드를 뽑으셨습니다.","오늘은 시시비비를 가려야 할 일들이 생길 것입니다.\r\n 다툼에 휘말릴 수 있으며 다름 사람의 언쟁에 관여하게 되는 경우도 있습니다.\r\n 정신적으로 피곤한 하루가 되겠네요.\r\n 분쟁과 구설에 말리지 않도록 노력해야 하는 하루 입니다.",Justice),
			new Card("Devil","강력한 유혹을 상징하는 15번 악마카드를 뽑으셨습니다.","이 카드는 강한 유혹을 상징하지요.\r\n 벗어자기 힘든 유혹을 의미하는 것이니 피할 수 없는일이 생기겠군요.\r\n 오늘 경험한 일들은 당분간 계속 경험하게 될 일들입니다.\r\n 중독성이 상한 일이니 즐기기로 따지면 좋은 날이 될 수도 있군요.",Devil),
			new Card("The Sun","강력한 긍정을 상징하는 19번 태양 카드를 뽑으셨습니다.","풍요와 강한 생명력 그리고 밝은 에너지를 상징합니다.\r\n 이는 오늘 나의 하루가 이처럼 밝게 비출 것이라는 것을 상징합니다.\r\n 모든 조건은 좋은 징후를 보일 것이니 과도한 것을 바라지 말라는 카드이기도 합니다.\r\n 좋은 인연을 만날 수 있으며 즐거운 시간을 보내기에 충분한 카드입니다.",Sun),
	};
	  ArrayList<Card> current_deck;
	  private Random rng = new Random();
	  private
	  int number;
	  private Card card;
	  Deck() {
		  current_deck = new ArrayList<Card>(Arrays.asList(deck));		  
	  }
	  
	  public Card setCard() {
		  number = rng.nextInt(22);
		  card = current_deck.get(number);
		  return card;
	  }
	  
	  
	  
	  

}

class Card{
	  
	  String name;
	  String description;
	  String intro;
	  ImageIcon image;
	  Card(String name, String intro, String description, ImageIcon image) {
	    this.name = name;
	    this.intro = intro;
	    this.description = description;
	    this.image = image;
	  }
	  public ImageIcon getImageIcon() {
		  return image;
	  }	  
	  public String getName() {
		  return name;
	  }
	  public String getIntro() {
		  return intro;
	  }
	  public String getDescription() {
		  return description;
	  }
	  
	}