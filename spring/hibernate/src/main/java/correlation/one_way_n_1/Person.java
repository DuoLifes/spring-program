package correlation.one_way_n_1;

import lombok.Data;
import lombok.Setter;
import org.hibernate.annotations.*;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;

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

    @ManyToOne
    //映射外键列，指定外键列的名称
    @JoinColumn(name = "address_id",nullable = false)
    //指定级联操作策略
    @Cascade(CascadeType.ALL)
    private Address address;



}
