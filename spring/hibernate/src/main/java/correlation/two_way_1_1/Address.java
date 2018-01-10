package correlation.two_way_1_1;

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
    @Column(name = "address_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int addressId;
    private String addressDetail;

    @OneToOne
    @JoinColumn(name = "person_id",referencedColumnName = "person_id" ,unique = true)
    private Person person;


}
