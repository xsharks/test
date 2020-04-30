# 计G191 2019322033 夏旺

# 实验名称
  古诗字符串处理程序设计
# 实验目的
  掌握字符串String及其方法的使用
  掌握异常处理结构
# 实验要求
  1.利用字符串String及其方法对古诗做对齐处理
  2.设计系统的输入/输出，把处理结果保存在文件中存储
  3.包含异常处理结构
  4.系统的界面采用二选一：
  
      1.使用GUI窗体界面，设计各组件，完成用户与系统的交互
      2.控制台（Console）
      

  输入：汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝承欢侍宴无闲暇春从春游夜专夜后宫佳丽三千人三千宠爱在一身金屋妆成娇侍夜玉楼宴罢醉和春姊妹弟兄皆列士可怜光采生门户遂令天下父母心不重生男重生女骊宫高处入青云仙乐风飘处处闻缓歌慢舞凝丝竹尽日君王看不足渔阳鼙鼓动地来惊破霓裳羽衣曲九重城阙烟尘生千乘万骑西南行<未完，待续>
  
  输出：
  
  汉皇重色思倾国，御宇多年求不得。
  
  杨家有女初长成，养在深闺人未识。
  
  天生丽质难自弃，一朝选在君王侧。
  
  回眸一笑百媚生，六宫粉黛无颜色。
  
  春寒赐浴华清池，温泉水滑洗凝脂。
  
  侍儿扶起娇无力，始是新承恩泽时。
  
  云鬓花颜金步摇，芙蓉帐暖度春宵。
 
  春宵苦短日高起，从此君王不早朝。
 
 …………

  注意： 输入的内容，利用main方法中的args数组传递
# 代码
import java.util.*;

public class Poem {
    public static void main(String[] args) {
        try {
       		System.out.print("请输入您的唐诗：");
       		Scanner scanner = new Scanner(System.in);
			String text_tangshi = scanner.next();
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
//"汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝承欢侍宴无闲暇春从春游夜专夜后宫佳丽三千人三千宠爱在一身金屋妆成娇侍夜玉楼宴罢醉和春姊妹弟兄皆列士可怜光采生门户遂令天下父母心不重生男重生女骊宫高处入青云仙乐风飘处处闻缓歌慢舞凝丝竹尽日君王看不足渔阳鼙鼓动地来惊破霓裳羽衣曲九重城阙烟尘生千乘万骑西南行";

```



# 流程图
![images](https://github.com/xsharks/test/blob/master/%E6%9C%AA%E5%91%BD%E5%90%8D%E6%96%87%E4%BB%B6%20(1).png)

# 运行结果
![images](https://github.com/xsharks/test/blob/master/%E7%BB%93%E6%9E%9C.png)

# 实验感想
在本次实验中我通过学习字符串的命令使用，以及对《长恨歌》的长字符串输入，进行文本的格式转换，对参数与数据的联系，并且
考虑操作中可能出现的异常，处理异常。不仅如此，还通过使用Github这个开源托管平台，来存放分享我的实验代码，以便于我们以后学习复习。
这次实验进行的比较坎坷，但在老师和同学的帮助下成功完成了，我也从中获取到了不少有用的知识！
