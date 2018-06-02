
package com.ws.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ws.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MyException_QNAME = new QName("http://turcell.com", "MyException");
    private final static QName _InsertEmployee_QNAME = new QName("http://turcell.com", "insertEmployee");
    private final static QName _GetEmployee_QNAME = new QName("http://turcell.com", "getEmployee");
    private final static QName _GetEmployeeResponse_QNAME = new QName("http://turcell.com", "getEmployeeResponse");
    private final static QName _Employee_QNAME = new QName("http://turcell.com", "employee");
    private final static QName _InsertEmployeeResponse_QNAME = new QName("http://turcell.com", "insertEmployeeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ws.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MyException }
     * 
     */
    public MyException createMyException() {
        return new MyException();
    }

    /**
     * Create an instance of {@link InsertEmployee }
     * 
     */
    public InsertEmployee createInsertEmployee() {
        return new InsertEmployee();
    }

    /**
     * Create an instance of {@link GetEmployee }
     * 
     */
    public GetEmployee createGetEmployee() {
        return new GetEmployee();
    }

    /**
     * Create an instance of {@link Employee }
     * 
     */
    public Employee createEmployee() {
        return new Employee();
    }

    /**
     * Create an instance of {@link InsertEmployeeResponse }
     * 
     */
    public InsertEmployeeResponse createInsertEmployeeResponse() {
        return new InsertEmployeeResponse();
    }

    /**
     * Create an instance of {@link GetEmployeeResponse }
     * 
     */
    public GetEmployeeResponse createGetEmployeeResponse() {
        return new GetEmployeeResponse();
    }

    /**
     * Create an instance of {@link MyError }
     * 
     */
    public MyError createMyError() {
        return new MyError();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MyException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://turcell.com", name = "MyException")
    public JAXBElement<MyException> createMyException(MyException value) {
        return new JAXBElement<MyException>(_MyException_QNAME, MyException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://turcell.com", name = "insertEmployee")
    public JAXBElement<InsertEmployee> createInsertEmployee(InsertEmployee value) {
        return new JAXBElement<InsertEmployee>(_InsertEmployee_QNAME, InsertEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://turcell.com", name = "getEmployee")
    public JAXBElement<GetEmployee> createGetEmployee(GetEmployee value) {
        return new JAXBElement<GetEmployee>(_GetEmployee_QNAME, GetEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://turcell.com", name = "getEmployeeResponse")
    public JAXBElement<GetEmployeeResponse> createGetEmployeeResponse(GetEmployeeResponse value) {
        return new JAXBElement<GetEmployeeResponse>(_GetEmployeeResponse_QNAME, GetEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Employee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://turcell.com", name = "employee")
    public JAXBElement<Employee> createEmployee(Employee value) {
        return new JAXBElement<Employee>(_Employee_QNAME, Employee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://turcell.com", name = "insertEmployeeResponse")
    public JAXBElement<InsertEmployeeResponse> createInsertEmployeeResponse(InsertEmployeeResponse value) {
        return new JAXBElement<InsertEmployeeResponse>(_InsertEmployeeResponse_QNAME, InsertEmployeeResponse.class, null, value);
    }

}
