package test;

public class TestXML {

    public static void main(String[] args) {
        System.out.println(getTestXML());
    }

    public static String getTestXML(){
        String xml="";
        StringBuilder builder = new StringBuilder();

        builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        builder.append("<xml-body>");
        builder.append("<Head>");
        builder.append("<Version>1.0</Version>");
        builder.append("<MethodCode></MethodCode>");
        builder.append("<BeanId>utrService</BeanId>");
        builder.append("<ParamType>xml</ParamType>");
        builder.append("</Head>");

        builder.append("<Body>");
        builder.append("<sysPass>chtrans2013</sysPass>");

        builder.append("<prop>");

        builder.append("<projectName>我是传输到服务端的内容</projectName>");

        builder.append("</prop>");
        builder.append("</Body>");
        builder.append("</xml-body>");

        xml = builder.toString();
        return xml;
    }
}
