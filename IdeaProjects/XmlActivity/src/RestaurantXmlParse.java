import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;


public class RestaurantXmlParse {
    public static void main(String[] args) {
       //do we need a try statement??
       try {
           File input = new File("Restaurant.xml");

          //DocumentFactory
           DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
           //DocumentBuilder
           DocumentBuilder builder = factory.newDocumentBuilder();
           //parse files
           Document doc = builder.parse(input);

           //getrootnode
           System.out.println("Root element : "+ doc.getDocumentElement().getNodeName());
           //get element by tag name

           NodeList RestaurantList = doc.getElementsByTagName("Restaurant");
           for (int i = 0; i < RestaurantList.getLength(); i++ ){
               Node node = RestaurantList.item(i);
               if(node.getNodeType() == Node.ELEMENT_NODE){
                   Element element = (Element) node;
                   System.out.println("Name: " + element.getAttribute("brandName"));
                   System.out.println("location: " + element.getElementsByTagName("location").item(0).getTextContent());
                   System.out.println("Food: " + element.getElementsByTagName("Food").item(0).getTextContent());
                   System.out.println("income: " + element.getElementsByTagName("income").item(0).getTextContent()  );

               }
           }

       }

       catch(Exception e ){
            e.printStackTrace();
        }
    }
}