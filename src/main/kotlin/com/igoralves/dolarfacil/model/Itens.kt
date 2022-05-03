package com.igoralves.dolarfacil.model

import com.google.gson.annotations.SerializedName


data class Itens (

  @SerializedName("emissor"        ) var emissor        : Emissor?                  = Emissor(),
  @SerializedName("historicoTaxas" ) var historicoTaxas : ArrayList<HistoricoTaxas> = arrayListOf()

)