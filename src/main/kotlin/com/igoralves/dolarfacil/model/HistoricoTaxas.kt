package com.igoralves.dolarfacil.model

import com.google.gson.annotations.SerializedName


data class HistoricoTaxas (

  @SerializedName("taxaTipoGasto"          ) var taxaTipoGasto          : String? = null,
  @SerializedName("taxaData"               ) var taxaData               : String? = null,
  @SerializedName("taxaConversao"          ) var taxaConversao          : Double? = null,
  @SerializedName("taxaDivulgacaoDataHora" ) var taxaDivulgacaoDataHora : String? = null

)