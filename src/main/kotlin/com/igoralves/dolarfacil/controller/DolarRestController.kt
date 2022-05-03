package com.igoralves.dolarfacil.controller

import com.igoralves.dolarfacil.model.TaxasConversao
import com.igoralves.dolarfacil.service.DolarFacilService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
class DolarRestController {

    @Autowired
    lateinit var service: DolarFacilService

    @GetMapping("/taxas-conversao")
    fun findAll(): Mono<Array<TaxasConversao>> {
        return service.getTaxasConversao()
    }
}