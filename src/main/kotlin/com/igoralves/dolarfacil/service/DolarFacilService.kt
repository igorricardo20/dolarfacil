package com.igoralves.dolarfacil.service

import com.igoralves.dolarfacil.model.TaxasConversao
import reactor.core.publisher.Mono

interface DolarFacilService {
    fun getTaxasConversao(): Mono<Array<TaxasConversao>>
}