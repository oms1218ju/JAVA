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
			new Card("The Fool","���۰� ���� �׸��� Ȧ������ ������ ��¡�ϴ� 0�� ī�带 �����̽��ϴ�.","�����ִ� ������ ������ ī���Դϴ�.\r\n ������ ���� ��쵵 ������ ���ο� ������ ��Ʈ�� �ñ�����.\r\n ������ ��¡�ϴ� ī���ε� ��ü�� �ִ� ������ �̳��� ������ ������ ���� ���� ���Դϴ�.\r\n �ӹڵǴ� �Ͽ��� ������� ������ ī���̴� ���Ӱ� ��̷ο� ���̳� �Ͽ��� �����й��� �õ��� �ϰ� �� ���Դϴ�.",The_Fool),
			new Card("The Emperor","������ ������ ��¡�ϴ� 4�� Ȳ�� ī�带 �����̽��ϴ�.","������ �߽��� �Ǵ� ī���̴� ���� ������ �� �ϵ��� ����ڱ���.\r\n �� ī��� ������ ���̰� �ڽ� ���ٴ� �����̳� �ٸ� ������� ���� �־��� �Ǵ� ī���Դϴ�.\r\n �׷��� �׷��� ����� �ᱹ�� �ڽſ��� ���ƿ��� ī���̴� ����� ���縦 �ϴ��� �ᱹ�� �ڽ��� ������ ���ƿ��� �˴ϴ�.\r\n ������ ī���̸� ���� ������ ū ī���Դϴ�.",Emperor),
			new Card("Strength","���� ��� �׸��� �γ��� ��¡�ϴ� 8�� ī�带 �����̽��ϴ�.","�ڽź��� ���� ���ϰų� ����ڸ� ����ϰ� �ȴٴ� ���Դϴ�.\r\n Ȥ�� �ڽ��� �����ϱ� ����� �Ͽ� �����ϰ� �ȴٴ� �ǹ̸� ���ϱ⵵ ������. \r\n �ڽ��� ������ ���ݸ� �� �ٽ����� ���ϴ� ����� ���� �� �ִ� �Ϸ簡 �� ���Դϴ�.",Strength),
			new Card("The Hanged Man","���߻��� ��¡�� 12�� ī�带 �����̽��ϴ�.","�� ī���� ��¡�� ��ü �Դϴ�.\r\n ������ ���� ���� ������ �Ͻ����� ��ü�� �����ϰ� �˴ϴ�.\r\n ���� ���� ������ Ȱ������ ������ ���� ī���Դϴ�.\r\n �׸��� ���� �ϵ��� ������ �ް� �ִٴ� ���� �ǹ�������.\r\n �������� ��Ȳ�� ���� �ݼ��� �ϰ� �ǰų� �����θ� �����ؾ� �ϴ� �ϵ��� �߻��� �մϴ�.",Hanged_Man),
			new Card("The Tower","�ް��� ��ȭ�� ��¡�ϴ� 16�� Ÿ�� ī�带 �����̽��ϴ�.","�� ī��� ���۽����� ��ȭ�� ��¡�մϴ�.\r\n �׸��� �� ��ȭ�� ����ġ ���� ��Ȳ���� �߻��� ������ �̾߱� �ϰ� �ֱ���. \r\n �� ī��� ���ۺ��� ���� �������� �ʽ��ϴ�.\r\n ���� �������� ����� �����ϰ� �ȴٴ� ��������.\r\n ��ó�� ���� �� ������ �Ͻ����� ����� �ްų� ���ο��� ������ �� �ִ� �Ϸ��Դϴ�.",Tower),
			new Card("Judgement","��Ȱ�� ��¡�ϴ� 20�� ���� ī�带 �����̽��ϴ�.","�� ī��� ����� ��ŭ�� ����� ��� �� �Ŷ�� �޼��� �Դϴ�.\r\n ���ο� �ҽ��� ��� �Ǳ⵵ �ϸ� ��ٸ��� ������ �ް� �Ǳ⵵ �մϴ�. \r\n �� ī��� ����� ���ο� ��ȸ�� ī���̸� �� ��ȸ�� ���� �غ��ߴ� ��ŭ �־����ٴ� �̾߱⸦ �ϰ� �ֽ��ϴ�.",Judgement),
			new Card("The Magician","�ŷ°� ���ο� â�Ƿ��� ��¡�ϴ� 1�� ī�带 �����̽��ϴ�.","��ȹ�� ���� �ִٸ� ���������� ������ �� ���Դϴ�.\r\n �غ�� ������ ��¡�ϴ� ī���̸� �������� ���մϴ�.\r\n ���ϴ� �ϵ��� �Ͼ ���Դϴ�.\r\n ���� �߽����� ������� ���̴� ī���Դϴ�.\r\n �αⰡ �ִ� ī���̴� �߿��� ������ �ϰ� �ǰų� �̾߱��� �߽ɿ� ���� �˴ϴ�.",Magician),
			new Card("The Hierophant","���հ� ������ ��¡�ϴ� 5�� ī�带 �����̽��ϴ�.","������ �ǹ̴� �ܼ��� �ǹ̿��� �������� �ṉ̀��� ��θ� �����մϴ�.\r\n ���� ȥ�� ������ ��� ���ٴ� ���� ��� Ȥ�� �� ���� ������ �Ǵ� ��찡 �� Ÿ��������.\r\n ��ü������ �����ϰų� �����й��� �Ϸ�� �ƴմϴ�.\r\n ������ Ʋ�� �����ϴ� ī�忩�� �ൿ�ݰ��� ũ�� �ʽ��ϴ�.",Hierophant),
			new Card("The Hermit","���� �ִ� ������ ��¡�ϴ� 9�� ����� ī�带 �����̽��ϴ�.","�� ī��� ������ Ž���ϴ� ī���Դϴ�.\r\n �ڽ��� �� ���� �����ϰ� ���ϴ� ī������.\r\n  ȥ�ڼ� �����ϰ� �ؾ��� ���� �ֱ���.\r\n ������ ������ �ذ��ؾ� �� ����� �Ȱ� �Ǹ� �̸� Ǯ�� ���� ����ϴ� �Ϸ��� ���Դϴ�.",Hermit),
			new Card("Death","�Ϻ��� ����� ��¡�ϴ� 13�� ���� ī�带 �����̽��ϴ�.","�� ī�� ���� ��ȭ�� ��¡�մϴ�.\r\n �׷��� �ܼ��� ��ȭ�� �ƴ϶� ��� ���� ������ ���� ���ο� �����Դϴ�. \r\n ���� ���� �ǳʰ� Ʋ�����ų� �ڽ��� �ɷ� �ۿ��� ��߳��� ���� �߻��� �մϴ�.\r\n ��ó�޴� ���� ����⵵ ������.\r\n ��� ���� �ƹ��͵� �ƴ� �� ������ ������ ���� �Ϸ簡 �� ���Դϴ�.",Death),
			new Card("The Star","����� ��¡�ϴ� 17�� �� ī�带 �����̽��ϴ�.","�� ī��� �� ��ǥ�� ����� ī���Դϴ�.\r\n ��� ����� ī������ ��ǥ������ �ټ� ������ �ɸ��� ī������. \r\n ������ ������ �Ϸ��Դϴ�.\r\n ����� ������ ���� �̷��� ���ص� �Ǹ������� �ʰڱ���.",Star),
			new Card("The World","�ϼ��� ��¡�ϴ� 21�� ����ī�带 �����̽��ϴ�.","�� ī��� �ڽŸ��� ������ �����ϰ� �Ǵ� ī���Դϴ�.\r\n ���� �ٸ� �̷�� �ȴٴ� ��¡�� �ǹ̸� ���ϰ� �ֽ��ϴ�. \r\n ��� ���� ���� ī���̴� ���� �Ϸ�� ���� �ٸ� �̷� �� �ִ� ���� �ǰڱ���.\r\n ������ ������ ���� �ϵ��� �Ͼ ���Դϴ�.",World),
			new Card("The High Priestess","��а� ������ ������ ��¡�ϴ� 2�� ������ ī�带 �����̽��ϴ�.","���� ������ ���ϴ� �ϵ��� �Ͼ�ϴ�.\r\n ���� �������� ���ϴ� ī���̴� ���� ������ ��� ���� �����ִ� �׸��Դϴ�.\r\n �� ���� �ӹ����� �ϴ� �ϵ��� ���� �� �ֽ��ϴ�.\r\n ����� ��� �ǰų� ����� ���� �� �ִ� ī���Դϴ�.",High_Priestess),
			new Card("The Lovers","����� ��¡�ϴ� 6�� ����ī�带 �����̽��ϴ�.","������ ������ ��¡�ϴ� ī���̸� �����ϰ� ��ſ� ī���Դϴ�.\r\n ������ ���踦 �δ� ī���Դϴ�. \r\n ȥ�ں��ٴ� �ٸ� ����� �Բ� �ð��� ������ �� ���̸� �Բ� �ϴ� �ð��� ���⿡ ����� ���� �ð��Դϴ�.",Lovers),
			new Card("Wheel of Fortune","��ȸ�� ��¡�ϴ� 10�� ����� ��������ī�带 �����̽��ϴ�.","�ڽ��� ��ġ�� �����϶�� ������ �޼����� �ִ� ī���Դϴ�.\r\n ���������� ���Ӿ��� �ݺ��Ǵ� �ϻ��� ��¡�մϴ�.\r\n ���ο� ���� ��̰� �������� ��µ� ���� �ϰ� �˴ϴ�.\r\n �ñ��� ���� ����� �˱� ���� �ൿ�ϰ� �� ���̴� ������ �Ϸ簡 ������ �ʽ��ϴ�.",Wheel_of_Fortune),
			new Card("Temperance","������ ��¡�ϴ� 14�� ī�带 �����̽��ϴ�.","���� ���� ���ϴ� ���� �߻��� �� ������ �ǹ��ϴ� ī���Դϴ�.\r\n ������ �������� ���ϴ� �ϵ��� �����ϰ� ������. \r\n �ڽ��� �ϰ� ���� ���� �и��� ���������� ������ �����ٴϴ� �Ϸ� �Դϴ�.\r\n ���忡 �ڽ��� ��� ���� ���� ���� �� �ִ� ���� �ƴϳ׿�.",Temperance),
			new Card("The Moon","����� �γ��� ��¡�ϴ� 18�� ��ī�带 �����̽��ϴ�.","���� �ò����� ��Ȳ�� �������� ������ �Ͻ��մϴ�.\r\n ���� ���� ���� �ְų� �ڽŰ� ������ ������ �ð��� ������ �˴ϴ�. \r\n ��ȸ�� ���� �ϰ� �Ǳ⵵ �ϸ� ������ ������ ���⵵ �մϴ�.\r\n ������ �ٸ��� �ൿ�ؾ� �� �ϵ��� ���� ���Դϴ�.",Moon),
			new Card("The Empress","ǳ�並 ��¡�ϴ� 3�� ī�带 �����̽��ϴ�.","�ŷ°� ǳ�� �׸��� Ȯ���� ��¡������.\r\n ������ ������ �������� �Ϸ簡 �� ���Դϴ�.\r\n ��ſ� �ϵ��� ���� ���̸� ���� �����̴� �Ϸ簡 �� ���Դϴ�.\r\n ���ο� ��ȹ�� ����� ���� ������ �����ϰ� �����⿡�� �Ʊ�� �Ϸ簡 �� ���Դϴ�.",Empress),
			new Card("The Chariot","�¸��� �������� ��¡�ϴ� 7�� ����ī�带 �����̽��ϴ�.","������ �ø��� ī���̸� ���� �����ϰ� ä�Ⱑ ��ġ�� ī������.\r\n �������� ���� ī���̴� �������� ���� �ִٸ� �״�� �а� ������ �����մϴ�.\r\n ���𰡸� ������� ����ؾ� �ϴ� ���� ���� ���Դϴ�.\r\n �׸��� ����� �밡�� ������ �ֽ��ϴ�.\r\n �ᱹ���� �ڽ��� ���� ������ ���� �����ϴ� �Ϸ簡 �� ���Դϴ�.",Chariot),
			new Card("Justice","������ �Ǵ� �׸��� ������ ��¡�ϴ� 11�� ���� ī�带 �����̽��ϴ�.","������ �ýú�� ������ �� �ϵ��� ���� ���Դϴ�.\r\n ������ �ָ��� �� ������ �ٸ� ����� ���￡ �����ϰ� �Ǵ� ��쵵 �ֽ��ϴ�.\r\n ���������� �ǰ��� �Ϸ簡 �ǰڳ׿�.\r\n ����� ������ ������ �ʵ��� ����ؾ� �ϴ� �Ϸ� �Դϴ�.",Justice),
			new Card("Devil","������ ��Ȥ�� ��¡�ϴ� 15�� �Ǹ�ī�带 �����̽��ϴ�.","�� ī��� ���� ��Ȥ�� ��¡������.\r\n �����ڱ� ���� ��Ȥ�� �ǹ��ϴ� ���̴� ���� �� �������� ����ڱ���.\r\n ���� ������ �ϵ��� ��а� ��� �����ϰ� �� �ϵ��Դϴ�.\r\n �ߵ����� ���� ���̴� ����� ������ ���� ���� �� ���� �ֱ���.",Devil),
			new Card("The Sun","������ ������ ��¡�ϴ� 19�� �¾� ī�带 �����̽��ϴ�.","ǳ��� ���� ����� �׸��� ���� �������� ��¡�մϴ�.\r\n �̴� ���� ���� �Ϸ簡 ��ó�� ��� ���� ���̶�� ���� ��¡�մϴ�.\r\n ��� ������ ���� ¡�ĸ� ���� ���̴� ������ ���� �ٶ��� ����� ī���̱⵵ �մϴ�.\r\n ���� �ο��� ���� �� ������ ��ſ� �ð��� �����⿡ ����� ī���Դϴ�.",Sun),
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