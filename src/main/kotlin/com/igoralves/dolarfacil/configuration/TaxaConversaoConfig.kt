package com.igoralves.dolarfacil.configuration

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.client.WebClient

@Configuration
class TaxaConversaoConfig(@Value("\${app.taxaconversao.baseurl}") val baseUrl: String) {

    @Bean
    fun createWebClient(): WebClient {
        return WebClient.create(baseUrl)
    }
}