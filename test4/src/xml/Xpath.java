package xml;

import cn.wanghaomiao.xpath.exception.XpathSyntaxErrorException;
import cn.wanghaomiao.xpath.model.JXDocument;
import cn.wanghaomiao.xpath.model.JXNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Xpath {
    public static void main(String[] args) throws IOException, XpathSyntaxErrorException {
        //获取xml文件路径
        String path = xmlDemo1.class.getClassLoader().getResource("test.xml").getPath();
        //解析xml文件，加载文档进内存，获取dom树---->Document对象
        Document document = Jsoup.parse(new File(path), "utf-8");
        //3.根据document对象，创建JXDocument对象
        JXDocument jxDocument = new JXDocument(document);

        //结合xpath的语法查询
        //.1查询所有student标签
        List<JXNode> jxNodes=jxDocument.selN("//student[@id='001']/name");
        for (JXNode jxNode:jxNodes) {
            System.out.println(jxNode);
            System.out.println("-----------------------");
        }
    }
}
