package correlation.two_way_1_1.haslinkedtable;

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

    @JoinTable(name = "person_address",
            joinColumns=@JoinColumn(name = "address_id" ,referencedColumnName = "address_id",unique = true),
            inverseJoinColumns = @JoinColumn(name = "person_id",unique = true,referencedColumnName = "person_id"))
    private Person person;

}
