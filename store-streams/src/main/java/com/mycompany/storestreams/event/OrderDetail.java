package com.mycompany.storestreams.event;

import lombok.Data;

import java.util.Date;
import java.util.Set;

@Data
public class OrderDetail {

    private String id;
    private Long customer_id;
    private String customer_name;
    private String payment_type;
    private String status;
    private Date created_at;
    private Set products;

}
