package cn.sortUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 查找重要方法
 * 1.binarySearch(List<? extends Comparable<? super T>> list, T key)  容器有序
 * 2、reverse(List<?> list)  元素反转
 * 3、shuffle(List<?> list) 使用默认随机源对指定列表进行置换。洗牌
   4.sort(List<T> list) 
          根据元素的自然顺序 对指定列表按升序进行排序。 
 sort(List<T> list, Comparator<? super T> c) 
          根据指定比较器产生的顺序对指定列表进行排序 
   5.swap(List<?> list, int i, int j) 
          在指定列表的指定位置处交换元素。   
 * @author YR
 *
 */
public class CollectionsDemo01
{
	public static void main(String[] args)
	{
		List<Integer> cards = new ArrayList<>();
		for(int i = 0;i<54;i++)
		{
			cards.add(i);
		}
		//洗牌
		Collections.shuffle(cards);
		//发牌
		List<Integer> p1 = new ArrayList<>();
		List<Integer> p2 = new ArrayList<>();
		List<Integer> p3 = new ArrayList<>();
		List<Integer> last = new ArrayList<>();
		for(int i = 0;i< 51;i+=3)
		{
			p1.add(cards.get(i));
			p2.add(cards.get(i+1));
			p3.add(cards.get(i+2));	
		}
		last.add(cards.get(51));
		last.add(cards.get(52));
		last.add(cards.get(53));
		System.out.println("第一个人："+p1);
		System.out.println("第二个人："+p2);
		System.out.println("第三个人："+p3);
		System.out.println("底牌："+last);
	}
	public static void test1()
	{
		List<Integer> list = new ArrayList<>();
		for(int i = 1;i<5;i++)
		{
			list.add(i);
		}
		Collections.reverse(list);
		System.out.println(list);
	}
}
