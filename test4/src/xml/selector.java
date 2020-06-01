package xml;

import cn.wanghaomiao.xpath.model.JXDocument;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class selector {
    public static void main(String[] args) throws IOException {
        //获取xml文件路径
        String path=xmlDemo1.class.getClassLoader().getResource("test.xml").getPath();
        //解析xml文件，加载文档进内存，获取dom树---->Document对象
        Document document= Jsoup.parse(new File(path),"utf-8");
        //select方法查询指定元素
        Elements elements=document.select("name");
        System.out.println(elements);

    }
}
