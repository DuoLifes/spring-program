package correlation.two_way_n_n;

import lombok.Data;
import lombok.Setter;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Create with correlation.one_way_n_1
 * 无连接表的情况
 * @author zhangpeiyu
 * @version 2018/1/9 22:34
 */
@Data
@Entity
@Table(name = "persion")
public class Person {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Setter
    private String name;
    private int age;

    @ManyToMany
    @JoinTable(name = "person_address",
            joinColumns=@JoinColumn(name = "person_id" ,referencedColumnName = "person_id"),
            inverseJoinColumns = @JoinColumn(name = "address_id",referencedColumnName = "address_id"))
    //指定级联操作策略
    @Cascade(CascadeType.ALL)
    private Set<Address> addresses = new HashSet<Address>();



}
