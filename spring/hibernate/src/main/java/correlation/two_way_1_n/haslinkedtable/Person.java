package correlation.two_way_1_n.haslinkedtable;

import lombok.Data;
import lombok.Setter;

import javax.persistence.*;
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

    @OneToMany
    //映射外键列，指定外键列的名称
    @JoinTable(name = "person_address",
            joinColumns=@JoinColumn(name = "person_id" ,referencedColumnName = "person_id"),
    inverseJoinColumns = @JoinColumn(name = "address_id",unique = true,referencedColumnName = "address_id"))//unique表名每个address实体最多只能关联一个person实体。而person可以关联多个address。
    private Set<Address> addresses;



}
