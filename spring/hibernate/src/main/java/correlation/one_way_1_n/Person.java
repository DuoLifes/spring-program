package correlation.one_way_1_n;

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

    @OneToMany
    //映射外键列，指定外键列的名称
    @JoinColumn(name = "address_id",referencedColumnName = "address_id",unique = true,nullable = false)
    //指定级联操作策略
    @Cascade(CascadeType.ALL)
    private Set<Address> addresses = new HashSet<Address>();



}
