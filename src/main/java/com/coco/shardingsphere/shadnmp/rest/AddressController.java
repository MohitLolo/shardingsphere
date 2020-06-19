package com.coco.shardingsphere.shadnmp.rest;

import com.coco.shardingsphere.shadnmp.domain.R;
import com.coco.shardingsphere.shadnmp.domain.address.Address;
import com.coco.shardingsphere.shadnmp.service.address.IAddressService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ming
 */
@RestController
@RequestMapping("address")
@AllArgsConstructor
public class AddressController {

    IAddressService addressService;

    @PostMapping("info")
    public R addAddress(@RequestBody Address address) {
        addressService.save(address);
        return R.success();
    }

}
