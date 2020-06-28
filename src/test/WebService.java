package test;


import com.webService.TestServiceServiceLocator;
import com.webService.TestService_PortType;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

public class WebService {
    public static void main(String[] args) {
        try {
            //这里new的是生成的服务端代码，在通过地址去调用服务端。
            TestService_PortType portType = new TestServiceServiceLocator().getTestService();
                System.out.println("生成的xml："+TestXML.getTestXML());
               String success = portType.getInsert(TestXML.getTestXML());
               System.out.println("调用服务端接口："+success);

        } catch (ServiceException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }

    }
}
