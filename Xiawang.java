package xw;

import java.util.*;

public class Xiawang {
    public static void main(String[] args) {
        try {
            String text_tangshi = "汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝承欢侍宴无闲暇春从春游夜专夜后宫佳丽三千人三千宠爱在一身金屋妆成娇侍夜玉楼宴罢醉和春姊妹弟兄皆列士可怜光采生门户遂令天下父母心不重生男重生女骊宫高处入青云仙乐风飘处处闻缓歌慢舞凝丝竹尽日君王看不足渔阳鼙鼓动地来惊破霓裳羽衣曲九重城阙烟尘生千乘万骑西南行";
       
            char[] text_xw = text_tangshi.toCharArray();
            int count = 0;
            for (int i = 0; i < text_tangshi.length(); i++) {
                System.out.print(text_xw[i]);
                if (i % 7 == 6) {
                    if (count % 2 == 0) {
                        System.out.print(",");
                    } else {
                        System.out.print("。");
                        System.out.println("");
                    }
                    count += 1;
                }
            }
            int count2=0;
            Scanner input=new Scanner(System.in);
            System.out.print("请输入要查找的文本：");
            String in=input.next();
            char c=in.charAt(0);
            for (int i=0; i < text_xw.length; i++) {
            	if (c==text_xw[i]){
            		count2++;
            	}
            }
            System.out.println("该字出现的次数为："+count2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
