package xw;

import java.util.*;

public class Xiawang {
    public static void main(String[] args) {
        try {
            String text_tangshi = "������ɫ˼�����������󲻵������Ů���������������δʶ��������������һ��ѡ�ھ��������һЦ������������������ɫ������ԡ�������Ȫˮ��ϴ��֬�̶���������ʼ���³ж���ʱ���޻��ս�ҡܽ����ů�ȴ�����������ո���Ӵ˾������糯�л���������Ͼ���Ӵ���ҹרҹ�󹬼�����ǧ����ǧ�谮��һ�����ױ�ɽ���ҹ��¥�����ʹ���õ��ֽ���ʿ����������Ż��������¸�ĸ�Ĳ�����������Ů�깬�ߴ����������ַ�Ʈ�����Ż���������˿���վ�������������ܱ�Ķ����������������������س����̳���ǧ������������";
       
            char[] text_xw = text_tangshi.toCharArray();
            int count = 0;
            for (int i = 0; i < text_tangshi.length(); i++) {
                System.out.print(text_xw[i]);
                if (i % 7 == 6) {
                    if (count % 2 == 0) {
                        System.out.print(",");
                    } else {
                        System.out.print("��");
                        System.out.println("");
                    }
                    count += 1;
                }
            }
            int count2=0;
            Scanner input=new Scanner(System.in);
            System.out.print("������Ҫ���ҵ��ı���");
            String in=input.next();
            char c=in.charAt(0);
            for (int i=0; i < text_xw.length; i++) {
            	if (c==text_xw[i]){
            		count2++;
            	}
            }
            System.out.println("���ֳ��ֵĴ���Ϊ��"+count2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
