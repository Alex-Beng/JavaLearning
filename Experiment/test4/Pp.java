class People
{
    protected double weight,height;
    public void speakHello() {
        System.out.println("yayawawa");
    }

    public void averageHeight()
    {
        height=173;
        System.out.println("average height:"+height);
    }
    public void averageWeight()
    {
        weight = 70;
        System.out.println("average weight:"+weight);
    }
}

class ChinaPeople extends People
{
	// [����1]//��дpublic void speakHello()������Ҫ�����"��ã��Է�����"������Ϣ
    public void speakHello() {
        System.out.println("��ã��Է�����");
    }
	//[����2]//��дpublic void averageHeight()������Ҫ�����"�й��˵�ƽ����ߣ�173.0����"������Ϣ
    public void averageHeight()
    {
        height=173;
        System.out.println("�й��˵�ƽ�����:"+height);
    }
    // [����3]//��дpublic void averageWeight()������Ҫ�����"�й��˵�ƽ�����أ�67.34����"������Ϣ
     public void averageWeight()
    {
        weight = 67.34;
        System.out.println("�й��˵�ƽ������:"+weight);
    }
	public void chinaGongfu()
	{
    //[����4]//����й�������Ϣ�����磺"�����ӣ�վ���ɣ�˯�繭"

        System.out.println("�����ӣ�վ���ɣ�˯�繭");
	}
}

class AmericanPeople extends People
{
	//[����5]//��дpublic void speakHello()������Ҫ�����"How do you do"
	public void speakHello() {
        System.out.println("How do you do");
    }
	//[����6]//��дpublic void averageHeight()����
	public void averageHeight()
    {
        height=173;
        System.out.println("height:"+height);
    }
     //[����7]//��дpublic void averageWeight()����
      public void averageWeight()
    {
        weight = 66.66;
        System.out.println("weight weight weight:"+weight);
    }
	public void americanBoxing()
	{
     //[����8]//���ȭ����Ϣ�����磺"ֱȭ����ȭ"
     System.out.println("yoyo chick it out");
	}
}

class BeijingPeople extends ChinaPeople
{
	//[����9]//��дpublic void speakHello()������Ҫ�����"���ã������Ǳ���"
	public void speakHello() {
        System.out.println("���ã������Ǳ���");
    }
	//[����10]//��дpublic void averageHeight()����
	public void averageHeight()
    {
        height=173;
        System.out.println("beijin height:"+height);
    }
     //[����11]//��дpublic void averageWeight()����
     public void averageWeight()
    {
        weight = 66.66;
        System.out.println("beijin weight:"+weight);
    }
	public void beijingOpera()
	{
    //[����12]//���������Ϣ�����磺"��������"
    System.out.println("��������");
	}
}

public class Pp
{
	public static void main(String args[])
	{
		ChinaPeople chinaPeople = new ChinaPeople();
		AmericanPeople americanPeople = new AmericanPeople();
		BeijingPeople beijingPeople = new BeijingPeople();
		chinaPeople.speakHello();
          americanPeople.speakHello();
          beijingPeople.speakHello();
		chinaPeople.averageHeight();
		americanPeople.averageHeight();
		beijingPeople.averageHeight();
		chinaPeople.averageWeight();
		americanPeople.averageWeight();
		beijingPeople.averageWeight();
         chinaPeople.chinaGongfu();
         americanPeople.americanBoxing();
         beijingPeople.beijingOpera();
         beijingPeople.chinaGongfu();
	}
}
