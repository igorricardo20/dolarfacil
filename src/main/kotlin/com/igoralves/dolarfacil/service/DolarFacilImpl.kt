package com.igoralves.dolarfacil.service

import com.igoralves.dolarfacil.model.TaxasConversao
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.core.ParameterizedTypeReference
import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.util.UriBuilder
import reactor.core.publisher.Mono

@Service
class DolarFacilImpl: DolarFacilService {

    private val logger = LoggerFactory.getLogger(javaClass)

    @Autowired
    lateinit var client: WebClient

    override fun getTaxasConversao(): Mono<Array<TaxasConversao>> {


        return client
            .get()
            .uri {builder: UriBuilder -> builder.path("/dadosabertos/taxasCartoes/taxas/itens").build()}
            .retrieve()
            .bodyToMono(Array<TaxasConversao>::class.java)
    }

}