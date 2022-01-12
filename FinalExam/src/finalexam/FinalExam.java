
package finalexam;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class FinalExam {

    public static void main(String[] args) {
        String x = new String() ;
        String y = new String() ;
        String z = new String() ;
        int i;
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Enter the made of the car : ");
        x = reader.nextLine();
        
        System.out.println("Enter the model of the car: ");
        y = reader.nextLine();
        
        System.out.println("Enter the made for update");
        z = reader.nextLine();
        
        System.out.println("1.Create \n 2.Read \n 3.Update \n 4.Delete");
        System.out.println("Eneter the number of what you want yo do");
        i = reader.nextInt();
        Choice(i, x, y, z);
        
        
    }
    
    public static void Choice( int i , String x , String y , String z)
    {
        if(i==1)
        {
            Create_part1(x, y);
            Create_part2(x, y);
        }
        else if(i==2)
        {
            Read(x);
        }
        else if(i==3)
        {
            Update(x, z);
        }
        else if(i==4)
        {
            Delete(x);
        }
        else
        {
            System.out.println("Incorect choice");
        }
    }
    
    public static void Create_part1( String x , String y)
    {
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        try
        {
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        Document doc = docBuilder.parse("D:\\Java\\Proiecte Java\\FinalExam\\src\\finalexam\\Cars.xml");
        Node staff = doc.getElementsByTagName("cars").item(0);
        Element made = doc.createElement("made");
        made.setAttribute("name", x);
        staff.appendChild(made);
        
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File("D:\\Java\\Proiecte Java\\FinalExam\\src\\finalexam\\Cars.xml"));
        transformer.transform(source, result); 
        
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(FinalExam.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(FinalExam.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FinalExam.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerConfigurationException ex) {
            Logger.getLogger(FinalExam.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(FinalExam.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void Create_part2( String x , String y)
    {
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        try
        {
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.parse("D:\\Java\\Proiecte Java\\FinalExam\\src\\finalexam\\Cars.xml");
            
            NodeList madeList = doc.getElementsByTagName("made");
            for(int i=0 ; i<madeList.getLength() ; i++)
            {
                Node madeNode = madeList.item(i);
                if(madeNode.getNodeType() == Node.ELEMENT_NODE)
                {
                    Element elemMade = (Element) madeNode;
                    if(x.equals(elemMade.getAttribute("name")))
                    {
                        Element model = doc.createElement("model");
                        model.setAttribute("value", y);
                        madeNode.appendChild(model);
                    }
                }
            }
            
            
            TransformerFactory transformerFactory2 = TransformerFactory.newInstance();
            Transformer transformer2 = transformerFactory2.newTransformer();
            DOMSource source2 = new DOMSource(doc);
            StreamResult result2 = new StreamResult(new File("D:\\Java\\Proiecte Java\\FinalExam\\src\\finalexam\\Cars.xml"));
            transformer2.transform(source2, result2);
            
            
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(FinalExam.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(FinalExam.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FinalExam.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerConfigurationException ex) {
            Logger.getLogger(FinalExam.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(FinalExam.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
    public static void Read( String x )
    {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new File ("D:\\Java\\Proiecte Java\\FinalExam\\src\\finalexam\\Cars.xml"));
            document.getDocumentElement().normalize();
            NodeList carList = document.getElementsByTagName("made");
            for(int i=0 ; i< carList.getLength() ; i++)
            {
                Node car = carList.item(i);
                if(car.getNodeType() == Node.ELEMENT_NODE)
                {
                    Element carElement = (Element) car;
                    NodeList model = car.getChildNodes();
                    
                    if( x.equals(carElement.getAttribute("name")))
                            {
                                System.out.println(carElement.getTagName() + " " + carElement.getAttribute("name"));
                            }
                    
                    
                    for(int j = 0 ; j< model.getLength() ; j++)
                    {
                        Node modelNode = model.item(j);
                        if(modelNode.getNodeType() == Node.ELEMENT_NODE)
                        {
                            Element modelElement = (Element) modelNode;
                            if( x.equals(carElement.getAttribute("name")))
                            {
                                System.out.println(modelElement.getTagName() + " " + modelElement.getAttribute("value"));
                            }
                        }   
                    }
                }
            }
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(FinalExam.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(FinalExam.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FinalExam.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void Update( String x , String z)
    {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new File ("D:\\Java\\Proiecte Java\\FinalExam\\src\\finalexam\\Cars.xml"));
            document.getDocumentElement().normalize();
            NodeList carList = document.getElementsByTagName("made");
            
            for(int i=0 ; i< carList.getLength() ; i++)
            {
                Node car = carList.item(i);
                if(car.getNodeType() == Node.ELEMENT_NODE)
                {
                    Element carElement = (Element) car;
                    if( x.equals(carElement.getAttribute("name")))
                            {
                                carElement.setAttribute("name", z);
                            }
                }
            }
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new File("D:\\Java\\Proiecte Java\\FinalExam\\src\\finalexam\\Cars.xml"));
            transformer.transform(source, result);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(FinalExam.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(FinalExam.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FinalExam.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerConfigurationException ex) {
            Logger.getLogger(FinalExam.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(FinalExam.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    public static void Delete( String x )
    {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try
        {
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File ("D:\\Java\\Proiecte Java\\FinalExam\\src\\finalexam\\Cars.xml"));
        document.getDocumentElement().normalize();
        Node staff = document.getElementsByTagName("cars").item(0);
        NodeList list = staff.getChildNodes();
        for (int i = 0; i < list.getLength(); i++) 
        {
            Node node = list.item(i);
            if(node.getNodeType() == Node.ELEMENT_NODE)
            {
            Element element = (Element) node;
            if (x.equals(element.getAttribute("name"))) 
                {
                   staff.removeChild(node);
                }
            }
        }
        
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(document);
        StreamResult result = new StreamResult(new File("D:\\Java\\Proiecte Java\\FinalExam\\src\\finalexam\\Cars.xml"));
        transformer.transform(source, result);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(FinalExam.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(FinalExam.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FinalExam.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerConfigurationException ex) {
            Logger.getLogger(FinalExam.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(FinalExam.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
