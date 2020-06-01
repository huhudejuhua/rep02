package xml;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class xmlDemo1 {
    public static void main(String[] args) throws IOException {
        //获取xml文件路径
        String path=xmlDemo1.class.getClassLoader().getResource("test.xml").getPath();
        //解析xml文件，加载文档进内存，获取dom树---->Document对象
        Document document= Jsoup.parse(new File(path),"utf-8");
        //获取元素对象集合Elements
        Elements elements=document.getElementsByTag("name");
        //获取元素对象Element
        Element element=elements.get(0);
        System.out.println(element);
        System.out.println("----------------");
        //获取数据
        String name=element.text();
        System.out.println(name);
    }
}
