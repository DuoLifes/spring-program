package correlation.one_way_n_n;

import lombok.Data;

import javax.persistence.*;

/**
 * Create with correlation.one_way_n_1
 *
 * @author zhangpeiyu
 * @version 2018/1/9 22:39
 */
@Data
@Entity
@Table(name = "address")
public class Address {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int address_id;
    private String addressDetail;

    @ManyToOne
    @JoinColumn(name = "person_id",referencedColumnName = "person_id",nullable = false)//使用此注解意味着有控制权。该注解将会在address表中增加person_id的外键列，这意味着address将作为从表。
    private Person person;


}
