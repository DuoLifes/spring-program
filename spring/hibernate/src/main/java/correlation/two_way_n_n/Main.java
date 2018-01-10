package correlation.two_way_n_n;


import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Create with correlation.one_way_n_1
 *
 * @author zhangpeiyu
 * @version 2018/1/9 22:50
 */
public class Main {

    private void test(){
        Session session = null;
        Transaction tx = session.getTransaction();
        Person person = new Person();
        Address address = new Address();
        address.setAddressDetail("广州");
        person.setAddress(address);
        person.setAge(22);
        person.setName("zhangpeiyu");
        session.persist(person);//先插入主表address  ，再插入从表person
        Address address1 = new Address();
        address1.setAddressDetail("天津");
        person.setAddress(address1);     //插入主表address1，更新person
        tx.commit();
    }
}
