package com.lanou3g.String;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringDemo {
		public static void main(String[] args) throws UnsupportedEncodingException{
			String a = "      abcdefg	";
			//ȥ���ַ���ǰ��Ŀո�
//			�������a�ı�,ֻ�Ƿ��ؽ����ֵ��a
			a=a.trim();
			//��ȡ�ַ����ĳ���
			System.out.println(a.length());
			//�滻.��a�滻��h
			//ֻ�Ƿ����滻�Ľ��,������ѽ����ֵ��a
			System.out.println(a.replace('a', 'h'));
//			System.out.println();
			//ȡ�ַ����е��Ӵ�
			//��0λ�ÿ�ʼ,ȡ��1
			//����һ�������ֿ�������
			//[0 ,2) ���Ծ��Ǵ�0ȡ��1
			System.out.println(a.substring(0,2));
			//ȡ�ַ����е��Ӵ�
			//��4��ʼһֱȡ��ĩβ
			System.out.println(a.substring(4));
			
			//�ָ��ַ���
			//��eΪ�����ָ��ַ���
			//��õ�һ���ַ���������
			System.out.println(Arrays.toString(a.split("e")));
			//�ж������ַ����������Ƿ����
			System.out.println(a.equals("bcd"));
			//�ж������ַ����������Ƿ���Ȳ��Һ��Դ�Сд
			a.equalsIgnoreCase("CB");
			//��ȡ��һ���ַ�c��a����ַ����е�λ��
			//���������c,�򷵻�-1
			int index = a.indexOf('c');
			System.out.println(index);
			//��ȡindexλ�õ��ַ�
			//�����index��ֵһ��Ҫ���ַ���������
			//����ᱨ��
			char ch =a.charAt(index);
			System.out.println(ch);
			//�Ƿ���a��ͷ,����boolean��true��false
			a.startsWith("a");
			//�Ƿ���a��β
			a.endsWith("a");
			//���ַ���ƴ�ӵ�a����
			a=a.concat("���Ǻ����ϵ�");
			//�ַ���a�Ƿ����"bcd",����true��false
			a.contains("bcd");
			//���ַ���a�е�Сд��ĸ��ת���ɴ�д
			a=a.toUpperCase();
			//���ַ���a�еĴ�д��ĸ��ת����Сд
			a.toLowerCase();
			//�õ�a�ַ������ַ�����
			char[] chs =  a.toCharArray();
			int[] a1 = {1,2,3};
			System.out.println(chs);
			//��Ƶ�����ת����
			//���a�ַ������ֽ�����
			byte[] bytes = a.getBytes();
			String aa = new String(bytes,"gbk");
			System.out.println(aa);
		}
}
